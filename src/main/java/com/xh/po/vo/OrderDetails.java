package com.xh.po.vo;

import com.xh.po.*;

import java.util.Date;
import java.util.List;

public class OrderDetails {
    String username;
    int orderid;
    Double amountpay;
    int totalcredit;
    Date createtime;
    String products;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public Double getAmountpay() {
        return amountpay;
    }

    public void setAmountpay(Double amountpay) {
        this.amountpay = amountpay;
    }

    public int getTotalcredit() {
        return totalcredit;
    }

    public void setTotalcredit(int totalcredit) {
        this.totalcredit = totalcredit;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

/*Order order;
    String products;

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }*/


}
