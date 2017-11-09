package com.xh.service;

import com.xh.po.vo.CommentRate;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/9.
 */
public interface MessageService {
    //根据商品名称进行分组求出每个商品的好评率
    public List<CommentRate> selectCommentRate();
}
