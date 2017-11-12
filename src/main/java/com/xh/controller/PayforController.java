package com.xh.controller;

import com.xh.po.Pay;
import com.xh.po.vo.TotalMessage;
import com.xh.service.PayforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class PayforController {
   //实现全部输出到页面
    @Autowired
    private PayforService payforService;
    @RequestMapping(value = "/QuerryAllPay.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String QuerryAllPay(Model model){
        List<Pay> payList=payforService.QuerryAllPay();
        TotalMessage totalMessage= payforService.totalpay();
        model.addAttribute("payList",payList);
        model.addAttribute("totalMessage",totalMessage);
        return "/jsp/admin/Cover_management.jsp";
    }

    //实现单个删除功能
    @RequestMapping(value = "/DelectPayById",method = {RequestMethod.GET,RequestMethod.POST})
    public String DelectPayById(Integer payid){
        payforService.deleteByPrimaryKey(payid);
        return "redirect:/QuerryAllPay.action";
    }
    //实现批量删除
    @RequestMapping(value = "/DelectPayQuerry.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String DelectPayQuerry(String [] payid){
        if (payid !=null){
            for (String id:payid){
                payforService.deleteByPrimaryKey(Integer.parseInt(id));
            }
            return "redirect:/QuerryAllPay.action";
        }else
        return "redirect:/QuerryAllPay.action";
    }
    //添加支付方式
    @RequestMapping(value = "/AddPay.action" ,method = {RequestMethod.GET,RequestMethod.POST})
    public String AddPay(Pay pay, Model model, MultipartFile Pay_pic,HttpSession session)throws IllegalStateException, IOException {
        String sqlPath = null;
        if (Pay_pic != null && Pay_pic.getOriginalFilename() != null) {
            String path = session.getServletContext().getRealPath("/jsp/admin/images/upload");
            String realName = Pay_pic.getOriginalFilename();
            String realFilePath = path + File.separator + realName;
            File file = new File(realFilePath);
            Pay_pic.transferTo(file);
            pay.setPaypicture(realFilePath);
            sqlPath = "jsp/admin/images/upload/" + realName;
            pay.setPayA(new Date());
            pay.setPaypicture(sqlPath);
            pay.setPaypicture(pay.getPaypicture());
            pay.setPayB(pay.getPayB());
            payforService.insert(pay);
            return "redirect:/QuerryAllPay.action";
        }
        return null;
    }

    //启用支付
    @RequestMapping(value = "/PayStatusStart.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String PayStatusStart(Integer payId){
        Pay pay=new Pay();
        pay.setPayid(payId);
        //这里用PayA表示状态
        pay.setPayB("1");
        payforService.updateByPrimaryKeySelective(pay);
        return "redirect:/QuerryAllPay.action";
    }
    //禁用支付
    @RequestMapping(value = "/PayStatusStop.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String PayStatusStop(Integer payId){
        Pay pay=new Pay();
        pay.setPayid(payId);
        pay.setPayB("0");
        payforService.updateByPrimaryKeySelective(pay);
        return "redirect:/QuerryAllPay.action";
    }
}
