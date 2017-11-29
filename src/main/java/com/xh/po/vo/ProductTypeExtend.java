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


    //附加字段
    private Integer pageNo = 1;
    private Integer pageSize = 10;
    //开始行
    private Integer startRow;

    public Integer getPageNo() {
        return pageNo;
    }
    public void setPageNo(Integer pageNo) {
        //计算开始行
        this.startRow = (pageNo-1)*pageSize;
        this.pageNo = pageNo;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        //计算开始行
        this.startRow = (pageNo-1)*pageSize;
        this.pageSize = pageSize;
    }
    public Integer getStartRow() {
        return startRow;
    }
    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }
}
