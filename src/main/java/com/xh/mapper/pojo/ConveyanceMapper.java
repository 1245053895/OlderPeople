package com.xh.mapper.pojo;

import com.xh.po.Transport;
import com.xh.po.TransportExample;
import com.xh.po.User;
import com.xh.po.vo.StringAndString;
import com.xh.po.vo.TotalMessage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ConveyanceMapper {

/*
* 根据Id删除物流信息
* */
    public void deleteByPrimaryKey(Integer transportid);
    //插入物流
    public void insert(Transport record);
    public void insertSelective(Transport record);
    //根据id查询物流
    public Transport selectByPrimaryKey(Integer transportid);
   //更新物流根据id 不能为空
    public void updateByPrimaryKeySelective(Transport record);
   //更新物流根据id
    public void updateByPrimaryKey(Transport record);
    //查询所有物流信息
    List<Transport> QuerryAllTranSport();
    //实现模糊查询
    public List<Transport> QueryTransportConfuse(StringAndString stringAndString);

    //统计出所有物流的条数
    public TotalMessage totalTransport();
}