package com.xh.test;

import com.xh.mapper.AdminMapper;
import com.xh.mapper.AdmingroupMapper;
import com.xh.mapper.pojo.ProductAndTypeMapper;
import com.xh.po.Admin;
import com.xh.po.Admingroup;
import com.xh.po.Product;
import com.xh.po.vo.*;
import com.xh.service.AdminManage;
import com.xh.serviceimp.AdminManageimpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("SpellCheckingInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/config/spring/applicationContext-*.xml")
public class Mytest {

    @Autowired
//    @Qualifier("adminMapper")
    private ProductAndTypeMapper productAndTypeMapper;



    @Test
    public void mapper() {
        Product user = new Product();
        user.setProductid(7);
         user.setProductname("器555");
//        List<KindOfProduct> allproduct1= productAndTypeMapper.productKindOf();
//        List<KindOfProduct> allproduct2= productAndTypeMapper.productNull();
//        allproduct1.addAll(allproduct2);
//        System.out.println(allproduct2);
        List<Integer> idList = new ArrayList<Integer>();
        idList.add(7);
        idList.add(8);
        productAndTypeMapper.deleteBatch(idList);
        //user.setProductcreatetime(new Date());
       // productAndTypeMapper.insertSelective(user);
       // productAndTypeMapper.updateByPrimaryKeySelective(user);
         //user.setProductprice(100.00);
       // List<ProductAndTypeVo> productAndTypeVos= productAndTypeMapper.selectByProduct(user);

       // System.out.println(productAndTypeVos);
      //List<Admin> adminList = adminMapper.selectAdmin();
      //  System.out.println(adminMapper.selectByname("admin1"));
      //adminMapper.deleteByPrimaryKey(8);
     // adminMapper.updateByPrimaryKeySelective(user);

      //  adminMapper.insert(user);
      //  List<AdminVo> adminList = adminMapper.queryAdminAndGroup();
//        List<Admingroup> admingroups  = admingroupMapper.selectKindOfAdmin();
//
//        for (int i = 0; i < admingroups .size(); i++) {
//            System.out.println(admingroups .get(i).getAdmingroupname());
//         }

    }
}
