package com.xh.service;


import com.xh.po.AdminRole;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KAIRUN on 2017/10/30.
 */

public interface RoleManageServ {
    public List<AdminRole> queryRoleAndAdmin();
}
