package com.xh.service.customerService;

import com.xh.controller.page.Pagination;
import com.xh.po.Orderproduct;
import com.xh.po.vo.TotalCreditsById;
import com.xh.po.vo.TuiJian;
/*import org.apdplat.word.vector.T;*/
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecommendService {
    //统计商品浏览次数最多的前二十条数据
    public List<TotalCreditsById> SelectRecommed();
    //查询商品购买次数
    public List<TuiJian> SelectShopingCount();
}
