package com.xh.mapper.pojo;

import com.xh.po.Producttype;
import com.xh.po.ProducttypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProducTypeMapper {

    int deleteByPrimaryKey(Integer producttypeid);

    int insertSelective(Producttype record);

    List<Producttype> selectByPrimaryKey();

    int updateByPrimaryKeySelective(Producttype record);


}