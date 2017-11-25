package com.xh.util.cnn;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import com.xh.util.cnn.Constant;
import com.xh.util.cnn.DataUtil.Record;

public class DataUtil {
    private List<Record> records;
    private int lableIndex;//答案标志位
    private double maxLable = -1; //记录最大数字

    private DataUtil(){
        this.lableIndex=-1;
        records=new ArrayList<Record>();
    }
    public int size(){
        return records.size();
    }
    public int getLableIndex() {
        return lableIndex;
    }
    public static void main(String[]a){
        String fileName = System.getProperty("user.dir")+File.separator+"dataset"+File.separator+"train.format";
        DataUtil d = DataUtil.load(fileName, ",", 784);
        System.out.println(d.getRecord(1200)+" \n"+d.size());
    }
    /**
     * 从单个文件读取多张图片
     * @param filePath
     * @param tag
     * @param lableIndex
     * @return
     */
    public static DataUtil load(String filePath, String tag, int lableIndex) {
        DataUtil dataUtil=new DataUtil();
        dataUtil.lableIndex=lableIndex;
        File file=new File(filePath);
        try {
            BufferedReader in=new BufferedReader(new FileReader(file));
            String line;
            int k=0;
            while((line=in.readLine())!=null){
                String[] datas=line.split(tag);
                if(datas.length==0){
                    continue;
                }
                double[] data=new double[datas.length];
                BufferedImage grayImage=new BufferedImage(Constant.smallWidth,Constant.smallHeight,BufferedImage.TYPE_BYTE_GRAY);
                for(int i=0;i<datas.length;i++){
                    data[i]=Double.parseDouble(datas[i]);
                }
                Record record=dataUtil.new Record(data);
                dataUtil.append(record);
                if(k%200==0){
                    //System.out.print("▆");
                }
            }

        } catch (FileNotFoundException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        print(dataUtil);
        return dataUtil;
    }

    /**
     * 将图片转为指定尺寸
     * @param file
     * @param width
     * @param height
     * @return
     */
    public static BufferedImage zoomImage(File file,int width,int height){
        BufferedImage tag = null;
        try {
            BufferedImage bi = ImageIO.read(file);
            tag=new BufferedImage(width,height, BufferedImage.TYPE_INT_RGB);
            tag.getGraphics().drawImage(bi, 0, 0, width, height, null);
            String tagFileName="D:"+File.separator+"img"+File.separator+"test"+File.separator+"b12.png";
            //ImageIO.write(tag, "jpg", new File(tagFileName));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return tag;
    }

    /**
     * 根据图片路径读取所有图片或单张图片
     * @param filePath
     * @param lable1 答案
     * @return
     */
    public static DataUtil load(String filePath,double... lable1) {
        DataUtil dataUtil=new DataUtil();

        //dataUtil.lableIndex=-1;
        File file=new File(filePath);
        if(file.exists()){
            if(file.isDirectory()){ //假如是一个文件夹
                File imgs[]=file.listFiles();
                for(File img:imgs){
                    if(img.isFile() &&
                            img.getAbsolutePath().endsWith(".jpg")||
                            img.getAbsolutePath().endsWith(".gif")||
                            img.getAbsolutePath().endsWith(".jfif")||
                            img.getAbsolutePath().endsWith(".png")){

                        dataUtil.lableIndex=-2;

                        //String fileName=img.getName().substring(0, 1);
                        String regex = "(\\d*)_";
                        String fileName=getMatcher(regex,img.getName());
                        double lable=Double.parseDouble(fileName);
                        //BufferedImage image = ImageIO.read(img);
                        BufferedImage image=zoomImage(img,28,28);
                        int imageWidth=image.getWidth();
                        int imageHeight=image.getHeight();
                        double data[]=new double[imageWidth*imageHeight];
                        for(int j=0;j<imageWidth;j++){
                            for(int k=0;k<imageHeight;k++){
                                int rgb=image.getRGB(k, j);
                                int R =(rgb & 0xff0000 ) >> 16 ;
                                int G= (rgb & 0xff00 ) >> 8 ;
                                int B= (rgb & 0xff );
                                double gray=R*0.1+G*0.6+B*0.3;
                                data[j*imageWidth+k]=gray<127.5?1:0;
                            }
                        }
                        Record record=dataUtil.new Record(data);
                        record.setLable(lable);
                        dataUtil.append(record);


                    }
                }
            }else{
                if(file.isFile() &&
                        file.getAbsolutePath().endsWith(".jpg")||
                        file.getAbsolutePath().endsWith(".gif")||
                        file.getAbsolutePath().endsWith(".jfif")||
                        file.getAbsolutePath().endsWith(".png")){

                    //String fileName=file.getName().substring(0, 1);
                    String regex = "(\\d*)_";
                    String fileName=getMatcher(regex,file.getName());
                    double lable;
                    if(lable1.length==0) {
                        dataUtil.lableIndex=-1;
                        lable=Double.parseDouble(fileName);
                    }else{
                        dataUtil.lableIndex=-2;
                        lable=lable1[0];
                    }

                    BufferedImage image;
                    //image = ImageIO.read(file);
                    image=zoomImage(file,28,28);
                    int imageWidth=image.getWidth();
                    int imageHeight=image.getHeight();
                    double data[]=new double[imageWidth*imageHeight];
                    for(int j=0;j<imageWidth;j++){
                        for(int k=0;k<imageHeight;k++){
                            int rgb=image.getRGB(k, j);
                            int R =(rgb & 0xff0000 ) >> 16 ;
                            int G= (rgb & 0xff00 ) >> 8 ;
                            int B= (rgb & 0xff );
                            int g= (int) ((R<<16|G<<8|B));
                            double gray=R*0.1+G*0.6+B*0.3;
                            data[j*imageWidth+k]=gray<127.5?1:0;
                        }
                    }
                    Record record=dataUtil.new Record(data);
                    record.setLable(lable);
                    dataUtil.append(record);
                    //System.out.print(dataUtil.getRecord(0));
                }

            }
        }
        print(dataUtil);
        return dataUtil;
    }

    public static DataUtil load(Map<String,Double> map) {
        DataUtil dataUtil=new DataUtil();
        dataUtil.lableIndex=-2;
        BufferedImage image;
        for (Map.Entry<String,Double> entry : map.entrySet()) {
            String productPath=entry.getKey();
            Double productId=entry.getValue();
            System.out.println("Key = " + productId + ", Value = " + productPath);
            File file=new File(productPath);
            image=zoomImage(file,28,28);
            int imageWidth=image.getWidth();
            int imageHeight=image.getHeight();
            double data[]=new double[imageWidth*imageHeight];
            for(int j=0;j<imageWidth;j++){
                for(int k=0;k<imageHeight;k++){
                    int rgb=image.getRGB(k, j);
                    int R =(rgb & 0xff0000 ) >> 16 ;
                    int G= (rgb & 0xff00 ) >> 8 ;
                    int B= (rgb & 0xff );
                    int g= (int) ((R<<16|G<<8|B));
                    double gray=R*0.1+G*0.6+B*0.3;
                    data[j*imageWidth+k]=gray<127.5?1:0;
                }
            }
            Record record=dataUtil.new Record(data);
            record.setLable(productId);
            dataUtil.append(record);
        }

        return dataUtil;
    }

    /**
     * 从图片流里读取图片
     * @param lable
     * @return
     */
    public static DataUtil load(BufferedImage image,double... lable) {
        DataUtil dataUtil=new DataUtil();
        if(lable.length==0) {
            dataUtil.lableIndex=-1;
        }else{
            dataUtil.lableIndex=-2;
        }
        int imageWidth=image.getWidth();
        int imageHeight=image.getHeight();
        double data[]=new double[imageWidth*imageHeight];
        for(int j=0;j<imageWidth;j++){
            for(int k=0;k<imageHeight;k++){
                int rgb=image.getRGB(k, j);
                int R =(rgb & 0xff0000 ) >> 16 ;
                int G= (rgb & 0xff00 ) >> 8 ;
                int B= (rgb & 0xff );
                double gray=Double.valueOf(R*299+G*587+B*144+500)/255000.0;
                data[j*imageWidth+k]=gray<0.7?1:0;
            }
        }
        Record record=dataUtil.new Record(data);
        for(double a:lable){
            System.out.print(a);
        }
        if(lable.length!=0)
            record.setLable(lable[0]);
        dataUtil.append(record);

        print(dataUtil);

        return dataUtil;
    }

    /**
     * 正则字符串裁剪
     * @param regex
     * @param source
     * @return
     */
    public static String getMatcher(String regex, String source) {
        String result = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            result = matcher.group(1);
        }
        return result;
    }

    public void append(Record record) {
        records.add(record);

    }

    public Record getRecord(int index) {
        return records.get(index);
    }

    public class Record {
        // 存储数据
        private double[] attrs;	//
        private Double lable;	//类标

        private Record(double[] attrs, Double lable) {
            this.attrs = attrs;
            this.lable = lable;
        }

        public Record(double[] data) {
            if (lableIndex == -1||lableIndex==-2)
                attrs = data;
            else {
                lable = data[lableIndex];
                if (lable > maxLable)
                    maxLable = lable;
                if (lableIndex == 0)
                    attrs = Arrays.copyOfRange(data, 1, data.length);
                else
                    attrs = Arrays.copyOfRange(data, 0, data.length - 1);
            }
        }

        @Override
        public String toString() {
            return "Record [attrs=" + Arrays.toString(attrs) + ", lable=" + lable + "]";
        }

        /**
         * 该记录的属性
         *
         * @return
         */
        public double[] getAttrs() {
            return attrs;
        }

        /**
         * 该记录的类标
         *
         * @return
         */
        public Double getLable() {
            if (lableIndex == -1)
                return null;
            return lable;
        }

        public void setLable(Double lable) {
            this.lable = lable;
        }
    }
    public static void print(DataUtil data){
        for(int j=0;j<1;j++){
            for(int i=0;i<784;i++){
                System.out.print(data.getRecord(0).getAttrs()[i]==0?"  ":"1 ");
                if(i%28==27)System.out.println();
            }
        }
    }
    public void clear() {
        records.clear();

    }
    public Iterator<Record> iter() {
        return records.iterator();
    }

}

