package com.xh.controller;


import com.xh.po.vo.AdminRole;
import com.xh.po.Admingroup;
import com.xh.po.vo.AdminRoleCustom;
import com.xh.po.Firstview;
import com.xh.service.RoleManageServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by KAIRUN on 2017/10/30.
 */
@Controller
public class RloeController {
    @Autowired
    private RoleManageServ roleManageServ;
    @RequestMapping("/RloeController.action")
    public String RloeController(Model model){
       List<AdminRole> adminRoles= roleManageServ.queryRoleAndAdmin();
       model.addAttribute("adminRoles",adminRoles);
       return "/jsp/admin/admin_Competence.jsp";
    }

    /**
     * 获取所有一级菜单
     * @param model
     * @return
     */
    @RequestMapping("/getFirstview")
    public String getFirstview(Model model){
        List<Firstview> firstviewList=roleManageServ.selectAllFirstview();
        model.addAttribute("firstviewList",firstviewList);
        return "/jsp/admin/Competence.jsp";
    }

    @RequestMapping("/addRloeAndView")
    public String addRloeAndView(AdminRoleCustom adminRoleCustom){
        //首先将新增角色插入数据库
        roleManageServ.insertRloe(adminRoleCustom);
        //通过新插入的角色名查找到
        Integer id=roleManageServ.selectRloeIdByName(adminRoleCustom.getAdmingroupname());
        adminRoleCustom.setAdmingroupid(id);

        //然后给角色分配权限
        roleManageServ.insertRloeAndFirstView(adminRoleCustom);

        return "forward:queryAllRole.action";
    }
    /**
     * 角色修改页面，只包括对角色表的查询
     */
    @RequestMapping("/queryAllRole.action")
    public String queryAllRole(Model model){
        List<Admingroup> admingroups=roleManageServ.queryAllRole();
        model.addAttribute("admingroups",admingroups);
        return "/jsp/admin/Category_Manage.jsp";
    }
    /**
     * 角色修改页面，实现对角色的删除
     */
    @RequestMapping("/deleteRoleById.action")
    public String deleteRoleById(int id){
        roleManageServ.deleteRoleById(id);
       // return "/jsp/admin/Category_Manage.jsp";
        return "redirect:/queryAllRole.action";

    }
    //根据管理员的名称来进行迷糊查询
    @RequestMapping("/moHuSelectByAdminUser.action")
    public String moHuSelectByAdminUser(Model model,String adminuser){
        List<AdminRole> adminRoles=roleManageServ.moHuSelectByAdminUser(adminuser);
        model.addAttribute("adminRoles",adminRoles);
        return  "/jsp/admin/admin_Competence.jsp";
    }


    //对角色修改页面进行批量删除
    @RequestMapping("/deletBatchRole.action")
    public  String deletBatchRole(String RoleIds){
        String[] ids=RoleIds.split(",");
        for(int i=0;i<ids.length;i++){
            roleManageServ.deleteRoleById(Integer.parseInt(ids[i]));
        }
        return "redirect:/queryAllRole.action";
    }

    /**
     * 通过角色id 修改角色信息
     * @param adminRoleCustom
     * @return
     */
    @RequestMapping("/updateRloeById")
    public String updateRloeById(AdminRoleCustom adminRoleCustom){
        roleManageServ.updateRloeById(adminRoleCustom);
        return "redirect:/queryAllRole.action";
    }


}
