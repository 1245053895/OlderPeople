package com.xh.po;

public class Orderproduct {
    private Integer orderproductid;

    private Integer productid;

    private Integer orderid;

    private Integer shoppingcount;

    private Double totalmoneycount;

    private String orderproductA;

    private String orderproductB;

    private String orderproductC;

    public Integer getOrderproductid() {
        return orderproductid;
    }

    public void setOrderproductid(Integer orderproductid) {
        this.orderproductid = orderproductid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getShoppingcount() {
        return shoppingcount;
    }

    public void setShoppingcount(Integer shoppingcount) {
        this.shoppingcount = shoppingcount;
    }

    public Double getTotalmoneycount() {
        return totalmoneycount;
    }

    public void setTotalmoneycount(Double totalmoneycount) {
        this.totalmoneycount = totalmoneycount;
    }

    public String getOrderproductA() {
        return orderproductA;
    }

    public void setOrderproductA(String orderproductA) {
        this.orderproductA = orderproductA == null ? null : orderproductA.trim();
    }

    public String getOrderproductB() {
        return orderproductB;
    }

    public void setOrderproductB(String orderproductB) {
        this.orderproductB = orderproductB == null ? null : orderproductB.trim();
    }

    public String getOrderproductC() {
        return orderproductC;
    }

    public void setOrderproductC(String orderproductC) {
        this.orderproductC = orderproductC == null ? null : orderproductC.trim();
    }
}