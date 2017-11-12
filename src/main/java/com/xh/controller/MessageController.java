package com.xh.controller;

import com.xh.po.Comment;
import com.xh.po.vo.CommentRate;
import com.xh.po.vo.MessageReview;
import com.xh.po.vo.TotalMessage;
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

    //得出每个商品的好评率和统计出所有总的数据
    @RequestMapping("/selectCommentRate.action")
    public String selectCommentRate(Model model){
       List<CommentRate> commentRates= messageService.selectCommentRate();
        TotalMessage totalMessage= messageService.selectTotalDate();
        model.addAttribute("totalMessage",totalMessage);
        model.addAttribute("commentRates",commentRates);
        return "/jsp/admin/Guestbook.jsp";
    }

    //根据商品的名称和好评率来进行模糊查询
    @RequestMapping("/moHuSelectByNameOrRate.action")
    public String moHuSelectByName(Model model,CommentRate commentRate){
      List<CommentRate> commentRates=  messageService.moHuSelectByNameOrRate(commentRate);
      model.addAttribute("commentRates",commentRates);
        return "/jsp/admin/Guestbook.jsp";
    }


    //根据商品的编号查询出评论的用户名，评论的内容，时间，回复

    @RequestMapping("/selectCommentUserById.action")
    public String selectCommentUserById(Model model, Integer productid, Comment comment){
      List<MessageReview> messageReviews= messageService.selectCommentUserById(productid);
      model.addAttribute("messageReviews",messageReviews);
        return "/jsp/admin/pl.jsp";
    }

    //根据评论的内容和好评度来进行模糊查询
    @RequestMapping("/selectCommentGood.action")
    public String selectCommentGood(Model model,Comment comment){
          List<MessageReview> messageReviews= messageService.selectCommentGood(comment);
           model.addAttribute("messageReviews",messageReviews);
            return "/jsp/admin/pl.jsp";
    }

}
