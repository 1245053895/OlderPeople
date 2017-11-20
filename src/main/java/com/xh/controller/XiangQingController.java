package com.xh.controller;

import com.xh.po.vo.MyProduct;
import com.xh.po.vo.PingJia;
import com.xh.po.vo.PingJiaShu;
import com.xh.po.vo.TuiJian;
import com.xh.service.ProductService;
import com.xh.service.customerService.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class XiangQingController {

    @Autowired
    ProductService productService;

    @Autowired
    private UserLoginService userLoginService;


    @RequestMapping(value = "/xiangqing",method={RequestMethod.POST,RequestMethod.GET})
    public String getAllOrder(@RequestParam(defaultValue="1")Integer productid, Model model){
       Integer ProductLookCount= userLoginService.queryLookcount(productid);
       if(ProductLookCount==null){
           userLoginService.setLookcount(productid);
       }else {
          userLoginService.AutoIncreaseOne(productid);
       }

        List<PingJiaShu> pingJiaShuList = productService.pingJiaShu(productid);
        List<PingJia> pingJiaList = productService.pingJia(productid);
        MyProduct myProduct = productService.selectByPrimaryKey(productid);
        PingJiaShu pingJiaShu=productService.pingJiaShu1(productid);

        List<TuiJian> tuiJianList01=productService.tuiJian01();
        model.addAttribute("tuiJianList01",tuiJianList01);
        List<TuiJian> tuiJianList02=productService.tuiJian02();
        model.addAttribute("tuiJianList02",tuiJianList02);
        List<TuiJian> tuiJianList03=productService.tuiJian03();
        model.addAttribute("tuiJianList03",tuiJianList03);
        List<TuiJian> tuiJianList04=productService.tuiJian04();
        model.addAttribute("tuiJianList04",tuiJianList04);
        List<TuiJian> tuiJianList05=productService.tuiJian05();
        model.addAttribute("tuiJianList05",tuiJianList05);





        model.addAttribute("pingJiaShu001",productService.pingJia001(productid).getGoodcommentcount());
        model.addAttribute("pingJiaShu002",productService.pingJia002(productid).getGoodcommentcount());
        model.addAttribute("pingJiaShu003",productService.pingJia003(productid).getGoodcommentcount());


        model.addAttribute("pingJiaShuList",pingJiaShuList);
        model.addAttribute("pingJiaList",pingJiaList);
        model.addAttribute("myProduct",myProduct);
        model.addAttribute("pingJiaShu",pingJiaShu);

        return "/jsp/users/page.jsp";
    }



}
