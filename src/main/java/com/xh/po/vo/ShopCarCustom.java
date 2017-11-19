package com.xh.po.vo;

import com.xh.po.Product;

public class ShopCarCustom extends Product {
    private Integer shopcarid;
    private Integer userid;
    private Integer orderamount;
    private Double price;

    private Double marketprice;
    private Integer stock;

    private Integer upperlimit;

    private Integer start;
    private Integer count;
    String conditions;//用于条件查询
    private int isOnFavorites;

    private int[] countNumb;

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

    public Double getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
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

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public int getIsOnFavorites() {
        return isOnFavorites;
    }

    public void setIsOnFavorites(int isOnFavorites) {
        this.isOnFavorites = isOnFavorites;
    }

    public int[] getCountNumb() {
        return countNumb;
    }

    public void setCountNumb(int[] countNumb) {
        this.countNumb = countNumb;
    }
}
