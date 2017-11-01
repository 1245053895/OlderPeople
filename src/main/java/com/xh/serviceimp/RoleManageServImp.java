package com.xh.serviceimp;

import com.xh.mapper.RoleMapper;
import com.xh.po.AdminRole;
import com.xh.po.Admingroup;
import com.xh.po.AdminRoleCustom;
import com.xh.po.Firstview;
import com.xh.service.RoleManageServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KAIRUN on 2017/10/30.
 */


@Component
public class RoleManageServImp implements RoleManageServ {
    @Autowired
    private RoleMapper roleMapper;

    public List<AdminRole> queryRoleAndAdmin() {
        List<AdminRole> adminRoles=roleMapper.queryRoleAndAdmin();
        return adminRoles;
    }

    public List<Admingroup> queryAllRole() {
        List<Admingroup> admingroups= roleMapper.queryAllRole();
        return admingroups;
    }

    public void deleteRoleById(int id) {
        roleMapper.deleteRoleById(id);
    }


    public List<Firstview> selectAllFirstview() {
        List<Firstview> firstviewList =roleMapper.selectAllFirstview();
        return firstviewList;
    }

    public void insertRloe(AdminRoleCustom adminRoleCustom) {
        roleMapper.insertRole(adminRoleCustom);
    }

    public Integer selectRloeIdByName(String admingroupname) {
        Integer rloe = roleMapper.selectRloeIdByName(admingroupname);
        return rloe;
    }

    public void insertRloeAndFirstView(AdminRoleCustom adminRoleCustom) {
        roleMapper.insertRloeAndFirstView(adminRoleCustom);
    }

}