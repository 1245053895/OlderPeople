package com.xh.service.customerService;

import com.xh.po.Product;
import com.xh.po.vo.ProductCustom;

import java.util.List;

public interface SearchService {
    public List<Product> queryProductAll();


    public List<ProductCustom> queryProductBySearch(List<String> words);

    public List<ProductCustom> queryProductByProductIds(int[] productId);

    public List<ProductCustom> queryProductByProductName(String productName);
}
