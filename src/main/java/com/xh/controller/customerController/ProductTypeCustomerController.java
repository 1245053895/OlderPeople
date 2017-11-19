package com.xh.controller.customerController;


import com.xh.po.Product;
import com.xh.po.Producttype;
import com.xh.po.vo.ProductTypeExtend;
import com.xh.service.customerService.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ProductTypeCustomerController {
    @Autowired
    private ProductTypeService productTypeService;
    //查询商品类型中de商品
    @RequestMapping(value = "/SelectProductType.action",method = RequestMethod.GET)
    public String SelectProductType(Model model ,Integer ProductTypeId){
        List<ProductTypeExtend> productTypeExtends=productTypeService.SelectProductType();
        for (ProductTypeExtend productTypeExtend:productTypeExtends){
            int id=productTypeExtend.getProducttypeid();
            List<Product> products=productTypeService.SelectProductByTypeId(id);
            productTypeExtend.setProduct(products);
        }
        List<ProductTypeExtend> productTypeExtends1=productTypeService.SelectProductTpyeById(ProductTypeId);
        List<Product> productss=productTypeService.SelectProductByTypeId(ProductTypeId);
        model.addAttribute("productTypeExtends1",productTypeExtends1);
        model.addAttribute("productss",productss);
        model.addAttribute("productTypeExtends",productTypeExtends);
        return "/jsp/users/my-all.jsp";
    }

    //

}
