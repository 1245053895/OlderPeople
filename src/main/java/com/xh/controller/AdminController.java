package com.xh.controller;

import com.xh.po.Admin;
import com.xh.po.Admingroup;
import com.xh.po.vo.AdminVo;
import com.xh.po.vo.kindOfAdmin;
import com.xh.service.AdminManage;
import com.xh.service.RoleManageServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminManage adminManage;
    @Autowired
    private RoleManageServ roleManageServ;
    //查询全部管理员
    @RequestMapping(value="adminList.action",method={RequestMethod.POST,RequestMethod.GET})
    public String  queryAllUsers(Model model){
        List<AdminVo> adminList = adminManage.queryAdminAndGroup();
        List<kindOfAdmin> kindOfAdmins =  adminManage.kindOfAdmin();
        kindOfAdmin  kindOfAdmin2=roleManageServ.adminCount2();
        model.addAttribute("kindOfAdmin2", kindOfAdmin2);
        model.addAttribute("kindOfAdmins", kindOfAdmins);
        model.addAttribute("adminList", adminList);
        List<Admingroup> admingroupnames=adminManage.selectAdminGroupName();
        model.addAttribute("admingroupnames",admingroupnames);
        //这个方法的返回值就是要跳转的页面的逻辑视图名称
        return "/jsp/admin/administrator.jsp";
    }



    //查询各类管理员
    @RequestMapping(value="kindOfAdmin.action",method={RequestMethod.POST,RequestMethod.GET})
    public String  queryKindOfAdmin(Model model){
        List<kindOfAdmin> kindOfAdmins =  adminManage.kindOfAdmin();
        model.addAttribute("kindOfAdmins", kindOfAdmins);
        //这个方法的返回值就是要跳转的页面的逻辑视图名称
        return "/jsp/admin/administrator.jsp";
    }



    //显示各角色的管理员
    @RequestMapping(value="adminkindOfAdmins.action",method={RequestMethod.POST,RequestMethod.GET})
    public String  adminkindOfAdmins(String admingroupid,Model model){
        List<AdminVo> adminList =  adminManage.queryAdminAndGroup3(admingroupid);
        List<kindOfAdmin> kindOfAdmins =  adminManage.kindOfAdmin();
        kindOfAdmin  kindOfAdmin2=roleManageServ.adminCount2();
        model.addAttribute("kindOfAdmin2", kindOfAdmin2);
        model.addAttribute("kindOfAdmins", kindOfAdmins);
        model.addAttribute("adminList", adminList);
        //这个方法的返回值就是要跳转的页面的逻辑视图名称
        return "/jsp/admin/administrator.jsp";
    }

    //通过Id删除数据
    @RequestMapping("/deleteByPrimaryKey.action")
    public String deleteByPrimaryKey(Integer id){
        adminManage.deleteByPrimaryKey(id);
        return "/admin/adminList.action";
    }

    //通过管理员登录名称模糊查询
    @RequestMapping("/mohuSelectByName.action")
    public String mohuSelectByName(Model model,String name){
        List<Admin> admins= adminManage.mohuSelectByName(name);
        model.addAttribute("adminList",admins);
        model.addAttribute("name",name);
        return  "/admin/kindOfAdmin.action";
    }
    //添加新的管理员
    @RequestMapping("/insert.action")
    public String  insert(Admin admin){
        adminManage.insert(admin);
        return  "/admin/adminList.action";

    }
    //批量删除管理员列表
    @RequestMapping("/deleteBatch.action")
    public String deleteBatch(int[] postIds){
        for(int i=0;i<postIds.length;i++){
            adminManage.deleteByPrimaryKey(postIds[i]);
        }
        return "/admin/adminList.action";
    }
}
