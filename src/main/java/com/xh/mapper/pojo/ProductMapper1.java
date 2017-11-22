package com.xh.mapper.pojo;

import com.xh.po.Product;
import com.xh.po.Shopcar;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductMapper1 {


    List<Product> selectByPrimaryKey(List<Integer> productid);

   void updateShopCarShuLiang(Shopcar shopcar);

    List<Shopcar> selectShopCarShangPing(Integer[] shopcarid);

    void updateShopCarC(List<Integer> shopcarid);
    void updateOrderPayStatus(Integer orderid);
}