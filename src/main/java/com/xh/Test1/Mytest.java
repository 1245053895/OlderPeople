package com.xh.Test1;

import com.xh.mapper.customerMapper.CustomerInformationMapper;
import com.xh.mapper.customerMapper.ProductTypeCustomerMapper;
import com.xh.mapper.customerMapper.UserLoginMapper;
import com.xh.po.Gainaddres;
import com.xh.po.Product;
import com.xh.po.Producttype;
import com.xh.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@SuppressWarnings("SpellCheckingInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/config/spring/applicationContext-*.xml")

public class Mytest {
    @Autowired
   private CustomerInformationMapper customerInformationMapper;
    @Autowired
    private UserLoginMapper userLoginMapper;
    @Autowired
    private ProductTypeCustomerMapper productTypeCustomerMapper;

    @Test
   public void TestA(){

      /*  List<Gainaddres> gainaddres1 =userLoginMapper.SelectUserAddressByid(11);*/

       //customerInformationMapper.SelectUserAddressByid(11);
      /*  Gainaddres gainaddres=new Gainaddres();
        gainaddres.setGainid(22);
        customerInformationMapper.InsertGainAddress(gainaddres);*/
       /* Gainaddres gainaddres=new Gainaddres();
        gainaddres.setGainid(3);
        gainaddres.setGainaddress("hjnsdk11151561");
        customerInformationMapper.UpdateGainAdress(gainaddres);*/
     /*   User user=new User();
        user.setUserbirthday(new Date());
        user.setUsername("nihao");
        user.setUserid(13);*/
     /*  customerInformationMapper.UpdateUserByid(user);*/

     List<Product> products=productTypeCustomerMapper.SelectProductByTypeId(1);
     System.out.print(products);

   }
}

