package com.xh.serviceimp;

import com.xh.mapper.pojo.MessageMapper;
import com.xh.po.vo.CommentRate;
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
}
