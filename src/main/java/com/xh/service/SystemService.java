package com.xh.service;

import com.xh.po.vo.SystemSitings;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SystemService {
    //插入
    public void insertSystem(SystemSitings systemSitings);
    //查询
    public List<SystemSitings> SelectSystemsQuerry();
}

