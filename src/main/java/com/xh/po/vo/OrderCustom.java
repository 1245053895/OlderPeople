package com.xh.po.vo;

import com.xh.po.Order;
import com.xh.po.User;

public class OrderCustom extends Order{
    String username;
    String conditions;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
}
