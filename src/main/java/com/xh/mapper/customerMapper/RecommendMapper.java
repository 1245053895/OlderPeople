package com.xh.mapper.customerMapper;

import com.xh.po.Orderproduct;
import com.xh.po.vo.TotalCreditsById;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
@Component
public interface RecommendMapper {
    //统计商品浏览的前二十条数据
    public List<TotalCreditsById> SelectRecommed();
    //查询商品购买次数
    public Orderproduct SelectShopingCount(Integer productid);

}
