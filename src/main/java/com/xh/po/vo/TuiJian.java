package com.xh.po.vo;

public class TuiJian {

    private Integer productid;
    private Integer shuliang;
    private String productname;
    private Double productprice;
    private String productpicture;

    public String[]getImages(){
        if (productpicture != null) {
            String[] images =productpicture.split(",");
            return images;
        }
        return null;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getShuliang() {
        return shuliang;
    }

    public void setShuliang(Integer shuliang) {
        this.shuliang = shuliang;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Double getProductprice() {
        return productprice;
    }

    public void setProductprice(Double productprice) {
        this.productprice = productprice;
    }

    public String getProductpicture() {
        return productpicture;
    }

    public void setProductpicture(String productpicture) {
        this.productpicture = productpicture;
    }
}
