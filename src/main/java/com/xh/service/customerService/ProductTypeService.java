package com.xh.service.customerService;

import com.xh.po.Product;
import com.xh.po.Producttype;
import com.xh.po.vo.ProductTypeExtend;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductTypeService {
    //查询商品类型
    public List<ProductTypeExtend> SelectProductType();
    //通过商品类型id查询商品
    public List<Product> SelectProductByTypeId(Integer productid);
    //通过商品id限制查询
    public List<Product> SelectProductByTypeIdLimit(Integer productid);
    //查询商品类型Byid
    public List<ProductTypeExtend> SelectProductTpyeById(Integer productTypeId);
}
