package com.xh.po;

public class Pay {
    private Integer payid;

    private String payname;

    private String paypicture;

    private String payA;

    private String payB;

    private String payC;

    public Integer getPayid() {
        return payid;
    }

    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    public String getPayname() {
        return payname;
    }

    public void setPayname(String payname) {
        this.payname = payname == null ? null : payname.trim();
    }

    public String getPaypicture() {
        return paypicture;
    }

    public void setPaypicture(String paypicture) {
        this.paypicture = paypicture == null ? null : paypicture.trim();
    }

    public String getPayA() {
        return payA;
    }

    public void setPayA(String payA) {
        this.payA = payA == null ? null : payA.trim();
    }

    public String getPayB() {
        return payB;
    }

    public void setPayB(String payB) {
        this.payB = payB == null ? null : payB.trim();
    }

    public String getPayC() {
        return payC;
    }

    public void setPayC(String payC) {
        this.payC = payC == null ? null : payC.trim();
    }
}