package com.xh.controller;

import com.xh.po.vo.OrderDetails;
import com.xh.po.vo.UserAndUserLog;
import com.xh.po.vo.UserLogCustom;
import com.xh.service.UserRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserRecordController {
    @Autowired
    UserRecordService userRecordService;

    /**
     * 查询所有用户日志
     * @param model
     * @return
     */
    @RequestMapping("/getUserRecord")
    public String getUserRecord(Model model){
        List<UserAndUserLog> userAndUserLog=userRecordService.queryUserLog();
        model.addAttribute("userAndUserLog",userAndUserLog);
        return "/jsp/admin/integration.jsp";
    }

    /**
     * 通过id查询订单详情
     * @param id
     * @return
     */
    @RequestMapping("/getOrderDetail")
    public @ResponseBody List<OrderDetails> getOrderDetailsByUserId(Integer id){
        List<OrderDetails> orderDetails=userRecordService.getOrderDetailsByUserId(id);
        return orderDetails;
    }

    /**
     * 通过id查询用户日志
     * @param id
     * @return
     */
    @RequestMapping("/getUserLogById")
    public @ResponseBody List<UserLogCustom> getUserLogById(Integer id){
        List<UserLogCustom> userLogById=userRecordService.getUserLogById(id);
        return userLogById;
    }

}
