package com.xh.service;


import com.xh.po.AdminRole;
import com.xh.po.AdminRoleCustom;
import com.xh.po.Firstview;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KAIRUN on 2017/10/30.
 */

public interface RoleManageServ {
    public List<AdminRole> queryRoleAndAdmin();

    public List<Firstview> selectAllFirstview();

    public void insertRloe(AdminRoleCustom adminRoleCustom);

    public Integer selectRloeIdByName(String admingroupname);

    public void insertRloeAndFirstView(AdminRoleCustom adminRoleCustom);
}
