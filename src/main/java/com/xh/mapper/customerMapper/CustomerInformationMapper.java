package com.xh.mapper.customerMapper;

import com.xh.po.Systemset;
import com.xh.po.User;
import com.xh.po.vo.StringAndString;
import com.xh.po.vo.TotalMessage;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerInformationMapper {
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

    //统计出所有用户的信息
    public TotalMessage totalUserInfor();

    //对用户的模糊查询
    public List<User> QueryUserConfuse(StringAndString stringAndString);
    /*
    * 系统设置的Mapper
    *
    * */

    //系统设置的查询
    public Systemset SelectSystemsQuerry();

    //更新系统设置
    public void updateSystemset(Systemset systemset);
}