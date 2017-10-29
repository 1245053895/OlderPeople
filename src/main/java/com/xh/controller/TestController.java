package com.xh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by KAIRUN on 2017/10/27.
 */
@Controller
public class TestController {
    @RequestMapping("/TestController")
    public String TestController(){
        return  "/jsp/admin/login.html";
    }
}
