package com.xh.mapper.pojo;

import com.xh.po.Product;
import com.xh.po.ProductExample;
import com.xh.po.vo.Allproduct;
import com.xh.po.vo.KindOfProduct;
import com.xh.po.vo.ProductAndTypeVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProductAndTypeMapper {

    void deleteByPrimaryKey(Integer productid);

    void insertSelective(Product record);

//    得到商品列表 包含对应的商品类型
    List<ProductAndTypeVo> selectByProduct(Product record);

    void updateByPrimaryKeySelective(Product record);

//    得到商品的总数    共：2334件商品
    Allproduct productCount();

    //  查询出的商品类型至少有一个商品   服装(2) 出现代步(1)  健康体测(1) 康复护理(1) 生活日用(1)
    List<KindOfProduct> productKindOf();
//    查询出的商品类型没有商品      电器(0)
    List<KindOfProduct>  productNull ();

   //批量删除
    void  deleteBatch(List<Integer> ids);
}