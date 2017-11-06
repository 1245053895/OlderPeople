package com.xh.serviceimp;

import com.xh.mapper.pojo.OrderAndOtherMapper;
import com.xh.po.Order;
import com.xh.po.vo.OrderAndOther;
import com.xh.po.vo.OrderAndString;
import com.xh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceimpl implements OrderService {

    @Autowired
    private OrderAndOtherMapper orderAndOtherMapper;

    @Override
    public List<Order> selectOrderByAll(Order order) {
        List<Order> orderList=  orderAndOtherMapper.selectOrderByAll(order);
        return orderList;
    }

    @Override
    public OrderAndString totalAmountOfTransaction() {
        return orderAndOtherMapper.totalAmountOfTransaction();
    }

    @Override
    public OrderAndString orderQuantity() {
        return orderAndOtherMapper.orderQuantity() ;
    }

    @Override
    public OrderAndString successfulTrade() {
        return orderAndOtherMapper.successfulTrade();
    }

    @Override
    public OrderAndString transactionFailure() {
        return orderAndOtherMapper.transactionFailure() ;
    }

    @Override
    public OrderAndString refundAmount() {
        return orderAndOtherMapper.refundAmount() ;
    }

    @Override
    public List<OrderAndString> selectNotName1() {
        List<OrderAndString> orderAndStringList1= orderAndOtherMapper.selectNotName1();
        return orderAndStringList1;
    }

    @Override
    public List<OrderAndString> selectNotName2() {
        List<OrderAndString> orderAndStringList2 = orderAndOtherMapper.selectNotName2();
        return orderAndStringList2;
    }

    @Override
    public List<OrderAndOther> selectOrderAndOther() {
        List<OrderAndOther> orderAndOtherList = orderAndOtherMapper.selectOrderAndOther();
        return orderAndOtherList;
    }
}
