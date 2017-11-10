package com.xh.po;

import java.util.Date;

public class Comment {
    private Integer commentid;

    private Integer productid;

    private Integer userid;

    private String comment;

    private Integer goodcomment;

    private Date CommentTime;

    private String CommentReview;

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

    public Date getCommentTime() {
        return CommentTime;
    }

    public void setCommentTime(Date commentTime) {
        CommentTime = commentTime;
    }

    public String getCommentReview() {
        return CommentReview;
    }

    public void setCommentReview(String commentReview) {
        CommentReview = commentReview;
    }

    public String getCommentC() {
        return commentC;
    }

    public void setCommentC(String commentC) {
        this.commentC = commentC == null ? null : commentC.trim();
    }
}