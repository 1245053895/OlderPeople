package com.xh.controller.customerController;

import com.xh.po.Gainaddres;
import com.xh.po.User;
import com.xh.po.vo.UserAndBrithday;
import com.xh.service.UserMessageService;
import com.xh.service.customerService.CustomerInformationService;
import com.xh.service.customerService.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class CustomerInformationController {
    @Autowired
    private CustomerInformationService customerInformationService;

    //用户信息
    @RequestMapping(value = "/CustomerInformation.action",method = {RequestMethod.GET,RequestMethod.POST})
    public  String CustomerInformation(HttpSession session, HttpServletRequest request, HttpServletResponse response, Model model){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        User userInfo = new User();
        userInfo = (User)request.getSession().getAttribute("user");

      /*  customerInformationService.selectCustomerInformatin(id);*/

        if(userInfo!=null) {
            Integer id=userInfo.getUserid();
            userInfo.setUserid(id);
            UserAndBrithday userAndBrithday=customerInformationService.SelectCustomerInformation(id);
            model.addAttribute(userAndBrithday);
            String userBirthday = df.format(userAndBrithday.getUserbirthday());
            String temp[] = userBirthday.split(" ")[0].split("-");
            String year = temp[0];
            String month = temp[1];
            String day = temp[2];

            model.addAttribute("temp", temp);


            return "/jsp/users/user.jsp";
        }else {
            return "/jsp/users/user.jsp";
        }
    }
    //修改用户信息
    @RequestMapping(value = "/CustomerUpdate.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String CustomerUpdate(UserAndBrithday userAndBrithday,HttpServletRequest request, HttpServletResponse response, Model model){
        User user1= (User) request.getSession().getAttribute("user");
        Integer id=user1.getUserid();
        userAndBrithday.setUserid(id);


        String temp =userAndBrithday.getYear()+userAndBrithday.getMonth()+userAndBrithday.getDay();
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date d = new Date();
        try {
            d = df.parse(temp);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        userAndBrithday.setUserbirthday(d);
        customerInformationService.UpdateUserByid(userAndBrithday);
        //customerInformationService.updateByPrimaryKeySelective(user);
        return "redirect:/CustomerInformation.action";
    }


    //收货地址
    @RequestMapping(value = "/CustomersAddress.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String CustomersAddress( HttpServletRequest request, HttpServletResponse response,Model model){
        User user1= (User) request.getSession().getAttribute("user");
        if (user1 !=null){
            Integer id=user1.getUserid();
            List<Gainaddres> gainaddres = customerInformationService.SelectUserAddressByid(id);
            model.addAttribute("gainaddres",gainaddres);
        }
        return "/jsp/users/address.jsp";
    }

    //根据用户Id插入收货地址信息
    @RequestMapping(value = "/InsertGainAddress.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String InsertGainAddress( Gainaddres gainaddres,HttpServletResponse response,HttpServletRequest request,Model model){

            customerInformationService.InsertGainAddress(gainaddres);

        return "redirect:/CustomersAddress.action";
    }


    //修改用户地址信息
    @RequestMapping(value = "/UpdateGainAdress.action",method ={RequestMethod.GET,RequestMethod.POST})
    public String UpdateGainAdress(Gainaddres gainaddres,HttpServletRequest request){
        customerInformationService.UpdateGainAdress(gainaddres);
        return "redirect:/CustomersAddress.action";
    }
    //删除收货地址
    @RequestMapping(value = "/DelectGainaddress.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String DelectGainaddress(Integer gainid){
        customerInformationService.DelectGainaddress(gainid);

        return "redirect:/CustomersAddress.action";
    }


    //修改状态选择默认地址
    @RequestMapping(value = "/UpdateGainAdressStatus.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String UpdateGainAdressStatus(Gainaddres gainaddres ,HttpServletRequest request){
        User user1= (User) request.getSession().getAttribute("user");
        int gainid=gainaddres.getGainid();
        if (user1!=null){
            Integer id=user1.getUserid();
            List<Gainaddres> gainaddres1=customerInformationService.SelectUserAddressByid(id);
            for (Gainaddres gainaddre:gainaddres1){
                if(gainaddre.getGainA().equals("1")){
                    customerInformationService.UpdateGainAflase(gainaddre.getGainid());
                }
            }
            customerInformationService.UpdateGainAture(gainid);
        }

        return "redirect:/CustomersAddress.action";
    }
}
