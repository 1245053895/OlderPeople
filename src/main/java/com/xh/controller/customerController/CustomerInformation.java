package com.xh.controller.customerController;

import com.xh.po.User;
import com.xh.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CustomerInformation {
    @Autowired
    private UserMessageService userMessageService;
    //用户
    @RequestMapping(value = "/CustomerInformation.action",method = {RequestMethod.GET,RequestMethod.POST})
    public  String CustomerInformation(Model model){
       List<User> userList=userMessageService.qullyAllUser();
       model.addAttribute(userList);
        return null;
    }
    @RequestMapping(value = "/CustomerDelect.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String CustomerUpdate(Model model,User user){
        userMessageService.updateByPrimaryKeySelective(user);
        return null;
    }
}
