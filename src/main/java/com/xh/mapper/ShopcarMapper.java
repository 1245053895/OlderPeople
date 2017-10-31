package com.xh.mapper;

import com.xh.po.Shopcar;
import com.xh.po.ShopcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopcarMapper {
    long countByExample(ShopcarExample example);

    int deleteByExample(ShopcarExample example);

    int deleteByPrimaryKey(Integer shopcarid);

    int insert(Shopcar record);

    int insertSelective(Shopcar record);

    List<Shopcar> selectByExample(ShopcarExample example);

    Shopcar selectByPrimaryKey(Integer shopcarid);

    int updateByExampleSelective(@Param("record") Shopcar record, @Param("example") ShopcarExample example);

    int updateByExample(@Param("record") Shopcar record, @Param("example") ShopcarExample example);

    int updateByPrimaryKeySelective(Shopcar record);

    int updateByPrimaryKey(Shopcar record);
}