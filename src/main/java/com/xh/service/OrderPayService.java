package com.xh.service;

import com.xh.po.*;

import java.util.List;

public interface OrderPayService {

    String  insertSelective1(Gainaddres gainaddres);
    String insertSelective2(Order order);
    String   insertSelective3(Orderproduct orderproduct);
    Gainaddres selectGainId(Gainaddres gainaddres);
    List<Product> selectByPrimaryKey(String[] productid);

    void updateShopCarShuLiang(Shopcar shopcar);
    List<Shopcar> selectShopCarShangPing(Integer[] shopcarid);

    void updateShopCarC(List<Integer> shopcarid);
    void updateOrderPayStatus(Integer orderid);

    /*public Gainaddres IsGainAddress(Gainaddres gainaddres);*/

}
