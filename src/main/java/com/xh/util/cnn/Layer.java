package com.xh.util.cnn;

import java.io.Serializable;

public class Layer implements Serializable{
    private LayerType type;
    private int outMapNum; //输出map的个数
    private Size mapSize;//map的大小
    private Size kernelSize;// 卷积核大小，只有卷积层有
    private Size scaleSize;// 采样大小，只有采样层有
    private double[][][][] kernel;//// 卷积核
    private double[]bias;//偏置，只有卷积层和输出层有
    private double[][][][] outmaps;// 保存各个batch的输出map，outmaps[0][0]表示第一条记录训练下第0个输出map
    private double[][][][] errors;// 残差
    private static int recordInBatch=0;// 记录当前训练的是batch的第几条记录
    private int classNum=-1;//类别
    static int count=0;
    private Layer(){

    }

    /**
     * 准备下一个batch的训练
     */
    public static void prepareForNewBacth(){
        recordInBatch=0;
    }
    /**
     * 准备下一条记录的训练
     */
    public static void prepareForNewRecord(){
        recordInBatch++;
    }
    /**
     * 构造输入层
     * @param mapSize
     * @return
     */
    public static Layer buildInputLayer(Size mapSize){
        Layer layer=new Layer();
        layer.type=LayerType.input;
        layer.outMapNum=1;
        layer.setMapSize(mapSize);
        return layer;
    }

    /**
     * 构造卷积层
     * @param outMapNum
     * @param kernelSize
     * @return
     */
    public static Layer buildConvLayer(int outMapNum,Size kernelSize){
        Layer layer=new Layer();
        layer.type=LayerType.conv;
        layer.outMapNum=outMapNum;
        layer.kernelSize=kernelSize;
        return layer;
    }

    /**
     * 构造采样层
     * @param scaleSize
     * @return
     */
    public static Layer buildSampLayer(Size scaleSize){
        Layer layer=new Layer();
        layer.type=LayerType.samp;
        layer.scaleSize=scaleSize;
        return layer;
    }

    /**
     * 构造输出层,根据类别构造输出层单元个数
     * @param classNum
     * @return
     */
    public static Layer buildOutputLayer(int classNum){
        Layer layer=new Layer();
        layer.classNum=classNum;
        layer.type=LayerType.output;
        layer.setMapSize(new Size(1,1));
        layer.outMapNum=classNum;
        System.out.println("输出map数为"+layer.outMapNum);
        return layer;
    }


    public Size getKernelSize() {
        return kernelSize;
    }

    public Size getScaleSize() {
        return scaleSize;
    }

    public int getOutMapNum() {
        return outMapNum;
    }

    public void setOutMapNum(int outMapNum) {
        this.outMapNum = outMapNum;
    }

    public LayerType getType() {
        return type;
    }

    public Size getMapSize() {
        return mapSize;
    }

    public void setMapSize(Size mapSize) {
        this.mapSize = mapSize;
    }


    /**
     * 初始化卷积核
     * @param frontMapNum
     */
    public void initKernel(int frontMapNum){
        this.kernel=new double[frontMapNum][outMapNum][kernelSize.x][kernelSize.y];
        for(int i=0;i<frontMapNum;i++){
            for(int j=0;j<outMapNum;j++){
                kernel[i][j]=Util.randomMatrix(kernelSize.x,kernelSize.y);
            }
        }
    }

    /**
     * 初始化输出层的卷积核
     * @param frontMapNum
     * @param size
     */
    public void initOutputKernel(int frontMapNum,Size size){
        this.kernelSize=size;
        this.kernel=new double[frontMapNum][outMapNum][kernelSize.x][kernelSize.y];
        for(int i=0;i<frontMapNum;i++){
            for(int j=0;j<outMapNum;j++){
                kernel[i][j]=Util.randomMatrix(kernelSize.x, kernelSize.y);
            }
        }

    }
    /**
     * 初始化偏置
     * @param frontMaoNum
     */
    public void initBias(int frontMaoNum){
        this.bias=Util.randomArray(outMapNum);
    }

    /**
     * 初始化输出map
     * @param batchSize
     */
    public void initOutmaps(int batchSize){
        outmaps=new double[batchSize][outMapNum][mapSize.x][mapSize.y];
    }

