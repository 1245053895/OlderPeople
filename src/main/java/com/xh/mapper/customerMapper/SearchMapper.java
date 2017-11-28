package com.xh.mapper.customerMapper;

import com.xh.po.Product;
import com.xh.po.vo.ProductCustom;
import org.apdplat.word.segmentation.Word;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SearchMapper {

    public List<Product> queryProductAll();

    public List<ProductCustom> queryProductBySearch(List<String> words);

    public List<ProductCustom> queryProductByProductIds(int[] productId);

    public List<ProductCustom> queryProductByProductName(String productName);
}
