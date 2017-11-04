package com.xh.mapper.pojo;

import com.xh.po.Producttype;
import com.xh.po.ProducttypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProducTypeMapper {

//    删除
    void TypedeleteByName(String producttypename);
//    增加
    void TypeinsertSelective(Producttype record);
//    查询
    List<Producttype> selectByNothing();

}