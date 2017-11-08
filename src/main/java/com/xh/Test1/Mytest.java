package com.xh.Test1;

import com.xh.po.User;
import com.xh.po.vo.OrderCustom;
import com.xh.service.OrderService;
import com.xh.service.UserMessageService;
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
    private UserMessageService userMessageService;
    @Autowired
    private OrderService orderService;

    @Test
    public void UseTest() {
        /*OrderCustom orderCustom=new OrderCustom();
        orderCustom.setConditions("1");
        List<OrderCustom> orderCustoms=orderService.queryByAny(orderCustom);*/

    }

}

