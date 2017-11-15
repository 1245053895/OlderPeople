package com.xh.serviceimp.customerServiceImpl;

import com.xh.po.User;
import com.xh.po.vo.StringAndString;
import com.xh.po.vo.TotalMessage;
import com.xh.service.customerService.CustomerInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerInformationServiceimpl implements CustomerInformationService {
    @Autowired
    private CustomerInformationService customerInformationService;
    public void deleteByPrimaryKey(Integer userid) {
        customerInformationService.deleteByPrimaryKey(userid);
    }

    public void insertSelective(User user) {
        customerInformationService.insertSelective(user);
    }
    public User selectByPrimaryKey(Integer userid) {
       return customerInformationService.selectByPrimaryKey(userid);
    }

    public void updateByPrimaryKeySelective(User record) {
        customerInformationService.updateByPrimaryKeySelective(record);
    }

    public User selectByPrimaryKeyByname(String username) {
        return customerInformationService.selectByPrimaryKeyByname(username);
    }

    @Override
    public List<User> qullyAllUser() {
        List<User> users=customerInformationService.qullyAllUser();
        return  users;
    }

    @Override
    public TotalMessage totalUserInfor() {
        return null;
    }

    @Override
    public List<User> QueryUserConfuse(StringAndString stringAndString) {
        List<User> users=customerInformationService.QueryUserConfuse(stringAndString);
        return users;
    }
}
