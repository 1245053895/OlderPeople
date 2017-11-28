package com.xh.util.cnn;

import java.io.Serializable;

public interface Operator extends Serializable{
    public double process(double value);
    /**
     *  定义每个元素value都进行1-value的操作
     */
    public static final Operator one_value=new Operator(){

        @Override
        public double process(double value) {
            // TODO 自动生成的方法存根
            return 1-value;
        }

    };

    /**
     * digmod函数
     */
    public static final Operator digmod=new Operator(){

        @Override
        public double process(double value) {
            // TODO 自动生成的方法存根
            return 1/(1+Math.pow(Math.E, -value));
        }

    };

}

