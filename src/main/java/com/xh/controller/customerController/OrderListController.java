package com.xh.controller.customerController;

import com.xh.po.vo.OrderCustom;
import com.xh.po.vo.ProductCustom;
import com.xh.service.customerService.OrderListService;
import com.xh.service.customerService.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderListController  {
    @Autowired
    private OrderListService orderListService;

    @RequestMapping(value = "/selectOrderList", method ={ RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody List<OrderCustom> selectOrderList(String[] para){
        OrderCustom oc=new OrderCustom();
        oc.setStart(Integer.parseInt(para[0]));
        oc.setCount(Integer.parseInt(para[1]));
        oc.setUserid(Integer.parseInt(para[2]));
        if(Integer.parseInt(para[3])!=-1&&!para[3].equals("")) oc.setStatus(Integer.parseInt(para[3]));
        if(!para[4].equals("-1")) oc.setConditions(para[4]);
        List<OrderCustom> orderCustoms= orderListService.selectOrderList(oc);
        for(OrderCustom orderCustom:orderCustoms) {
            List<ProductCustom> productCustoms=orderListService.selectOrderDetails(orderCustom.getOrderid());
            orderCustom.setProductCustoms(productCustoms);
        }
        return orderCustoms;
    }
}
