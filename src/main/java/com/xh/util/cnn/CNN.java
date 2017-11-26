package com.xh.util.cnn;

    import java.awt.image.BufferedImage;
    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.ObjectInputStream;
    import java.io.ObjectOutputStream;
    import java.io.PrintWriter;
    import java.io.Serializable;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Iterator;
    import java.util.List;
    import java.util.concurrent.atomic.AtomicBoolean;

    import com.xh.util.cnn.DataUtil.Record;
    import com.xh.util.cnn.ConcurenceRunner.TaskManager;
    import com.xh.util.cnn.Layer.Size;;

public class CNN implements Serializable {

    protected static double ALPHA = 0.85;
    protected static double LAMBDA = 0;
    private List<Layer> layers;
    private int layerNum;
    private int batchSize;
    private Operator divide_batchSize;
    private Operator multiply_alpha;
    private Operator multiply_lambda;
    public CNN(LayerBuilder layerBuilder,final int batchSize){
        this.layers=layerBuilder.mLayers; //建造者模式获取Layer对象
        this.layerNum=layers.size(); //层数
        this.batchSize=batchSize;//批处理大小10,就是10个数据(10幅图片)更新一次权重,越大越不准
        setup(batchSize);
        initPerator();
    }

    /**
     * 设置卷积神经网络各层参数
     * @param batchSize
     */
    private void setup(int batchSize) {
        Layer inputLayer=layers.get(0);
        inputLayer.initOutmaps(batchSize);//初始化输入层的map
        for(int i=1;i<layers.size();i++){
            Layer layer=layers.get(i);//获取第i层网络
            Layer frontLayer=layers.get(i-1);//获取第i层的上一层的网络
            int frontMapNum=frontLayer.getOutMapNum(); //得到上层map数
            switch(layer.getType()){
                case input:
                    break;
                case conv:
                    layer.setMapSize(frontLayer.getMapSize().subtract(layer.getKernelSize(), 1));// 设置map的大小
                    layer.initKernel(frontMapNum);//初始化卷积核
                    layer.initBias(frontMapNum);// 初始化偏置
                    layer.initErros(batchSize);//初始化残差
                    layer.initOutmaps(batchSize);//初始化map
                    break;
                case samp:
                    layer.setOutMapNum(frontMapNum);//设置map的数量,采样层的map数量与上一层相同
                    layer.setMapSize(frontLayer.getMapSize().divide(layer.getScaleSize()));//设置map的大小,采样层map的大小是上一层map的大小除以scale大小
                    layer.initErros(batchSize);//初始化残差
                    layer.initOutmaps(batchSize);//初始化map
                    break;
                case output:
                    layer.initOutputKernel(frontMapNum, frontLayer.getMapSize());
                    layer.initBias(frontMapNum);
                    layer.initErros(batchSize);
                    layer.initOutmaps(batchSize);
                    break;
            }
        }

    }
    /**
     * 初始化操作符
     */

    private void initPerator() {
        divide_batchSize=new Operator(){

            @Override
            public double process(double value) {
                // TODO 自动生成的方法存根
                return value/batchSize;
            }

        };
        /**
         * value*α
         */
        multiply_alpha=new Operator(){

            @Override
            public double process(double value) {
                // TODO 自动生成的方法存根
                return value*ALPHA;
            }

        };

        /**
         * value*(1-λ*α)
         */
        multiply_lambda=new Operator(){

            @Override
            public double process(double value) {
                // TODO 自动生成的方法存根
                return value*(1-LAMBDA*ALPHA);
            }

        };
    }

