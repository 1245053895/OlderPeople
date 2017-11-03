package com.xh.service;

import com.xh.po.vo.UserAndUserLog;

import java.util.List;

public interface UserRecordService {
    /**
     * 查询用户日志,部分用户信息,浏览商品次数及购买率
     * @return
     */
    public List<UserAndUserLog> queryUserLog();
}
