package com.xh.mapper;
import com.xh.po.AdminRole;
import com.xh.po.Admingroup;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/10/30.
 */
@Component
public interface RoleMapper {
    /**
     *  查询出每个后台用户对应的角色名称和角色描述
     */
    public List<AdminRole> queryRoleAndAdmin();

    /**
     *  查询出所有角色的角色名称和角色描述
     */
    public List<Admingroup>queryAllRole();

    /**
     * 实现对角色修改页面根据角色的id删除角色
     * @param id
     */
    public  void deleteRoleById(int id);
}
