package com.xh.controller;


import com.xh.po.Product;
import com.xh.po.Producttype;
import com.xh.po.vo.KindOfProduct;
import com.xh.po.vo.ProductAndTypeVo;
import com.xh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.util.List;
@Controller
public class ProducController {

    @Autowired
    private ProductService productService;
//    查
    @RequestMapping("/ProducList.action")
    public String producList(String productname, Product product, Model model){
            List<ProductAndTypeVo> productAndTypeVos= productService.selectByProduct(product);
            model.addAttribute("productAndTypeVos",productAndTypeVos);
            model.addAttribute("productname",productname);
            return "/jsp/admin/Products_List.jsp";
    }
//删除
    @RequestMapping("/DeleteOneProduct.action")
    public String deleteOneProduct(int productid){
        productService.deleteByPrimaryKey(productid);
        return "redirect:/ProducList.action";
    }
//批量删除
    @RequestMapping("/DeleteBatchProduct.action")
    public String deleteBatchProduct(String[] productid){
        if (productid[0]!=null){
        productService.deleteBatch(productid);
//        重定向
        return "redirect:/ProducList.action";
        }
       else {return "/jsp/admin/login.jsp";}
    }
//添加
    @RequestMapping("/AddProduct.action")
    public String addProduct(Product product, Model model) throws ParseException {
//       springmvc 没有办法去处理日期格式的字符串1990-01-01   1990/01/01     01/01 1990   Date

        productService.insertSelective(product);
      //请求转发，可带参数到转发的controller方法中（ProducList.action方法中能用本方法中的形参值）
        return "forward:/ProducList.action";
    }


















    //商品分类列表     Producttype producttype,Model model
    @RequestMapping("/ProductType.action")
    public String productType(Model model){
        List<KindOfProduct> kindOfProducts= productService.KindOfProduct();
        model.addAttribute("kindOfProducts",kindOfProducts);
        return "/jsp/admin/Product_Manage.jsp";
    }
    //商品分类增加     Producttype producttype,Model model
    @RequestMapping("/ProductTypeAdd.action")
    public String productTypeAdd(String producttypename,Producttype producttype,Model model){
        productService.TypeinsertSelective(producttype);
        List<KindOfProduct> kindOfProducts= productService.KindOfProduct();
        model.addAttribute("kindOfProducts",kindOfProducts);
        model.addAttribute("producttypename",producttypename);
        return "/jsp/admin/product-category-add.jsp";


    }
    //商品分类删除     Producttype producttype,Model model
    @RequestMapping("/ProductTypeDda.action")
    public String productTypeDda(String producttypename,Model model){
        productService.TypedeleteByName(producttypename);
        model.addAttribute("producttypename",producttypename);
        return "/jsp/admin/product-category-add.jsp";
    }


}
