package com.xh.mapper.customerMapper;

import com.xh.po.vo.TotalCreditsById;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
@Component
public interface ProductNewMapper {
    //查询热销商品
    public List<TotalCreditsById>  SelectProductNew(TotalCreditsById totalCreditsById);
    //查询新品总数
    public Integer SelectNewCount(TotalCreditsById totalCreditsById);
}
