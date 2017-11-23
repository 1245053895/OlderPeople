package com.xh.po.vo;

import com.xh.po.Order;
import com.xh.po.Product;

public class FavoritesCustom extends Product {
    private Integer start;
    private Integer count;
    String conditions; //用于条件查询
    private Integer userid;
    private Double marketprice;

    private int isOnShopcar;

    private int[] countNumb;

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Double getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
    }

    public int getIsOnShopcar() {
        return isOnShopcar;
    }

    public void setIsOnShopcar(int isOnShopcar) {
        this.isOnShopcar = isOnShopcar;
    }

    public int[] getCountNumb() {
        return countNumb;
    }

    public void setCountNumb(int[] countNumb) {
        this.countNumb = countNumb;
    }
}
