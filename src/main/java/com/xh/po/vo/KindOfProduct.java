package com.xh.po.vo;

public class KindOfProduct {
    private String kindofproduct;

    @Override
    public String toString() {
        return "KindOfProduct{" +
                "kindofproduct='" + kindofproduct + '\'' +
                '}';
    }

    public String getKindofproduct() {
        return kindofproduct;
    }

    public void setKindofproduct(String kindofproduct) {
        this.kindofproduct = kindofproduct;
    }
}
