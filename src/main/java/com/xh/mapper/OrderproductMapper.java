package com.xh.mapper;

import com.xh.po.Orderproduct;
import com.xh.po.OrderproductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderproductMapper {
    long countByExample(OrderproductExample example);

    int deleteByExample(OrderproductExample example);

    int deleteByPrimaryKey(Integer orderproductid);

    int insert(Orderproduct record);

    int insertSelective(Orderproduct record);

    List<Orderproduct> selectByExample(OrderproductExample example);

    Orderproduct selectByPrimaryKey(Integer orderproductid);

    int updateByExampleSelective(@Param("record") Orderproduct record, @Param("example") OrderproductExample example);

    int updateByExample(@Param("record") Orderproduct record, @Param("example") OrderproductExample example);

    int updateByPrimaryKeySelective(Orderproduct record);

    int updateByPrimaryKey(Orderproduct record);
}