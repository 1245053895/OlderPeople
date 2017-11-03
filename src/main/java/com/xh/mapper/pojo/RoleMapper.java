package com.xh.mapper.pojo;
import com.xh.po.*;
import com.xh.po.vo.AdminRole;
import com.xh.po.vo.AdminRoleCustom;
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
    /**
     * 查询每个用户对应的角色
     * @return
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

    /**
     * 查询所有一级菜单
     * @return
     */
    public List<Firstview> selectAllFirstview();

    /**
     * 插入新角色
     * @param adminRoleCustom
     */
    public void insertRole(AdminRoleCustom adminRoleCustom);

    /**
     * 通过角色名查找角色id
     * @param admingroupname
     * @return
     */
    public Integer selectRloeIdByName(String admingroupname);

    /**
     * 将角色对应的一个权限写入数据库
     * @param adminRoleCustom
     */
    public void insertRloeAndFirstView(AdminRoleCustom adminRoleCustom);

    //输入管理员的名称来进行模糊查询
    public List<AdminRole> moHuSelectByAdminUser(String uadminuser);
}
