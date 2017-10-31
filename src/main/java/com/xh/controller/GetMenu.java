package com.xh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class GetMenu {

    @RequestMapping("/getMenu")
    public String getMenu(Model model){
        Menu menu=new Menu();
        /*Map<String,String[]> menu= new HashMap<String, String[]>();
        String[] view={"订单查询","订单详情"};
        menu.put("订单管理",view);
        String[] view1={"商品查询","商品详情"};
        menu.put("订单管理",view1);*/
        model.addAttribute("menu",menu);
        return null;
    }

    class Menu{
        Map<String,String[]> menu= new HashMap<String, String[]>();

    }
}
