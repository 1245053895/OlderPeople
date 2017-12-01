package com.xh.po.vo;

import com.xh.po.Product;

import java.util.Date;

/**
 * Created by KAIRUN on 2017/11/16.
 */
public class TotalCreditsById extends Product{
    private Date createtime;
    private Date endtime;
    private Integer userid;
    private Integer totalCredits;
    private Integer totalcomment;
    private String comment;
    private String username;
    private Integer totalhotsale;
    private Integer shopComment;
    private Integer totalgoodcomment;
    private Integer onegood;
    private Integer startpage;

    //
    private  Integer  productTypeId1;
    private  Integer  productTypeId2;
    private  Integer  productTypeId3;

    public Integer getProductTypeId1() {
        return productTypeId1;
    }

    public void setProductTypeId1(Integer productTypeId1) {
        this.productTypeId1 = productTypeId1;
    }

    public Integer getProductTypeId2() {
        return productTypeId2;
    }

    public void setProductTypeId2(Integer productTypeId2) {
        this.productTypeId2 = productTypeId2;
    }

    public Integer getProductTypeId3() {
        return productTypeId3;
    }

    public void setProductTypeId3(Integer productTypeId3) {
        this.productTypeId3 = productTypeId3;
    }
    public Integer getStartpage() {
        return startpage;
    }

    public void setStartpage(Integer startpage) {
        this.startpage = startpage;
    }

    public Integer getOnegood() {
        return onegood;
    }

    public void setOnegood(Integer onegood) {
        this.onegood = onegood;
    }

    public Integer getTotalgoodcomment() {
        return totalgoodcomment;
    }

    public void setTotalgoodcomment(Integer totalgoodcomment) {
        this.totalgoodcomment = totalgoodcomment;
    }

    public Integer getShopComment() {
        return shopComment;
    }

    public void setShopComment(Integer shopComment) {
        this.shopComment = shopComment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }



    public Integer getTotalhotsale() {
        return totalhotsale;
    }

    public void setTotalhotsale(Integer totalhotsale) {
        this.totalhotsale = totalhotsale;
    }

    public Integer getTotalcomment() {
        return totalcomment;
    }

    public void setTotalcomment(Integer totalcomment) {
        this.totalcomment = totalcomment;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(Integer totalCredits) {
        this.totalCredits = totalCredits;
    }


    //附加字段
    private Integer pageNo = 1;
    private Integer pageSize = 10;
    //开始行
    private Integer startRow;

    public Integer getPageNo() {
        return pageNo;
    }
    public void setPageNo(Integer pageNo) {
        //计算开始行
        this.startRow = (pageNo-1)*pageSize;
        this.pageNo = pageNo;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        //计算开始行
        this.startRow = (pageNo-1)*pageSize;
        this.pageSize = pageSize;
    }
    public Integer getStartRow() {
        return startRow;
    }
    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
