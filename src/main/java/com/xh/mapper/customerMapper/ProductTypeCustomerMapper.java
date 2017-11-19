package com.xh.mapper.customerMapper;

import com.xh.po.Product;
import com.xh.po.Producttype;
import com.xh.po.User;
import com.xh.po.Userlog;
import com.xh.po.vo.ProductTypeExtend;
import com.xh.po.vo.TotalCreditsById;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
@Component
public interface ProductTypeCustomerMapper {

    //查询商品类型
    public List<ProductTypeExtend> SelectProductType();
    //通过商品类型id查询商品
    public List<Product> SelectProductByTypeId(Integer productid);
    //通过商品id限制查询
    public List<Product> SelectProductByTypeIdLimit(Integer productid);
    //查询商品类型Byid
    public List<ProductTypeExtend> SelectProductTpyeById(Integer productTypeId);

}
