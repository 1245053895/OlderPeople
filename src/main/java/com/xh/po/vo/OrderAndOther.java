package com.xh.po.vo;

import com.xh.po.Order;
import com.xh.po.Orderproduct;
import com.xh.po.Product;
import com.xh.po.Producttype;

import java.util.Date;

public class OrderAndOther {
    private Integer orderproductid;
    private Integer  productid;
    private Integer  orderid;
    private Integer  shoppingcount;
    private Double  totalmoneycount;
    private Double  productprice;
    private String  productname;
    private String  productpicture;
    private Integer  productnew;
    private String  producthotsale;
    private String  productdisabled;
    private String  productcredits;
    private Integer  userid;
    private Double  amountpay;
    private Double  realpay;
    private Integer  paytype;
    private Double  postfee;
    private Integer  status;
    private Integer  paystatus;
    private Date createtime;
    private Date  updatetime;
    private Date  paymenttime;
    private Date  sendtime;
    private Date  endtime;
    private Date  closetime;
    private String  shippingname;
    private String  shippingcode;
    private String  buyerrequest;
    private Integer  totalcredit;
    private String  producttypename;

    public Integer getOrderproductid() {
        return orderproductid;
    }

    public void setOrderproductid(Integer orderproductid) {
        this.orderproductid = orderproductid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getShoppingcount() {
        return shoppingcount;
    }

    public void setShoppingcount(Integer shoppingcount) {
        this.shoppingcount = shoppingcount;
    }

    public Double getTotalmoneycount() {
        return totalmoneycount;
    }

    public void setTotalmoneycount(Double totalmoneycount) {
        this.totalmoneycount = totalmoneycount;
    }

    public Double getProductprice() {
        return productprice;
    }

    public void setProductprice(Double productprice) {
        this.productprice = productprice;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductpicture() {
        return productpicture;
    }

    public void setProductpicture(String productpicture) {
        this.productpicture = productpicture;
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
        this.producthotsale = producthotsale;
    }

    public String getProductdisabled() {
        return productdisabled;
    }

    public void setProductdisabled(String productdisabled) {
        this.productdisabled = productdisabled;
    }

    public String getProductcredits() {
        return productcredits;
    }

    public void setProductcredits(String productcredits) {
        this.productcredits = productcredits;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Double getAmountpay() {
        return amountpay;
    }

    public void setAmountpay(Double amountpay) {
        this.amountpay = amountpay;
    }

    public Double getRealpay() {
        return realpay;
    }

    public void setRealpay(Double realpay) {
        this.realpay = realpay;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Double getPostfee() {
        return postfee;
    }

    public void setPostfee(Double postfee) {
        this.postfee = postfee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(Date paymenttime) {
        this.paymenttime = paymenttime;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
    }

    public String getShippingname() {
        return shippingname;
    }

    public void setShippingname(String shippingname) {
        this.shippingname = shippingname;
    }

    public String getShippingcode() {
        return shippingcode;
    }

    public void setShippingcode(String shippingcode) {
        this.shippingcode = shippingcode;
    }

    public String getBuyerrequest() {
        return buyerrequest;
    }

    public void setBuyerrequest(String buyerrequest) {
        this.buyerrequest = buyerrequest;
    }

    public Integer getTotalcredit() {
        return totalcredit;
    }

    public void setTotalcredit(Integer totalcredit) {
        this.totalcredit = totalcredit;
    }

    public String getProducttypename() {
        return producttypename;
    }

    public void setProducttypename(String producttypename) {
        this.producttypename = producttypename;
    }


    @Override
    public String toString() {
        return "OrderService{" +
                "orderproductid=" + orderproductid +
                ", productid=" + productid +
                ", orderid=" + orderid +
                ", shoppingcount=" + shoppingcount +
                ", totalmoneycount=" + totalmoneycount +
                ", productprice=" + productprice +
                ", productname='" + productname + '\'' +
                ", productpicture='" + productpicture + '\'' +
                ", productnew=" + productnew +
                ", producthotsale='" + producthotsale + '\'' +
                ", productdisabled='" + productdisabled + '\'' +
                ", productcredits='" + productcredits + '\'' +
                ", userid=" + userid +
                ", amountpay=" + amountpay +
                ", realpay=" + realpay +
                ", paytype=" + paytype +
                ", postfee=" + postfee +
                ", status=" + status +
                ", paystatus=" + paystatus +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", paymenttime=" + paymenttime +
                ", sendtime=" + sendtime +
                ", endtime=" + endtime +
                ", closetime=" + closetime +
                ", shippingname='" + shippingname + '\'' +
                ", shippingcode='" + shippingcode + '\'' +
                ", buyerrequest='" + buyerrequest + '\'' +
                ", totalcredit=" + totalcredit +
                ", producttypename='" + producttypename + '\'' +
                '}';
    }
}
