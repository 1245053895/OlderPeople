package com.xh.service.customerService;

import com.xh.po.Gainaddres;
import com.xh.po.User;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
public interface UserLoginService {
    //查询出所有登录用户的用户名和密码
    public User selectAllNameAndPwd(String username);




}
