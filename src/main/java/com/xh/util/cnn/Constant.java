package com.xh.util.cnn;

import java.awt.Color;
import java.io.File;

public class Constant {
    public static String trainFolder = "image";
    public static int width = 450;
    public static int height = 450;
    public static int paintSize=15;
    public static Color paintColor=Color.BLACK;
    public static int smallWidth = 28;
    public static int smallHeight = 28;
    public static int digit = -1;
    public static boolean tag=true;//背景图是否画上或保存
    public static boolean draw=true;//
    public static double grayData[]=new double[784];
    public static String modelName="WEB-INF"+ File.separator+"classes"+ File.separator+"config"+ File.separator+"cnn.modle";
    public static int imageWidth=28;
    public static int imageHeight=28;
}

