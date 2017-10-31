package com.xh.mapper;

import com.xh.po.Secondview;
import com.xh.po.SecondviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecondviewMapper {
    long countByExample(SecondviewExample example);

    int deleteByExample(SecondviewExample example);

    int deleteByPrimaryKey(Integer secondviewid);

    int insert(Secondview record);

    int insertSelective(Secondview record);

    List<Secondview> selectByExample(SecondviewExample example);

    Secondview selectByPrimaryKey(Integer secondviewid);

    int updateByExampleSelective(@Param("record") Secondview record, @Param("example") SecondviewExample example);

    int updateByExample(@Param("record") Secondview record, @Param("example") SecondviewExample example);

    int updateByPrimaryKeySelective(Secondview record);

    int updateByPrimaryKey(Secondview record);
}