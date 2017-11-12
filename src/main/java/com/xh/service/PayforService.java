package com.xh.service;

import com.xh.po.Pay;
import com.xh.po.vo.StringAndString;
import com.xh.po.vo.TotalMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PayforService {
    //删除支付方式
    public void deleteByPrimaryKey(Integer payid);
    //插入支付方式
    public void insert(Pay record);
    //插入支付方式
    public void insertSelective(Pay record);
    //根据Id查询支付方式
    public  Pay selectByPrimaryKey(Integer payid);
    //更新支付方式
    public void updateByPrimaryKeySelective(Pay record);
    public void  updateByPrimaryKey(Pay record);
    //查询所有物流
     List<Pay> QuerryAllPay();
    //实现模糊查询
    public List<Pay> QuerryConfuse(StringAndString stringAndString);
    //统计出所有的支付种类
    public TotalMessage totalpay();
}
