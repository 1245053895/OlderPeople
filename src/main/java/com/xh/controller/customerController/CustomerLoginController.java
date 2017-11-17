package com.xh.controller.customerController;

import com.xh.po.User;
import com.xh.po.Userlog;
import com.xh.po.vo.TotalCreditsById;
import com.xh.service.customerService.UserLoginService;
import com.xh.util.NetworkUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
public class CustomerLoginController {
    @Autowired
    private UserLoginService userLoginService;

    //通过该url进入到商城的首页面
    @RequestMapping(value = "/ShopFrontPage.action", method = RequestMethod.GET)
    public String login() {
        return "/jsp/users/index.jsp";
    }

    //进入商城的登录页面
    @RequestMapping("/LoginPage.action")
    public String LoginPage(){
        return "/jsp/users/login.jsp";
    }

    //前端用户登录的验证
    @RequestMapping("/CustomerLogin.action")
    public String CustomerLogin(String username, String password, HttpServletRequest request, HttpServletResponse response, Model model){
        Userlog userlog=new Userlog();
        if (username != null) {
            if (password != null) {
                User user= userLoginService.selectAllNameAndPwd(username);
                if (user != null) {
                    if (user.getUserpwd().equals(password)) {
                        HttpSession session = request.getSession();
                        session.setMaxInactiveInterval(600*60*60);
                        session.setAttribute("user", user);
                        userlog.setUserid(user.getUserid());
                        userlog.setStartlogintime(new Date());
                        try {
                            userlog.setUserip(NetworkUtil.getIpAddress(request));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        userLoginService.insertStartTimeAndIp(userlog);
                        return "/jsp/users/index.jsp";
                    } else {
                        model.addAttribute("error", "密码不正确");
                    }
                } else {
                    model.addAttribute("error", "用户名不正确");
                }
            } else {
                model.addAttribute("error", "密码不能为空");
            }
        } else {
            model.addAttribute("error", "用户名不能为空");
        }
        return "/jsp/users/login.jsp";

    }

    //清空session中的值，使退出登录的用户能够调转到当前商城首页而没有用户名
    @RequestMapping("/ExitLogin.action")
    public String ExitLogin(HttpServletRequest request,HttpServletResponse response,Userlog userlog){
        HttpSession session=request.getSession();
        User user= (User)session.getAttribute("user");
        userlog.setUserid(user.getUserid());
        userlog.setEndlogintime(new Date());
        userLoginService.updateEndLoginTime(userlog);
        session.removeAttribute("user");
        return "redirect:/ShopFrontPage.action";
    }

    //用户注册页
    @RequestMapping("/CustomerReginster.action")
    public String CustomerReginster(User user){
        user.setUserinputdate(new Date());
        userLoginService.insertNewUser(user);
        return "/jsp/users/login.jsp";
    }


    //个人中心里跳转到修改密码的页面
    @RequestMapping("/UpdataPwdPage.action")
    public  String UpdataPwdPage(){
        return "/jsp/users/my-user.jsp";
    }

    //个人中心里根据登录用户的id修改登录密码
    @RequestMapping("/updateLoginPassword.action")
    public String updateLoginPassword(HttpServletRequest request,User user){
        HttpSession session=request.getSession();
        User user2=(User)session.getAttribute("user");
        user.setUserid(user2.getUserid());
        user.getUserpwd();
        userLoginService.updataPwdById(user);
        return "/jsp/users/my-user.jsp";
    }

    //个人中心里根据登录用户的id修改电话
    @RequestMapping("/updataLoginPhone.action")
    public String updataLoginPhone(HttpServletRequest request,User user){
        HttpSession session=request.getSession();
        User user1=(User) session.getAttribute("user");
        user.setUserid(user1.getUserid());
        user.getUserphone();
        userLoginService.updataLoginPhone(user);
        return "/jsp/users/my-user.jsp";
    }

    //个人中心中我的积分页面的展示,以及每一个用户购买的所有商品的总积分
    @RequestMapping("/MyCredits.action")
    public String MyCredits(Model model,HttpServletRequest request,Integer userid){
        HttpSession session=request.getSession();
        User user= (User)session.getAttribute("user");
         userid= user.getUserid();
       List<TotalCreditsById> totalCreditsByIds= userLoginService.queryAllById(userid);
        TotalCreditsById totalCreditsById=  userLoginService.queryTotalCriditsById(userid);
       model.addAttribute("totalCreditsByIds",totalCreditsByIds);
       model.addAttribute("totalCreditsById",totalCreditsById);
        return "/jsp/users/jifen.jsp";
    }

    //积分说明
    @RequestMapping("/CreditsMean.action")
    public String CreditsMean(){
        return "jsp/users/jifensm.jsp";
    }



    //查询出商品的图片，名称，描述，价格，展示在商城的首页


}
