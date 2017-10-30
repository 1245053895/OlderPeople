package com.xh.mapper;
import com.xh.po.AdminRole;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/10/30.
 */
@Component
public interface RoleMapper {
    public List<AdminRole> queryRoleAndAdmin();
}
