package com.xh.serviceimp.customerServiceImpl;

import com.xh.mapper.customerMapper.ProductHotMapper;
import com.xh.po.vo.TotalCreditsById;
import com.xh.service.customerService.ProductHotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductHotServiceimpl implements ProductHotService {
    @Autowired
    private ProductHotMapper productHotMapper;
    @Override
    public List<TotalCreditsById> SelectHotProduct() {
        List<TotalCreditsById> totalCreditsById=productHotMapper.SelectHotProduct();
        return totalCreditsById;
    }
}
