package com.xh.mapper.pojo;

import com.xh.po.Comment;
import com.xh.po.Gainaddres;
import com.xh.po.Order;
import com.xh.po.Orderproduct;
import org.springframework.stereotype.Component;

@Component
public interface OrderPayMapper {

    int  insertSelective1(Gainaddres gainaddres);
    int  insertSelective2(Order order);
    void   insertSelective3(Orderproduct orderproduct);
    Gainaddres selectGainId(Gainaddres gainaddres);

    public Gainaddres IsGainAddress(Gainaddres gainaddres);
}
