package com.xh.po.vo;

import com.xh.po.Firstview;
import com.xh.po.Secondview;

public class AdminFirstViewCustom extends Secondview {
    private Integer adminid;
    private String adminname;

    private Integer admingroupid;
    private String admingroupname;
    private String admingroupdescription;

    private Integer firstviewid;
    private String firstviewaction;
    private String firstviewdescription;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public Integer getAdmingroupid() {
        return admingroupid;
    }

    public void setAdmingroupid(Integer admingroupid) {
        this.admingroupid = admingroupid;
    }

    public String getAdmingroupname() {
        return admingroupname;
    }

    public void setAdmingroupname(String admingroupname) {
        this.admingroupname = admingroupname;
    }

    public String getAdmingroupdescription() {
        return admingroupdescription;
    }

    public void setAdmingroupdescription(String admingroupdescription) {
        this.admingroupdescription = admingroupdescription;
    }

    public Integer getFirstviewid() {
        return firstviewid;
    }

    public void setFirstviewid(Integer firstviewid) {
        this.firstviewid = firstviewid;
    }

    public String getFirstviewaction() {
        return firstviewaction;
    }

    public void setFirstviewaction(String firstviewaction) {
        this.firstviewaction = firstviewaction;
    }

    public String getFirstviewdescription() {
        return firstviewdescription;
    }

    public void setFirstviewdescription(String firstviewdescription) {
        this.firstviewdescription = firstviewdescription;
    }
}
