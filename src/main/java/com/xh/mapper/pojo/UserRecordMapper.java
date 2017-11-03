package com.xh.mapper.pojo;

import com.xh.po.vo.OrderDetails;
import com.xh.po.vo.UserAndUserLog;
import com.xh.po.vo.UserLogCustom;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRecordMapper {
    /**
     * 查询用户日志,部分用户信息,浏览商品次数及购买率
     * @return UserAndUserLog
     */
    public List<UserAndUserLog> queryUserLog();

    public List<OrderDetails> getOrderDetailsByUserId(Integer id);

    public List<UserLogCustom> getUserLogById(Integer id);
}
