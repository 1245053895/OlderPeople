package com.xh.controller.customerController;

import com.xh.po.User;
import com.xh.service.UserMessageService;
import com.xh.service.customerService.CustomerInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class CustomerInformation {
    @Autowired
    private CustomerInformationService customerInformationService;
    //用户信息
    @RequestMapping(value = "/CustomerInformation.action",method = {RequestMethod.GET,RequestMethod.POST})
    public  String CustomerInformation(HttpSession session,User user, HttpServletRequest request, HttpServletResponse response, Model model){
      /* List<User> userList=customerInformationService.qullyAllUser();*/
     /*  model.addAttribute(userList);*/
        String a=session.getId();
        System.out.print(a);
        return "/jsp/users/user.jsp";
    }
    //修改用户信息
    @RequestMapping(value = "/CustomerUpdate.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String CustomerUpdate( HttpServletRequest request, HttpServletResponse response,Model model){
        User user=new User();
        User user1= (User) request.getSession().getAttribute("user");
        Integer id=user1.getUserid();
        user1.setUserid(id);
        customerInformationService.updateByPrimaryKeySelective(user);
        return "/jsp/users/user.jsp";

    }
}
