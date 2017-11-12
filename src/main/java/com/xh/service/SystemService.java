package com.xh.service;

import com.xh.po.Systemset;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SystemService {
    //插入
  /*  public void insertSystem(SystemSitings systemSitings);*/
    //系统设置的查询
    public Systemset SelectSystemsQuerry();

    //更新系统设置
    public void updateSystemset(Systemset systemset);
}

