package com.xh.service;


import com.xh.po.vo.AdminRole;
import com.xh.po.Admingroup;
import com.xh.po.vo.AdminRoleCustom;
import com.xh.po.Firstview;

import java.util.List;

/**
 * Created by KAIRUN on 2017/10/30.
 */

public interface RoleManageServ {
    public List<AdminRole> queryRoleAndAdmin();
    public List<Admingroup>queryAllRole();
    public  void deleteRoleById(int id);

    public List<Firstview> selectAllFirstview();

    public void insertRloe(AdminRoleCustom adminRoleCustom);

    public Integer selectRloeIdByName(String admingroupname);

    public void insertRloeAndFirstView(AdminRoleCustom adminRoleCustom);

    //输入管理员的名称来进行模糊查询
    public List<AdminRole> moHuSelectByAdminUser(String adminuser);
}
