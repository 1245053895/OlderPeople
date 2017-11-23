package com.xh.serviceimp.customerServiceImpl;

import com.xh.mapper.customerMapper.ProductTypeCustomerMapper;
import com.xh.mapper.customerMapper.SearchMapper;
import com.xh.po.Product;
import com.xh.po.vo.ProductCustom;
import com.xh.service.customerService.SearchService;
import org.apdplat.word.segmentation.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    private SearchMapper searchMapper;

    @Override
    public List<Product> queryProductAll() {
        return searchMapper.queryProductAll();
    }

    @Override
    public List<ProductCustom> queryProductBySearch(List<String> words) {
        return searchMapper.queryProductBySearch(words);
    }
}
