package com.xh.mapper.pojo;

import com.xh.po.Order;
import com.xh.po.Transport;
import com.xh.po.vo.OrderAndOther;
import com.xh.po.vo.OrderAndString;
import com.xh.po.vo.OrderCustom;
import com.xh.po.vo.OrderDetailCustom;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderAndOtherMapper {

    //   如果 OrderOfString orderOfString=null代表查询全部订单
    List<Order> selectOrderByAll(Order order);

    OrderAndString totalAmountOfTransaction();

    OrderAndString orderQuantity();

    OrderAndString successfulTrade();

    OrderAndString  transactionFailure();

    OrderAndString  refundAmount();
    List< OrderAndString>  selectNotName1();
    List< OrderAndString>  selectNotName2();
    List<OrderAndOther> selectOrderAndOther();

    /**
     * 任意条件模糊查询订单
     * @param orderCustom
     * @return
     */
    public List<OrderCustom> queryByAny(OrderCustom orderCustom);

    /**
     * 得到物流列表
     * @return
     */
    public List<Transport> getTransport();

    /**
     * 订单表插入物流名和物流单号
     * @param orderCustom
     */
    public void updateOrderShipping(OrderCustom orderCustom);

    /**
     * 关闭交易,改变订单状态,更新关闭时间
     * @param orderCustom
     */
    public void updateCloseDeal(OrderCustom orderCustom);

    /**
     * 通过订单id 查询订单详情
     * @param id
     * @return
     */
    public List<OrderDetailCustom> getOrderDetailByOrderId(Integer id);


    public List<OrderCustom> getOrderByStatusOfSix(OrderCustom orderCustom);
}
