package com.xh.mapper;
import com.xh.po.Admin;
import com.xh.po.AdminRole;
import com.xh.po.Admingroup;
import com.xh.po.Admingroupfirstview;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/10/30.
 */
@Component
public interface RoleMapper {
    /**
     * 查询每个用户对应的角色
     * @return
     */
    public List<AdminRole> queryRoleAndAdmin();

    /**
     * 查询所有管理员列表
     * @return
     */
    public List<Admin> selectAllAdmin();

    /**
     * 从某个位置查询一定数量管理员列表
     * @param start  从何处开始
     * @param count  总共查多少
     * @return
     */
    public List<Admin> selectAdmin(Integer start,Integer count);
    /**
     * 查询所有角色列表
     * @return
     */
    public List<Admingroup> selectAllAdmingroup();

    /**
     * 从某个位置查询一定数量角色列表
     * @param start
     * @param count
     * @return
     */
    public List<Admingroup> selectAdmingroup(Integer start,Integer count);

    /**
     * 添加角色及设置角色应有的权限
     * @param admingroup
     */
    public void insertRole(Admingroup admingroup, List<Admingroupfirstview> Admingroupfirstviews);

    /**
     * 通过id删除角色
     * @param id
     */
    public void deleteRoleById(Integer id);

    /**
     * 通过id批量删除
     * @param ids
     */
    public void deleteRolesByIds(Integer[] ids);

    /**
     *通过管理员id检查输入的密码,Admin为空则密码不正确
     * @return
     */
    public Admin  queryPasswordById(Integer id,String password);

    /**
     * 通过管理员id修改管理员密码(修改前先调用queryPasswordById 验证原密码是否正确)
     * @param id
     * @param newPassword
     */
    public void updataPasswordById(Integer id,String newPassword);


}
