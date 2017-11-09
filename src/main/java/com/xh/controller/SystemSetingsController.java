package com.xh.controller;

import com.xh.po.vo.SystemSitings;
import com.xh.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class SystemSetingsController {
    //系统设置
    @Autowired
    private SystemService systemService;
    @RequestMapping(value = "/AddSystem.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String AddSystem(SystemSitings systemSitings, Model model){
        systemService.insertSystem(systemSitings);
        model.addAttribute("systemSitings",systemSitings);
        return "/jsp/admin/Systems.jsp";
    }

}
