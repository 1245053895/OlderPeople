package com.xh.po.vo;

import java.util.List;

public class SearchResult {
    private List<SearchProduct> product_list;
    private SearchRectangle rectangle;
    private List<ProductCustom> productCustoms;
    private List<ProductCustom> productCNN;

    public List<SearchProduct> getProduct_list() {
        return product_list;
    }

    public void setProduct_list(List<SearchProduct> product_list) {
        this.product_list = product_list;
    }

    public SearchRectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(SearchRectangle rectangle) {
        this.rectangle = rectangle;
    }

    public List<ProductCustom> getProductCustoms() {
        return productCustoms;
    }

    public void setProductCustoms(List<ProductCustom> productCustoms) {
        this.productCustoms = productCustoms;
    }

    public List<ProductCustom> getProductCNN() {
        return productCNN;
    }

    public void setProductCNN(List<ProductCustom> productCNN) {
        this.productCNN = productCNN;
    }
}
