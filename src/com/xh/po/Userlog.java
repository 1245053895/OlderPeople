package com.xh.po;

import java.util.Date;

public class Userlog {
    private Integer userlogid;

    private Integer userid;

    private Date startlogintime;

    private Date endlogintime;

    private String userip;

    private String userlogA;

    private String userlogB;

    private String userlogC;

    public Integer getUserlogid() {
        return userlogid;
    }

    public void setUserlogid(Integer userlogid) {
        this.userlogid = userlogid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getStartlogintime() {
        return startlogintime;
    }

    public void setStartlogintime(Date startlogintime) {
        this.startlogintime = startlogintime;
    }

    public Date getEndlogintime() {
        return endlogintime;
    }

    public void setEndlogintime(Date endlogintime) {
        this.endlogintime = endlogintime;
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip == null ? null : userip.trim();
    }

    public String getUserlogA() {
        return userlogA;
    }

    public void setUserlogA(String userlogA) {
        this.userlogA = userlogA == null ? null : userlogA.trim();
    }

    public String getUserlogB() {
        return userlogB;
    }

    public void setUserlogB(String userlogB) {
        this.userlogB = userlogB == null ? null : userlogB.trim();
    }

    public String getUserlogC() {
        return userlogC;
    }

    public void setUserlogC(String userlogC) {
        this.userlogC = userlogC == null ? null : userlogC.trim();
    }
}