    public int analysis(DataUtil dataUtil){
        Record record=dataUtil.getRecord(0);
        Layer.prepareForNewBacth();//Layer.recordInBatch=0;
        forward(record);
        Layer outputLayer=layers.get(layerNum-1);
        int mapNum=outputLayer.getOutMapNum();
        double[] out=new double[mapNum];
        for(int m=0;m<mapNum;m++){
            double[][] outmap=outputLayer.getMap(m);
            out[m]=outmap[0][0];
        }
        int lable=Util.getMaxIndex(out);
        return lable;
    }
    /**
     * 获得预测结果集
     * @param dataUtil
     * @return
     */
    public double[] analysis2(DataUtil dataUtil){
        Record record=dataUtil.getRecord(0);
        Layer.prepareForNewBacth();//Layer.recordInBatch=0;
        forward(record);
        Layer outputLayer=layers.get(layerNum-1);
        int mapNum=outputLayer.getOutMapNum();
        double[] out=new double[mapNum];
        for(int m=0;m<mapNum;m++){
            double[][] outmap=outputLayer.getMap(m);
            out[m]=outmap[0][0];
        }
        //int lable=Util.getMaxIndex(out);
        return out;
    }
    /**
     * 测试test.format里的数据
     * @param dataUtil
     * @param fileName
     */
    public void predict(DataUtil dataUtil,String fileName){
        Log.i("开始预测");
        try {
            int max=layers.get(layerNum-1).getClassNum();
            PrintWriter writer=new PrintWriter(new File(fileName));
            Layer.prepareForNewBacth();
            Iterator<Record> iter=dataUtil.iter();
            int k=0;
            while(iter.hasNext()){
                Record record=iter.next();
                forward(record);
                Layer outputLayer=layers.get(layerNum-1);
                int mapNum=outputLayer.getOutMapNum();
                double[] out=new double[mapNum];
                for(int m=0;m<mapNum;m++){
                    double[][] outmap=outputLayer.getMap(m);
                    out[m]=outmap[0][0];
                }
                System.out.println(Arrays.toString(out));
                int lable=Util.getMaxIndex(out);
                double attrs[]=record.getAttrs();
                String str="";
                BufferedImage grayImage=new BufferedImage(Constant.imageWidth,Constant.imageHeight,BufferedImage.TYPE_BYTE_GRAY);
                for (int i = 0; i < attrs.length; i++) {
                    grayImage.setRGB(i%Constant.imageWidth,i/Constant.imageHeight,attrs[i]==0?0:16777215);
                    if(i%Constant.imageWidth==0){
                        str+="\n"+(attrs[i]==0?"  ":" *");
                    }else{
                        str+=(attrs[i]==0?" ":" *");
                    }
                }
                writer.write(lable + str+ "\n");

            }
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
    }

    public void train(DataUtil dataUtil, int repeat) {
        new Lisenter().start();
        boolean stop=true;
        for(int t=0;t<repeat&&!stopTrain.get()&&stop;t++){
            int epochsNum=dataUtil.size()/batchSize;
            if(dataUtil.size()%batchSize!=0){
                epochsNum++;
            }
            Log.i("");
            Log.i(t+"th iter epochsNum: "+epochsNum);
            int right=0;
            int count=0;
            for(int i=0;i<epochsNum;i++){
                int[] randPerm=Util.randomPerm(dataUtil.size(),batchSize);
                Layer.prepareForNewBacth();//Layer.recordInBatch=0;
                for(int index:randPerm){
                    boolean isRight=train(dataUtil.getRecord(index));
                    if(isRight){
                        right++;
                    }
                    if(dataUtil.size()==1&&isRight){
                        stop=false;
                    }
                    count++;
                    Layer.prepareForNewRecord();//Layer.recordInBatch++;
                }
                updateParas(); // 跑完一个batch后更新权重
                if(epochsNum==1||epochsNum<200){

                }else{
                    if(i%(int)(epochsNum*0.05)==0){
                        System.out.print("▆");
                        if (i + 20 > epochsNum)
                            System.out.println();
                    }
                }
            }
            double p=1.0*right/count;
            if(t%10==1&&p>0.94){	//动态调整准学习速率
                ALPHA=0.001+ALPHA*0.9;
                Log.i("Set ALPHA = " + ALPHA);
            }
            Log.i("准确率: " + right + "/" + count + "=" + p);
            if(p>0.98){
                break;
            }
        }
    }

    private void updateParas() {
        for(int l=1;l<layerNum;l++){
            Layer layer=layers.get(l);
            Layer lastLayer=layers.get(l-1);
            switch(layer.getType()){
                case conv:
                case output:
                    updateKernels(layer,lastLayer);
                    updateBias(layer,lastLayer);
                    break;
                default:
                    break;
            }
        }

    }

    private void updateBias(final Layer layer, final Layer lastLayer) {
        final double[][][][] errors=layer.getErrors();
        int mapNum=layer.getOutMapNum();
        new TaskManager(mapNum){

            @Override
            public void process(int start, int end) {
                for(int j=start;j<end;j++){
                    double[][]error=Util.sum(errors,j);
                    double deltaBias=Util.sum(error)/batchSize;
                    double bias=layer.getBias(j)+ALPHA*deltaBias;
                    layer.setBias(j, bias);
                }

            }

        }.start();

    }

    private void updateKernels(final Layer layer,final Layer lastLayer) {
        int mapNum=layer.getOutMapNum();
        final int lastMapNum=lastLayer.getOutMapNum();
        new TaskManager(mapNum){

            @Override
            public void process(int start, int end) {
                for(int j=start;j<end;j++){
                    for(int i=0;i<lastMapNum;i++){
                        double[][] deltaKernel=null;
                        for(int r=0;r<batchSize;r++){
                            double[][] error=layer.getError(r,j);
                            if(deltaKernel==null){
                                deltaKernel=Util.convnValid(lastLayer.getMap(r,i),error);
                            }else{
                                deltaKernel=Util.matrixOp(Util.convnValid(lastLayer.getMap(r,i),error),deltaKernel,null,null,OperatorOnTwo.plus);
                            }
                        }
                        deltaKernel=Util.matrixOp(deltaKernel,divide_batchSize);// 除以batchSize
                        double[][] kernel=layer.getKernel(i, j);
                        deltaKernel=Util.matrixOp(kernel, deltaKernel, multiply_lambda, multiply_alpha, OperatorOnTwo.plus);
                        layer.setKernel(i,j,deltaKernel);
                    }
                }

            }

        }.start();

    }

    private boolean train(Record record) {
        forward(record);
        boolean result=backPropagation(record);
        return result;
    }

    private boolean backPropagation(Record record) {
        boolean result=setOutLayerErrors(record);
        setHiddenLayerErrors();
        return result;
    }
    /**
     * 设置中间各层的残差
     */
    private void setHiddenLayerErrors() {
        for(int l=layerNum-2;l>0;l--){
            Layer layer=layers.get(l);
            Layer nextLayer=layers.get(l+1);
            switch(layer.getType()){
                case samp:
                    setSampErrors(layer, nextLayer);
                    break;
                case conv:
                    setConvErrors(layer, nextLayer);
                    break;
                default:// 只有采样层和卷积层需要处理残差，输入层没有残差，输出层已经处理过
                    break;
            }
        }

    }
    private void setConvErrors(final Layer layer, final Layer nextLayer) {
        // 卷积层的下一层为采样层，即两层的map个数相同，且一个map只与令一层的一个map连接，
        // 因此只需将下一层的残差kronecker扩展再用点积即可
        int mapNum = layer.getOutMapNum();
        new TaskManager(mapNum) {

            @Override
            public void process(int start, int end) {
                for (int m = start; m < end; m++) {
                    Size scale = nextLayer.getScaleSize();
                    double[][] nextError = nextLayer.getError(m);
                    double[][] map = layer.getMap(m);
                    // 矩阵相乘，但对第二个矩阵的每个元素value进行1-value操作
                    double[][] outMatrix = Util.matrixOp(map,
                            Util.cloneMatrix(map), null, Operator.one_value,
                            OperatorOnTwo.multiply);
                    outMatrix = Util.matrixOp(outMatrix,
                            Util.kronecker(nextError, scale), null, null,
                            OperatorOnTwo.multiply);
                    layer.setError(m, outMatrix);
                }

            }

        }.start();

    }

    /**
     * 设置采样层的残差
     * @param layer
     * @param nextLayer
     */
    private void setSampErrors(final Layer layer, final Layer nextLayer) {
        int mapNum=layer.getOutMapNum();
        final int nextMapNum=nextLayer.getOutMapNum();
        new TaskManager(mapNum){

            @Override
            public void process(int start, int end) {
                for (int i = start; i < end; i++) {
                    double[][] sum = null;// 对每一个卷积进行求和
                    for (int j = 0; j < nextMapNum; j++) {
                        double[][] nextError = nextLayer.getError(j);
                        double[][] kernel = nextLayer.getKernel(i, j);
                        // 对卷积核进行180度旋转，然后进行full模式下得卷积
                        if (sum == null)
                            sum = Util
                                    .convnFull(nextError, Util.rot180(kernel));
                        else
                            sum = Util.matrixOp(
                                    Util.convnFull(nextError,
                                            Util.rot180(kernel)), sum, null,
                                    null, OperatorOnTwo.plus);
                    }
                    layer.setError(i, sum);
                }

            }

        }.start();

    }

    /**
     * 设置输出层的残差值,输出层的神经单元个数较少，暂不考虑多线程
     * @param record
     * @return
     */
    private boolean setOutLayerErrors(Record record) {
        Layer outputLayer=layers.get(layerNum-1);
        int mapNum=outputLayer.getOutMapNum();
        double[] target=new double[mapNum];
        double[] outmaps=new double[mapNum];
        for(int m=0;m<mapNum;m++){
            double[][] outmap=outputLayer.getMap(m);
            outmaps[m]=outmap[0][0];
        }
        int lable=record.getLable().intValue();
        target[lable]=1;
        for(int m=0;m<mapNum;m++){
            outputLayer.setError(m, 0, 0, outmaps[m]*(1-outmaps[m])*(target[m]-outmaps[m]));
        }
        return lable==Util.getMaxIndex(outmaps);
    }

    private void forward(Record record) {
        setInLayerOutput(record);// 设置输入层的map
        for(int l=1;l<layers.size();l++){
            Layer layer=layers.get(l);
            Layer lastLayer=layers.get(l-1);
            switch(layer.getType()){
                case conv:
                    setConvOutput(layer,lastLayer);
                    break;
                case samp:
                    setSampOutput(layer,lastLayer);
                    break;
                case output:
                    setConvOutput(layer,lastLayer);
                    break;
                default:
                    break;
            }
        }

    }
    private void setSampOutput(final Layer layer, final Layer lastLayer) {
        int lastMapNum=lastLayer.getOutMapNum();
        new TaskManager(lastMapNum){

            @Override
            public void process(int start, int end) {
                for(int i=start;i<end;i++){
                    double[][] lastMap=lastLayer.getMap(i);
                    Size scaleSize=layer.getScaleSize();
                    double[][] sampMatrix=Util.scaleMatrix(lastMap,scaleSize);
                    layer.setMapValue(i,sampMatrix);
                }

            }

        }.start();

    }

    /**
     * 计算卷积层输出值,每个线程负责一部分map
     * @param layer
     * @param lastLayer
     */
    private void setConvOutput(final Layer layer, final Layer lastLayer) {
        int mapNum=layer.getOutMapNum();
        final int lastMapNum=lastLayer.getOutMapNum();
        new TaskManager(mapNum){

            @Override
            public void process(int start, int end) {
                for(int j=start;j<end;j++){
                    double[][]sum=null;// 对每一个输入map的卷积进行求和
                    for(int i=0;i<lastMapNum;i++){
                        double[][] lastMap=lastLayer.getMap(i);
                        double[][] kernel=layer.getKernel(i, j);
                        if(sum==null){
                            sum=Util.convnValid(lastMap, kernel);
                        }else{
                            sum=Util.matrixOp(Util.convnValid(lastMap, kernel), sum, null, null, OperatorOnTwo.plus);
                        }
                    }
                    final double bias=layer.getBias(j);
                    sum=Util.matrixOp(sum, new Operator(){

                        @Override
                        public double process(double value) {
                            return Util.sigmod(value+bias);
                        }

                    });
                    layer.setMapValue(j, sum);
                }
            }

        }.start();

    }

    /**
     * 根据记录值，设置输入层的输出值
     * @param record
     */
    private void setInLayerOutput(Record record) {
        final Layer inputLayer=layers.get(0);
        final Size mapSize=inputLayer.getMapSize();
        final double[] attr=record.getAttrs();
        if(attr.length!=mapSize.x*mapSize.y){
            throw new RuntimeException("数据记录的大小与定义的map大小不一致!");
        }
        for(int i=0;i<mapSize.x;i++){
            for(int j=0;j<mapSize.y;j++){
                inputLayer.setMapValue(0, i, j, attr[mapSize.x*i+j]);// 将记录属性的一维向量弄成二维矩阵
            }
        }
    }

    private static AtomicBoolean stopTrain;
    static class Lisenter extends Thread{
        Lisenter(){
            setDaemon(true);
            stopTrain=new AtomicBoolean(false);
        }

        @Override
        public void run() {
            System.out.println("输入 & 停止训练.");
            while(true){
                try {
                    int a=System.in.read();
                    if(a=='&'){
                        stopTrain.compareAndSet(false, true);
                        break;
                    }
                } catch (IOException e) {
                    // TODO 自动生成的 catch 块
                    e.printStackTrace();
                }
            }
            System.out.println("停止监听");
        }

    }

    public static class LayerBuilder{
        private List<Layer> mLayers;

        public LayerBuilder(){
            mLayers=new ArrayList<Layer>();
        }
        public LayerBuilder(Layer layer){
            this();
            mLayers.add(layer);
        }
        public LayerBuilder addLayer(Layer layer){
            mLayers.add(layer);
            return this;
        }

        public List<Layer> getmLayers() {
            return mLayers;
        }

        public void setmLayers(List<Layer> mLayers) {
            this.mLayers = mLayers;
        }
    }

    /**
     * 序列化保存模型
     * @param fileName
     */
    public void saveModel(String fileName){
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(this);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
    }

    /**
     * 反序列化生成模型
     * @param fileName
     * @return
     */
    public static CNN loadModel(String fileName){
        try {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName));
            CNN cnn=(CNN) in.readObject();
            in.close();
            return cnn;
        } catch (FileNotFoundException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return null;
    }

    public List<Layer> getLayers() {
        return layers;
    }
}

