package com.xh.serviceimp.customerServiceImpl;


import com.xh.mapper.customerMapper.ProductTypeCustomerMapper;
import com.xh.po.Product;
import com.xh.po.Producttype;
import com.xh.po.vo.ProductTypeExtend;
import com.xh.service.customerService.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductTypeServiceimpl implements ProductTypeService {
   @Autowired
   private ProductTypeCustomerMapper productTypeCustomerMapper;
    //查询商品类型
    @Override
    public List<ProductTypeExtend> SelectProductType() {

        List<ProductTypeExtend> productTypeExtends=productTypeCustomerMapper.SelectProductType();
        return productTypeExtends;
    }

    //通过商品类型id查询商品
    @Override
    public List<Product> SelectProductByTypeId(Integer productid) {
       List<Product> products=productTypeCustomerMapper.SelectProductByTypeId(productid);
        return products;
    }

    @Override
    public List<Product> SelectProductByTypeIdLimit(Integer productid) {
       List<Product> products=productTypeCustomerMapper.SelectProductByTypeIdLimit(productid);
        return products;
    }

    @Override
    public List<ProductTypeExtend> SelectProductTpyeById(Integer productTypeId) {
        List<ProductTypeExtend> productTypeExtends=productTypeCustomerMapper.SelectProductTpyeById(productTypeId);
        return  productTypeExtends;
    }
}
