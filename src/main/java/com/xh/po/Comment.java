package com.xh.po;

import java.util.Date;

public class Comment {
    private Integer commentid;

    private Integer productid;

    private Integer userid;

    private String comment;

    private Integer goodcomment;

    private Date commenttime;

    private String commentreview;

    private String commentC;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getGoodcomment() {
        return goodcomment;
    }

    public void setGoodcomment(Integer goodcomment) {
        this.goodcomment = goodcomment;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public String getCommentreview() {
        return commentreview;
    }

    public void setCommentreview(String commentreview) {
        this.commentreview = commentreview == null ? null : commentreview.trim();
    }

    public String getCommentC() {
        return commentC;
    }

    public void setCommentC(String commentC) {
        this.commentC = commentC == null ? null : commentC.trim();
    }
}