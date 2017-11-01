package com.xh.service;


import com.xh.po.AdminRole;
import com.xh.po.Admingroup;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KAIRUN on 2017/10/30.
 */
public interface RoleManageServ {
    public List<AdminRole> queryRoleAndAdmin();
    public List<Admingroup>queryAllRole();
    public  void deleteRoleById(int id);
}
