package com.xh.mapper;

import com.xh.po.Proxy;
import com.xh.po.ProxyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProxyMapper {
    long countByExample(ProxyExample example);

    int deleteByExample(ProxyExample example);

    int deleteByPrimaryKey(Integer proxyid);

    int insert(Proxy record);

    int insertSelective(Proxy record);

    List<Proxy> selectByExample(ProxyExample example);

    Proxy selectByPrimaryKey(Integer proxyid);

    int updateByExampleSelective(@Param("record") Proxy record, @Param("example") ProxyExample example);

    int updateByExample(@Param("record") Proxy record, @Param("example") ProxyExample example);

    int updateByPrimaryKeySelective(Proxy record);

    int updateByPrimaryKey(Proxy record);
}