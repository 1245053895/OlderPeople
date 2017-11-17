package com.xh.po.vo;

import com.xh.po.Order;
import com.xh.po.Product;
import com.xh.po.User;

import java.util.List;

public class OrderCustom extends Order{
    private int buyTime;

    private String username;

    private int shoppingcount;
    private double totalmoneycount;
    private Double payprice;

    private String gainname;
    private String gainmobile;
    private String gainaddress;
    private Integer gaincode;

    private int start;
    private int count;
    String conditions;

    List<ProductCustom> productCustoms;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<ProductCustom> getProductCustoms() {
        return productCustoms;
    }

    public void setProductCustoms(List<ProductCustom> productCustoms) {
        this.productCustoms = productCustoms;
    }

    public int getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(int buyTime) {
        this.buyTime = buyTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getShoppingcount() {
        return shoppingcount;
    }

    public void setShoppingcount(int shoppingcount) {
        this.shoppingcount = shoppingcount;
    }

    public double getTotalmoneycount() {
        return totalmoneycount;
    }

    public void setTotalmoneycount(double totalmoneycount) {
        this.totalmoneycount = totalmoneycount;
    }

    public Double getPayprice() {
        return payprice;
    }

    public void setPayprice(Double payprice) {
        this.payprice = payprice;
    }

    public String getGainname() {
        return gainname;
    }

    public void setGainname(String gainname) {
        this.gainname = gainname;
    }

    public String getGainmobile() {
        return gainmobile;
    }

    public void setGainmobile(String gainmobile) {
        this.gainmobile = gainmobile;
    }

    public String getGainaddress() {
        return gainaddress;
    }

    public void setGainaddress(String gainaddress) {
        this.gainaddress = gainaddress;
    }

    public Integer getGaincode() {
        return gaincode;
    }

    public void setGaincode(Integer gaincode) {
        this.gaincode = gaincode;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
}
