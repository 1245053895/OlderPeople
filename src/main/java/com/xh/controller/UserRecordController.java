package com.xh.controller;

import com.xh.po.vo.UserAndUserLog;
import com.xh.service.UserRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserRecordController {
    @Autowired
    UserRecordService userRecordService;

    @RequestMapping("/getUserRecord")
    public String getUserRecord(Model model){
        List<UserAndUserLog> userAndUserLog=userRecordService.queryUserLog();
        model.addAttribute("userAndUserLog",userAndUserLog);
        return "/jsp/admin/integration.jsp";
    }

}
