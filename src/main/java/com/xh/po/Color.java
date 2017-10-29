package com.xh.po;

public class Color {
    private Integer colorid;

    private String colorname;

    private Integer productid;

    private String colorA;

    private String colorB;

    private String colorC;

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public String getColorname() {
        return colorname;
    }

    public void setColorname(String colorname) {
        this.colorname = colorname == null ? null : colorname.trim();
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getColorA() {
        return colorA;
    }

    public void setColorA(String colorA) {
        this.colorA = colorA == null ? null : colorA.trim();
    }

    public String getColorB() {
        return colorB;
    }

    public void setColorB(String colorB) {
        this.colorB = colorB == null ? null : colorB.trim();
    }

    public String getColorC() {
        return colorC;
    }

    public void setColorC(String colorC) {
        this.colorC = colorC == null ? null : colorC.trim();
    }
}