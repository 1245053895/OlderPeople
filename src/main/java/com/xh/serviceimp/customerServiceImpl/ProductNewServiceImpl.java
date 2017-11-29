package com.xh.serviceimp.customerServiceImpl;

import com.xh.controller.page.Pagination;
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
    public Pagination selectPaginationByQuery(Integer pageNo) {
        TotalCreditsById totalCreditsById=new TotalCreditsById();
        totalCreditsById.setPageNo(Pagination.cpn(pageNo));
        totalCreditsById.setPageSize(8);
        StringBuilder params = new StringBuilder();


        Pagination pagination=new Pagination(totalCreditsById.getPageNo(),
                                              totalCreditsById.getPageSize(),
                                              productNewMapper.SelectNewCount(totalCreditsById) );
        pagination.setList(productNewMapper.SelectProductNew(totalCreditsById));
        String url="SelectNewProduct.action";
        pagination.pageView(url,params.toString());
        return pagination;
    }

    @Override
    public List<TotalCreditsById> SelectProductNew() {
        return null;
    }
}
