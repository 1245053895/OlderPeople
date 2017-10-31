package com.xh.mapper;

import com.xh.po.Color;
import com.xh.po.ColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColorMapper {
    long countByExample(ColorExample example);

    int deleteByExample(ColorExample example);

    int deleteByPrimaryKey(Integer colorid);

    int insert(Color record);

    int insertSelective(Color record);

    List<Color> selectByExample(ColorExample example);

    Color selectByPrimaryKey(Integer colorid);

    int updateByExampleSelective(@Param("record") Color record, @Param("example") ColorExample example);

    int updateByExample(@Param("record") Color record, @Param("example") ColorExample example);

    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);
}