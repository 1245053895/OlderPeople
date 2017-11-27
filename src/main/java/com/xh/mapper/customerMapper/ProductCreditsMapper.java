package com.xh.mapper.customerMapper;

import com.xh.po.Product;
import com.xh.po.vo.ProductTypeExtend;
import com.xh.po.vo.TotalCreditsById;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
@Component
public interface ProductCreditsMapper {
    //查询出行所有商品结果集
    public List<TotalCreditsById> SelectCreditQuerry(TotalCreditsById totalCreditsById);
    //统计商品数量
    public Integer SelectCount(TotalCreditsById totalCreditsById);
    //查询出行商品
    public List<ProductTypeExtend> SelectTravelProductType();
    //查询出行商品
    public List<ProductTypeExtend> SelectHealthProductType();
    //查询出行商品
    public List<ProductTypeExtend> SelectLifeProductType();
    //查询商品根据商品类型id
    public List<Product> SelectCreditProductByTypeid(Integer productTypeId);
    //查询积积分特惠
    public List<Product> SelectCrediDiscountQuerry();
    //查询爆款积分商品
    public  List<TotalCreditsById> SelectHotCreditProduct();

    //根据商品类型查询爆款商品
    public List<TotalCreditsById> SelectHotCreditProductByTypeId(Integer ProductTypeId);
    //查询健康类型商品
    public List<TotalCreditsById> SelectHealthProduct();
    //查询所有商品类型
    public  List<ProductTypeExtend> SelectProductType(Integer ProductTypeId);
}
