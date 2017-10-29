package com.xh.po;

import java.util.Date;

public class Productslog {
    private Integer productslogid;

    private Integer productid;

    private Integer userid;

    private Date startbrowsetime;

    private Date endbrowsetime;

    private Integer isshop;

    private String productslogA;

    private String productslogB;

    private String productslogC;

    public Integer getProductslogid() {
        return productslogid;
    }

    public void setProductslogid(Integer productslogid) {
        this.productslogid = productslogid;
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

    public Date getStartbrowsetime() {
        return startbrowsetime;
    }

    public void setStartbrowsetime(Date startbrowsetime) {
        this.startbrowsetime = startbrowsetime;
    }

    public Date getEndbrowsetime() {
        return endbrowsetime;
    }

    public void setEndbrowsetime(Date endbrowsetime) {
        this.endbrowsetime = endbrowsetime;
    }

    public Integer getIsshop() {
        return isshop;
    }

    public void setIsshop(Integer isshop) {
        this.isshop = isshop;
    }

    public String getProductslogA() {
        return productslogA;
    }

    public void setProductslogA(String productslogA) {
        this.productslogA = productslogA == null ? null : productslogA.trim();
    }

    public String getProductslogB() {
        return productslogB;
    }

    public void setProductslogB(String productslogB) {
        this.productslogB = productslogB == null ? null : productslogB.trim();
    }

    public String getProductslogC() {
        return productslogC;
    }

    public void setProductslogC(String productslogC) {
        this.productslogC = productslogC == null ? null : productslogC.trim();
    }
}