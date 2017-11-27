package com.xh.controller;

import com.xh.po.vo.OderAndString2;
import com.xh.po.vo.OrderAndString;
import com.xh.po.vo.ReportFormsString;
import com.xh.service.OrderService;
import com.xh.service.ReportFormsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;


@Controller
public class ReportForms {

    @Autowired
    OrderService orderService;
    @Autowired
    ReportFormsService reportFormsService;

    //用于ajax的报表
    @RequestMapping(value = "/readforms")
    public @ResponseBody
    List< OrderAndString> findBigDecimal(@RequestBody OrderAndString orderAndString, HttpServletRequest request){
        List< OrderAndString> List2=orderService.selectNotName2();
        return List2;
    }
    @RequestMapping(value = "/readforms1")
    public @ResponseBody
    List< OrderAndString> findBigDecimal1(@RequestBody OrderAndString orderAndString, HttpServletRequest request){
        List< OrderAndString> List1=orderService.selectNotName1();
        return List1;
    }

   @RequestMapping(value = "/getArray")
   public @ResponseBody
   List<Integer> findBigDecimal005551(  ){
    //获取今年   如     2017
       Calendar cal = Calendar.getInstance();
       int year = cal.get(Calendar.YEAR);
       int[] array =  reportFormsService.getArray(year);
       int n=array.length;
       Integer[] iarr=new Integer[n];
       for(int i=0;i<n;i++){
           iarr[i]=new Integer(array[i]);
       }
       List<Integer> listppp= Arrays.asList(iarr);
       return  listppp;
    }


    @RequestMapping(value = "/readforms4")
    public @ResponseBody
    List< OderAndString2> findBigDecimal002(@RequestBody OrderAndString orderAndString, HttpServletRequest request){

        List<OderAndString2> oderAndString2s=orderService.selectAndName();

        System.out.println(oderAndString2s.get(0).getDdd());
        return oderAndString2s;
    }

    @RequestMapping(value = "/readindex1",method={RequestMethod.POST,RequestMethod.GET})
    public String getIpAddr111111(HttpServletRequest request, Model model) {

        return "/222.jsp";
    }


    @RequestMapping(value = "/readindex",method={RequestMethod.POST,RequestMethod.GET})
    public String getIpAddr(HttpServletRequest request, Model model) {
//        //        得到各个商品类型的交易金额  name1 name2
//        List< OrderAndString> List2=orderService.selectNotName2();
//        //        得到各个商品类型的订单数  name3 name4
//        List< OrderAndString> List1=orderService.selectNotName1();
//        //    查询用户人数
//        OrderAndString orderAndString0=orderService.selectName5();
        //    查询交易总金额
        OrderAndString orderAndString1=orderService.totalAmountOfTransaction();
        //    订单数量
        OrderAndString orderAndString2=orderService.orderQuantity() ;
        //    交易成功
        OrderAndString orderAndString3=orderService.successfulTrade();
        //    交易失败
        OrderAndString orderAndString4=orderService.transactionFailure();
        //    退款金额
        OrderAndString orderAndString5=orderService.refundAmount();

        model.addAttribute("orderAndString1",orderAndString1);
        model.addAttribute("orderAndString2",orderAndString2);
        model.addAttribute("orderAndString3",orderAndString3);
        model.addAttribute("orderAndString4",orderAndString4);
        model.addAttribute("orderAndString5",orderAndString5);
        return "/jsp/admin/home.jsp";
    }

    //home页面ajax
    @RequestMapping(value = "/readforms10000")
    public @ResponseBody
     OrderAndString findBigDhgffg(){
        //    查询用户人数
        OrderAndString orderAndString0=orderService.selectName5();
        return orderAndString0;
    }
    @RequestMapping(value = "/readforms10001")
    public @ResponseBody
    OrderAndString findBigDhgfg(){
        //    查询交易总金额
        OrderAndString orderAndString1=orderService.totalAmountOfTransaction();
        return orderAndString1;
    }

    @RequestMapping(value = "/readforms10002")
    public @ResponseBody
    OrderAndString findBiDhgfg(){
        //    订单数量
        OrderAndString orderAndString2=orderService.orderQuantity() ;
        return orderAndString2;
    }
    @RequestMapping(value = "/readforms10005")
    public @ResponseBody
    OrderAndString findBiDhgofg(){
        //    退款金额
        OrderAndString orderAndString5=orderService.refundAmount();
        return orderAndString5;
    }

   }
