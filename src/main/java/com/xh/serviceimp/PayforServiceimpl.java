package com.xh.serviceimp;

import com.xh.mapper.pojo.PayforMapper;
import com.xh.po.Pay;
import com.xh.po.vo.StringAndString;
import com.xh.po.vo.TotalMessage;
import com.xh.service.PayforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PayforServiceimpl implements PayforService {
   @Autowired
   private PayforMapper payforMapper;
    //删除ById
    public void deleteByPrimaryKey(Integer payid) {
        payforMapper.deleteByPrimaryKey(payid);
    }
    //插入
    public void insert(Pay record) {
        payforMapper.insert(record);
    }

  //插入
    public void insertSelective(Pay record) {
       payforMapper.insertSelective(record);
    }

   //查询
    public Pay selectByPrimaryKey(Integer payid) {
        return payforMapper.selectByPrimaryKey(payid);
    }

    //更新不能为空
    public void updateByPrimaryKeySelective(Pay record) {
        payforMapper.updateByPrimaryKeySelective(record);
    }

    //更新
    public void updateByPrimaryKey(Pay record) {
     payforMapper.updateByPrimaryKey(record);
    }

    //查询所有用户
    public List<Pay> QuerryAllPay() {
        List<Pay> pays=payforMapper.QuerryAllPay();
        return pays;
    }

   //模糊查询
    public List<Pay> QuerryConfuse(StringAndString stringAndString) {
        List<Pay> pays=payforMapper.QuerryConfuse(stringAndString);
        return pays;
    }

    @Override
    public TotalMessage totalpay() {
       TotalMessage totalMessage= payforMapper.totalpay();
        return totalMessage;
    }
}
