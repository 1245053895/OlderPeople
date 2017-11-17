package com.xh.po.vo;

import com.xh.po.Product;

public class ProductCustom extends Product{
    private int shoppingcount;
    private int totalmoneycount;
    private int payprice; //购买时价格

    public int getShoppingcount() {
        return shoppingcount;
    }

    public void setShoppingcount(int shoppingcount) {
        this.shoppingcount = shoppingcount;
    }

    public int getTotalmoneycount() {
        return totalmoneycount;
    }

    public void setTotalmoneycount(int totalmoneycount) {
        this.totalmoneycount = totalmoneycount;
    }

    public int getPayprice() {
        return payprice;
    }

    public void setPayprice(int payprice) {
        this.payprice = payprice;
    }
}
