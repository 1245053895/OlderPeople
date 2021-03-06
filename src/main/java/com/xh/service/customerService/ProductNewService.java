package com.xh.service.customerService;

import com.xh.controller.page.Pagination;
import com.xh.po.vo.TotalCreditsById;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductNewService {
   //查询分页对象
    public Pagination selectPaginationByQuery(Integer pageNo);
    //查询新商品
    public List<TotalCreditsById> SelectProductNew();

}
