package com.xh.serviceimpl.adminmanageimpl;

//import com.xh.po.Admin;
import com.xh.mapper.AdminMapper;
import com.xh.po.Admin;
import com.xh.po.vo.AdminVo;
import com.xh.service.adminmanage.AdminManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class AdminManageimpl implements AdminManage {
    @Autowired
    @Qualifier("adminMapper")
    private AdminMapper adminMapper;

    public void deleteByPrimaryKey(Integer adminid) {
        adminMapper.deleteByPrimaryKey(adminid);
    }

    public void insertSelective(Admin record) {
        adminMapper.insertSelective(record);

    }

    public Admin selectByPrimaryKey(Integer adminid) {
        return adminMapper.selectByPrimaryKey(adminid);

    }

    public List<Admin> selectAdmin() {
        List<Admin> adminList =  adminMapper.selectAdmin();
        return adminList;
    }

    public void updateByPrimaryKeySelective(Admin record) {
        adminMapper.updateByPrimaryKeySelective(record);

    }

    public List<AdminVo> queryAdminAndGroup() {
        List<AdminVo> adminList =  adminMapper.queryAdminAndGroup();
        return adminList;
    }
}
