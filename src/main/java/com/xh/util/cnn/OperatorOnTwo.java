package com.xh.util.cnn;

import java.io.Serializable;

public interface OperatorOnTwo extends Serializable{
    public double process(double a,double b);

    /**
     * 定义矩阵对应元素的加法操作
     */
    public static OperatorOnTwo plus=new OperatorOnTwo(){

        @Override
        public double process(double a, double b) {
            // TODO 自动生成的方法存根
            return a+b;
        }

    };
    /**
     * 定义矩阵对应元素的乘法操作
     */
    public static OperatorOnTwo multiply=new OperatorOnTwo(){

        @Override
        public double process(double a, double b) {
            // TODO 自动生成的方法存根
            return a*b;
        }

    };
    /**
     * 定义矩阵对应元素的减法操作
     */
    public static OperatorOnTwo minus=new OperatorOnTwo(){

        @Override
        public double process(double a, double b) {
            // TODO 自动生成的方法存根
            return a-b;
        }

    };

}

