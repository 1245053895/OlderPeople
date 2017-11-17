package com.xh.mapper.customerMapper;

import com.xh.po.Gainaddres;
import com.xh.po.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
@Component
public interface CustomerInformationMapper {
    //通过用户Id查询用户的收货地址
    public List<Gainaddres> SelectUserAddressByid(Integer userid);
}
