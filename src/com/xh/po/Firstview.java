package com.xh.po;

public class Firstview {
    private Integer firstviewid;

    private String firstviewaction;

    private String firstviewdescription;

    private Integer secondviewid;

    private String firstviewA;

    private String firstviewB;

    private String firstviewC;

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
        this.firstviewaction = firstviewaction == null ? null : firstviewaction.trim();
    }

    public String getFirstviewdescription() {
        return firstviewdescription;
    }

    public void setFirstviewdescription(String firstviewdescription) {
        this.firstviewdescription = firstviewdescription == null ? null : firstviewdescription.trim();
    }

    public Integer getSecondviewid() {
        return secondviewid;
    }

    public void setSecondviewid(Integer secondviewid) {
        this.secondviewid = secondviewid;
    }

    public String getFirstviewA() {
        return firstviewA;
    }

    public void setFirstviewA(String firstviewA) {
        this.firstviewA = firstviewA == null ? null : firstviewA.trim();
    }

    public String getFirstviewB() {
        return firstviewB;
    }

    public void setFirstviewB(String firstviewB) {
        this.firstviewB = firstviewB == null ? null : firstviewB.trim();
    }

    public String getFirstviewC() {
        return firstviewC;
    }

    public void setFirstviewC(String firstviewC) {
        this.firstviewC = firstviewC == null ? null : firstviewC.trim();
    }
}