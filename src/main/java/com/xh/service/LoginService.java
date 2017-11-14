package com.xh.service;

import com.xh.po.Admin;
import com.xh.po.vo.AdminFirstViewCustom;
import com.xh.po.vo.AdminRole;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoginService {
    public Admin selectUserByUsername(String username);

    // 根据缓存的用户名在后台进行个人资料的显示
    public AdminRole selectMyselfInformation(Integer adminid);

    //<!--修改个人资料-->
    public void UpdateMyselfInformation(Admin admin);


    //个人资料中根据管理员的id修改密码
    public void updatePasswordById(Admin admin);

    //根据Id修改管理员的头像
    public void updateAdminPic(Admin admin);

    /**
     * 通过用户id查询其所拥有的一级菜单
     * @param id
     */
    public List<AdminFirstViewCustom> selectFirstViewByUserId(int id);
}
