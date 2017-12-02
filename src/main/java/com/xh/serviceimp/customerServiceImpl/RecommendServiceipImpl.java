package com.xh.serviceimp.customerServiceImpl;

import com.xh.controller.page.Pagination;
import com.xh.mapper.customerMapper.ProductHotMapper;
import com.xh.mapper.customerMapper.RecommendMapper;
import com.xh.po.vo.TotalCreditsById;
import com.xh.po.vo.TuiJian;
import com.xh.service.customerService.ProductHotService;
import com.xh.service.customerService.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class RecommendServiceipImpl implements RecommendService {
    @Autowired
    private RecommendMapper recommendMapper;

    @Override
    public List<TotalCreditsById> SelectRecommed() {
        List<TotalCreditsById> totalCreditsByIds=recommendMapper.SelectRecommed();
        List<TotalCreditsById> randomHCproductList=new ArrayList<TotalCreditsById>();
        Random random=new Random();
        if(totalCreditsByIds.size()>10){
            for (int i=0;i<10;i++){
                int ran=random.nextInt(totalCreditsByIds.size());
                randomHCproductList.add(totalCreditsByIds.get(ran));
                totalCreditsByIds.remove(ran);
            }}else {
            return totalCreditsByIds;
        }
        return randomHCproductList;

    }

    @Override
    public List<TuiJian> SelectShopingCount() {
        List<TuiJian> tuiJians=recommendMapper.SelectShopingCount();
        return tuiJians;
    }
}
