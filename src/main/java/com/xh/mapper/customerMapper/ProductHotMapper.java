package com.xh.mapper.customerMapper;

import com.xh.po.Product;
import com.xh.po.vo.ProductTypeExtend;
import com.xh.po.vo.TotalCreditsById;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KAIRUN on 2017/11/13.
 */
@Component
public interface ProductHotMapper {
    //查询热销商品结果集
    public List<TotalCreditsById> SelectHotProduct(TotalCreditsById totalCreditsById);
    //查询总条数
    public Integer SelectCount(TotalCreditsById totalCreditsById);

}
