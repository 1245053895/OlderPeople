package com.xh.controller;

import com.xh.po.*;
import com.xh.service.OrderPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class OrderPayController {

    @Autowired
    private OrderPayService orderPayService;


    //    详情页面的单个商品购买
    @RequestMapping(value = "/querendingdan.action", method = {RequestMethod.GET, RequestMethod.POST})
    public String QuerryAllPay44(Model model, String[] productid, String[] shuliang) {

        List<Integer> idList = new ArrayList<Integer>();
        for (String id : shuliang) {
            idList.add(Integer.valueOf(id));
        }

        List<Product> productList = orderPayService.selectByPrimaryKey(productid);

        Integer a = idList.get(0);
//        价格
        Double b = productList.get(0).getProductprice();
//        积分
        Integer b1 = productList.get(0).getProductcredits();
        double c = a * b;
        Integer c1 = a * b1;
        List<Double> zongjia = new ArrayList<Double>();
        zongjia.add(c);
        List<Integer> zongjifen = new ArrayList<Integer>();
        zongjifen.add(c1);

        model.addAttribute("zongjia", zongjia);
        model.addAttribute("zongjifen", zongjifen);


        model.addAttribute("productList", productList);
//        Integer zongjia= (idList[0])*(productList[0].productprice);
        model.addAttribute("idList", idList);

        return "/jsp/users/my-add.jsp";

    }



    //商品详情的结算
    @RequestMapping(value = "/jieSuan.action", method = {RequestMethod.GET, RequestMethod.POST})
    public String jieSuan(Model model, String[] productid, Gainaddres gainaddres, Order order, Orderproduct orderproduct
            , String[] productname) {
        model.addAttribute("productname", productname);  /*保存商品名称*/
        model.addAttribute("totalcredit", order.getTotalcredit());  /*保存用户此次购买可获得的积分*/

/*       先得到用户id
        HttpSession session = request.getSession();
        User user= (User) session.getAttribute("user");
        Integer userid=user.getUserid();*/
//        存入数据库
        //        Gainaddres gainaddres   Order order    Orderproduct orderproduct
        String return1 = orderPayService.insertSelective1(gainaddres);
        Integer gainid = gainaddres.getGainid();  /*数据库返回的主键*/
        order.setGainid(gainid);       /*主键是另外一张表的外键需要插入*/
        if (return1.equals("OK")) {
                                                 /*实付金额与邮费*/
            if (order.getAmountpay() > 88) {
                order.setPostfee(0.0);
                order.setRealpay(order.getAmountpay());
            } else {
                order.setPostfee(15.0);
                order.setRealpay(order.getAmountpay() + 15);
            }
            order.setStatus(0);       /* 订单状态 订单新建时为0*/
            String return2 = orderPayService.insertSelective2(order);
            Integer orderid = order.getOrderid();  /*数据库返回的主键*/
            orderproduct.setOrderid(orderid);       /*主键是另外一张表的外键需要插入*/
            model.addAttribute("orderid", orderid);  /*设置支付状态*/
            model.addAttribute("realpay", order.getRealpay());  /*保存支付金额*/
            if (return2.equals("OK")) {
                orderPayService.insertSelective3(orderproduct);
                //        判断支付方式  1在线支付------返回付款页面  0货到付款------
                if (order.getPaytype() == 1) {


                    return "/jsp/users/my-apy.jsp";
                } else {
                    return "/jsp/users/my-apy-suc.jsp";
                }

            }
            return null;
        }
        return null;


    }



//  购物车页面  点击“去付款 ”之后的功能步骤********************************************
    @RequestMapping(value = "/myTset.action", method = {RequestMethod.GET, RequestMethod.POST})
     public String myTest(HttpSession session,Model model,Integer[] shopcarid,Integer[] orderamount) {
//  第一步   修改购物车商品数量
        for (int i=0;i<shopcarid.length;i++){
            System.out.println(shopcarid[i] +" "+orderamount[i]);
            Shopcar shopcar=new Shopcar();shopcar.setShopcarid(shopcarid[i]);shopcar.setOrderamount(orderamount[i]);
            orderPayService.updateShopCarShuLiang(shopcar);
        }
//  第二步   通过shopcarid数组查询用户要付款的购物车信息
        List<Shopcar> myshopcarList=orderPayService.selectShopCarShangPing(shopcarid);
        List<Integer> idList = new ArrayList<Integer>();
        List<String> idListofSrting = new ArrayList<String>();
        Double zongjia=0.0;
        for (int i=0;i<myshopcarList.size();i++){
            Double a=Double.parseDouble(myshopcarList.get(i).getShopcarB());
            zongjia += a;
            idList.add(myshopcarList.get(i).getProductid());
            idListofSrting.add(String.valueOf(myshopcarList.get(i).getProductid()));
        }
        String[] arr= idListofSrting.toArray(new String[idListofSrting.size()]);

        Integer zongjifen=0;
        List<Product> productList = orderPayService.selectByPrimaryKey(arr);
       for (int i=0;i<productList.size();i++){    /*myshopcarList 的C字段保存商品图片  A 保存商品名称*/
           myshopcarList.get(i).setShopcarC(productList.get(i).getProductpicture());
           myshopcarList.get(i).setShopcarA(productList.get(i).getProductname());
           Integer a=  productList.get(i).getProductcredits();
           Integer b=a*orderamount[i];
           zongjifen += b; }

        session.setAttribute("myshopcarList", myshopcarList);  /*保存用户要付款的购物车信息*/
        session.setAttribute("zongjia", zongjia);  /*保存用户要付款总价 没计算邮费在内*/
        session.setAttribute("totalcredit", zongjifen);  /*保存总积分*/

//        String message="测试页面";
//        model.addAttribute("message",message);
        return "/jsp/users/my-add-of-car.jsp";
}


    //购物车的结算
    @RequestMapping(value = "/jieSuanForCar.action", method = {RequestMethod.GET, RequestMethod.POST})
    public String jieSuan(HttpSession session,Model model, Gainaddres gainaddres, Order order, Orderproduct orderproduct) {

        //  存入数据库      Gainaddres gainaddres   Order order    Orderproduct orderproduct
        String return1 = orderPayService.insertSelective1(gainaddres);
        Integer gainid = gainaddres.getGainid();  /*数据库返回的主键*/
        order.setGainid(gainid);       /*主键是另外一张表的外键需要插入*/
        if (return1.equals("OK")) {
                                                 /*实付金额与邮费*/
            if (order.getAmountpay() < 88) {
                order.setPostfee(15.0);
                order.setRealpay(order.getAmountpay() + 15);

            } else {
                order.setPostfee(0.0);
                order.setRealpay(order.getAmountpay());
            }
            order.setStatus(0);
            String return2 = orderPayService.insertSelective2(order);
            Integer orderid = order.getOrderid();  /*数据库返回的主键*/
            orderproduct.setOrderid(orderid);       /*主键是另外一张表的外键需要插入*/
            List<Shopcar> myshopcarList= (List<Shopcar>) session.getAttribute("myshopcarList");
            model.addAttribute("orderid", orderid);  /*设置支付状态*/
            model.addAttribute("realpay", order.getRealpay());  /*保存支付金额*/
            if (return2.equals("OK")) {
                for (int i=0;i<myshopcarList.size();i++){
                    orderproduct.setProductid( myshopcarList.get(i).getProductid() );
                    orderproduct.setShoppingcount( myshopcarList.get(i).getOrderamount() );
                    orderproduct.setTotalmoneycount(Double.valueOf(myshopcarList.get(i).getShopcarB()));
                    orderproduct.setPayprice( myshopcarList.get(i).getPrice()  );

                    orderPayService.insertSelective3(orderproduct);
                }

                //        判断支付方式  1在线支付------返回付款页面  0货到付款------返回购买成功页面
                if (order.getPaytype() == 1) {


                    return "/jsp/users/my-apy.jsp";
                } else {
                    return "/jsp/users/my-apy-suc.jsp";
                }
            }
            return null;
        }
        return null;
    }



    //进行用户支付是否成功的处理   支付成功返回到 my-apy-suc
    @RequestMapping(value = "/wanCheng.action", method = {RequestMethod.GET, RequestMethod.POST})
    public String wanCheng(HttpSession session,Model model, Integer orderid) {

        //  此处需要进行支付是否成功验证


        //下面是支付成功的继续    one 修改order表中paystatus为1表示已支付  two 将 shopcar 的 C值变为1代表已付款，清除session
        if (orderid!=null){
        orderPayService. updateOrderPayStatus(orderid);}

        List<Shopcar> myshopcarList= (List<Shopcar>) session.getAttribute("myshopcarList");
        if (myshopcarList!=null){
        List<Integer> idList = new ArrayList<Integer>();
        for (int i=0;i<myshopcarList.size();i++){
            idList.add(  myshopcarList.get(i).getShopcarid() );
        }
        orderPayService.updateShopCarC(idList);}
        return "/jsp/users/my-apy-suc.jsp";


    }




    }
