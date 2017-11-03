package com.xh.serviceimp;

import com.xh.mapper.pojo.UserCsdMapper;
import com.xh.po.User;
import com.xh.po.vo.StringAndString;
import com.xh.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserMessageServiceimpl implements UserMessageService {
    @Autowired
    private UserCsdMapper userCsdMapper;
    @Transactional
    public void deleteByPrimaryKey(Integer userid) {  userCsdMapper.deleteByPrimaryKey(userid); }

    public void insertSelective(User record)
    {
    userCsdMapper.insertSelective(record);
    }

    public User selectByPrimaryKey(Integer userid) { return userCsdMapper.selectByPrimaryKey(userid); }

    public void updateByPrimaryKeySelective(User record)
    {
        userCsdMapper.updateByPrimaryKeySelective(record);
    }

    public User selectByPrimaryKeyByname(String username) { return userCsdMapper.selectByPrimaryKeyByname(username);
    }

    public List<User> qullyAllUser() {
        List<User> users=userCsdMapper.qullyAllUser();
        return users;
    }

    public List<User> QueryUserConfuse(StringAndString stringAndString) {
        List<User> users=userCsdMapper.QueryUserConfuse(stringAndString);
        return users;
    }
}
