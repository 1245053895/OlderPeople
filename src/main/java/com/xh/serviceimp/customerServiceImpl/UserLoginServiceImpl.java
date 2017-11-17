package com.xh.serviceimp.customerServiceImpl;

import com.xh.mapper.customerMapper.UserLoginMapper;
import com.xh.po.Product;
import com.xh.po.User;
import com.xh.po.Userlog;
import com.xh.po.vo.TotalCreditsById;
import com.xh.service.customerService.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserLoginMapper userLoginMapper;
    @Override
    public User selectAllNameAndPwd(String username) {
        User user= userLoginMapper.selectAllNameAndPwd(username);
        return user;
    }

    @Override
    public void insertNewUser(User user) {
        userLoginMapper.insertNewUser(user);
    }

    @Override
    public void insertStartTimeAndIp(Userlog userlog) {
        userLoginMapper.insertStartTimeAndIp(userlog);
    }

    @Override
    public void updateEndLoginTime(Userlog userlog) {
        userLoginMapper.updateEndLoginTime(userlog);
    }

    @Override
    public void updataPwdById(User user) {
        userLoginMapper.updataPwdById(user);
    }

    @Override
    public void updataLoginPhone(User user) {
        userLoginMapper.updataLoginPhone(user);
    }

    @Override
    public List<TotalCreditsById> queryAllById(Integer userid) {
      List<TotalCreditsById> totalCreditsByIds=  userLoginMapper.queryAllById(userid);
      return  totalCreditsByIds;
    }

    @Override
    public TotalCreditsById queryTotalCriditsById(Integer userid) {
       TotalCreditsById totalCreditsById= userLoginMapper.queryTotalCriditsById(userid);
        return totalCreditsById;
    }

    @Override
    public List<Product> selectproduct() {
      List<Product>  products= userLoginMapper.selectproduct();
        return products;
    }
}
