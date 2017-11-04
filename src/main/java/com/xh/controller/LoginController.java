package com.xh.controller;




import com.xh.po.Admin;
import com.xh.service.LoginService;
//import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by KAIRUN on 2017/10/27.
 */
@Controller
public class LoginController {
    //去登录页面
    @RequestMapping(value = "/LoginController",method= RequestMethod.GET)
    public String login(){
        return "/jsp/admin/login.jsp";
    }
    //提交登录

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/LoginController" ,method = RequestMethod.POST)
    public String login(String username, String password, String returnUrl , HttpServletRequest request, HttpServletResponse response , Model model){
        //1：用户名不能为空
        if (username !=null){
            //2:密码不能为空
            if (password !=null){
                //3:用户名必须正确
                Admin admin =loginService.selectUserByUsername(username);
                if (admin !=null){
                    //4:密码必须正确

                    if (admin.getAdminpwd().equals(password)){
                        HttpSession session = request.getSession();
                        session.setMaxInactiveInterval(52*60);
                        session.setAttribute("username", username);
                        return "/jsp/admin/index.jsp";
                    }else {
                        model.addAttribute("error","密码不正确");
                    }
                }else {
                    model.addAttribute("error","用户名必须正确");
                }
            }else {
                model.addAttribute("error","密码不能为空");
            }
        }else{
            model.addAttribute("error","用户名不能为空");
        }

        return "/jsp/admin/login.jsp";
    }

    //加密
    public String encodePassword(String password){
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
    public String  ShowInformation(){
        return "/jsp/admin/admin_info.jsp";

    }

}
