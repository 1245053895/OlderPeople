package com.xh.mapper.pojo;

import com.xh.po.Comment;
import com.xh.po.vo.CommentRate;
import com.xh.po.vo.MessageReview;
import com.xh.po.vo.TotalMessage;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/9.
 */
@Component
public interface MessageMapper {
    //根据商品名称进行分组求出每个商品的好评率
    public List<CommentRate> selectCommentRate();

    //根据商品的名称和好评率来进行模糊查询
    public List<CommentRate> moHuSelectByNameOrRate(CommentRate commentRate);

//统计出所有商品的条数
    public TotalMessage selectTotalDate();

     //根据商品的id查询出对它进行评价的用户名，时间，评论内容等
    public List<MessageReview> selectCommentUserById(Integer productid);

    //根据评论的内容和好评度来进行模糊查询
    public List<MessageReview> selectCommentGood(Comment comment);

    //pl页面针对某个商品统计出所有评论的用户有多少人
    public  TotalMessage queryTotalUserById(Integer productid);
}
