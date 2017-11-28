package com.xh.controller.Interceptors;

import com.xh.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by KAIRUN on 2017/11/20.
 */
public class LoginInterceptors implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String Url=httpServletRequest.getHeader("referer");

        HttpSession session=httpServletRequest.getSession();
        User user= (User) session.getAttribute("user");
       if (user!=null){
           //身份存在，放行
           return true;
       }
       //执行这里表示用户的身份需要认证，跳转到登录页面。

        httpServletRequest.getRequestDispatcher("/LoginPage.action?returnUrl="+Url).forward(httpServletRequest,httpServletResponse);
        return false;

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
