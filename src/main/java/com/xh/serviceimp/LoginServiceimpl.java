package com.xh.serviceimp;



import com.xh.mapper.AdminMapper;
import com.xh.po.Admin;
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

}
