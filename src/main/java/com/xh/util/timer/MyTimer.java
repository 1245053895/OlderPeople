package com.xh.util.timer;

import com.xh.po.vo.ProductCustom;
import com.xh.service.customerService.CNNService;
import com.xh.serviceimp.customerServiceImpl.CNNServiceImpl;
import com.xh.util.cnn.*;
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
    String modelPath;
    int num;

    public MyTimer(List<ProductCustom> productCustoms, String modelPath,int num) {
        this.productCustoms=productCustoms;
        this.modelPath=modelPath;
        this.num=num;
    }

    /*public MyTimer(List<ProductCustom> productCustoms){
        this.productCustoms=productCustoms;
    }*/
    @Override
    public void run() {
        Map<String,Double> map=new HashMap<String,Double>();
        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        ServletContext servletContext = webApplicationContext.getServletContext();
        String modelPathReal = servletContext.getRealPath(modelPath);
        File modelPathFile=new File(modelPathReal);
        for (ProductCustom productCustom:productCustoms){

            String imgPath = servletContext.getRealPath(File.separator+productCustom.getProductpicture());
            double productId=productCustom.getProductid();
            map.put(imgPath,productId-num);
            String productImgStrB=productCustom.getProductB();
            String productImgStrC=productCustom.getProductC();
            String productImgStr=productImgStrB+","+productImgStrC;
            String []productImgs=productImgStr.split(",");
            for (String productImg:productImgs){
                String productP = servletContext.getRealPath(File.separator+productImg);
                map.put(productP,productId-num);
            }
        }
        //String path="D:"+File.separator+"img"+File.separator+"test";
        DataUtil dataUtil=DataUtil.load(map);
        if(modelPathFile.exists()){ //如果模型已经存在
            cnn=CNN.loadModel(modelPathReal);
            if(cnn==null){
                cnn= CreateCNN.getCNN(1,productCustoms.size()+1);
                cnn.train(dataUtil,400);
            }else {
                int out=cnn.getLayers().size()-1; //cnn输出层
                int outNum=cnn.getLayers().get(out).getOutMapNum();
                if(outNum<productCustoms.size()){
                    cnn= CreateCNN.getCNN(1,productCustoms.size()+1);
                    cnn.train(dataUtil,400);
                }else {
                    cnn.train(dataUtil,400);
                }
            }
        }else{
            cnn= CreateCNN.getCNN(1,productCustoms.size()+1);
            cnn.train(dataUtil,300);
        }
        cnn.saveModel(modelPathReal);
    }
}
