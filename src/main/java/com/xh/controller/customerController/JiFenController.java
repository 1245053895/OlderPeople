package com.xh.controller.customerController;

import com.xh.po.Gainaddres;
import com.xh.po.Order;
import com.xh.po.Orderproduct;
import com.xh.po.User;
import com.xh.po.vo.UserAndBrithday;
import com.xh.service.OrderPayService;
import com.xh.service.customerService.CustomerInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
@Controller
public class JiFenController {
    @Autowired
    private CustomerInformationService customerInformationService;
    @Autowired
    private OrderPayService orderPayService;

    //ajax
    @RequestMapping(value = "/userJiFen.action", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody
    UserAndBrithday userJiFen(Model model, HttpServletRequest request) {
        User user1 = (User) request.getSession().getAttribute("user");
        if (user1 != null) {
            Integer id = user1.getUserid();
            UserAndBrithday userAndBrithday = customerInformationService.SelectCustomerInformation(id);
            return userAndBrithday;
        }
        return null;
    }


    //处理积分兑换
    @RequestMapping(value = "/jiFenDingDan.action", method = {RequestMethod.GET, RequestMethod.POST})
    public String jiFenDingDan(Order order, HttpServletRequest request, Model model, Integer productid,Integer shuliang,Integer mygainid) {
        User user1 = (User) request.getSession().getAttribute("user");

        if (mygainid>0){order.setGainid(mygainid);}
        order.setStatus(1);       /* 订单状态 订单新建时为1,表示该订单是待发货的订单*/
        order.setPostfee(0.0);
        order.setPaystatus(1);
        order.setUserid(user1.getUserid());
        int a = 0 - order.getTotalcredit();
        order.setTotalcredit(a);
        String return2 = orderPayService.insertSelective2(order);
        Integer orderid = order.getOrderid();  /*数据库返回的主键*/

        Orderproduct orderproduct = new Orderproduct();

        orderproduct.setOrderid(orderid);       /*主键是另外一张表的外键需要插入*/
        orderproduct.setShoppingcount(shuliang);/*订单商品表的商品数量*/
        orderproduct.setProductid(productid);
        if (return2.equals("OK")) {
            orderPayService.insertSelective3(orderproduct);
            model.addAttribute("productid", productid);
//            return "/xiangqing.action";
            return "redirect:/xiangqing.action?productid={productid}";
        }
        return null;

    }
}