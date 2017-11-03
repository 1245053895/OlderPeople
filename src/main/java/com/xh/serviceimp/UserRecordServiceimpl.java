package com.xh.serviceimp;

import com.xh.mapper.pojo.UserRecordMapper;
import com.xh.po.vo.UserAndUserLog;
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
}
