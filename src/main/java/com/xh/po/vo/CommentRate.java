package com.xh.po.vo;

/**
 * Created by KAIRUN on 2017/11/9.
 */
public class CommentRate {
    private Integer commentid;

    private String productname;

    private Integer GoodRate;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Integer getGoodRate() {
        return GoodRate;
    }

    public void setGoodRate(Integer goodRate) {
        GoodRate = goodRate;
    }
}
