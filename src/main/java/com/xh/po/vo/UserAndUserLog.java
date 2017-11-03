package com.xh.po.vo;

import com.xh.po.User;
import com.xh.po.Userlog;

import java.util.List;

public class UserAndUserLog extends User {
    //用户浏览商品次数
    Integer browseCount;
    //购买率
    Double ratio;

    public Integer getBrowseCount() {
        return browseCount;
    }

    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

}
