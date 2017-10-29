package com.xh.po;

public class Transport {
    private Integer transportid;

    private String transportname;

    private String transportimg;

    private String transportA;

    private String transportB;

    private String transportC;

    public Integer getTransportid() {
        return transportid;
    }

    public void setTransportid(Integer transportid) {
        this.transportid = transportid;
    }

    public String getTransportname() {
        return transportname;
    }

    public void setTransportname(String transportname) {
        this.transportname = transportname == null ? null : transportname.trim();
    }

    public String getTransportimg() {
        return transportimg;
    }

    public void setTransportimg(String transportimg) {
        this.transportimg = transportimg == null ? null : transportimg.trim();
    }

    public String getTransportA() {
        return transportA;
    }

    public void setTransportA(String transportA) {
        this.transportA = transportA == null ? null : transportA.trim();
    }

    public String getTransportB() {
        return transportB;
    }

    public void setTransportB(String transportB) {
        this.transportB = transportB == null ? null : transportB.trim();
    }

    public String getTransportC() {
        return transportC;
    }

    public void setTransportC(String transportC) {
        this.transportC = transportC == null ? null : transportC.trim();
    }
}