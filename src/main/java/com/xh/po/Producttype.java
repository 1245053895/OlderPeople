package com.xh.po;

public class Producttype {
    private Integer producttypeid;

    private String producttypename;

    private String producttypeA;

    private String producttypeB;

    private String producttypeC;

    public Integer getProducttypeid() {
        return producttypeid;
    }

    public void setProducttypeid(Integer producttypeid) {
        this.producttypeid = producttypeid;
    }

    public String getProducttypename() {
        return producttypename;
    }

    public void setProducttypename(String producttypename) {
        this.producttypename = producttypename == null ? null : producttypename.trim();
    }

    public String getProducttypeA() {
        return producttypeA;
    }

    public void setProducttypeA(String producttypeA) {
        this.producttypeA = producttypeA == null ? null : producttypeA.trim();
    }

    public String getProducttypeB() {
        return producttypeB;
    }

    public void setProducttypeB(String producttypeB) {
        this.producttypeB = producttypeB == null ? null : producttypeB.trim();
    }

    public String getProducttypeC() {
        return producttypeC;
    }

    public void setProducttypeC(String producttypeC) {
        this.producttypeC = producttypeC == null ? null : producttypeC.trim();
    }
}