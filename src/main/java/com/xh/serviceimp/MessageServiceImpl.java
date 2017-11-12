package com.xh.serviceimp;

import com.xh.mapper.pojo.MessageMapper;
import com.xh.po.Comment;
import com.xh.po.vo.CommentRate;
import com.xh.po.vo.MessageReview;
import com.xh.po.vo.TotalMessage;
import com.xh.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/9.
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Override
    public List<CommentRate> selectCommentRate() {
        List<CommentRate> commentRates= messageMapper.selectCommentRate();
        return commentRates;
    }

    @Override
    public List<CommentRate> moHuSelectByNameOrRate(CommentRate commentRate) {
        List<CommentRate> commentRates=messageMapper.moHuSelectByNameOrRate(commentRate);
        return commentRates;
    }

    @Override
    public TotalMessage selectTotalDate() {
       TotalMessage totalMessage= messageMapper.selectTotalDate();
        return totalMessage;
    }


    @Override
    public List<MessageReview> selectCommentUserById(Integer productid) {
        List<MessageReview> messageReviews=messageMapper.selectCommentUserById(productid);
        return messageReviews;
    }

    @Override
    public List<MessageReview> selectCommentGood(Comment comment) {
       List<MessageReview> messageReviews= messageMapper.selectCommentGood(comment);
        return messageReviews;
    }

    @Override
    public TotalMessage queryTotalUserById(Integer productid) {
     TotalMessage totalMessage= messageMapper.queryTotalUserById(productid);
        return totalMessage;
    }

    @Override
    public void updataComment(Comment comment) {
        messageMapper.updataComment(comment);
    }
}
