package com.xh.mapper.pojo;

import com.xh.po.User;
import com.xh.po.vo.StringAndString;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserCsdMapper {
    //根据用户名删除用户
    public void deleteByPrimaryKey(Integer userid);
    //增加用户
    void insertSelective(User record);
    //根据用户Id查询用户
    User selectByPrimaryKey(Integer userid);
    //更新用户的信息
    void updateByPrimaryKeySelective(User record);
    //根据用户名查询用户
    public User selectByPrimaryKeyByname(String username);
    //查询所有用户
    List<User> qullyAllUser();
    //对用户的模糊查询
    public List<User> QueryUserConfuse(StringAndString stringAndString);

}