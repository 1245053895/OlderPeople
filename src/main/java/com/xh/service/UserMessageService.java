package com.xh.service;

import com.xh.po.User;

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
}
