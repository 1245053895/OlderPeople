package com.xh.mapper;

import com.xh.po.Productslog;
import com.xh.po.ProductslogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductslogMapper {
    long countByExample(ProductslogExample example);

    int deleteByExample(ProductslogExample example);

    int deleteByPrimaryKey(Integer productslogid);

    int insert(Productslog record);

    int insertSelective(Productslog record);

    List<Productslog> selectByExample(ProductslogExample example);

    Productslog selectByPrimaryKey(Integer productslogid);

    int updateByExampleSelective(@Param("record") Productslog record, @Param("example") ProductslogExample example);

    int updateByExample(@Param("record") Productslog record, @Param("example") ProductslogExample example);

    int updateByPrimaryKeySelective(Productslog record);

    int updateByPrimaryKey(Productslog record);
}