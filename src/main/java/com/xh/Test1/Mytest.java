package com.xh.Test1;

import com.xh.mapper.customerMapper.CustomerInformationMapper;
import com.xh.mapper.customerMapper.UserLoginMapper;
import com.xh.po.Gainaddres;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SuppressWarnings("SpellCheckingInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/config/spring/applicationContext-*.xml")

public class Mytest {
    @Autowired
   private CustomerInformationMapper customerInformationMapper;
    @Autowired
    private UserLoginMapper userLoginMapper;

    @Test
   public void TestA(){
Gainaddres gainaddres=new Gainaddres();
        List<Gainaddres> gainaddres1 =userLoginMapper.SelectUserAddressByid(11);

       //customerInformationMapper.SelectUserAddressByid(11);
   }
}

