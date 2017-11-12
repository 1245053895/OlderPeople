package com.xh.service;

import com.xh.po.vo.OrderDetails;
import com.xh.po.vo.TotalMessage;
import com.xh.po.vo.UserAndUserLog;
import com.xh.po.vo.UserLogCustom;

import java.util.List;

public interface UserRecordService {
    /**
     * 查询用户日志,部分用户信息,浏览商品次数及购买率
     * @return
     */
    public List<UserAndUserLog> queryUserLog();


    /**
     * 通过用户id获取订单详情
     * @param id
     * @return
     */
    public List<OrderDetails> getOrderDetailsByUserId(Integer id);

    /**
     * 通过用户id查询用户登录记录
     * @param id
     * @return
     */
    public List<UserLogCustom> getUserLogById(Integer id);


    //实现所有用户记录的条数统计
    public TotalMessage queryTotalRecord();

    //用户记录中根据用户的名称进行模糊查询
    public List<UserAndUserLog> moHuSelectByUserId(String username);

}
