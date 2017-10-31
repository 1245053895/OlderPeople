package com.xh.controller;


import com.xh.po.AdminRole;
import com.xh.po.Admingroup;
import com.xh.service.RoleManageServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    /**
     * 查询出每个后台用户对应的角色名称和角色描述
     */
    @RequestMapping("/RloeController.action")
    public String RloeController(Model model){
        List<AdminRole> adminRoles= roleManageServ.queryRoleAndAdmin();
        model.addAttribute("adminRoles",adminRoles);
        return "/jsp/admin/admin_Competence.jsp";
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
        return "/jsp/admin/Category_Manage.jsp";

    }

}
