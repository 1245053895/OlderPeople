package com.xh.service;

import com.xh.po.Order;
import com.xh.po.Transport;
import com.xh.po.vo.*;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

public interface OrderService {

    // 查询订单   根据	所有条件（订单编号、下单时间。。。。。）
    //  如果 OrderOfString orderOfString=null代表查询全部订单
    public List<Order> selectOrderByAll(Order order);

    List<OderAndString2> selectAndName();
    OrderAndString  selectName5();
    //    查询交易总金额
    public OrderAndString totalAmountOfTransaction();
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

    /**
     * 任意条件查询所有订单
     * @param orderCustom
     * @return
     */
    public List<OrderCustom> queryByAny(OrderCustom orderCustom);
    //查询所有物流
    public List<Transport> getTransport();

    /**
     * 订单表插入物流名和物流单号
     * @param orderCustom
     */
    public void updateOrderShipping(OrderCustom orderCustom);

    /**
     * 通过订单id,关闭交易(令订单状态为0)
     * @param orderCustom
     */
    public void updateCloseDeal(OrderCustom orderCustom);

    /**
     * 通过订单id 查询订单详情
     * @param id
     * @return
     */
    public List<OrderDetailCustom> getOrderDetailByOrderId(Integer id);

    /**
     * 得到指定状态的订单
     * @param orderCustom
     * @return
     */
    public List<OrderCustom> getOrderByStatusOfSix(OrderCustom orderCustom);
}
