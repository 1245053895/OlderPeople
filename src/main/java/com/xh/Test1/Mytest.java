package com.xh.Test1;

import com.xh.po.Admin;
import com.xh.po.User;
import com.xh.service.LoginService;
import com.xh.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SuppressWarnings("SpellCheckingInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/config/spring/applicationContext-*.xml")
public class Mytest {

@Autowired
private UserService userService;
    @Test
    public void UseTest() {
         User user=userService.selectByPrimaryKeyByname("3");
        System.out.print(user);
    }

}

