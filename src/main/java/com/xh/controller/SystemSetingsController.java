package com.xh.controller;

import com.xh.po.Systemset;
import com.xh.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
public class SystemSetingsController {
    @Autowired
    private SystemService systemService;

    //查询并显示
    @RequestMapping(value = "/SelectSystems.action", method = {RequestMethod.GET, RequestMethod.POST})
    public String SelectSystems(Model model, HttpServletRequest request, HttpServletResponse response) {
        Systemset systemset = systemService.SelectSystemsQuerry();
        model.addAttribute("systemset", systemset);
     /*   HttpSession session=request.getSession();
        session.setAttribute("SystemSitings",systemSitings1);*/
        return "/jsp/admin/Systems.jsp";
    }

    //系统设置的编辑
    @RequestMapping(value = "/AddSystem.action", method = {RequestMethod.GET, RequestMethod.POST})
    public String AddSystem(Systemset systemset, Model model, MultipartFile webicons, HttpSession session) throws IllegalStateException, IOException {
        String sqlPath = null;
        if (webicons != null && webicons.getOriginalFilename() != null) {
            String path = session.getServletContext().getRealPath("/jsp/admin/images/upload");
            String realName = webicons.getOriginalFilename();
            String realFilePath = path + File.separator + realName;
            File file = new File(realFilePath);
            webicons.transferTo(file);
            systemset.setWebicon(realFilePath);
            sqlPath = "jsp/admin/images/upload/" + realName;
            systemset.setWebicon(sqlPath);
            systemService.updateSystemset(systemset);
            return "/jsp/admin/Systems.jsp";
        }
        return null;

    }
}
