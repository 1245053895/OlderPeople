package com.xh.serviceimp.customerServiceImpl;

import com.xh.mapper.customerMapper.CustomerInformationMapper;
import com.xh.po.Gainaddres;
import com.xh.service.customerService.CustomerInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerInformationServiceimpl implements CustomerInformationService {
    @Autowired
    private CustomerInformationMapper customerInformationMapper;

    @Override
    public List<Gainaddres> SelectUserAddressByid(Integer userid) {
        List<Gainaddres> gainaddres=customerInformationMapper.SelectUserAddressByid(userid);
        return gainaddres;
    }

}
