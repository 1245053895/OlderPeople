package com.xh.serviceimp;

import com.xh.mapper.pojo.SystemSetingsMapper;
import com.xh.mapper.pojo.UserCsdMapper;
import com.xh.po.vo.SystemSitings;
import com.xh.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StystemServiceipml implements SystemService {
  @Autowired
 private UserCsdMapper userCsdMapper;

    public void insertSystem(SystemSitings systemSitings) {
        userCsdMapper.insertSystem(systemSitings);
    }

    @Override
    public List<SystemSitings> SelectSystemsQuerry() {
        List<SystemSitings> systemSitings=userCsdMapper.SelectSystemsQuerry();
        return  systemSitings;
    }
}
