package com.xh.po.vo;

import com.xh.po.*;

import java.util.List;

public class OrderDetailCustom extends Order {
    int productid;
    String productdescribe;
    double productprice;
    String productname;
    String productpicture;
    String gainname;
    String gainaddress;
    int gaincode;
    String gainmobile;
    int shoppingcount;
    String orderproductA;
    int stock;

    public String getProductpicture() {
        return productpicture;
    }

    public void setProductpicture(String productpicture) {
        this.productpicture = productpicture;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductdescribe() {
        return productdescribe;
    }

    public void setProductdescribe(String productdescribe) {
        this.productdescribe = productdescribe;
    }

    public double getProductprice() {
        return productprice;
    }

    public void setProductprice(double productprice) {
        this.productprice = productprice;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getGainname() {
        return gainname;
    }

    public void setGainname(String gainname) {
        this.gainname = gainname;
    }

    public String getGainaddress() {
        return gainaddress;
    }

    public void setGainaddress(String gainaddress) {
        this.gainaddress = gainaddress;
    }

    public int getGaincode() {
        return gaincode;
    }

    public void setGaincode(int gaincode) {
        this.gaincode = gaincode;
    }

    public String getGainmobile() {
        return gainmobile;
    }

    public void setGainmobile(String gainmobile) {
        this.gainmobile = gainmobile;
    }

    public int getShoppingcount() {
        return shoppingcount;
    }

    public void setShoppingcount(int shoppingcount) {
        this.shoppingcount = shoppingcount;
    }

    public String getOrderproductA() {
        return orderproductA;
    }

    public void setOrderproductA(String orderproductA) {
        this.orderproductA = orderproductA;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
