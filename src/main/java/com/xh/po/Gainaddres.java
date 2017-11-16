package com.xh.po;

public class Gainaddres {
    private Integer gainid;

    private Integer userid;

    private String gainname;

    private String gainmobile;

    private String gainaddress;

    private Integer gaincode;

    private String gainA;

    private String gainB;

    private String gainC;

    public Integer getGainid() {
        return gainid;
    }

    public void setGainid(Integer gainid) {
        this.gainid = gainid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getGainname() {
        return gainname;
    }

    public void setGainname(String gainname) {
        this.gainname = gainname == null ? null : gainname.trim();
    }

    public String getGainmobile() {
        return gainmobile;
    }

    public void setGainmobile(String gainmobile) {
        this.gainmobile = gainmobile == null ? null : gainmobile.trim();
    }

    public String getGainaddress() {
        return gainaddress;
    }

    public void setGainaddress(String gainaddress) {
        this.gainaddress = gainaddress == null ? null : gainaddress.trim();
    }

    public Integer getGaincode() {
        return gaincode;
    }

    public void setGaincode(Integer gaincode) {
        this.gaincode = gaincode;
    }

    public String getGainA() {
        return gainA;
    }

    public void setGainA(String gainA) {
        this.gainA = gainA == null ? null : gainA.trim();
    }

    public String getGainB() {
        return gainB;
    }

    public void setGainB(String gainB) {
        this.gainB = gainB == null ? null : gainB.trim();
    }

    public String getGainC() {
        return gainC;
    }

    public void setGainC(String gainC) {
        this.gainC = gainC == null ? null : gainC.trim();
    }

    @Override
    public String toString() {
        return "Gainaddres{" +
                "gainid=" + gainid +
                ", userid=" + userid +
                ", gainname='" + gainname + '\'' +
                ", gainmobile='" + gainmobile + '\'' +
                ", gainaddress='" + gainaddress + '\'' +
                ", gaincode=" + gaincode +
                ", gainA='" + gainA + '\'' +
                ", gainB='" + gainB + '\'' +
                ", gainC='" + gainC + '\'' +
                '}';
    }
}