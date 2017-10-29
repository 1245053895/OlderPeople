package com.xh.po;

public class Comment {
    private Integer commentid;

    private Integer productid;

    private Integer userid;

    private String comment;

    private Integer goodcomment;

    private String commentA;

    private String commentB;

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

    public String getCommentA() {
        return commentA;
    }

    public void setCommentA(String commentA) {
        this.commentA = commentA == null ? null : commentA.trim();
    }

    public String getCommentB() {
        return commentB;
    }

    public void setCommentB(String commentB) {
        this.commentB = commentB == null ? null : commentB.trim();
    }

    public String getCommentC() {
        return commentC;
    }

    public void setCommentC(String commentC) {
        this.commentC = commentC == null ? null : commentC.trim();
    }
}