package com.xh.mapper;

import com.xh.po.Admin;
import com.xh.po.AdminExample;
import java.util.List;

import com.xh.po.vo.AdminVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
@Component
public interface AdminMapper {
    //删除数据通过id
    void deleteByPrimaryKey(Integer adminid);
    //增加一条数据
    void insert(Admin record);
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

    List <AdminVo> queryAdminAndGroup();
}