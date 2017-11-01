package com.xh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by KAIRUN on 2017/10/27.
 */
@Controller
public class LoginController {
    //去登录页面
    @RequestMapping(value = "/LoginController",method= RequestMethod.GET)
    public String login(){
        return "/jsp/admin/login.jsp";
    }
    //提交登录
    @RequestMapping(value = "/LoginController",method = RequestMethod.POST)
    public String TestController(String username, String password, String returnUrl,Model model){
        return "/jsp/admin/login.jsp";
    }
}
