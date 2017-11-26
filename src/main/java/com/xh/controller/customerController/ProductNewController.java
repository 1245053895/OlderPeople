package com.xh.controller.customerController;

import com.xh.po.vo.TotalCreditsById;
import com.xh.service.customerService.ProductNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class ProductNewController {
    @Autowired
    private  ProductNewService productNewService;
    @RequestMapping(value = "/SelectNewProduct.action" ,method = {RequestMethod.GET,RequestMethod.POST})
    public String SelectNewProduct(Model model){
        List<TotalCreditsById> totalCreditsByIdNew=productNewService.SelectProductNew();
        model.addAttribute("totalCreditsByIdNew",totalCreditsByIdNew);
        return "jsp/users/xpzq.jsp";
    }
}
