package com.xh.util.cnn;

import com.xh.util.cnn.*;
import com.xh.util.cnn.CNN.LayerBuilder;
import com.xh.util.cnn.Layer.Size;

public class CreateCNN {
    private static CNN cnn;
    public CreateCNN(int batchSize){
        LayerBuilder builder = new LayerBuilder();
        builder.addLayer(Layer.buildInputLayer(new Size(28, 28)));// 初始化输入层  设置map的大小为28*28  输入层的map个数为默认为1
        builder.addLayer(Layer.buildConvLayer(6, new Size(5,5)));//构造卷积层: 6是卷积层的map个数  5*5是卷积核大小
        builder.addLayer(Layer.buildSampLayer(new Size(2, 2)));//构造采样层  均值卷积核大小2*2
        builder.addLayer(Layer.buildConvLayer(12, new Size(5, 5)));//构造卷积层 : 12是卷积层的map个数  5*5是卷积核大小
        builder.addLayer(Layer.buildSampLayer(new Size(2, 2)));//构造采样层 : 均值卷积核大小2*2
        builder.addLayer(Layer.buildOutputLayer(45));//构造输出层,类别个数，根据类别的个数来决定输出单元的个数(样本是数字 0-9)
        cnn = new CNN(builder, batchSize);  //批处理大小10,就是10个数据(10幅图片)更新一次权重,越大越不准
    }
    public static CNN getCNN(int batchSize){
        new CreateCNN(batchSize);
        return cnn;
    }
}

