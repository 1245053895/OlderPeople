package com.xh.serviceimp.customerServiceImpl;

import com.xh.mapper.customerMapper.ProductNewMapper;
import com.xh.po.vo.TotalCreditsById;
import com.xh.service.customerService.ProductNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductNewServiceImpl implements ProductNewService {
@Autowired
private ProductNewMapper productNewMapper;

    @Override
    public List<TotalCreditsById> SelectProductNew() {
        List<TotalCreditsById> totalCreditsById=productNewMapper.SelectProductNew();
        return  totalCreditsById;
    }
}
