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
    /*public MyTimer(List<ProductCustom> productCustoms){
        this.productCustoms=productCustoms;
    }*/
    @Override
    public void run() {
        Map<String,Double> map=new HashMap<String,Double>();
        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        CNNService cnnService = webApplicationContext.getBean(CNNServiceImpl.class);
        productCustoms = cnnService.queryAllProduct();
        /*servletContextEvent.getServletContext().setAttribute("productCustoms", productCustoms);*/

        ServletContext servletContext = webApplicationContext.getServletContext();
        // 得到模型绝对路径
        String modelPath = servletContext.getRealPath(Constant.modelName);
        File modelFile=new File(modelPath);
        for (ProductCustom productCustom:productCustoms){

            String imgPath = servletContext.getRealPath(File.separator+productCustom.getProductpicture());
            double productId=productCustom.getProductid();
            map.put(imgPath,productId);
            String productImgStrB=productCustom.getProductB();
            String productImgStrC=productCustom.getProductC();
            String productImgStr=productImgStrB+","+productImgStrC;
            String []productImgs=productImgStr.split(",");
            for (String productImg:productImgs){
                String productP = servletContext.getRealPath(File.separator+productImg);
                map.put(productP,productId);
            }
        }
        //String path="D:"+File.separator+"img"+File.separator+"test";
        DataUtil dataUtil=DataUtil.load(map);
        if(modelFile.exists()){ //如果模型已经存在
            cnn=CNN.loadModel(modelPath);
            if(cnn==null){
                cnn= CreateCNN.getCNN(1,productCustoms.size()+1);
                cnn.train(dataUtil,2000);
            }else {
                int out=cnn.getLayers().size()-1; //cnn输出层
                int outNum=cnn.getLayers().get(out).getOutMapNum();
                if(outNum<productCustoms.size()){
                    cnn= CreateCNN.getCNN(1,productCustoms.size()+1);
                    cnn.train(dataUtil,2000);
                }else {
                    cnn.train(dataUtil,20);
                }
            }
        }else{
            cnn= CreateCNN.getCNN(1,productCustoms.size()+1);
            cnn.train(dataUtil,2000);
        }
        cnn.saveModel(modelPath);
    }
}
