package com.xh.service;


import com.xh.po.Product;

import com.xh.po.Producttype;
import com.xh.po.vo.Allproduct;
import com.xh.po.vo.KindOfProduct;
import com.xh.po.vo.ProductAndTypeVo;
import com.xh.po.vo.StringAndString;

import java.util.Date;
import java.util.List;

public interface ProductService {
                                                                 //    产品管理接口
    void deleteByPrimaryKey(Integer productid);
    void insertSelective(Product record);
    //    得到商品列表 包含对应的商品类型
    List<ProductAndTypeVo> selectByProduct(Product record);
    void updateByPrimaryKeySelective(Product record);
    //    得到商品的总数    共：2334件商品
    Allproduct productCount();

    //       得到各类商品的总数     电器(0)  服装(2) 出现代步(1)  健康体测(1) 康复护理(1) 生活日用(1)
    List<KindOfProduct> KindOfProduct();

    //批量删除
    void  deleteBatch(String[] ids);

 //    商品类型的增加
    void TypeinsertSelective(Producttype record);
 //    商品类型的删除
    void TypedeleteByName(String producttypename);
  //    商品类型查询
  List<Producttype> selectByNothing();

    //模糊查询根据时间
    public List<ProductAndTypeVo> moHuselectByTime(Date productstoretime);

}
