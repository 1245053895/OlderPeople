package com.xh.service;

import com.xh.po.Transport;
import com.xh.po.vo.StringAndString;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ConveyanceService {
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
}
