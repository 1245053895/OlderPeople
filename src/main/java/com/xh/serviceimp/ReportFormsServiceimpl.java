package com.xh.serviceimp;

import com.xh.mapper.pojo.ReportFormsMapper;
import com.xh.po.vo.ReportFormsString;
import com.xh.service.ReportFormsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportFormsServiceimpl implements ReportFormsService {
    @Autowired
    private ReportFormsMapper reportFormsMapper;

    @Override
    public int[] getArray(Integer myyear) {
        List<ReportFormsString> reportFormsStringList1= reportFormsMapper.selectGetCount1(myyear);
        List<ReportFormsString> reportFormsStringList2= reportFormsMapper.selectGetCount2(myyear);
        List<ReportFormsString> reportFormsStringList3= reportFormsMapper.selectGetCount3(myyear);
        List<ReportFormsString> reportFormsStringList4= reportFormsMapper.selectGetCount4(myyear);
        //0-11待付款  20-31已付款 40-51待发货 60-71所有订单
        int[] array = new int[72];
        for (int i=0;i<reportFormsStringList1.size();i++){
            String yearmonth  = reportFormsStringList1.get(i).getMonths();
            int mm= Integer.parseInt(yearmonth.substring(4))-1;
            array[mm]=reportFormsStringList1.get(i).getCount1();
        }
        for (int i=0;i<reportFormsStringList2.size();i++){
            String yearmonth   = reportFormsStringList2.get(i).getMonths();
            int mm= Integer.parseInt(yearmonth.substring(4))+19;
            array[mm]=reportFormsStringList2.get(i).getCount2();
        }
        for (int i=0;i<reportFormsStringList3.size();i++){
            String yearmonth  = reportFormsStringList3.get(i).getMonths();
            int mm= Integer.parseInt(yearmonth.substring(4))+39;
            array[mm]=reportFormsStringList3.get(i).getCount3();
        }

        for (int i=0;i<reportFormsStringList4.size();i++){
            String yearmonth  = reportFormsStringList4.get(i).getMonths();
            int mm= Integer.parseInt(yearmonth.substring(4))+59;
            array[mm]=reportFormsStringList4.get(i).getCount4();
        }
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
        return array;
    }
}
