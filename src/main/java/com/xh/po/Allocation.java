package com.xh.po;

public class Allocation {
    private Integer allocationid;

    private Integer productid;

    private Integer proxyid;

    private Integer allocationnumble;

    private String allocationA;

    private String allocationB;

    private String allocationC;

    public Integer getAllocationid() {
        return allocationid;
    }

    public void setAllocationid(Integer allocationid) {
        this.allocationid = allocationid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getProxyid() {
        return proxyid;
    }

    public void setProxyid(Integer proxyid) {
        this.proxyid = proxyid;
    }

    public Integer getAllocationnumble() {
        return allocationnumble;
    }

    public void setAllocationnumble(Integer allocationnumble) {
        this.allocationnumble = allocationnumble;
    }

    public String getAllocationA() {
        return allocationA;
    }

    public void setAllocationA(String allocationA) {
        this.allocationA = allocationA == null ? null : allocationA.trim();
    }

    public String getAllocationB() {
        return allocationB;
    }

    public void setAllocationB(String allocationB) {
        this.allocationB = allocationB == null ? null : allocationB.trim();
    }

    public String getAllocationC() {
        return allocationC;
    }

    public void setAllocationC(String allocationC) {
        this.allocationC = allocationC == null ? null : allocationC.trim();
    }
}