package com.xh.po;

public class Systemset {
    private Integer webid;

    private String webname;

    private String webicon;

    private String keywords;

    private String blockwords;

    private String webfilepatn;

    private String webdescribe;

    private String bottomcopyright;

    private String recordnumber;

    public Integer getWebid() {
        return webid;
    }

    public void setWebid(Integer webid) {
        this.webid = webid;
    }

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname == null ? null : webname.trim();
    }

    public String getWebicon() {
        return webicon;
    }

    public void setWebicon(String webicon) {
        this.webicon = webicon == null ? null : webicon.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getBlockwords() {
        return blockwords;
    }

    public void setBlockwords(String blockwords) {
        this.blockwords = blockwords == null ? null : blockwords.trim();
    }

    public String getWebfilepatn() {
        return webfilepatn;
    }

    public void setWebfilepatn(String webfilepatn) {
        this.webfilepatn = webfilepatn == null ? null : webfilepatn.trim();
    }

    public String getWebdescribe() {
        return webdescribe;
    }

    public void setWebdescribe(String webdescribe) {
        this.webdescribe = webdescribe == null ? null : webdescribe.trim();
    }

    public String getBottomcopyright() {
        return bottomcopyright;
    }

    public void setBottomcopyright(String bottomcopyright) {
        this.bottomcopyright = bottomcopyright == null ? null : bottomcopyright.trim();
    }

    public String getRecordnumber() {
        return recordnumber;
    }

    public void setRecordnumber(String recordnumber) {
        this.recordnumber = recordnumber == null ? null : recordnumber.trim();
    }
}