package com.xh.mapper;

import com.xh.po.Admingroupfirstview;
import com.xh.po.AdmingroupfirstviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdmingroupfirstviewMapper {
    long countByExample(AdmingroupfirstviewExample example);

    int deleteByExample(AdmingroupfirstviewExample example);

    int deleteByPrimaryKey(Integer admingroupfirstviewid);

    int insert(Admingroupfirstview record);

    int insertSelective(Admingroupfirstview record);

    List<Admingroupfirstview> selectByExample(AdmingroupfirstviewExample example);

    Admingroupfirstview selectByPrimaryKey(Integer admingroupfirstviewid);

    int updateByExampleSelective(@Param("record") Admingroupfirstview record, @Param("example") AdmingroupfirstviewExample example);

    int updateByExample(@Param("record") Admingroupfirstview record, @Param("example") AdmingroupfirstviewExample example);

    int updateByPrimaryKeySelective(Admingroupfirstview record);

    int updateByPrimaryKey(Admingroupfirstview record);
}