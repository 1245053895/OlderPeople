package com.xh.controller;

import com.xh.po.Admin;
import com.xh.po.vo.AdminVo;
import com.xh.service.AdminManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AdminController {
     @Autowired
    private AdminManage adminManage;
     //查询全部管理员
   @RequestMapping(value="adminList.action",method={RequestMethod.POST,RequestMethod.GET})
    public String  queryAllUsers(Model model){
        List<AdminVo> adminList = adminManage.queryAdminAndGroup();
        model.addAttribute("adminList", adminList);
        //这个方法的返回值就是要跳转的页面的逻辑视图名称
        return "/jsp/admin/administrator.jsp";
    }

    //查询各类管理员
    @RequestMapping(value="admin1.action",method={RequestMethod.POST,RequestMethod.GET})
    public String  queryKindOfAdmin(Model model){
        List<AdminVo> adminList = adminManage.queryAdminAndGroup();
        model.addAttribute("adminList", adminList);
        //这个方法的返回值就是要跳转的页面的逻辑视图名称
        return "/jsp/admin/administrator.jsp";
    }









    //查询一个管理员
    @RequestMapping(value="admin.action",method={RequestMethod.POST,RequestMethod.GET})
    // @RequestMapping("/adminList")
    public String  queryAdmin(Model model){
        Admin admin = adminManage.selectByPrimaryKey(1);
        model.addAttribute("admin", admin);
        //这个方法的返回值就是要跳转的页面的逻辑视图名称
        return "";
    }



}
