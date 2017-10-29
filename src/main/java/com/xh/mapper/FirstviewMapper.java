package com.xh.mapper;

import com.xh.po.Firstview;
import com.xh.po.FirstviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirstviewMapper {
    long countByExample(FirstviewExample example);

    int deleteByExample(FirstviewExample example);

    int deleteByPrimaryKey(Integer firstviewid);

    int insert(Firstview record);

    int insertSelective(Firstview record);

    List<Firstview> selectByExample(FirstviewExample example);

    Firstview selectByPrimaryKey(Integer firstviewid);

    int updateByExampleSelective(@Param("record") Firstview record, @Param("example") FirstviewExample example);

    int updateByExample(@Param("record") Firstview record, @Param("example") FirstviewExample example);

    int updateByPrimaryKeySelective(Firstview record);

    int updateByPrimaryKey(Firstview record);
}