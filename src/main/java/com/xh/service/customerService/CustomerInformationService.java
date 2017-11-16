package com.xh.service.customerService;

import com.xh.po.Gainaddres;
import com.xh.po.User;
import com.xh.po.vo.StringAndString;
import com.xh.po.vo.TotalMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerInformationService{
    //根据用户Id查询用户的收货地址
    public List<Gainaddres> SelectUserAddressByid(Integer userid);
}
