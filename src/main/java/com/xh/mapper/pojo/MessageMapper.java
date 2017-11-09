package com.xh.mapper.pojo;

import com.xh.po.vo.CommentRate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/9.
 */
@Component
public interface MessageMapper {
    //根据商品名称进行分组求出每个商品的好评率
    public List<CommentRate> selectCommentRate();
}
