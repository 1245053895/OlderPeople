package com.xh.service.customerService;

import com.xh.controller.page.Pagination;
import com.xh.po.Product;
import com.xh.po.Producttype;
import com.xh.po.vo.ProductTypeExtend;
import com.xh.po.vo.TotalCreditsById;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductTypeService {

    //分页对象
    public Pagination selectPaginationByQuery( Integer productTypeId,Integer pageNo);
    //查询商品类型
    public List<ProductTypeExtend> SelectProductType();
    //通过商品类型id查询商品
    public List<TotalCreditsById> SelectProductByTypeIdPage(TotalCreditsById totalCreditsById);
    //首页的商品总数
    public  List<Product> SelectProductByTypeId(Integer productid);
    //限制查询六个
    public  List<Product> SelectProductByTypeIdLimitSix(Integer productid);
    //通过商品id限制查询两个
    public List<Product> SelectProductByTypeIdLimit(Integer productid);
    //查询商品类型Byid
    public List<ProductTypeExtend> SelectProductTpyeById(Integer productTypeId);
}
