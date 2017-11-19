package com.xh.po.vo;

import com.xh.po.Product;
import com.xh.po.Producttype;

import java.util.List;

public class ProductTypeExtend extends Producttype{

    private List<Product> Product;

    public List<com.xh.po.Product> getProduct() {
        return Product;
    }

    public void setProduct(List<com.xh.po.Product> product) {
        Product = product;
    }
}
