package com.xh.serviceimp;

import com.xh.mapper.pojo.OrderAndOtherMapper;
import com.xh.po.Order;
import com.xh.po.Transport;
import com.xh.po.vo.*;
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
    public List<OderAndString2> selectAndName() {
        List<OderAndString2> oderAndString2s=orderAndOtherMapper.selectAndName();
        return oderAndString2s;
    }


    @Override
    public OrderAndString selectName5()  {
        return orderAndOtherMapper.selectName5();
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

    @Override
    public List<OrderCustom> queryByAny(OrderCustom orderCustom) {
        return orderAndOtherMapper.queryByAny(orderCustom);
    }

    @Override
    public List<Transport> getTransport() {
        return orderAndOtherMapper.getTransport();
    }

    @Override
    public void updateOrderShipping(OrderCustom orderCustom) {
        orderAndOtherMapper.updateOrderShipping(orderCustom);
    }

    @Override
    public void updateCloseDeal(OrderCustom orderCustom) {
        orderAndOtherMapper.updateCloseDeal(orderCustom);
    }

    @Override
    public List<OrderDetailCustom> getOrderDetailByOrderId(Integer id) {
        return orderAndOtherMapper.getOrderDetailByOrderId(id);
    }

    @Override
    public List<OrderCustom> getOrderByStatusOfSix(OrderCustom orderCustom) {
        return orderAndOtherMapper.getOrderByStatusOfSix(orderCustom);
    }

    @Override
    public OrderCustom getReturnDetail(int orderId) {
        return orderAndOtherMapper.getReturnDetail(orderId);
    }

    @Override
    public void updateOrderStatus(OrderCustom orderCustom) {
        orderAndOtherMapper.updateOrderStatus(orderCustom);
    }
}
