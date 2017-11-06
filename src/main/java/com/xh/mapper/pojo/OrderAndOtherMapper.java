package com.xh.mapper.pojo;

import com.xh.po.Order;
import com.xh.po.vo.OrderAndOther;
import com.xh.po.vo.OrderAndString;
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

}
