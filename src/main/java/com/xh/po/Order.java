package com.xh.po;

import java.util.Date;

public class Order {
    private Integer orderid;

    private Integer userid;

    private Double realpay;

    private Double amountpay;

    private Integer paytype;

    private Double postfee;

    private Integer status;

    private Integer paystatus;

    private Date createtime;

    private Date updatetime;

    private Date paymenttime;

    private Date sendtime;

    private Date endtime;

    private Date closetime;

    private String shippingname;

    private String shippingcode;

    private String buyerrequest;

    private Integer totalcredit;

    private String orderA;

    private String orderB;

    private String orderC;

    private Integer gainid;

    private Integer gainmethod;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Double getRealpay() {
        return realpay;
    }

    public void setRealpay(Double realpay) {
        this.realpay = realpay;
    }

    public Double getAmountpay() {
        return amountpay;
    }

    public void setAmountpay(Double amountpay) {
        this.amountpay = amountpay;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Double getPostfee() {
        return postfee;
    }

    public void setPostfee(Double postfee) {
        this.postfee = postfee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(Date paymenttime) {
        this.paymenttime = paymenttime;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
    }

    public String getShippingname() {
        return shippingname;
    }

    public void setShippingname(String shippingname) {
        this.shippingname = shippingname == null ? null : shippingname.trim();
    }

    public String getShippingcode() {
        return shippingcode;
    }

    public void setShippingcode(String shippingcode) {
        this.shippingcode = shippingcode == null ? null : shippingcode.trim();
    }

    public String getBuyerrequest() {
        return buyerrequest;
    }

    public void setBuyerrequest(String buyerrequest) {
        this.buyerrequest = buyerrequest == null ? null : buyerrequest.trim();
    }

    public Integer getTotalcredit() {
        return totalcredit;
    }

    public void setTotalcredit(Integer totalcredit) {
        this.totalcredit = totalcredit;
    }

    public String getOrderA() {
        return orderA;
    }

    public void setOrderA(String orderA) {
        this.orderA = orderA == null ? null : orderA.trim();
    }

    public String getOrderB() {
        return orderB;
    }

    public void setOrderB(String orderB) {
        this.orderB = orderB == null ? null : orderB.trim();
    }

    public String getOrderC() {
        return orderC;
    }

    public void setOrderC(String orderC) {
        this.orderC = orderC == null ? null : orderC.trim();
    }

    public Integer getGainid() {
        return gainid;
    }

    public void setGainid(Integer gainid) {
        this.gainid = gainid;
    }

    public Integer getGainmethod() {
        return gainmethod;
    }

    public void setGainmethod(Integer gainmethod) {
        this.gainmethod = gainmethod;
    }
}