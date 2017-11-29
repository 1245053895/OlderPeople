package com.xh.service;

import com.xh.po.vo.ReportFormsString;

import java.util.List;

public interface ReportFormsService {
//    把每个月的数据 （待付款、 已付款、待发货、所有订单 ）放在一个数组
    int[]  getArray(Integer myyear);

}
