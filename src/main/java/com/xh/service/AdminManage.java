package com.xh.service;

import com.xh.po.Admin;
import com.xh.po.vo.AdminVo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AdminManage {
    //删除数据通过id
    void deleteByPrimaryKey(Integer adminid);

    //增加一条数据  属性非空的不加
    void insertSelective(Admin record);

    //查询一条数据通过id
    Admin selectByPrimaryKey(Integer adminid);
    //查询全部
    List<Admin> selectAdmin( );

    //修改一条数据  属性非空的不变
    void updateByPrimaryKeySelective(Admin record);

    List <AdminVo>  queryAdminAndGroup();

}
