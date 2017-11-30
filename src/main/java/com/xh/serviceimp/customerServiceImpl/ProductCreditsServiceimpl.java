package com.xh.serviceimp.customerServiceImpl;

import com.xh.controller.page.Pagination;
import com.xh.mapper.customerMapper.ProductCreditsMapper;
import com.xh.po.Product;
import com.xh.po.vo.ProductTypeExtend;
import com.xh.po.vo.TotalCreditsById;
import com.xh.service.customerService.ProductCreditsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ProductCreditsServiceimpl implements ProductCreditsService{
    @Autowired
    private ProductCreditsMapper productCreditsMapper;
    //分页对象
    public Pagination selectPaginationByQuery( Integer productTypeId,Integer pageNo){
       TotalCreditsById totalCreditsById=new TotalCreditsById();
       totalCreditsById.setPageNo(Pagination.cpn(pageNo));
       totalCreditsById.setPageSize(8);
       totalCreditsById.setProducttypeid(productTypeId);


       StringBuilder params = new StringBuilder();
        //条件
        if(null != productTypeId){
            totalCreditsById.setProducttypeid(productTypeId);
            params.append("productTypeId=").append(productTypeId);
        }
       Pagination pagination=new Pagination(totalCreditsById.getPageNo(),
                                            totalCreditsById.getPageSize(),
                                            productCreditsMapper.SelectCount(totalCreditsById));

       //设置结果集
        pagination.setList(productCreditsMapper.SelectCreditQuerry(totalCreditsById));
        //分页展示
        String url="/SelectCreditsProductQuerry.action";
        pagination.pageView(url,params.toString());
        return pagination;
    }
    @Override
    public List<ProductTypeExtend> SelectTravelProductType() {
        List<ProductTypeExtend> productTypeTraver=productCreditsMapper.SelectTravelProductType();
        return productTypeTraver;
    }

    @Override
    public List<ProductTypeExtend> SelectHealthProductType() {
        List<ProductTypeExtend> productTypeHealth=productCreditsMapper.SelectHealthProductType();
        return productTypeHealth;
    }

    @Override
    public List<ProductTypeExtend> SelectLifeProductType() {
        List<ProductTypeExtend> productTypeLife=productCreditsMapper.SelectLifeProductType();
        return productTypeLife;
    }

    @Override
    public List<Product> SelectCreditProductByTypeid(Integer productTypeId) {
        List<Product> products=productCreditsMapper.SelectCreditProductByTypeid(productTypeId);
        return products;
    }

    @Override
    public List<Product> SelectCrediDiscountQuerry() {
        List<Product> products=productCreditsMapper.SelectCrediDiscountQuerry();
        return  products;
    }

    @Override
    public List<TotalCreditsById> SelectHotCreditProduct() {
        List<TotalCreditsById> totalCreditsByIdList=productCreditsMapper.SelectHotCreditProduct();
        return totalCreditsByIdList;
    }


    @Override
    public List<TotalCreditsById> SelectCreditQuerry(TotalCreditsById totalCreditsById) {
        List<TotalCreditsById> allproductList=productCreditsMapper.SelectCreditQuerry(totalCreditsById);
        return allproductList;
    }
//爆款
    @Override
    public List<TotalCreditsById> SelectHotCreditProductByTypeId(Integer ProductTypeId) {
        List<TotalCreditsById> allHCproductList=productCreditsMapper.SelectHotCreditProductByTypeId(ProductTypeId);
        List<TotalCreditsById> randomHCproductList=new ArrayList<TotalCreditsById>();
        Random random=new Random();
        if(allHCproductList.size()>4){
        for (int i=0;i<4;i++){
        int ran=random.nextInt(allHCproductList.size());
        randomHCproductList.add(allHCproductList.get(ran));
        allHCproductList.remove(ran);
        }}else {
            return allHCproductList;
        }
        return randomHCproductList;
    }

    @Override
    public List<TotalCreditsById> SelectHealthProduct() {
        List<TotalCreditsById> allHproductList=productCreditsMapper.SelectHealthProduct();
        return allHproductList;
    }

    @Override
    public List<ProductTypeExtend> SelectProductType(Integer ProductTypeId) {
        List<ProductTypeExtend> productTypeExtends=productCreditsMapper.SelectProductType(ProductTypeId);
        return productTypeExtends;
    }


}
