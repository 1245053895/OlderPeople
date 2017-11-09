
package com.xh.mapper.pojo;

import com.xh.po.Pay;
import com.xh.po.PayExample;
import java.util.List;

import com.xh.po.vo.StringAndString;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface PayforMapper {
  //删除支付方式
    public void deleteByPrimaryKey(Integer payid);
    //插入支付方式
    public void insert(Pay record);
    //插入支付方式
    public void insertSelective(Pay record);
    //根据Id查询支付方式
    public  Pay selectByPrimaryKey(Integer payid);
    //更新支付方式
    public void  updateByPrimaryKeySelective(Pay record);
    public void  updateByPrimaryKey(Pay record);
    //查询所有物流
    List<Pay> QuerryAllPay();
    //实现模糊查询
    public List<Pay> QuerryConfuse(StringAndString stringAndString);
}