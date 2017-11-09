package com.xh.po.vo;

public class SystemSitings {
 private int webid;
 private String webname;
 private String webicon;
 private String keywords;
 private  String blockwords;
 private  String webfilepath;
 private  String webdescrible;
 private  String bottomcopyright;
 private  String recordnumber;

    public int getWebid() {
        return webid;
    }

    public void setWebid(int webid) {
        this.webid = webid;
    }

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname;
    }

    public String getWebicon() {
        return webicon;
    }

    public void setWebicon(String webicon) {
        this.webicon = webicon;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getBlockwords() {
        return blockwords;
    }

    public void setBlockwords(String blockwords) {
        this.blockwords = blockwords;
    }

    public String getWebfilepath() {
        return webfilepath;
    }

    public void setWebfilepath(String webfilepath) {
        this.webfilepath = webfilepath;
    }

    public String getWebdescrible() {
        return webdescrible;
    }

    public void setWebdescrible(String webdescrible) {
        this.webdescrible = webdescrible;
    }

    public String getBottomcopyright() {
        return bottomcopyright;
    }

    public void setBottomcopyright(String bottomcopyright) {
        this.bottomcopyright = bottomcopyright;
    }

    public String getRecordnumber() {
        return recordnumber;
    }

    public void setRecordnumber(String recordnumber) {
        this.recordnumber = recordnumber;
    }

    @Override
    public String toString() {
        return "SystemSitings{" +
                "webid=" + webid +
                ", webname='" + webname + '\'' +
                ", webicon='" + webicon + '\'' +
                ", keywords='" + keywords + '\'' +
                ", blockwords='" + blockwords + '\'' +
                ", webfilepath='" + webfilepath + '\'' +
                ", webdescrible='" + webdescrible + '\'' +
                ", bottomcopyright='" + bottomcopyright + '\'' +
                ", recordnumber='" + recordnumber + '\'' +
                '}';
    }
}