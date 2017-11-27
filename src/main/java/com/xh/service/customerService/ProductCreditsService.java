package com.xh.service.customerService;

import com.xh.controller.page.Pagination;
import com.xh.po.Product;
import com.xh.po.vo.ProductTypeExtend;
import com.xh.po.vo.TotalCreditsById;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductCreditsService {
    //分页对象
    public Pagination selectPaginationByQuery( Integer productTypeId,Integer pageNo);
    //查询出行商品
    public List<ProductTypeExtend> SelectTravelProductType();
    //查询出行商品
    public List<ProductTypeExtend> SelectHealthProductType();
    //查询出行商品
    public List<ProductTypeExtend> SelectLifeProductType();
    //查询商品根据商品类型id
    public List<Product> SelectCreditProductByTypeid(Integer productTypeId);
    //查询所有特惠积分商品
    public List<Product> SelectCrediDiscountQuerry();
    //查询爆款积分商品
    public  List<TotalCreditsById> SelectHotCreditProduct();
    //查询所有商品
    public List<TotalCreditsById> SelectCreditQuerry(TotalCreditsById totalCreditsById);
    //根据商品类型查询爆款商品
    public List<TotalCreditsById> SelectHotCreditProductByTypeId(Integer ProductTypeId);
    //查询健康类型商品
    public List<TotalCreditsById> SelectHealthProduct();
    //查询所有商品类型
    public  List<ProductTypeExtend> SelectProductType(Integer ProductTypeId);
}
