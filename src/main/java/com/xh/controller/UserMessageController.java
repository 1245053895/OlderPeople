package com.xh.controller;

import com.xh.po.User;
import com.xh.po.vo.StringAndString;
import com.xh.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by KAIRUN on 2017/10/27.
 */
@Controller
public class UserMessageController {

    @Autowired
    UserMessageService userMessageService;
    /*
    * 对用户全部查询输出到页面上
    * */
    @RequestMapping(value = "/UserMessageController.action")
    public String UseMessage(Model model){
        List<User> userList=userMessageService.qullyAllUser();
        model.addAttribute("userList",userList);
        return "jsp/admin/user_list.jsp";
    }
    /*
    * 实现单个删除查询
    * */
    @RequestMapping(value = "/DelectUserById.action",method ={RequestMethod.POST,RequestMethod.GET})
    public String DelectUserById(Integer Userid, Model model){

        userMessageService.deleteByPrimaryKey(Userid);

        return "redirect:/UserMessageController.action";
    }
    /*
    * 实现模糊查询
    * */
    @RequestMapping(value = "/QueryUserConfuse.action",method = {RequestMethod.POST,RequestMethod.GET})
    public String QueryUserConfuse(StringAndString stringAndString ,Model model ){
        model.addAttribute("stringAndString",stringAndString);
        List<User> userList=userMessageService.QueryUserConfuse(stringAndString);
        model.addAttribute(userList);
        return "/jsp/admin/user_list.jsp";
    }
}
