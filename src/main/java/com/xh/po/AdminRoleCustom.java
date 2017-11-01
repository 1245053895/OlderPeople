package com.xh.po;

import java.util.List;

public class AdminRoleCustom extends Admingroup {

    List<String> firstViewAction;

    public List<String> getFirstViewAction() {
        return firstViewAction;
    }

    public void setFirstViewAction(List<String> firstViewAction) {
        this.firstViewAction = firstViewAction;
    }
}
