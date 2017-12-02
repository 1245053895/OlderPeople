package com.xh.serviceimp.customerServiceImpl;

import com.xh.mapper.customerMapper.CNNMapper;
import com.xh.mapper.customerMapper.OrderListMapper;
import com.xh.po.vo.ProductCustom;
import com.xh.service.customerService.CNNService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CNNServiceImpl implements CNNService {
    @Autowired
    private CNNMapper cnnMapper;
    @Override
    public List<ProductCustom> queryAllProduct(int start,int count) {
        return cnnMapper.queryAllProduct(start,count);
    }
}
