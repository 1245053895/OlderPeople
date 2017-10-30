package com.xh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by KAIRUN on 2017/10/30.
 */
@Controller
public class LoginController {
    @RequestMapping("/LoginController")
    public String LoginController(){
        return "/jsp/admin/login.jsp";
    }
}
