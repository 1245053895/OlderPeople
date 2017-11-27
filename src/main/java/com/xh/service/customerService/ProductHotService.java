package com.xh.service.customerService;

import com.xh.po.vo.TotalCreditsById;
import org.springframework.stereotype.Service;
import com.xh.controller.page.Pagination;

import java.util.List;

@Service
public interface ProductHotService {
    //分页对象
    public Pagination selectPaginationByQuery(Integer pageNo);
    //查询热销商品结果集
    public List<TotalCreditsById> SelectHotProduct(Integer pageNo);
}
