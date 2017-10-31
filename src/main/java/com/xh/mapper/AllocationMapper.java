package com.xh.mapper;

import com.xh.po.Allocation;
import com.xh.po.AllocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllocationMapper {
    long countByExample(AllocationExample example);

    int deleteByExample(AllocationExample example);

    int deleteByPrimaryKey(Integer allocationid);

    int insert(Allocation record);

    int insertSelective(Allocation record);

    List<Allocation> selectByExample(AllocationExample example);

    Allocation selectByPrimaryKey(Integer allocationid);

    int updateByExampleSelective(@Param("record") Allocation record, @Param("example") AllocationExample example);

    int updateByExample(@Param("record") Allocation record, @Param("example") AllocationExample example);

    int updateByPrimaryKeySelective(Allocation record);

    int updateByPrimaryKey(Allocation record);
}