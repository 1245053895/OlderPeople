package com.xh.controller;

import com.xh.po.vo.CommentRate;
import com.xh.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.List;

/**
 * Created by KAIRUN on 2017/11/9.
 */
@Controller
public class MessageController {
    @Autowired
    private MessageService messageService;
    @RequestMapping("/selectCommentRate.action")
    public String selectCommentRate(Model model){
       List<CommentRate> commentRates= messageService.selectCommentRate();
       model.addAttribute("commentRates",commentRates);
        return "/jsp/admin/Guestbook.jsp";
    }
}
