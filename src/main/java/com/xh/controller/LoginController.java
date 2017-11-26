package com.xh.controller;




import com.xh.po.Admin;
import com.xh.po.vo.AdminFirstViewCustom;
import com.xh.po.vo.AdminRole;
import com.xh.service.LoginService;
//import org.apache.commons.codec.binary.Hex;
import com.xh.service.RoleManageServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by KAIRUN on 2017/10/27.
 */
@Controller
public class LoginController {
    //去登录页面
    @RequestMapping(value = "/LoginController", method = RequestMethod.GET)
    public String login() {
        return "/jsp/admin/login.jsp";
    }
    //提交登录

    @Autowired
    private LoginService loginService;


    @RequestMapping(value = "/LoginController", method = RequestMethod.POST)
    public String login(String username, String password, String returnUrl, HttpServletRequest request, HttpServletResponse response, Model model) {
        //1：用户名不能为空
        if (username != null) {
            //2:密码不能为空
            if (password != null) {
                //3:用户名必须正确
                Admin admin = loginService.selectUserByUsername(username);
                if (admin != null) {
                    //4:密码必须正确

                    if (admin.getAdminpwd().equals(password)) {
                        List<AdminFirstViewCustom> adminFirstViewCustoms= loginService.selectFirstViewByUserId(admin.getAdminid());
                        model.addAttribute("adminFirstViewCustoms",adminFirstViewCustoms);
                        HttpSession session = request.getSession();
                        session.setMaxInactiveInterval(52 * 60);
                        /*session.setAttribute("username", username);
                        session.setAttribute("password",password);*/

                        session.setAttribute("admin", admin);

                        //获取ip
                        String ip = request.getHeader("x-forwarded-for");
                        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                            ip = request.getHeader("Proxy-Client-IP");
                        }
                        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                            ip = request.getHeader("WL-Proxy-Client-IP");
                        }
                        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                            ip = request.getRemoteAddr();
                        }
                        session.setAttribute("ip",ip);


                        return "/jsp/admin/index.jsp";
                    } else {
                        model.addAttribute("error", "密码不正确");
                    }
                } else {
                    model.addAttribute("error", "用户名必须正确");
                }
            } else {
                model.addAttribute("error", "密码不能为空");
            }
        } else {
            model.addAttribute("error", "用户名不能为空");
        }





        return "/jsp/admin/login.jsp";
    }

    //加密
    public String encodePassword(String password) {
        //
        //password = "gxzcwefxcbergfd123456errttyyytytrnfzeczxcvertwqqcxvxb";
        //1:MD5  算法
        String algorithm = "MD5";
        char[] encodeHex = null;
        try {
            //MD5加密
            MessageDigest instance = MessageDigest.getInstance(algorithm);
            //加密后
            byte[] digest = instance.digest(password.getBytes());
            //
            //2:十六进制

            //encodeHex = Hex.encodeHex(digest);
        } catch (NoSuchAlgorithmException e) {

            e.printStackTrace();
        }
        return new String(encodeHex);
    }
    //个人资料的显示
    @RequestMapping("/ShowInformation.action")
    public String ShowInformation(Model model, Integer adminid) {
        AdminRole adminRole = loginService.selectMyselfInformation(adminid);
        adminRole.setAdminid(adminid);
        model.addAttribute("adminRole", adminRole);
        return "/jsp/admin/admin_info.jsp";

    }

    //个人资料的保存修改，将修改后的信息写入到数据库中
    @RequestMapping("/UpdateMyselfInformation.action")
    public String UpdateMyselfInformation(Admin admin) {
        loginService.UpdateMyselfInformation(admin);
        return "redirect:/ShowInformation.action?adminid=" + admin.getAdminid();
    }

    //个人资料修改中的密码修改
    @RequestMapping("/updatePasswordById.action")
    public String updatePasswordById(Admin admin) {
        loginService.updatePasswordById(admin);
        // 没有经过查询显示出来的页面没有任何信息，return "/jsp/admin/admin_info.jsp";
        return "redirect:/ShowInformation.action?adminid=" + admin.getAdminid();

    }

    @RequestMapping("/uploadUser.action")
    //MultipartFile userphoto 表示上传字段
    public String addUser2(Integer adminid,MultipartFile adminpic, HttpSession session) throws IllegalStateException, IOException {
        Admin admin=new Admin();
        String sqlPath = null;
        if (adminpic != null && adminpic.getOriginalFilename() != null) {
            //在这里进行文件保存操作
            //传进去的是一个路径，返回的也是一个路径
            String path = session.getServletContext().getRealPath("/jsp/admin/images/upload");
            String realName = adminpic.getOriginalFilename();
            String realFilePath = path + File.separator + realName;
            File file = new File(realFilePath);
            adminpic.transferTo(file);
            admin.setAdminpic(realFilePath);
            sqlPath = "jsp/admin/images/upload/"+realName;
            admin.setAdminid(adminid);
            admin.setAdminpic(sqlPath);
            loginService.updateAdminPic(admin);
            return "redirect:/ShowInformation.action?adminid=" + admin.getAdminid();
        }
        return null;
    }
}