package com.xh.serviceimp;

import com.xh.mapper.pojo.OrderPayMapper;
import com.xh.mapper.pojo.ProductMapper1;
import com.xh.po.*;
import com.xh.service.OrderPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderPayServiceImpl implements OrderPayService {
    @Autowired
    private OrderPayMapper orderPayMapper;
    @Autowired
    private ProductMapper1 productMapper1;

//    添加收货地址
    @Override
    public String insertSelective1(Gainaddres gainaddres) {
        Gainaddres gainaddres1=orderPayMapper.IsGainAddress(gainaddres);
        if(gainaddres1==null){
            orderPayMapper.insertSelective1(gainaddres);
        }
        return "OK";
    }
//    添加订单信息
    @Override
    public String insertSelective2(Order order) {
        Date date =new Date();
        order.setCreatetime(date);
        order.setUpdatetime(date);
        order.setPaymenttime(date);
        orderPayMapper.insertSelective2(order);
        return "OK";
    }
//    添加订单商品
    @Override
    public String insertSelective3(Orderproduct orderproduct) {
        orderPayMapper.insertSelective3(orderproduct);
        return "OK";
    }
//    查询收货地址的主键
    @Override
    public Gainaddres selectGainId(Gainaddres gainaddres) {
        return orderPayMapper.selectGainId(gainaddres);
    }
//    通过id数组查询商品信息
    @Override
    public List<Product> selectByPrimaryKey(String[] productid) {
        List<Integer> idList = new ArrayList<Integer>();
        for(String id : productid) {
            idList.add(Integer.valueOf(id));
        }
        List<Product> productList=  productMapper1.selectByPrimaryKey(idList);
        return productList;
    }

    @Override
    public void updateShopCarShuLiang(Shopcar shopcar) {
        productMapper1.updateShopCarShuLiang(shopcar);
    }

    @Override
    public List<Shopcar> selectShopCarShangPing(Integer[] shopcarid) {
        List<Shopcar> myshopcarList=productMapper1.selectShopCarShangPing(shopcarid);
        return myshopcarList;
    }

    @Override
    public void updateShopCarC(List<Integer> shopcarid) {
        productMapper1.updateShopCarC(shopcarid);
    }

    @Override
    public void updateOrderPayStatus(Integer orderid) {
        productMapper1.updateOrderPayStatus(orderid);
    }

    /*@Override
    public Gainaddres IsGainAddress(Gainaddres gainaddres) {
       Gainaddres gainaddres1= orderPayMapper.IsGainAddress(gainaddres);
        return gainaddres1;
    }*/

}
