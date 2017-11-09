package com.xh.controller;

import com.xh.po.Transport;
import com.xh.po.vo.StringAndString;
import com.xh.service.ConveyanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class SystemController {
    /*
    * 系统设置
    * */

    /*
    * 物流管理
    * */
    //实现物流的全部输出
    @Autowired
    private ConveyanceService conveyanceService;
    @RequestMapping(value = "/Advertising.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String Advertising(Model model){
        List<Transport> transportslist=conveyanceService.QuerryAllTranSport();
        model.addAttribute("transportslist",transportslist);
        return "/jsp/admin/advertising.jsp";
    }
    //启用物流
    @RequestMapping(value = "/AdvertisingStatusStart.action",method ={RequestMethod.GET,RequestMethod.POST} )
    public String AdvertisingStart(Integer transportId){
        Transport transport=new Transport();
        transport.setTransportid(transportId);
        //这里用TransportB来表示物流状态
        transport.setTransportB("1");
        conveyanceService.updateByPrimaryKeySelective(transport);
        return "redirect:/Advertising.action";
    }
    //停用物流
    @RequestMapping(value = "/AdvertisingStatusStop.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String AdvertisingStartStop(Integer transportId){
        Transport transport=new Transport();
        transport.setTransportid(transportId);
        //这里用TransportB来表示物流状态
        transport.setTransportB("0");
        conveyanceService.updateByPrimaryKeySelective(transport);
        return "redirect:/Advertising.action";
    }
    //实现模糊查询
    @RequestMapping(value = "/TransportConfuse.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String TransportConfuse(StringAndString stringAndString,Model model){
        model.addAttribute("stringAndString",stringAndString);
        List<Transport> transportslist=conveyanceService.QueryTransportConfuse(stringAndString);
        model.addAttribute("transportslist",transportslist);
        return "/jsp/admin/advertising.jsp";
    }
    //删除物流信息
    @RequestMapping(value = "/TransportDelect.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String TransportDelect(Integer transportId){
        conveyanceService.deleteByPrimaryKey(transportId);
        return "redirect:/Advertising.action";
    }
    //批量删除
    @RequestMapping(value = "/DelectTransportQuerry.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String DelectTransportQuerry(String[] Transpostids){
        if (Transpostids !=null){
            for (String id:Transpostids){
                conveyanceService.deleteByPrimaryKey(Integer.parseInt(id));
            }
            return "redirect:/Advertising.action";
        }else
            return "redirect:/Advertising.action";
    }
    //添加物流方式
    @RequestMapping(value = "/AddTransport.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String AddTransport(Transport transport,Model model){
        transport.setTransportA(new Date());
        conveyanceService.insert(transport);
        return "redirect:/Advertising.action";
    }


}
