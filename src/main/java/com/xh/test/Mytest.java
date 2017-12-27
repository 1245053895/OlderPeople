package com.xh.test;

import com.xh.mapper.AdminMapper;
import com.xh.mapper.AdmingroupMapper;
import com.xh.po.Admin;
import com.xh.po.Admingroup;
import com.xh.po.vo.AdminVo;
import com.xh.po.vo.kindOfAdmin;
import com.xh.service.AdminManage;
import com.xh.serviceimp.AdminManageimpl;
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
    private AdminManage adminManage;
    @Autowired
    private AdmingroupMapper admingroupMapper;


    @Test
    public void servise() {
        Admin user = new Admin();
        //user.setAdminid(7);
        user.setAdmingroupid(2);
        user.setAdminname("chengsiding");
        user.setAdminpwd("77777");
       // adminManage.deleteByPrimaryKey(12);
      // adminManage.updateByPrimaryKeySelective(user);
      adminManage.insertSelective(user);
   //   System.out.println(adminManage.selectAdmin());


    }

    @Test
    public void ssservise() {
        System.out.println("dfsdf");
    }

    @Test
    public void mapper() {
//      Admin user = new Admin();
//      user.setAdminid(9);
//      user.setAdminname("hehhehe");
//      user.setAdminpwd("5555");

        List<kindOfAdmin> kindOfAdmins = adminMapper.kindOfAdmin();
        System.out.println(kindOfAdmins);
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
