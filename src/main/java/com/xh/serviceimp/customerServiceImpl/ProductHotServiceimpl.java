package com.xh.serviceimp.customerServiceImpl;

import com.xh.controller.page.Pagination;
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
    public Pagination selectPaginationByQuery(Integer pageNo){
        TotalCreditsById totalCreditsById=new TotalCreditsById();
        totalCreditsById.setPageNo(Pagination.cpn(pageNo));
        totalCreditsById.setPageSize(11);

        StringBuilder params = new StringBuilder();
        Pagination pagination=new Pagination(totalCreditsById.getPageNo(),
                totalCreditsById.getPageSize(),
                productHotMapper.SelectCount(totalCreditsById)
        );
        //设置结果集
        pagination.setList(productHotMapper.SelectHotProduct(totalCreditsById));
        //分页展示
        String url="/ProductHot.action";
        pagination.pageView(url,params.toString());
        return pagination;
    }
    @Override
    public List<TotalCreditsById> SelectHotProduct(Integer pageNo) {
        return null;
    }

}
