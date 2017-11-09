package com.xh.mapper.pojo;

import com.xh.po.User;
import com.xh.po.vo.StringAndString;
import com.xh.po.vo.SystemSitings;
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
    /*
    * 系统设置的Mapper
    *
    * */
    //系统设置的插入方法，这里因为系统设置的Mapper不能映射，所以写在了用户的里面
    public void insertSystem(SystemSitings systemSitings);
    //系统设置的查询
    public  List<SystemSitings> SelectSystemsQuerry();
}