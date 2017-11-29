package com.xh.controller.customerController;


import com.xh.controller.page.Pagination;
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
    public String SelectProductType(Model model ,Integer productTypeId,Integer pageNo){
        List<ProductTypeExtend> productTypeExtends=productTypeService.SelectProductType();
        for (ProductTypeExtend productTypeExtend:productTypeExtends){
            int id=productTypeExtend.getProducttypeid();
            List<Product> products=productTypeService.SelectProductByTypeIdLimitSix(id);
            productTypeExtend.setProduct(products);
        }
        List<ProductTypeExtend> productTypeExtends1=productTypeService.SelectProductTpyeById(productTypeId);
        Pagination pagination=productTypeService.selectPaginationByQuery(productTypeId,pageNo);
        model.addAttribute("pagination",pagination);
        model.addAttribute("productTypeExtends1",productTypeExtends1);
        model.addAttribute("productTypeExtends",productTypeExtends);
        return "/jsp/users/my-all.jsp";
    }


}
