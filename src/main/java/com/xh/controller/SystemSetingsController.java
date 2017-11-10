package com.xh.controller;

import com.xh.po.vo.SystemSitings;
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
import java.util.List;
import java.util.UUID;

@Controller
public class SystemSetingsController {
    //系统设置
    @Autowired
    private SystemService systemService;
    @RequestMapping(value = "/AddSystem.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String AddSystem(SystemSitings systemSitings, Model model, MultipartFile Iocn_pic){
        systemService.insertSystem(systemSitings);
        //图片原始名称
        String originalFilename = Iocn_pic.getOriginalFilename();
        //上传图片
        if(Iocn_pic!=null && originalFilename!=null && originalFilename.length()>0){

            //存储图片的物理路径
            String pic_path = "E:\\IntelliJ IDEA\\images\\";
            //新的图片名称
            String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
            //新图片
            File newFile = new File(pic_path+newFileName);

            //将内存中的数据写入磁盘
            try {
                Iocn_pic.transferTo(newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }

            //将新图片名称写到itemsCustom中
            systemSitings.setWebicon(newFileName);

        }


        // 调用service添加商品信息
        systemService.insertSystem(systemSitings);

        // 重定向到商品查询列表
        // return "redirect:queryItems.action";
        // 页面请求转发，可带参数到转发的controller方法中（ProducList.action方法中能用本方法中的形参值）
        // return "forward:queryItems.action";


        return "/jsp/admin/Systems.jsp";
    }
    //查询并显示
    @RequestMapping(value = "/SelectSystems.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String SelectSystems(Model model, HttpServletRequest request, HttpServletResponse response ){
        List<SystemSitings> systemSitings1=systemService.SelectSystemsQuerry();
        model.addAttribute("systemSitings1",systemSitings1);
        HttpSession session=request.getSession();
        session.setAttribute("SystemSitings",systemSitings1);
        return "/jsp/admin/Systems.jsp";
    }
}
