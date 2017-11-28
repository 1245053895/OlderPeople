package com.xh.mapper.customerMapper;

import com.xh.po.vo.ProductCustom;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CNNMapper {
    public List<ProductCustom> queryAllProduct(@Param("start")int start, @Param("count")int count);
}
