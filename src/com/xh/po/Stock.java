package com.xh.po;

import java.util.Date;

public class Stock {
    private Integer stockid;

    private Integer productid;

    private Integer colorid;

    private String sizes;

    private Double marketprice;

    private Double price;

    private Integer stock;

    private Integer upperlimit;

    private Date createtime;

    private String stockA;

    private String stockB;

    private String stockC;

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes == null ? null : sizes.trim();
    }

    public Double getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getUpperlimit() {
        return upperlimit;
    }

    public void setUpperlimit(Integer upperlimit) {
        this.upperlimit = upperlimit;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getStockA() {
        return stockA;
    }

    public void setStockA(String stockA) {
        this.stockA = stockA == null ? null : stockA.trim();
    }

    public String getStockB() {
        return stockB;
    }

    public void setStockB(String stockB) {
        this.stockB = stockB == null ? null : stockB.trim();
    }

    public String getStockC() {
        return stockC;
    }

    public void setStockC(String stockC) {
        this.stockC = stockC == null ? null : stockC.trim();
    }
}