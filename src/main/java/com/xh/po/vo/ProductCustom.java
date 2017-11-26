package com.xh.po.vo;

import com.xh.po.Product;

import java.util.Date;

public class ProductCustom extends Product{
    private Integer shoppingcount;
    private Integer totalmoneycount;
    private Double payprice; //购买时价格

    private Integer commentid;
    private Integer productid;
    private Integer userid;
    private String comment;
    private Integer goodcomment;
    private Date commenttime;
    private String commentreview;
    private String commentC; //评论表里的订单id

    private Integer OrderId; //商品表里的订单id

    public Integer getShoppingcount() {
        return shoppingcount;
    }

    public void setShoppingcount(Integer shoppingcount) {
        this.shoppingcount = shoppingcount;
    }

    public Integer getTotalmoneycount() {
        return totalmoneycount;
    }

    public void setTotalmoneycount(Integer totalmoneycount) {
        this.totalmoneycount = totalmoneycount;
    }

    public Double getPayprice() {
        return payprice;
    }

    public void setPayprice(Double payprice) {
        this.payprice = payprice;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    @Override
    public Integer getProductid() {
        return productid;
    }

    @Override
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
        this.comment = comment;
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
        this.commentreview = commentreview;
    }

    public String getCommentC() {
        return commentC;
    }

    public void setCommentC(String commentC) {
        this.commentC = commentC;
    }

    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer orderId) {
        OrderId = orderId;
    }
}
