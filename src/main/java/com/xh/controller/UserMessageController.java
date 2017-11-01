package com.xh.controller;

import com.xh.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by KAIRUN on 2017/10/27.
 */
@Controller
public class UserMessageController {
    @Autowired
    UserMessageService userMessageService;
    @RequestMapping("/TestController.action")
    public String TestController(){
        return "/jsp/admin/login.jsp";
    }
}
