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
