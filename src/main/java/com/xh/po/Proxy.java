package com.xh.po;

public class Proxy {
    private Integer proxyid;

    private String proxyname;

    private String proxypwd;

    private String proxyaddr;

    private String proxyphone;

    private Integer proxyzip;

    private String proxyA;

    private String proxyB;

    private String proxyC;

    public Integer getProxyid() {
        return proxyid;
    }

    public void setProxyid(Integer proxyid) {
        this.proxyid = proxyid;
    }

    public String getProxyname() {
        return proxyname;
    }

    public void setProxyname(String proxyname) {
        this.proxyname = proxyname == null ? null : proxyname.trim();
    }

    public String getProxypwd() {
        return proxypwd;
    }

    public void setProxypwd(String proxypwd) {
        this.proxypwd = proxypwd == null ? null : proxypwd.trim();
    }

    public String getProxyaddr() {
        return proxyaddr;
    }

    public void setProxyaddr(String proxyaddr) {
        this.proxyaddr = proxyaddr == null ? null : proxyaddr.trim();
    }

    public String getProxyphone() {
        return proxyphone;
    }

    public void setProxyphone(String proxyphone) {
        this.proxyphone = proxyphone == null ? null : proxyphone.trim();
    }

    public Integer getProxyzip() {
        return proxyzip;
    }

    public void setProxyzip(Integer proxyzip) {
        this.proxyzip = proxyzip;
    }

    public String getProxyA() {
        return proxyA;
    }

    public void setProxyA(String proxyA) {
        this.proxyA = proxyA == null ? null : proxyA.trim();
    }

    public String getProxyB() {
        return proxyB;
    }

    public void setProxyB(String proxyB) {
        this.proxyB = proxyB == null ? null : proxyB.trim();
    }

    public String getProxyC() {
        return proxyC;
    }

    public void setProxyC(String proxyC) {
        this.proxyC = proxyC == null ? null : proxyC.trim();
    }
}