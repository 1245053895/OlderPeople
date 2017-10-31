package com.xh.mapper;

import com.xh.po.Gainaddres;
import com.xh.po.GainaddresExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GainaddresMapper {
    long countByExample(GainaddresExample example);

    int deleteByExample(GainaddresExample example);

    int deleteByPrimaryKey(Integer gainid);

    int insert(Gainaddres record);

    int insertSelective(Gainaddres record);

    List<Gainaddres> selectByExample(GainaddresExample example);

    Gainaddres selectByPrimaryKey(Integer gainid);

    int updateByExampleSelective(@Param("record") Gainaddres record, @Param("example") GainaddresExample example);

    int updateByExample(@Param("record") Gainaddres record, @Param("example") GainaddresExample example);

    int updateByPrimaryKeySelective(Gainaddres record);

    int updateByPrimaryKey(Gainaddres record);
}