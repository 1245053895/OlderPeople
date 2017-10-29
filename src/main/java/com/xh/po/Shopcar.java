package com.xh.po;

public class Shopcar {
    private Integer shopcarid;

    private Integer userid;

    private Integer productid;

    private Integer orderamount;

    private Double price;

    private String shopcarA;

    private String shopcarB;

    private String shopcarC;

    public Integer getShopcarid() {
        return shopcarid;
    }

    public void setShopcarid(Integer shopcarid) {
        this.shopcarid = shopcarid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getOrderamount() {
        return orderamount;
    }

    public void setOrderamount(Integer orderamount) {
        this.orderamount = orderamount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getShopcarA() {
        return shopcarA;
    }

    public void setShopcarA(String shopcarA) {
        this.shopcarA = shopcarA == null ? null : shopcarA.trim();
    }

    public String getShopcarB() {
        return shopcarB;
    }

    public void setShopcarB(String shopcarB) {
        this.shopcarB = shopcarB == null ? null : shopcarB.trim();
    }

    public String getShopcarC() {
        return shopcarC;
    }

    public void setShopcarC(String shopcarC) {
        this.shopcarC = shopcarC == null ? null : shopcarC.trim();
    }
}