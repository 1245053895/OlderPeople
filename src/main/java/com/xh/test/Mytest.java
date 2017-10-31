package com.xh.test;

import com.xh.mapper.AdminMapper;
import com.xh.mapper.AdmingroupMapper;
import com.xh.po.Admin;
import com.xh.po.Admingroup;
import com.xh.po.vo.AdminVo;
import com.xh.serviceimpl.adminmanageimpl.AdminManageimpl;
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
//    @Qualifier("adminMapper")
    private AdminMapper adminMapper;
    @Autowired
    private AdminManageimpl adminManage;
    @Autowired
    private AdmingroupMapper admingroupMapper;


    @Test
    public void servise() {
        Admin user = new Admin();
       // user.setAdminid(7);
        user.setAdminname("chengsiding");
        user.setAdminpwd("6666666");
    //  adminManage.deleteByPrimaryKey(11);
       // adminManage.updateByPrimaryKeySelective(user);
     //   adminManage.insertSelective(user);
      System.out.println(adminManage.selectAdmin());


    }


    @Test
    public void mapper() {
      Admin user = new Admin();
      user.setAdminid(8);
      user.setAdminname("hehhehe");
      user.setAdminpwd("5555");

      //  Admin admin = adminMapper.selectByPrimaryKey(3);
      // List<Admin> adminList = adminMapper.selectAdmin();
      //adminMapper.deleteByPrimaryKey(8);
      //  adminMapper.updateByPrimaryKeySelective(user);

      //  adminMapper.insert(user);
      //  List<AdminVo> adminList = adminMapper.queryAdminAndGroup();
        List<Admingroup> admingroups  = admingroupMapper.selectKindOfAdmin();

        for (int i = 0; i < admingroups .size(); i++) {
            System.out.println(admingroups .get(i).getAdmingroupname());
         }

    }
}
