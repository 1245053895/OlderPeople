package com.xh.serviceimp;
import com.xh.mapper.pojo.UserCsdMapper;
import com.xh.po.Systemset;
import com.xh.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StystemServiceipml implements SystemService {
  @Autowired
 private UserCsdMapper userCsdMapper;

    @Override
    public Systemset SelectSystemsQuerry() {
     Systemset systemset= userCsdMapper.SelectSystemsQuerry();
        return systemset;
    }

    @Override
    public void updateSystemset(Systemset systemset) {
        userCsdMapper.updateSystemset(systemset);

    }



}
