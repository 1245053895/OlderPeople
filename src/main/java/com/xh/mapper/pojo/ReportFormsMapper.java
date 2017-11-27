package com.xh.mapper.pojo;


import com.xh.po.vo.ReportFormsString;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ReportFormsMapper {

    List<ReportFormsString> selectGetCount1(Integer myyear);
    List<ReportFormsString> selectGetCount2(Integer myyear);
    List<ReportFormsString> selectGetCount3(Integer myyear);
    List<ReportFormsString> selectGetCount4(Integer myyear);
}
