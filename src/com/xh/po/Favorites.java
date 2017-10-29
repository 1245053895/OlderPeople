package com.xh.po;

public class Favorites {
    private Integer favoritesid;

    private Integer userid;

    private Integer productid;

    private String favoritesA;

    private String favoritesB;

    private String favoritesC;

    public Integer getFavoritesid() {
        return favoritesid;
    }

    public void setFavoritesid(Integer favoritesid) {
        this.favoritesid = favoritesid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getFavoritesA() {
        return favoritesA;
    }

    public void setFavoritesA(String favoritesA) {
        this.favoritesA = favoritesA == null ? null : favoritesA.trim();
    }

    public String getFavoritesB() {
        return favoritesB;
    }

    public void setFavoritesB(String favoritesB) {
        this.favoritesB = favoritesB == null ? null : favoritesB.trim();
    }

    public String getFavoritesC() {
        return favoritesC;
    }

    public void setFavoritesC(String favoritesC) {
        this.favoritesC = favoritesC == null ? null : favoritesC.trim();
    }
}