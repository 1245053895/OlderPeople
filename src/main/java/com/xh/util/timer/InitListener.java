package com.xh.util.timer;

import com.xh.po.Product;
import com.xh.po.vo.ProductCustom;
import com.xh.service.customerService.CNNService;
import com.xh.serviceimp.customerServiceImpl.CNNServiceImpl;
import com.xh.util.cnn.ConcurenceRunner;
import com.xh.util.cnn.Constant;
import netscape.security.Privilege;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;

import com.xh.util.cnn.ConcurenceRunner.TaskManager;

@Component
public class InitListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //获取容器和相关的Service
        Timer t=new Timer();
        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(servletContextEvent.getServletContext());
        CNNService cnnService = ac.getBean(CNNServiceImpl.class);
        List<ProductCustom> productCustoms_1 = cnnService.queryAllProduct(0,32);
        t.schedule(new MyTimer(productCustoms_1, Constant.modelName+ File.separator+"product_1.model",0), 24*60*60*1000,24*60*60*1000);//一小时执行一次

        List<ProductCustom> productCustoms_2 = cnnService.queryAllProduct(32,32);
        t.schedule(new MyTimer(productCustoms_2, Constant.modelName+ File.separator+"product_2.model",33), 24*60*60*1000,24*60*60*1000);//一小时执行一次

        List<ProductCustom> productCustoms_3 = cnnService.queryAllProduct(64,32);
        t.schedule(new MyTimer(productCustoms_3, Constant.modelName+ File.separator+"product_3.model",65), 24*60*60*1000,24*60*60*1000);//一小时执行一次

        //servletContextEvent.getServletContext().setAttribute("productCustoms", productCustoms);
        //System.out.println(productCustoms);



    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}