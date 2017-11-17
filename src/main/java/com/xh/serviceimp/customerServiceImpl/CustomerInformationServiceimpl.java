package com.xh.serviceimp.customerServiceImpl;

import com.xh.mapper.customerMapper.CustomerInformationMapper;
import com.xh.po.Gainaddres;
import com.xh.po.User;
import com.xh.po.vo.UserAndBrithday;
import com.xh.service.customerService.CustomerInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerInformationServiceimpl implements CustomerInformationService {
    @Autowired
    private CustomerInformationMapper customerInformationMapper;


    @Override
    //查询用户信息
    public UserAndBrithday SelectCustomerInformation(Integer userid) {
         UserAndBrithday userAndBrithday= customerInformationMapper.SelectCustomerInformation(userid);
         return userAndBrithday;
    }

    //查询物流信息
    @Override
    public List<Gainaddres> SelectUserAddressByid(Integer userid) {
        List<Gainaddres> gainaddres=customerInformationMapper.SelectUserAddressByid(userid);
        return gainaddres;
    }

    @Override
    public void UpdateUserByid(UserAndBrithday user) {
        customerInformationMapper.UpdateUserByid(user);
    }
    /*
    * 增加收货地址
    * */

    @Override
    public void InsertGainAddress(Gainaddres gainaddres) {

        customerInformationMapper.InsertGainAddress(gainaddres);
    }
    //更新收货地址
    @Override
    public void UpdateGainAdress(Gainaddres gainaddres) {

        customerInformationMapper.UpdateGainAdress(gainaddres);
    }

    //删除收货地址
    @Override
    public void DelectGainaddress(Integer gainid) {
        customerInformationMapper.DelectGainaddress(gainid);
    }

    @Override
    public void UpdateGainAture(Integer gainid) {
        customerInformationMapper.UpdateGainAture(gainid);
    }

    @Override
    public void UpdateGainAflase(Integer gainid) {
        customerInformationMapper.UpdateGainAflase(gainid);
    }


}
