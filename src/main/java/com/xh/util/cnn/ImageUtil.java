package com.xh.util.cnn;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.imageio.ImageIO;

import com.xh.util.cnn.Constant;
import com.xh.util.cnn.ImageUtil;

public class ImageUtil {

    private static ImageUtil imageUtil;

    public static ImageUtil getInstance() {
        if(imageUtil == null){
            imageUtil = new ImageUtil();
        }
        return imageUtil;
    }
    /**
     * 将一维的灰度矩阵的值转为0(value>=0.7),1(value<0.7)形式
     * @param
     * @return
     */
    public int[] transGrayMatrixFromPanel(double[] input) {
        int[] binaryArray=new int[input.length];
        for(int i=0;i<input.length;i++){
            if(Double.compare(0.7, input[i])>=0){
                binaryArray[i]=1;
            }else{
                binaryArray[i]=0;
            }
        }
        return binaryArray;
    }

    public String saveImage(BufferedImage bSmallImage){
        UUID uuid=java.util.UUID.randomUUID();
        String fileName=String.format("%s"+File.separator+"%d_%s.png",
                Constant.trainFolder,
                Constant.digit,
                uuid);
        try {
            if(fileName!=null){
                ImageIO.write(bSmallImage, "png" ,new File(fileName));
            }
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return Constant.digit+"_"+uuid+".png";
    }
}

