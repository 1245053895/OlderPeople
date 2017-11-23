package com.xh.service.customerService;

import com.xh.po.vo.TotalCreditsById;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductHotService {
    //查询热销商品
    public List<TotalCreditsById> SelectHotProduct();
}
