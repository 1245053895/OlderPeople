package com.xh.controller;

import com.xh.po.Order;
import com.xh.po.Transport;
import com.xh.po.vo.OrderCustom;
import com.xh.po.vo.OrderDetailCustom;
import com.xh.service.OrderService;
import com.xh.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    /**
     * 得到所有订单
     * @param model
     * @param orderCustom
     * @return
     */
    @RequestMapping(value = "/getAllOrder",method={RequestMethod.POST,RequestMethod.GET})
    public String getAllOrder(Model model,OrderCustom orderCustom){
        List<OrderCustom> orderCustoms=orderService.queryByAny(orderCustom);
        model.addAttribute("orderCustoms",orderCustoms);
        return "/jsp/admin/Orderform.jsp";
    }

    /**
     * 得到订单状态为6 的订单
     * @param model
     * @param orderCustom
     * @return
     */
    @RequestMapping(value = "/getOrderByStatusOfSix",method={RequestMethod.POST,RequestMethod.GET})
    public String getOrderByStatusOfSix(Model model,OrderCustom orderCustom){
        orderCustom.setConditions("6");
        List<OrderCustom> orderCustoms=orderService.getOrderByStatusOfSix(orderCustom);
        model.addAttribute("orderCustoms",orderCustoms);
        return "/jsp/admin/Orderform.jsp";
    }

    /**
     * 得到所有物流方式
     * @return
     */
    @RequestMapping(value = "/getTransport",method = {RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody List<Transport> getTransport(){
        List<Transport> transports= orderService.getTransport();
        return transports;
    }

    /**
     * 发货  更新订单加入物流信息
     * @param orderCustom
     * @return
     */
    @RequestMapping(value = "/updateOrderShipping",method = {RequestMethod.POST,RequestMethod.GET})
    public String updateOrderShipping(OrderCustom orderCustom){
        orderCustom.setStatus(2);
        orderCustom.setSendtime(new Date());
        orderService.updateOrderShipping(orderCustom);
        return "forward:/getAllOrder.action";
    }

    /**
     * 关闭交易
     * @param orderCustom
     * @return
     */
    @RequestMapping(value = "/updateCloseDeal",method = {RequestMethod.POST,RequestMethod.GET})
    public String updateCloseDeal(OrderCustom orderCustom){
        orderCustom.setStatus(0);
        orderCustom.setClosetime(new Date());
        orderService.updateCloseDeal(orderCustom);
        return "forward:/getAllOrder.action";
    }

    /**
     * 通过订单id 获取订单详细
     * @param id
     * @return
     */
    @RequestMapping(value = "/getOrderDetailByOrderId",method = {RequestMethod.POST,RequestMethod.GET})
    public String getOrderDetailByOrderId(Model model,Integer id){

        List<OrderDetailCustom> orderDetailCustoms=orderService.getOrderDetailByOrderId(id);
        model.addAttribute("orderDetailCustoms",orderDetailCustoms);
        return "/jsp/admin/order_detailed.jsp";
    }

    /**
     * 获取退货详情
     * @param orderId
     * @return
     */
    @RequestMapping(value = "/getReturnDetail",method = {RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody OrderCustom getReturnDetail(int orderId){
        OrderCustom orderCustom= orderService.getReturnDetail(orderId);
        try {
            orderCustom.setBuyTime(DateUtil.daysBetween(orderCustom.getEndtime(),new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return orderCustom;
    }

    /**
     *
     * @param model
     * @param orderCustom
     * @return
     */
    @RequestMapping(value = "/updateOrderStatus",method={RequestMethod.POST,RequestMethod.GET})
    public String updateOrderStatus(Model model,OrderCustom orderCustom){
        int statuss=orderCustom.getStatus();
        orderService.updateOrderStatus(orderCustom);
        return "forward:/getAllOrder.action";
    }


}
