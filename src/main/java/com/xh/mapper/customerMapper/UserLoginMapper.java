package com.xh.mapper.customerMapper;

import com.xh.po.Gainaddres;
import com.xh.po.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
@Component
public interface UserLoginMapper {

    //查询出所有登录用户的用户名和密码
    public User selectAllNameAndPwd(String username);
}
