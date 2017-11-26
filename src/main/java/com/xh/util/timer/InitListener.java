package com.xh.util.timer;

import com.xh.po.Product;
import com.xh.po.vo.ProductCustom;
import com.xh.service.customerService.CNNService;
import com.xh.serviceimp.customerServiceImpl.CNNServiceImpl;
import com.xh.util.cnn.ConcurenceRunner;
import netscape.security.Privilege;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
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
        WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(servletContextEvent.getServletContext());
        CNNService cnnService = ac.getBean(CNNServiceImpl.class);
        List<ProductCustom> productCustoms = cnnService.queryAllProduct();
        servletContextEvent.getServletContext().setAttribute("productCustoms", productCustoms);
        System.out.println(productCustoms);

        Timer t=new Timer();
        t.schedule(new MyTimer(productCustoms), 1000,1*60*1000);//一小时执行一次

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}