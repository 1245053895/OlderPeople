package com.xh.mapper;

import com.xh.po.User;
import com.xh.po.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    //根据用户Id删除用户
    void deleteByPrimaryKey(Integer userid);
    //增加用户
    void insertSelective(User record);
    //根据用户Id查询用户
    User selectByPrimaryKey(Integer userid);
    //更新用户的信息
    void updateByPrimaryKeySelective(User record);
    //根据用户名查询用户
    public User selectByPrimaryKeyByname(String username);
}