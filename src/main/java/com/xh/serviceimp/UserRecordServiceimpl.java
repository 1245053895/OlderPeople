package com.xh.serviceimp;

import com.xh.mapper.pojo.UserRecordMapper;
import com.xh.po.vo.OrderDetails;
import com.xh.po.vo.UserAndUserLog;
import com.xh.po.vo.UserLogCustom;
import com.xh.service.UserRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRecordServiceimpl implements UserRecordService {

    @Autowired
    UserRecordMapper userRecordMapper;

    public List<UserAndUserLog> queryUserLog() {
        List<UserAndUserLog> userAndUserLogs =userRecordMapper.queryUserLog();
        return userAndUserLogs;
    }

    public List<OrderDetails> getOrderDetailsByUserId(Integer id) {
        return userRecordMapper.getOrderDetailsByUserId(id);
    }

    public List<UserLogCustom> getUserLogById(Integer id) {
        List<UserLogCustom> userLogCustoms= userRecordMapper.getUserLogById(id);
        return userLogCustoms;
    }

    @Override
    public List<UserAndUserLog> moHuSelectByUserId(String username) {
        List<UserAndUserLog> userAndUserLogs= userRecordMapper.moHuSelectByUserId(username);
        return userAndUserLogs;
    }

}
