package com.xh.Test1;

import com.xh.po.User;
import com.xh.service.UserMessageService;
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
    private UserMessageService userMessageService;
    @Test
    public void UseTest() {
        User user=userMessageService.selectByPrimaryKeyByname("3");
        System.out.print(user);
    }

}

