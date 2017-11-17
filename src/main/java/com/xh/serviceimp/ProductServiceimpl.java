package com.xh.serviceimp;

import com.xh.mapper.pojo.MyProductMapper;
import com.xh.mapper.pojo.ProductAndTypeMapper;
import com.xh.mapper.pojo.ProducTypeMapper;
import com.xh.po.Product;
import com.xh.po.Producttype;
import com.xh.po.vo.*;
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
    @Autowired
    private MyProductMapper myProductMapper;

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
    public List<PingJiaShu> pingJiaShu(Integer productid) {
        List<PingJiaShu> pingJiaShuList = myProductMapper.pingJiaShu(productid);
        return pingJiaShuList;
    }

    @Override
    public List<PingJia> pingJia(Integer productid) {
        List<PingJia> pingJiaList = myProductMapper.pingJia(productid);
        return pingJiaList;
    }

    @Override
    public MyProduct selectByPrimaryKey(Integer productid) {
        MyProduct myProduct = myProductMapper.selectByPrimaryKey(productid);
        return myProduct;
    }

    @Override
    public PingJiaShu pingJiaShu1(Integer productid) {
        PingJiaShu pingJiaShu=myProductMapper.pingJiaShu1(productid);
        return pingJiaShu;
    }

    @Override
    public PingJiaShu pingJia001(Integer productid) {
        return myProductMapper.pingJia001(productid) ;
    }

    @Override
    public PingJiaShu pingJia002(Integer productid) {
        return myProductMapper.pingJia002(productid) ;
    }

    @Override
    public PingJiaShu pingJia003(Integer productid) {
        return myProductMapper.pingJia003(productid) ;
    }

    @Override
    public List<TuiJian> tuiJian01() {
        List<TuiJian> tuiJianList01=myProductMapper.tuiJian01();
        return tuiJianList01;
    }

    @Override
    public List<TuiJian> tuiJian02() {
        List<TuiJian> tuiJianList02=myProductMapper.tuiJian02();
        return tuiJianList02;
    }

    @Override
    public List<TuiJian> tuiJian03() {
        List<TuiJian> tuiJianList03=myProductMapper.tuiJian03();
        return tuiJianList03;
    }

    @Override
    public List<TuiJian> tuiJian04() {
        List<TuiJian> tuiJianList04=myProductMapper.tuiJian04();
        return tuiJianList04;
    }

    @Override
    public List<TuiJian> tuiJian05() {
        List<TuiJian> tuiJianList05=myProductMapper.tuiJian05();
        return tuiJianList05;
    }

    @Override
    public void updateById(ProductAndTypeVo productAndTypeVo) {
        productAndTypeMapper.updateById(productAndTypeVo);
    }
}
