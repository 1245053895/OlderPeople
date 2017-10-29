package com.xh.po;

import java.util.Date;

public class Product {
    private Integer productid;

    private Integer producttypeid;

    private String productname;

    private Double productprice;

    private String picturesizes;

    private String picturecolors;

    private Integer productlookcount;

    private String productdescribe;

    private Date productstoretime;

    private String productpicture;

    private Integer productnew;

    private String producthotsale;

    private String productdisabled;

    private String productcredits;

    private Date productcreatetime;

    private String productA;

    private String productB;

    private String productC;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getProducttypeid() {
        return producttypeid;
    }

    public void setProducttypeid(Integer producttypeid) {
        this.producttypeid = producttypeid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Double getProductprice() {
        return productprice;
    }

    public void setProductprice(Double productprice) {
        this.productprice = productprice;
    }

    public String getPicturesizes() {
        return picturesizes;
    }

    public void setPicturesizes(String picturesizes) {
        this.picturesizes = picturesizes == null ? null : picturesizes.trim();
    }

    public String getPicturecolors() {
        return picturecolors;
    }

    public void setPicturecolors(String picturecolors) {
        this.picturecolors = picturecolors == null ? null : picturecolors.trim();
    }

    public Integer getProductlookcount() {
        return productlookcount;
    }

    public void setProductlookcount(Integer productlookcount) {
        this.productlookcount = productlookcount;
    }

    public String getProductdescribe() {
        return productdescribe;
    }

    public void setProductdescribe(String productdescribe) {
        this.productdescribe = productdescribe == null ? null : productdescribe.trim();
    }

    public Date getProductstoretime() {
        return productstoretime;
    }

    public void setProductstoretime(Date productstoretime) {
        this.productstoretime = productstoretime;
    }

    public String getProductpicture() {
        return productpicture;
    }

    public void setProductpicture(String productpicture) {
        this.productpicture = productpicture == null ? null : productpicture.trim();
    }

    public Integer getProductnew() {
        return productnew;
    }

    public void setProductnew(Integer productnew) {
        this.productnew = productnew;
    }

    public String getProducthotsale() {
        return producthotsale;
    }

    public void setProducthotsale(String producthotsale) {
        this.producthotsale = producthotsale == null ? null : producthotsale.trim();
    }

    public String getProductdisabled() {
        return productdisabled;
    }

    public void setProductdisabled(String productdisabled) {
        this.productdisabled = productdisabled == null ? null : productdisabled.trim();
    }

    public String getProductcredits() {
        return productcredits;
    }

    public void setProductcredits(String productcredits) {
        this.productcredits = productcredits == null ? null : productcredits.trim();
    }

    public Date getProductcreatetime() {
        return productcreatetime;
    }

    public void setProductcreatetime(Date productcreatetime) {
        this.productcreatetime = productcreatetime;
    }

    public String getProductA() {
        return productA;
    }

    public void setProductA(String productA) {
        this.productA = productA == null ? null : productA.trim();
    }

    public String getProductB() {
        return productB;
    }

    public void setProductB(String productB) {
        this.productB = productB == null ? null : productB.trim();
    }

    public String getProductC() {
        return productC;
    }

    public void setProductC(String productC) {
        this.productC = productC == null ? null : productC.trim();
    }
}