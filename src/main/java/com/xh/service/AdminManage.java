package com.xh.service;

import com.xh.po.Admin;
import com.xh.po.Admingroup;
import com.xh.po.vo.AdminVo;
import com.xh.po.vo.kindOfAdmin;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AdminManage {
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
    List<Admin> selectAdmin( );

    //修改一条数据  属性非空的不变
    void updateByPrimaryKeySelective(Admin record);

    List <AdminVo>  queryAdminAndGroup();
    List <kindOfAdmin> kindOfAdmin();

    //  通过管理员姓名和性别组合搜索（姓名模糊查询，性别选择男、女、空）
    List <AdminVo> selectByAdminNameAndSex(Admin record);

    //通过管理员的登录名称来进行模糊查询
    public List<Admin> mohuSelectByName(String name);

    //批量删除通过id列表
    public void deleteBatch(int[] postIds);

}
