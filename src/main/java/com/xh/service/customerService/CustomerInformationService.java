package com.xh.service.customerService;

import com.xh.po.Gainaddres;
import com.xh.po.User;
import com.xh.po.vo.StringAndString;
import com.xh.po.vo.TotalMessage;
import com.xh.po.vo.UserAndBrithday;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerInformationService{
    //查询用户根据Id
    public UserAndBrithday SelectCustomerInformation(Integer userid);
    //根据用户Id查询用户的收货地址
    public List<Gainaddres> SelectUserAddressByid(Integer userid);
    //修改用户信息
    public void UpdateUserByid(UserAndBrithday user);
    //通过用户Id插入收货地址
    public void InsertGainAddress (Gainaddres gainaddres);
    //更新收货地址
    public void UpdateGainAdress(Gainaddres gainaddres);
    //删除收货地址
    public void  DelectGainaddress(Integer gainid);
    //选择收货地址
    public void UpdateGainAture(Integer gainid);
    //取消收货地址
    public void  UpdateGainAflase(Integer gainid);

}
