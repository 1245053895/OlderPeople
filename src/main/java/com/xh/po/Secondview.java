package com.xh.po;

public class Secondview {
    private Integer secondviewid;

    private String secondviewaction;

    private String secondviewdescribe;

    private String secondviewA;

    private String secondviewB;

    private String secondviewC;

    private String sencondurl;

    public Integer getSecondviewid() {
        return secondviewid;
    }

    public void setSecondviewid(Integer secondviewid) {
        this.secondviewid = secondviewid;
    }

    public String getSecondviewaction() {
        return secondviewaction;
    }

    public void setSecondviewaction(String secondviewaction) {
        this.secondviewaction = secondviewaction == null ? null : secondviewaction.trim();
    }

    public String getSecondviewdescribe() {
        return secondviewdescribe;
    }

    public void setSecondviewdescribe(String secondviewdescribe) {
        this.secondviewdescribe = secondviewdescribe == null ? null : secondviewdescribe.trim();
    }

    public String getSecondviewA() {
        return secondviewA;
    }

    public void setSecondviewA(String secondviewA) {
        this.secondviewA = secondviewA == null ? null : secondviewA.trim();
    }

    public String getSecondviewB() {
        return secondviewB;
    }

    public void setSecondviewB(String secondviewB) {
        this.secondviewB = secondviewB == null ? null : secondviewB.trim();
    }

    public String getSecondviewC() {
        return secondviewC;
    }

    public void setSecondviewC(String secondviewC) {
        this.secondviewC = secondviewC == null ? null : secondviewC.trim();
    }

    public String getSencondurl() {
        return sencondurl;
    }

    public void setSencondurl(String sencondurl) {
        this.sencondurl = sencondurl == null ? null : sencondurl.trim();
    }
}