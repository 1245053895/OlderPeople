package com.xh.serviceimp;



import com.xh.mapper.AdminMapper;
import com.xh.po.Admin;
import com.xh.po.vo.AdminRole;
import com.xh.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LoginServiceimpl implements LoginService {


    @Autowired
    private AdminMapper adminMapper;

    //通过用户名查询对象
    public Admin selectUserByUsername(String username) {
        Admin admin=adminMapper.selectUserByUsername(username);
            return admin;
    }

    @Override
    public AdminRole selectMyselfInformation(Integer adminid) {
        AdminRole adminRole=adminMapper.selectMyselfInformation(adminid);
        return adminRole;
    }

    @Override
    public void UpdateMyselfInformation(Admin admin) {
        adminMapper.UpdateMyselfInformation(admin);
    }

    @Override
    public void updatePasswordById(Admin admin) {
        adminMapper.updatePasswordById(admin);
    }

    @Override
    public void updateAdminPic(Admin admin) {
        adminMapper.updateAdminPic(admin);
    }


}
