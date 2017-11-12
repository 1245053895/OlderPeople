package com.xh.po.vo;

/**
 * Created by KAIRUN on 2017/11/9.
 */
public class TotalMessage {
    //实现对所有已评论商品的统计
    private Integer total;

    //实现对某一商品的所有用户的评论数统计
    private  Integer totaluser;

    // 实现对所有用户信息的条数统计
    private Integer totaluserinfor;

    //实现对所有用户记录的条数统计
    private Integer totaluserrecord;

    //统计出所有的物流条数
    private Integer totaltransport;

    //统计出所有的支付种类
    private Integer totalpay;

    public Integer getTotalpay() {
        return totalpay;
    }

    public void setTotalpay(Integer totalpay) {
        this.totalpay = totalpay;
    }

    public Integer getTotaltransport() {
        return totaltransport;
    }

    public void setTotaltransport(Integer totaltransport) {
        this.totaltransport = totaltransport;
    }

    public Integer getTotaluserrecord() {
        return totaluserrecord;
    }

    public void setTotaluserrecord(Integer totaluserrecord) {
        this.totaluserrecord = totaluserrecord;
    }

    public Integer getTotaluserinfor() {
        return totaluserinfor;
    }

    public void setTotaluserinfor(Integer totaluserinfor) {
        this.totaluserinfor = totaluserinfor;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotaluser() {
        return totaluser;
    }

    public void setTotaluser(Integer totaluser) {
        this.totaluser = totaluser;
    }
}
