package com.xh.po.vo;

import com.xh.po.Product;

import java.util.Date;

/**
 * Created by KAIRUN on 2017/11/16.
 */
public class TotalCreditsById extends Product{
    private Date endtime;
    private Integer userid;
    private Integer totalCredits;
    private Integer totalcomment;
    private String comment;
    private String username;
    private Integer totalhotsale;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }



    public Integer getTotalhotsale() {
        return totalhotsale;
    }

    public void setTotalhotsale(Integer totalhotsale) {
        this.totalhotsale = totalhotsale;
    }

    public Integer getTotalcomment() {
        return totalcomment;
    }

    public void setTotalcomment(Integer totalcomment) {
        this.totalcomment = totalcomment;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(Integer totalCredits) {
        this.totalCredits = totalCredits;
    }
}
