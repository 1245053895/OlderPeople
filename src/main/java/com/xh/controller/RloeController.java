package com.xh.controller;


import com.xh.po.AdminRole;
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
    @RequestMapping("/RloeController.action")
    public String RloeController(Model model){
       List<AdminRole> adminRoles= roleManageServ.queryRoleAndAdmin();
       model.addAttribute("adminRoles",adminRoles);
       return "/jsp/admin/admin_Competence.jsp";
    }

}
