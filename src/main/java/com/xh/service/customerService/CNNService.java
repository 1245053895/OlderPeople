package com.xh.service.customerService;

import com.xh.po.vo.ProductCustom;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CNNService {

    public List<ProductCustom> queryAllProduct(int start,int count);
}