    /**
     * 设置map值
     * @param mapNo
     * @param mapX
     * @param mapY
     * @param value
     */
    public void setMapValue(int mapNo,int mapX,int mapY,double value){
        outmaps[recordInBatch][mapNo][mapX][mapY]=value;
    }

    public void setMapValue(int mapNo, double[][] outMatrix) {
        outmaps[recordInBatch][mapNo]=outMatrix;
    }



    public double[][] getMap(int index) {
        return outmaps[recordInBatch][index];
    }
    public double[][] getMap(int recordId, int mapNo) {
        return outmaps[recordId][mapNo];
    }
    /**
     * 得到指定卷积核
     * @param i
     * @param j
     * @return
     */
    public double[][] getKernel(int i,int j) {
        return kernel[i][j];
    }

    /**
     * 设置残差值
     * @param mapNo
     * @param mapX
     * @param mapY
     * @param value
     */
    public void setError(int mapNo,int mapX,int mapY,double value) {
        errors[recordInBatch][mapNo][mapX][mapY]=value;
    }

    /**
     * 以map矩阵块形式设置残差值
     * @param mapNo
     * @param matrix
     */
    public void setError(int mapNo,double[][] matrix){
        errors[recordInBatch][mapNo]=matrix;
    }

    /**
     * 获取第mapNo个map的残差
     * @param mapNo
     * @return
     */
    public double[][] getError(int mapNo){
        return errors[recordInBatch][mapNo];
    }

    /**
     * 获取所有(每个记录和每个map)的残差
     * @return
     */
    public double[][][][]getErrors(){
        return errors;
    }

    /**
     * 初始化残差数组
     * @param batchSize
     */
    public void initErros(int batchSize){
        errors=new double[batchSize][outMapNum][mapSize.x][mapSize.y];
    }

    /**
     * 设置残差
     * @param lastMapNo
     * @param mapNo
     * @param kernel
     */
    public void setKernel(int lastMapNo,int mapNo,double[][] kernel){
        this.kernel[lastMapNo][mapNo]=kernel;
    }

    /**
     * 获取第mapNo个偏置
     * @param mapNo
     * @return
     */
    public double getBias(int mapNo){
        return bias[mapNo];
    }

    /**
     * 设置第mapNo个map的偏置值
     * @param mapNo
     * @param value
     */
    public void setBias(int mapNo,double value){
        bias[mapNo]=value;
    }

    /**
     * 获取batch各个map矩阵
     * @return
     */
    public double[][][][] getMaps(){
        return outmaps;
    }

    /**
     * 获取第recordId记录下第mapNo的残差
     * @param recordId
     * @param mapNo
     * @return
     */
    public double[][] getError(int recordId,int mapNo){
        return errors[recordId][mapNo];
    }

    /**
     * 获取类别数
     * @return
     */
    public int getClassNum(){
        return classNum;
    }

    /**
     * 获取全部卷积核
     * @return
     */
    public double[][][][] getKernel(){
        return kernel;
    }

    enum LayerType{
        input,output,conv,samp;
    }
    public static class Size implements Serializable{
        public final int x;
        public final int y;

        public Size(int x,int y){
            this.x=x;
            this.y=y;
        }
        /**
         * 求采样层的map大小,用上层map大小除以下层scaleSize(采样)大小
         * @param scaleSize
         * @return
         */
        public Size divide(Size scaleSize){
            int x=this.x/scaleSize.x;
            int y=this.y/scaleSize.y;
            if(x*scaleSize.x!=this.x||y*scaleSize.y!=this.y){
                throw new RuntimeException(this+"不能整除"+scaleSize);
            }
            return new Size(x,y);
        }
        /**
         * 求卷积层的map大小.用上层map大小减去(kernelSize)卷积核大小加1
         * @param size
         * @param append
         * @return
         */
        public Size subtract(Size size,int append){
            int x=this.x-size.x+append;
            int y=this.y-size.y+append;
            return new Size(x,y);
        }
        @Override
        public String toString() {
            return "Size [x=" + x + ", y=" + y + "]";
        }

    }

}

