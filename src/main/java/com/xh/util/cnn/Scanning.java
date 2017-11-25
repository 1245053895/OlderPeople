package com.xh.util.cnn;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Scanning {
    public static String fileName;
    private int data[][][];;

    public Scanning(){
        init();
    }

    private void init() {
        fileName=System.getProperty("user.dir")+File.separator+"scanning"+File.separator+"scanning.jpg";

    }

    public static void handling(){
        File file=new File(fileName);
        if(file.exists()){
            try {
                BufferedImage image=ImageIO.read(file);
                int width=image.getWidth();
                int height=image.getHeight();
                double img[]=new double[width*height];
                for(int i=0;i<width;i++){
                    for(int j=0;j<height;j++){
                        int rgb=image.getRGB(j, i);
                        int R =(rgb & 0xff0000 ) >> 16 ;
                        int G= (rgb & 0xff00 ) >> 8 ;
                        int B= (rgb & 0xff );
                        double gray=R*0.1+G*0.6+B*0.3;
                        img[i*width+j]=gray<127.5?1:0;
                    }
                }

                for(int i=14;i<width;i++){
                    for(int j=0;j<width-i;j++){
                        for(int k=0;k<width-i;k++){

                        }
                    }
                }
            } catch (IOException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
        }
    }
}

