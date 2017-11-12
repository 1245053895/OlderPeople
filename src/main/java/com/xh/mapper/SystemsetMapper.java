package com.xh.mapper;

import com.xh.po.Systemset;
import com.xh.po.SystemsetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemsetMapper {
    int countByExample(SystemsetExample example);

    int deleteByExample(SystemsetExample example);

    int deleteByPrimaryKey(Integer webid);

    int insert(Systemset record);

    int insertSelective(Systemset record);

    List<Systemset> selectByExample(SystemsetExample example);

    Systemset selectByPrimaryKey(Integer webid);

    int updateByExampleSelective(@Param("record") Systemset record, @Param("example") SystemsetExample example);

    int updateByExample(@Param("record") Systemset record, @Param("example") SystemsetExample example);

    int updateByPrimaryKeySelective(Systemset record);

    int updateByPrimaryKey(Systemset record);
}