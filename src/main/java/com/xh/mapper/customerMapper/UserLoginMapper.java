package com.xh.mapper.customerMapper;

import com.xh.po.User;
import com.xh.po.Userlog;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
@Component
public interface UserLoginMapper {

    //查询出所有登录用户的用户名和密码
    public User selectAllNameAndPwd(String username);

    //注册后插入一个新用户的账号，电话和密码
    public void insertNewUser(User user);


    //根据登录用户的id向用户日志表中插入用户开始登录的时间，用户的登录ip
    public void insertStartTimeAndIp(Userlog userlog);

    //根据用户id插入用户的结束登录时间
   public void updateEndLoginTime(Userlog userlog);


}
