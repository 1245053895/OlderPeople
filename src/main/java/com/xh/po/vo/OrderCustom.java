package com.xh.po.vo;

import com.xh.po.Order;
import com.xh.po.User;

public class OrderCustom extends Order{
    int buyTime;
    String username;
    String conditions;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(int buyTime) {
        this.buyTime = buyTime;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
}
