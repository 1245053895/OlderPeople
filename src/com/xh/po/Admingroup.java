package com.xh.po;

public class Admingroup {
    private Integer admingroupid;

    private String admingroupname;

    private String admingroupdescription;

    private String admingroupidA;

    private String admingroupidB;

    private String admingroupidC;

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
        this.admingroupname = admingroupname == null ? null : admingroupname.trim();
    }

    public String getAdmingroupdescription() {
        return admingroupdescription;
    }

    public void setAdmingroupdescription(String admingroupdescription) {
        this.admingroupdescription = admingroupdescription == null ? null : admingroupdescription.trim();
    }

    public String getAdmingroupidA() {
        return admingroupidA;
    }

    public void setAdmingroupidA(String admingroupidA) {
        this.admingroupidA = admingroupidA == null ? null : admingroupidA.trim();
    }

    public String getAdmingroupidB() {
        return admingroupidB;
    }

    public void setAdmingroupidB(String admingroupidB) {
        this.admingroupidB = admingroupidB == null ? null : admingroupidB.trim();
    }

    public String getAdmingroupidC() {
        return admingroupidC;
    }

    public void setAdmingroupidC(String admingroupidC) {
        this.admingroupidC = admingroupidC == null ? null : admingroupidC.trim();
    }
}