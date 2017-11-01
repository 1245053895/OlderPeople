package com.xh.serviceimp;

import com.xh.mapper.UserMapper;
import com.xh.po.User;
import com.xh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
@Autowired
private UserMapper userMapper;

    public void deleteByPrimaryKey(Integer userid) {

        userMapper.deleteByPrimaryKey(userid);
    }

    public void insertSelective(User record) {

        userMapper.insertSelective(record);
    }

    public User selectByPrimaryKey(Integer userid) {

        return userMapper.selectByPrimaryKey(userid);
    }

    public void updateByPrimaryKeySelective(User record) {
       userMapper.updateByPrimaryKeySelective(record);
    }
    public User selectByPrimaryKeyByname(String username){
        return userMapper.selectByPrimaryKeyByname(username);
    }
}
