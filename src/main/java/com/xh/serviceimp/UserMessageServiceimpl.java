package com.xh.serviceimp;

import com.xh.mapper.pojo.UserCsdMapper;
import com.xh.po.User;
import com.xh.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMessageServiceimpl implements UserMessageService {
    @Autowired
    private UserCsdMapper userCsdMapper;
    public void deleteByPrimaryKey(Integer userid) {
        userCsdMapper.deleteByPrimaryKey(userid);
    }

    public void insertSelective(User record) {
    userCsdMapper.insertSelective(record);
    }

    public User selectByPrimaryKey(Integer userid) {
       return userCsdMapper.selectByPrimaryKey(userid);
    }

    public void updateByPrimaryKeySelective(User record) {
        userCsdMapper.updateByPrimaryKeySelective(record);
    }

    public User selectByPrimaryKeyByname(String username) {
        return userCsdMapper.selectByPrimaryKeyByname(username);
    }
}
