package com.xh.mapper.pojo;

import com.xh.po.Product;
import com.xh.po.ProductExample;
import com.xh.po.vo.MyProduct;
import com.xh.po.vo.PingJia;
import com.xh.po.vo.PingJiaShu;
import com.xh.po.vo.TuiJian;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MyProductMapper {

    PingJiaShu pingJiaShu1(Integer productid);

    List<PingJiaShu> pingJiaShu(Integer productid);

    List<PingJia> pingJia(Integer productid);

    MyProduct selectByPrimaryKey(Integer productid);

    PingJiaShu pingJia001(Integer productid);
    PingJiaShu pingJia002(Integer productid);
    PingJiaShu pingJia003(Integer productid);


    List<TuiJian> tuiJian01();
    List<TuiJian> tuiJian02();
    List<TuiJian> tuiJian03();
    List<TuiJian> tuiJian04();
    List<TuiJian> tuiJian05();



}