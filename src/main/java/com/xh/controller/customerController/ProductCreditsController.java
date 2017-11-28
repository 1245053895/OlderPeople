package com.xh.controller.customerController;

import com.xh.controller.page.Pagination;
import com.xh.po.Product;
import com.xh.po.vo.ProductTypeExtend;
import com.xh.po.vo.TotalCreditsById;
import com.xh.service.customerService.ProductCreditsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Controller
public class ProductCreditsController {
    @Autowired
    private ProductCreditsService productCreditsService;

    @RequestMapping(value = "/SelectProducCredits.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String SelectProducCredits(Model model,Integer ProductTypeId){
        //查询出行
        List<ProductTypeExtend> productTypeExtendsTraver=productCreditsService.SelectTravelProductType();
        for ( ProductTypeExtend productTypeExtendT:productTypeExtendsTraver){
            Integer id=productTypeExtendT.getProducttypeid();
            List<Product> productTraver=productCreditsService.SelectCreditProductByTypeid(id);
            productTypeExtendT.setProduct(productTraver);
        }
        List<Product> productsTr=productCreditsService.SelectCreditProductByTypeid(ProductTypeId);
        model.addAttribute("productsTr",productsTr);
        model.addAttribute("productTypeExtendsTraver",productTypeExtendsTraver);


        //查询健康
        List<ProductTypeExtend> productTypeExtendsHealth=productCreditsService.SelectHealthProductType();
        for (ProductTypeExtend productTypeExtendH:productTypeExtendsHealth){
            Integer id=productTypeExtendH.getProducttypeid();
            List<Product> productHealth=productCreditsService.SelectCreditProductByTypeid(id);
            productTypeExtendH.setProduct(productHealth);
        }
        List<Product> productsHealth=productCreditsService.SelectCreditProductByTypeid(ProductTypeId);
        model.addAttribute("productsHealth",productsHealth);
        model.addAttribute("productTypeExtendsHealth",productTypeExtendsHealth);


       //查询生活
        List<ProductTypeExtend> productTypeExtendsLife=productCreditsService.SelectLifeProductType();
        for (ProductTypeExtend productTypeExtendLif:productTypeExtendsLife){
            int id=productTypeExtendLif.getProducttypeid();
            List<Product> productsLife=productCreditsService.SelectCreditProductByTypeid(id);
            productTypeExtendLif.setProduct(productsLife);
        }
        model.addAttribute("productTypeExtendsLife",productTypeExtendsLife);
        return "/jsp/users/jfsc_index.jsp";
    }

    //特惠积分商品
    @RequestMapping(value = "/SelectProductDiscont.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String SelectProductDiscont(Model model){
       List<Product> productLists=productCreditsService.SelectCrediDiscountQuerry();
       model.addAttribute("productLists",productLists);
        return "/jsp/users/jfsc_index.jsp";
    }
    //爆款积分商品
    @RequestMapping(value = "/SelectProductHotDiscont.action",method = {RequestMethod.GET,RequestMethod.POST})
    public  String SelectProductHotDiscont(Model model){
        List<TotalCreditsById> totalCreditsByIds=productCreditsService.SelectHotCreditProduct();
        model.addAttribute("totalCreditsByIds",totalCreditsByIds);
        return "/jsp/users/jfsc_index.jsp";
    }
    //查询所有积分商品根据商品类型ID
    @RequestMapping(value = "/SelectCreditsProductQuerry.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String SelectCreditsProductQuerry(Model model ,Integer productTypeId,Integer pageNo){
        List<ProductTypeExtend> productTypeExtends=productCreditsService.SelectProductType(productTypeId);
        model.addAttribute("productTypeExtends",productTypeExtends);
       //全部出行积分商品
        Pagination pagination=productCreditsService.selectPaginationByQuery(productTypeId,pageNo);
        model.addAttribute("pagination",pagination);
        //爆款
        List<TotalCreditsById> allHCproductList=productCreditsService.SelectHotCreditProductByTypeId(productTypeId);
        model.addAttribute("allHCproductList",allHCproductList);
        return "/jsp/users/jfsc_lncx.jsp";
    }


}