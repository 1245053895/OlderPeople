package com.xh.po;

public class Admingroupfirstview {
    private Integer admingroupfirstviewid;

    private String firstviewaction;

    private Integer admingroupid;

    private String admingroupfirstviewA;

    private String admingroupfirstviewB;

    private String admingroupfirstviewC;

    public Integer getAdmingroupfirstviewid() {
        return admingroupfirstviewid;
    }

    public void setAdmingroupfirstviewid(Integer admingroupfirstviewid) {
        this.admingroupfirstviewid = admingroupfirstviewid;
    }

    public String getFirstviewaction() {
        return firstviewaction;
    }

    public void setFirstviewaction(String firstviewaction) {
        this.firstviewaction = firstviewaction == null ? null : firstviewaction.trim();
    }

    public Integer getAdmingroupid() {
        return admingroupid;
    }

    public void setAdmingroupid(Integer admingroupid) {
        this.admingroupid = admingroupid;
    }

    public String getAdmingroupfirstviewA() {
        return admingroupfirstviewA;
    }

    public void setAdmingroupfirstviewA(String admingroupfirstviewA) {
        this.admingroupfirstviewA = admingroupfirstviewA == null ? null : admingroupfirstviewA.trim();
    }

    public String getAdmingroupfirstviewB() {
        return admingroupfirstviewB;
    }

    public void setAdmingroupfirstviewB(String admingroupfirstviewB) {
        this.admingroupfirstviewB = admingroupfirstviewB == null ? null : admingroupfirstviewB.trim();
    }

    public String getAdmingroupfirstviewC() {
        return admingroupfirstviewC;
    }

    public void setAdmingroupfirstviewC(String admingroupfirstviewC) {
        this.admingroupfirstviewC = admingroupfirstviewC == null ? null : admingroupfirstviewC.trim();
    }
}