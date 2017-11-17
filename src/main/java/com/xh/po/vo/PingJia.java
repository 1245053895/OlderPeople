package com.xh.po.vo;

import java.util.Date;

public class PingJia {

    private String username;
    private String ccomment;
    private String goodcomment;
    private String commentreview;
    private Date commenttime;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCcomment() {
        return ccomment;
    }

    public void setCcomment(String ccomment) {
        this.ccomment = ccomment;
    }

    public String getGoodcomment() {
        return goodcomment;
    }

    public void setGoodcomment(String goodcomment) {
        this.goodcomment = goodcomment;
    }

    public String getCommentreview() {
        return commentreview;
    }

    public void setCommentreview(String commentreview) {
        this.commentreview = commentreview;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }
}
