package com.xh.service;

import com.xh.po.Order;
import com.xh.po.vo.OrderAndOther;
import com.xh.po.vo.OrderAndString;

import java.util.List;

public interface OrderService {

    // 查询订单   根据	所有条件（订单编号、下单时间。。。。。）
    //  如果 OrderOfString orderOfString=null代表查询全部订单
    List<Order> selectOrderByAll(Order order);
//    查询交易总金额
    OrderAndString totalAmountOfTransaction();
//    订单数量
    OrderAndString orderQuantity();
//    交易成功
    OrderAndString successfulTrade();
//    交易失败
    OrderAndString  transactionFailure();
//    退款金额
    OrderAndString  refundAmount();
//    各个商品类型的订单数
    List< OrderAndString>  selectNotName1();
//    各个商品类型的交易金额
    List< OrderAndString>  selectNotName2();
//    各个订单的商品详情
    List<OrderAndOther> selectOrderAndOther();

}
