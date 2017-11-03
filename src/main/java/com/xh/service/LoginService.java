package com.xh.service;

import com.xh.po.Admin;
import org.springframework.stereotype.Service;

public interface LoginService {
    public Admin selectUserByUsername(String username);
}
