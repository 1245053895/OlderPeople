package com.xh.po.vo;

public class Allproduct {
    //保存字段   共：6 件商品
    private String   productcount;


    @Override
    public String toString() {
        return "Allproduct{" +
                "productcount='" + productcount + '\'' +
                '}';
    }

    public String getProductcount() {
        return productcount;
    }

    public void setProductcount(String productcount) {
        this.productcount = productcount;
    }

}
