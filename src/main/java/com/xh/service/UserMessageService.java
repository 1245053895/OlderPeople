package com.xh.service;

import com.xh.po.User;
import com.xh.po.vo.StringAndString;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserMessageService {
    //根据用户Id删除用户
    public void deleteByPrimaryKey(Integer userid);
    //增加用户
    public void insertSelective(User record);
    //根据用户Id查询用户
    public User selectByPrimaryKey(Integer userid);
    //更新用户的信息
    public void updateByPrimaryKeySelective(User record);
    //根据用户名查找用户
    public User selectByPrimaryKeyByname(String username);
    //查找所有用户
    public List<User> qullyAllUser();
    //对用户模糊查询
    public List<User> QueryUserConfuse(StringAndString stringAndString);
}
