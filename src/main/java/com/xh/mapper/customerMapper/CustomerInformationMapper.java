package com.xh.mapper.customerMapper;

import com.xh.po.Gainaddres;
import com.xh.po.User;
import com.xh.po.vo.UserAndBrithday;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
@Component
public interface CustomerInformationMapper {
    //查询用户
   public UserAndBrithday SelectCustomerInformation(Integer userid);
    //通过用户Id查询用户的收货地址
    public List<Gainaddres> SelectUserAddressByid(Integer userid);
    //修改用户信息
    public void UpdateUserByid(UserAndBrithday user);
    //通过用户Id插入收货地址
    public void InsertGainAddress (Gainaddres gainaddres);
    //修改收货地址
    public void UpdateGainAdress(Gainaddres gainaddres);
    //删除收货地址
    public  void DelectGainaddress(Integer gainid);
    //选择收货地址
    public void UpdateGainAture(Integer gainid);
    //取消收货地址
    public void  UpdateGainAflase(Integer gainid);
}
