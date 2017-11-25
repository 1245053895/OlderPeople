package com.xh.util.timer;

import com.xh.po.vo.ProductCustom;
import com.xh.util.cnn.CNN;
import com.xh.util.cnn.Constant;
import com.xh.util.cnn.CreateCNN;
import com.xh.util.cnn.DataUtil;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.io.Console;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;

public class MyTimer extends TimerTask {
    CNN cnn;
    List<ProductCustom> productCustoms;
    public MyTimer(List<ProductCustom> productCustoms){
        this.productCustoms=productCustoms;
    }
    @Override
    public void run() {
        Map<String,Double> map=new HashMap<String,Double>();
        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        ServletContext servletContext = webApplicationContext.getServletContext();
        // 得到模型绝对路径
        String modelPath = servletContext.getRealPath(Constant.modelName);
        File modelFile=new File(modelPath);
        if(modelFile.exists()){
            cnn=CNN.loadModel(modelPath);
        }else{
            cnn= CreateCNN.getCNN(1);
        }
        for (ProductCustom productCustom:productCustoms){

            String imgPath = servletContext.getRealPath(File.separator+productCustom.getProductpicture());
            double productId=productCustom.getProductid();
            map.put(imgPath,productId);
            String productImgStr=productCustom.getProductB();
            String []productImgs=productImgStr.split(",");
            for (String productImg:productImgs){
                String productP = servletContext.getRealPath(File.separator+productImg);
                map.put(productP,productId);
            }
        }
        //String path="D:"+File.separator+"img"+File.separator+"test";
        DataUtil dataUtil=DataUtil.load(map);
        cnn.train(dataUtil,2000);
        cnn.saveModel(modelPath);
    }
}
