package com.xh.po.vo;

import com.xh.po.Admin;

/**
 * Created by KAIRUN on 2017/10/30.
 */
public class AdminRole extends Admin {
    private String admingroupdescription;
    private String admingroupname;

    public String getAdmingroupdescription() {
        return admingroupdescription;
    }

    public void setAdmingroupdescription(String admingroupdescription) {
        this.admingroupdescription = admingroupdescription;
    }

    public String getAdmingroupname() {
        return admingroupname;
    }

    public void setAdmingroupname(String admingroupname) {
        this.admingroupname = admingroupname;
    }
}
