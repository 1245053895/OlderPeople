package com.xh.serviceimp;

import com.xh.mapper.pojo.ProductAndTypeMapper;
import com.xh.mapper.pojo.ProducTypeMapper;
import com.xh.po.Product;
import com.xh.po.Producttype;
import com.xh.po.vo.Allproduct;
import com.xh.po.vo.KindOfProduct;
import com.xh.po.vo.ProductAndTypeVo;
import com.xh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class ProductServiceimpl implements ProductService {

    @Autowired
    private ProductAndTypeMapper productAndTypeMapper;
    @Autowired
    private ProducTypeMapper producTypeMapper;

    public void deleteByPrimaryKey(Integer productid) {
        productAndTypeMapper.deleteByPrimaryKey(productid);
    }

    public void insertSelective(Product record) {
        productAndTypeMapper.insertSelective(record);
    }

    public List<ProductAndTypeVo> selectByProduct(Product record) {
        List<ProductAndTypeVo> productAndTypeVos= productAndTypeMapper.selectByProduct(record);
        return productAndTypeVos;
    }

    public void updateByPrimaryKeySelective(Product record) {
        productAndTypeMapper.updateByPrimaryKeySelective(record);
    }

    public Allproduct productCount() {
        Allproduct allproduct =  productAndTypeMapper.productCount();
        return allproduct;
    }

    public List<KindOfProduct> KindOfProduct() {
        List<KindOfProduct> kindOfProduct1 = productAndTypeMapper.productNull();
        List<KindOfProduct> kindOfProduct2 = productAndTypeMapper.productKindOf();
        kindOfProduct1.addAll(kindOfProduct2);
        return kindOfProduct1;
    }

    public void deleteBatch(String[] ids) {
        List<Integer> idList = new ArrayList<Integer>();
        for(String id : ids) {
            idList.add(Integer.valueOf(id));
        }
        productAndTypeMapper.deleteBatch(idList);


    }

    @Override
    public void TypeinsertSelective(Producttype record) {
        producTypeMapper.TypeinsertSelective(record);
    }
    @Override
    public void TypedeleteByName(String producttypename) {
        producTypeMapper.TypedeleteByName(producttypename);
    }

    @Override
    public List<Producttype> selectByNothing() {
        return  producTypeMapper.selectByNothing();
    }


    @Override
    public List<ProductAndTypeVo> moHuselectByTime(Date productstoretime) {
        List<ProductAndTypeVo> productAndTypeVos= productAndTypeMapper.moHuselectByTime(productstoretime);
        return productAndTypeVos;
    }

    @Override
    public List<ProductAndTypeVo> typeProductType(String producttypeid) {
        List<ProductAndTypeVo> productAndTypeVos=producTypeMapper.typeProductType(producttypeid);
        return productAndTypeVos;
    }

    @Override
    public void updateProductState(Product product) {
        productAndTypeMapper.updateProductState(product);
    }

    @Override
    public void updateProductById(Product product) {
        productAndTypeMapper.updateProductById(product);
    }

    @Override
    public void updateById(ProductAndTypeVo productAndTypeVo) {
        productAndTypeMapper.updateById(productAndTypeVo);
    }
}
