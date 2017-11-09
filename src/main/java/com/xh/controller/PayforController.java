package com.xh.controller;

import com.xh.po.Pay;
import com.xh.service.PayforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

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
        model.addAttribute("payList",payList);
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
    //添加物流方式
    @RequestMapping(value = "/AddPay.action" ,method = {RequestMethod.GET,RequestMethod.POST})
    public String AddPay(Pay pay, Model model, MultipartFile Pay_pic){
        pay.setPayA(new Date());
        payforService.insert(pay);

        //图片原始名称
        String originalFilename = Pay_pic.getOriginalFilename();
        //上传图片
        if(Pay_pic!=null && originalFilename!=null && originalFilename.length()>0){

            //存储图片的物理路径D:\ideaspace\i
            String pic_path = "D:\\ideaspace\\i\\";
            //新的图片名称
            String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
            //新图片
            File newFile = new File(pic_path+newFileName);

            //将内存中的数据写入磁盘
            try {
                Pay_pic.transferTo(newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }

            //将新图片名称写到itemsCustom中
            pay.setPaypicture(newFileName);

        }


        // 调用service添加商品信息
        payforService.insert(pay);

        // 重定向到商品查询列表
        // return "redirect:queryItems.action";
        // 页面请求转发，可带参数到转发的controller方法中（ProducList.action方法中能用本方法中的形参值）
        // return "forward:queryItems.action";
        return "redirect:/QuerryAllPay.action";
    }
    //启用物流
    @RequestMapping(value = "/PayStatusStart.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String PayStatusStart(Integer payId){
        Pay pay=new Pay();
        pay.setPayid(payId);
        //这里用PayA表示状态
        pay.setPayB("1");
        payforService.updateByPrimaryKeySelective(pay);
        return "redirect:/QuerryAllPay.action";
    }
    //禁用物流
    @RequestMapping(value = "/PayStatusStop.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String PayStatusStop(Integer payId){
        Pay pay=new Pay();
        pay.setPayid(payId);
        pay.setPayB("0");
        payforService.updateByPrimaryKeySelective(pay);
        return "redirect:/QuerryAllPay.action";
    }
}
