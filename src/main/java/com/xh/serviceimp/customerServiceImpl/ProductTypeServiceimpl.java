package com.xh.serviceimp.customerServiceImpl;


import com.xh.controller.page.Pagination;
import com.xh.mapper.customerMapper.ProductTypeCustomerMapper;
import com.xh.po.Product;
import com.xh.po.Producttype;
import com.xh.po.vo.ProductTypeExtend;
import com.xh.po.vo.TotalCreditsById;
import com.xh.service.customerService.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductTypeServiceimpl implements ProductTypeService {
   @Autowired
   private ProductTypeCustomerMapper productTypeCustomerMapper;
   //分页对象
   public Pagination selectPaginationByQuery( Integer productTypeId,Integer pageNo){
       TotalCreditsById totalCreditsById=new TotalCreditsById();
       totalCreditsById.setPageNo(Pagination.cpn(pageNo));
       totalCreditsById.setPageSize(12);
       totalCreditsById.setProducttypeid(productTypeId);


       StringBuilder params = new StringBuilder();
       //条件
       if(null != productTypeId){
           totalCreditsById.setProducttypeid(productTypeId);
           params.append("productTypeId=").append(productTypeId);
       }
       Pagination pagination=new Pagination(totalCreditsById.getPageNo(),
                                            totalCreditsById.getPageSize(),
                                           productTypeCustomerMapper.SelectCount(totalCreditsById));

       //设置结果集
       pagination.setList(productTypeCustomerMapper.SelectProductByTypeIdPage(totalCreditsById));
       //分页展示
       String url="/SelectProductType.action";
       pagination.pageView(url,params.toString());
       return pagination;
   }



    //查询商品类型
    @Override
    public List<ProductTypeExtend> SelectProductType() {

        List<ProductTypeExtend> productTypeExtends=productTypeCustomerMapper.SelectProductType();
        return productTypeExtends;
    }

    //通过商品类型id查询商品
    @Override
    public List<TotalCreditsById> SelectProductByTypeIdPage(TotalCreditsById totalCreditsById) {
       List<TotalCreditsById> products=productTypeCustomerMapper.SelectProductByTypeIdPage(totalCreditsById);
        return products;
    }

    @Override
    public List<Product> SelectProductByTypeId(Integer productid) {
        List<Product> products=productTypeCustomerMapper.SelectProductByTypeId(productid);
        return  products;
    }

    //限制查六个
    @Override
    public List<Product> SelectProductByTypeIdLimitSix(Integer productid) {
        List<Product> products1=productTypeCustomerMapper.SelectProductByTypeIdLimitSix(productid);
        return products1;
    }
//限制查两个
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
