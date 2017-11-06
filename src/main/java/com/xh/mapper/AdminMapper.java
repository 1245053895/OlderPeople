package com.xh.mapper;

import com.xh.po.Admin;
import com.xh.po.AdminExample;
import com.xh.po.Admingroup;
import com.xh.po.vo.AdminRole;
import com.xh.po.vo.AdminVo;
import org.springframework.stereotype.Component;

import java.util.List;

import com.xh.po.vo.AdminVo;
import com.xh.po.vo.kindOfAdmin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
@Component
public interface AdminMapper {
    //删除数据通过id
    void deleteByPrimaryKey(Integer adminid);
    //增加一条数据
    void insert(Admin record);

    //通过admingroupid查询出所有的admingroupname
    public List<Admingroup> selectAdminGroupName();
    //增加一条数据  属性非空的不加
    void insertSelective(Admin record);
    //查询一条数据通过id
    Admin selectByPrimaryKey(Integer adminid);
    //查询全部
    List <Admin> selectAdmin( );
    //修改一条数据  属性非空的不变
    void updateByPrimaryKeySelective(Admin record);
    //修改一条数据
    void updateByPrimaryKey(Admin record);
    //根据用户名查询密码
    public Admin selectUserByUsername(String username);

    //得到admin表的拓展（+admingroupname）
    List <AdminVo> queryAdminAndGroup();

    //得到 “管理员种类(数量)” 如 超级管理员(2)
    List <kindOfAdmin> kindOfAdmin();

    //  通过管理员姓名和性别组合搜索（姓名模糊查询，性别选择男、女、空）
    List <AdminVo> selectByAdminNameAndSex(Admin record);

    //通过管理员的登录名称来进行模糊查询
    public List<Admin> mohuSelectByName(String name);

    //批量删除通过id列表
    public void deleteBatch(int[] postIds);

    // 根据缓存的用户名在后台进行个人资料的显示
    public AdminRole selectMyselfInformation(Integer adminid);

    //<!--修改个人资料-->
    public void UpdateMyselfInformation(Admin admin);

//个人资料中根据管理员的id修改密码
    public void updatePasswordById(Admin admin);

}