package com.xh.service;

import com.xh.po.vo.SystemSitings;
import org.springframework.stereotype.Service;

@Service
public interface SystemService {
    public void insertSystem(SystemSitings systemSitings);
}
