package com.xh.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProductidIsNull() {
            addCriterion("ProductId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("ProductId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("ProductId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("ProductId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("ProductId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("ProductId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("ProductId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("ProductId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("ProductId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("ProductId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIsNull() {
            addCriterion("ProductTypeId is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIsNotNull() {
            addCriterion("ProductTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeidEqualTo(Integer value) {
            addCriterion("ProductTypeId =", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotEqualTo(Integer value) {
            addCriterion("ProductTypeId <>", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidGreaterThan(Integer value) {
            addCriterion("ProductTypeId >", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductTypeId >=", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidLessThan(Integer value) {
            addCriterion("ProductTypeId <", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidLessThanOrEqualTo(Integer value) {
            addCriterion("ProductTypeId <=", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIn(List<Integer> values) {
            addCriterion("ProductTypeId in", values, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotIn(List<Integer> values) {
            addCriterion("ProductTypeId not in", values, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidBetween(Integer value1, Integer value2) {
            addCriterion("ProductTypeId between", value1, value2, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductTypeId not between", value1, value2, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("ProductName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("ProductName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("ProductName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("ProductName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("ProductName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("ProductName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("ProductName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("ProductName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("ProductName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("ProductName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("ProductName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("ProductName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("ProductName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNull() {
            addCriterion("ProductPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNotNull() {
            addCriterion("ProductPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductpriceEqualTo(Double value) {
            addCriterion("ProductPrice =", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotEqualTo(Double value) {
            addCriterion("ProductPrice <>", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThan(Double value) {
            addCriterion("ProductPrice >", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ProductPrice >=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThan(Double value) {
            addCriterion("ProductPrice <", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThanOrEqualTo(Double value) {
            addCriterion("ProductPrice <=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceIn(List<Double> values) {
            addCriterion("ProductPrice in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotIn(List<Double> values) {
            addCriterion("ProductPrice not in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceBetween(Double value1, Double value2) {
            addCriterion("ProductPrice between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotBetween(Double value1, Double value2) {
            addCriterion("ProductPrice not between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andPicturesizesIsNull() {
            addCriterion("PictureSizes is null");
            return (Criteria) this;
        }

        public Criteria andPicturesizesIsNotNull() {
            addCriterion("PictureSizes is not null");
            return (Criteria) this;
        }

        public Criteria andPicturesizesEqualTo(String value) {
            addCriterion("PictureSizes =", value, "picturesizes");
            return (Criteria) this;
        }

        public Criteria andPicturesizesNotEqualTo(String value) {
            addCriterion("PictureSizes <>", value, "picturesizes");
            return (Criteria) this;
        }

        public Criteria andPicturesizesGreaterThan(String value) {
            addCriterion("PictureSizes >", value, "picturesizes");
            return (Criteria) this;
        }

        public Criteria andPicturesizesGreaterThanOrEqualTo(String value) {
            addCriterion("PictureSizes >=", value, "picturesizes");
            return (Criteria) this;
        }

        public Criteria andPicturesizesLessThan(String value) {
            addCriterion("PictureSizes <", value, "picturesizes");
            return (Criteria) this;
        }

        public Criteria andPicturesizesLessThanOrEqualTo(String value) {
            addCriterion("PictureSizes <=", value, "picturesizes");
            return (Criteria) this;
        }

        public Criteria andPicturesizesLike(String value) {
            addCriterion("PictureSizes like", value, "picturesizes");
            return (Criteria) this;
        }

        public Criteria andPicturesizesNotLike(String value) {
            addCriterion("PictureSizes not like", value, "picturesizes");
            return (Criteria) this;
        }

        public Criteria andPicturesizesIn(List<String> values) {
            addCriterion("PictureSizes in", values, "picturesizes");
            return (Criteria) this;
        }

        public Criteria andPicturesizesNotIn(List<String> values) {
            addCriterion("PictureSizes not in", values, "picturesizes");
            return (Criteria) this;
        }

        public Criteria andPicturesizesBetween(String value1, String value2) {
            addCriterion("PictureSizes between", value1, value2, "picturesizes");
            return (Criteria) this;
        }

        public Criteria andPicturesizesNotBetween(String value1, String value2) {
            addCriterion("PictureSizes not between", value1, value2, "picturesizes");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsIsNull() {
            addCriterion("PictureColors is null");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsIsNotNull() {
            addCriterion("PictureColors is not null");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsEqualTo(String value) {
            addCriterion("PictureColors =", value, "picturecolors");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsNotEqualTo(String value) {
            addCriterion("PictureColors <>", value, "picturecolors");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsGreaterThan(String value) {
            addCriterion("PictureColors >", value, "picturecolors");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsGreaterThanOrEqualTo(String value) {
            addCriterion("PictureColors >=", value, "picturecolors");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsLessThan(String value) {
            addCriterion("PictureColors <", value, "picturecolors");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsLessThanOrEqualTo(String value) {
            addCriterion("PictureColors <=", value, "picturecolors");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsLike(String value) {
            addCriterion("PictureColors like", value, "picturecolors");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsNotLike(String value) {
            addCriterion("PictureColors not like", value, "picturecolors");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsIn(List<String> values) {
            addCriterion("PictureColors in", values, "picturecolors");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsNotIn(List<String> values) {
            addCriterion("PictureColors not in", values, "picturecolors");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsBetween(String value1, String value2) {
            addCriterion("PictureColors between", value1, value2, "picturecolors");
            return (Criteria) this;
        }

        public Criteria andPicturecolorsNotBetween(String value1, String value2) {
            addCriterion("PictureColors not between", value1, value2, "picturecolors");
            return (Criteria) this;
        }

        public Criteria andProductlookcountIsNull() {
            addCriterion("ProductLookCount is null");
            return (Criteria) this;
        }

        public Criteria andProductlookcountIsNotNull() {
            addCriterion("ProductLookCount is not null");
            return (Criteria) this;
        }

        public Criteria andProductlookcountEqualTo(Integer value) {
            addCriterion("ProductLookCount =", value, "productlookcount");
            return (Criteria) this;
        }

        public Criteria andProductlookcountNotEqualTo(Integer value) {
            addCriterion("ProductLookCount <>", value, "productlookcount");
            return (Criteria) this;
        }

        public Criteria andProductlookcountGreaterThan(Integer value) {
            addCriterion("ProductLookCount >", value, "productlookcount");
            return (Criteria) this;
        }

        public Criteria andProductlookcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductLookCount >=", value, "productlookcount");
            return (Criteria) this;
        }

        public Criteria andProductlookcountLessThan(Integer value) {
            addCriterion("ProductLookCount <", value, "productlookcount");
            return (Criteria) this;
        }

        public Criteria andProductlookcountLessThanOrEqualTo(Integer value) {
            addCriterion("ProductLookCount <=", value, "productlookcount");
            return (Criteria) this;
        }

        public Criteria andProductlookcountIn(List<Integer> values) {
            addCriterion("ProductLookCount in", values, "productlookcount");
            return (Criteria) this;
        }

        public Criteria andProductlookcountNotIn(List<Integer> values) {
            addCriterion("ProductLookCount not in", values, "productlookcount");
            return (Criteria) this;
        }

        public Criteria andProductlookcountBetween(Integer value1, Integer value2) {
            addCriterion("ProductLookCount between", value1, value2, "productlookcount");
            return (Criteria) this;
        }

        public Criteria andProductlookcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductLookCount not between", value1, value2, "productlookcount");
            return (Criteria) this;
        }

        public Criteria andProductdescribeIsNull() {
            addCriterion("ProductDescribe is null");
            return (Criteria) this;
        }

        public Criteria andProductdescribeIsNotNull() {
            addCriterion("ProductDescribe is not null");
            return (Criteria) this;
        }

        public Criteria andProductdescribeEqualTo(String value) {
            addCriterion("ProductDescribe =", value, "productdescribe");
            return (Criteria) this;
        }

        public Criteria andProductdescribeNotEqualTo(String value) {
            addCriterion("ProductDescribe <>", value, "productdescribe");
            return (Criteria) this;
        }

        public Criteria andProductdescribeGreaterThan(String value) {
            addCriterion("ProductDescribe >", value, "productdescribe");
            return (Criteria) this;
        }

        public Criteria andProductdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("ProductDescribe >=", value, "productdescribe");
            return (Criteria) this;
        }

        public Criteria andProductdescribeLessThan(String value) {
            addCriterion("ProductDescribe <", value, "productdescribe");
            return (Criteria) this;
        }

        public Criteria andProductdescribeLessThanOrEqualTo(String value) {
            addCriterion("ProductDescribe <=", value, "productdescribe");
            return (Criteria) this;
        }

        public Criteria andProductdescribeLike(String value) {
            addCriterion("ProductDescribe like", value, "productdescribe");
            return (Criteria) this;
        }

        public Criteria andProductdescribeNotLike(String value) {
            addCriterion("ProductDescribe not like", value, "productdescribe");
            return (Criteria) this;
        }

        public Criteria andProductdescribeIn(List<String> values) {
            addCriterion("ProductDescribe in", values, "productdescribe");
            return (Criteria) this;
        }

        public Criteria andProductdescribeNotIn(List<String> values) {
            addCriterion("ProductDescribe not in", values, "productdescribe");
            return (Criteria) this;
        }

        public Criteria andProductdescribeBetween(String value1, String value2) {
            addCriterion("ProductDescribe between", value1, value2, "productdescribe");
            return (Criteria) this;
        }

        public Criteria andProductdescribeNotBetween(String value1, String value2) {
            addCriterion("ProductDescribe not between", value1, value2, "productdescribe");
            return (Criteria) this;
        }

        public Criteria andProductstoretimeIsNull() {
            addCriterion("ProductStoreTime is null");
            return (Criteria) this;
        }

        public Criteria andProductstoretimeIsNotNull() {
            addCriterion("ProductStoreTime is not null");
            return (Criteria) this;
        }

        public Criteria andProductstoretimeEqualTo(Date value) {
            addCriterion("ProductStoreTime =", value, "productstoretime");
            return (Criteria) this;
        }

        public Criteria andProductstoretimeNotEqualTo(Date value) {
            addCriterion("ProductStoreTime <>", value, "productstoretime");
            return (Criteria) this;
        }

        public Criteria andProductstoretimeGreaterThan(Date value) {
            addCriterion("ProductStoreTime >", value, "productstoretime");
            return (Criteria) this;
        }

        public Criteria andProductstoretimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ProductStoreTime >=", value, "productstoretime");
            return (Criteria) this;
        }

        public Criteria andProductstoretimeLessThan(Date value) {
            addCriterion("ProductStoreTime <", value, "productstoretime");
            return (Criteria) this;
        }

        public Criteria andProductstoretimeLessThanOrEqualTo(Date value) {
            addCriterion("ProductStoreTime <=", value, "productstoretime");
            return (Criteria) this;
        }

        public Criteria andProductstoretimeIn(List<Date> values) {
            addCriterion("ProductStoreTime in", values, "productstoretime");
            return (Criteria) this;
        }

        public Criteria andProductstoretimeNotIn(List<Date> values) {
            addCriterion("ProductStoreTime not in", values, "productstoretime");
            return (Criteria) this;
        }

        public Criteria andProductstoretimeBetween(Date value1, Date value2) {
            addCriterion("ProductStoreTime between", value1, value2, "productstoretime");
            return (Criteria) this;
        }

        public Criteria andProductstoretimeNotBetween(Date value1, Date value2) {
            addCriterion("ProductStoreTime not between", value1, value2, "productstoretime");
            return (Criteria) this;
        }

        public Criteria andProductpictureIsNull() {
            addCriterion("ProductPicture is null");
            return (Criteria) this;
        }

        public Criteria andProductpictureIsNotNull() {
            addCriterion("ProductPicture is not null");
            return (Criteria) this;
        }

        public Criteria andProductpictureEqualTo(String value) {
            addCriterion("ProductPicture =", value, "productpicture");
            return (Criteria) this;
        }

        public Criteria andProductpictureNotEqualTo(String value) {
            addCriterion("ProductPicture <>", value, "productpicture");
            return (Criteria) this;
        }

        public Criteria andProductpictureGreaterThan(String value) {
            addCriterion("ProductPicture >", value, "productpicture");
            return (Criteria) this;
        }

        public Criteria andProductpictureGreaterThanOrEqualTo(String value) {
            addCriterion("ProductPicture >=", value, "productpicture");
            return (Criteria) this;
        }

        public Criteria andProductpictureLessThan(String value) {
            addCriterion("ProductPicture <", value, "productpicture");
            return (Criteria) this;
        }

        public Criteria andProductpictureLessThanOrEqualTo(String value) {
            addCriterion("ProductPicture <=", value, "productpicture");
            return (Criteria) this;
        }

        public Criteria andProductpictureLike(String value) {
            addCriterion("ProductPicture like", value, "productpicture");
            return (Criteria) this;
        }

        public Criteria andProductpictureNotLike(String value) {
            addCriterion("ProductPicture not like", value, "productpicture");
            return (Criteria) this;
        }

        public Criteria andProductpictureIn(List<String> values) {
            addCriterion("ProductPicture in", values, "productpicture");
            return (Criteria) this;
        }

        public Criteria andProductpictureNotIn(List<String> values) {
            addCriterion("ProductPicture not in", values, "productpicture");
            return (Criteria) this;
        }

        public Criteria andProductpictureBetween(String value1, String value2) {
            addCriterion("ProductPicture between", value1, value2, "productpicture");
            return (Criteria) this;
        }

        public Criteria andProductpictureNotBetween(String value1, String value2) {
            addCriterion("ProductPicture not between", value1, value2, "productpicture");
            return (Criteria) this;
        }

        public Criteria andProductnewIsNull() {
            addCriterion("ProductNew is null");
            return (Criteria) this;
        }

        public Criteria andProductnewIsNotNull() {
            addCriterion("ProductNew is not null");
            return (Criteria) this;
        }

        public Criteria andProductnewEqualTo(Integer value) {
            addCriterion("ProductNew =", value, "productnew");
            return (Criteria) this;
        }

        public Criteria andProductnewNotEqualTo(Integer value) {
            addCriterion("ProductNew <>", value, "productnew");
            return (Criteria) this;
        }

        public Criteria andProductnewGreaterThan(Integer value) {
            addCriterion("ProductNew >", value, "productnew");
            return (Criteria) this;
        }

        public Criteria andProductnewGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductNew >=", value, "productnew");
            return (Criteria) this;
        }

        public Criteria andProductnewLessThan(Integer value) {
            addCriterion("ProductNew <", value, "productnew");
            return (Criteria) this;
        }

        public Criteria andProductnewLessThanOrEqualTo(Integer value) {
            addCriterion("ProductNew <=", value, "productnew");
            return (Criteria) this;
        }

        public Criteria andProductnewIn(List<Integer> values) {
            addCriterion("ProductNew in", values, "productnew");
            return (Criteria) this;
        }

        public Criteria andProductnewNotIn(List<Integer> values) {
            addCriterion("ProductNew not in", values, "productnew");
            return (Criteria) this;
        }

        public Criteria andProductnewBetween(Integer value1, Integer value2) {
            addCriterion("ProductNew between", value1, value2, "productnew");
            return (Criteria) this;
        }

        public Criteria andProductnewNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductNew not between", value1, value2, "productnew");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleIsNull() {
            addCriterion("ProducthotSale is null");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleIsNotNull() {
            addCriterion("ProducthotSale is not null");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleEqualTo(String value) {
            addCriterion("ProducthotSale =", value, "producthotsale");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleNotEqualTo(String value) {
            addCriterion("ProducthotSale <>", value, "producthotsale");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleGreaterThan(String value) {
            addCriterion("ProducthotSale >", value, "producthotsale");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleGreaterThanOrEqualTo(String value) {
            addCriterion("ProducthotSale >=", value, "producthotsale");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleLessThan(String value) {
            addCriterion("ProducthotSale <", value, "producthotsale");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleLessThanOrEqualTo(String value) {
            addCriterion("ProducthotSale <=", value, "producthotsale");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleLike(String value) {
            addCriterion("ProducthotSale like", value, "producthotsale");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleNotLike(String value) {
            addCriterion("ProducthotSale not like", value, "producthotsale");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleIn(List<String> values) {
            addCriterion("ProducthotSale in", values, "producthotsale");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleNotIn(List<String> values) {
            addCriterion("ProducthotSale not in", values, "producthotsale");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleBetween(String value1, String value2) {
            addCriterion("ProducthotSale between", value1, value2, "producthotsale");
            return (Criteria) this;
        }

        public Criteria andProducthotsaleNotBetween(String value1, String value2) {
            addCriterion("ProducthotSale not between", value1, value2, "producthotsale");
            return (Criteria) this;
        }

        public Criteria andProductdisabledIsNull() {
            addCriterion("ProductDisabled is null");
            return (Criteria) this;
        }

        public Criteria andProductdisabledIsNotNull() {
            addCriterion("ProductDisabled is not null");
            return (Criteria) this;
        }

        public Criteria andProductdisabledEqualTo(String value) {
            addCriterion("ProductDisabled =", value, "productdisabled");
            return (Criteria) this;
        }

        public Criteria andProductdisabledNotEqualTo(String value) {
            addCriterion("ProductDisabled <>", value, "productdisabled");
            return (Criteria) this;
        }

        public Criteria andProductdisabledGreaterThan(String value) {
            addCriterion("ProductDisabled >", value, "productdisabled");
            return (Criteria) this;
        }

        public Criteria andProductdisabledGreaterThanOrEqualTo(String value) {
            addCriterion("ProductDisabled >=", value, "productdisabled");
            return (Criteria) this;
        }

        public Criteria andProductdisabledLessThan(String value) {
            addCriterion("ProductDisabled <", value, "productdisabled");
            return (Criteria) this;
        }

        public Criteria andProductdisabledLessThanOrEqualTo(String value) {
            addCriterion("ProductDisabled <=", value, "productdisabled");
            return (Criteria) this;
        }

        public Criteria andProductdisabledLike(String value) {
            addCriterion("ProductDisabled like", value, "productdisabled");
            return (Criteria) this;
        }

        public Criteria andProductdisabledNotLike(String value) {
            addCriterion("ProductDisabled not like", value, "productdisabled");
            return (Criteria) this;
        }

        public Criteria andProductdisabledIn(List<String> values) {
            addCriterion("ProductDisabled in", values, "productdisabled");
            return (Criteria) this;
        }

        public Criteria andProductdisabledNotIn(List<String> values) {
            addCriterion("ProductDisabled not in", values, "productdisabled");
            return (Criteria) this;
        }

        public Criteria andProductdisabledBetween(String value1, String value2) {
            addCriterion("ProductDisabled between", value1, value2, "productdisabled");
            return (Criteria) this;
        }

        public Criteria andProductdisabledNotBetween(String value1, String value2) {
            addCriterion("ProductDisabled not between", value1, value2, "productdisabled");
            return (Criteria) this;
        }

        public Criteria andProductcreditsIsNull() {
            addCriterion("ProductCredits is null");
            return (Criteria) this;
        }

        public Criteria andProductcreditsIsNotNull() {
            addCriterion("ProductCredits is not null");
            return (Criteria) this;
        }

        public Criteria andProductcreditsEqualTo(String value) {
            addCriterion("ProductCredits =", value, "productcredits");
            return (Criteria) this;
        }

        public Criteria andProductcreditsNotEqualTo(String value) {
            addCriterion("ProductCredits <>", value, "productcredits");
            return (Criteria) this;
        }

        public Criteria andProductcreditsGreaterThan(String value) {
            addCriterion("ProductCredits >", value, "productcredits");
            return (Criteria) this;
        }

        public Criteria andProductcreditsGreaterThanOrEqualTo(String value) {
            addCriterion("ProductCredits >=", value, "productcredits");
            return (Criteria) this;
        }

        public Criteria andProductcreditsLessThan(String value) {
            addCriterion("ProductCredits <", value, "productcredits");
            return (Criteria) this;
        }

        public Criteria andProductcreditsLessThanOrEqualTo(String value) {
            addCriterion("ProductCredits <=", value, "productcredits");
            return (Criteria) this;
        }

        public Criteria andProductcreditsLike(String value) {
            addCriterion("ProductCredits like", value, "productcredits");
            return (Criteria) this;
        }

        public Criteria andProductcreditsNotLike(String value) {
            addCriterion("ProductCredits not like", value, "productcredits");
            return (Criteria) this;
        }

        public Criteria andProductcreditsIn(List<String> values) {
            addCriterion("ProductCredits in", values, "productcredits");
            return (Criteria) this;
        }

        public Criteria andProductcreditsNotIn(List<String> values) {
            addCriterion("ProductCredits not in", values, "productcredits");
            return (Criteria) this;
        }

        public Criteria andProductcreditsBetween(String value1, String value2) {
            addCriterion("ProductCredits between", value1, value2, "productcredits");
            return (Criteria) this;
        }

        public Criteria andProductcreditsNotBetween(String value1, String value2) {
            addCriterion("ProductCredits not between", value1, value2, "productcredits");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeIsNull() {
            addCriterion("ProductCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeIsNotNull() {
            addCriterion("ProductCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeEqualTo(Date value) {
            addCriterion("ProductCreateTime =", value, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeNotEqualTo(Date value) {
            addCriterion("ProductCreateTime <>", value, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeGreaterThan(Date value) {
            addCriterion("ProductCreateTime >", value, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ProductCreateTime >=", value, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeLessThan(Date value) {
            addCriterion("ProductCreateTime <", value, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ProductCreateTime <=", value, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeIn(List<Date> values) {
            addCriterion("ProductCreateTime in", values, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeNotIn(List<Date> values) {
            addCriterion("ProductCreateTime not in", values, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeBetween(Date value1, Date value2) {
            addCriterion("ProductCreateTime between", value1, value2, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ProductCreateTime not between", value1, value2, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductAIsNull() {
            addCriterion("Product_A is null");
            return (Criteria) this;
        }

        public Criteria andProductAIsNotNull() {
            addCriterion("Product_A is not null");
            return (Criteria) this;
        }

        public Criteria andProductAEqualTo(String value) {
            addCriterion("Product_A =", value, "productA");
            return (Criteria) this;
        }

        public Criteria andProductANotEqualTo(String value) {
            addCriterion("Product_A <>", value, "productA");
            return (Criteria) this;
        }

        public Criteria andProductAGreaterThan(String value) {
            addCriterion("Product_A >", value, "productA");
            return (Criteria) this;
        }

        public Criteria andProductAGreaterThanOrEqualTo(String value) {
            addCriterion("Product_A >=", value, "productA");
            return (Criteria) this;
        }

        public Criteria andProductALessThan(String value) {
            addCriterion("Product_A <", value, "productA");
            return (Criteria) this;
        }

        public Criteria andProductALessThanOrEqualTo(String value) {
            addCriterion("Product_A <=", value, "productA");
            return (Criteria) this;
        }

        public Criteria andProductALike(String value) {
            addCriterion("Product_A like", value, "productA");
            return (Criteria) this;
        }

        public Criteria andProductANotLike(String value) {
            addCriterion("Product_A not like", value, "productA");
            return (Criteria) this;
        }

        public Criteria andProductAIn(List<String> values) {
            addCriterion("Product_A in", values, "productA");
            return (Criteria) this;
        }

        public Criteria andProductANotIn(List<String> values) {
            addCriterion("Product_A not in", values, "productA");
            return (Criteria) this;
        }

        public Criteria andProductABetween(String value1, String value2) {
            addCriterion("Product_A between", value1, value2, "productA");
            return (Criteria) this;
        }

        public Criteria andProductANotBetween(String value1, String value2) {
            addCriterion("Product_A not between", value1, value2, "productA");
            return (Criteria) this;
        }

        public Criteria andProductBIsNull() {
            addCriterion("Product_B is null");
            return (Criteria) this;
        }

        public Criteria andProductBIsNotNull() {
            addCriterion("Product_B is not null");
            return (Criteria) this;
        }

        public Criteria andProductBEqualTo(String value) {
            addCriterion("Product_B =", value, "productB");
            return (Criteria) this;
        }

        public Criteria andProductBNotEqualTo(String value) {
            addCriterion("Product_B <>", value, "productB");
            return (Criteria) this;
        }

        public Criteria andProductBGreaterThan(String value) {
            addCriterion("Product_B >", value, "productB");
            return (Criteria) this;
        }

        public Criteria andProductBGreaterThanOrEqualTo(String value) {
            addCriterion("Product_B >=", value, "productB");
            return (Criteria) this;
        }

        public Criteria andProductBLessThan(String value) {
            addCriterion("Product_B <", value, "productB");
            return (Criteria) this;
        }

        public Criteria andProductBLessThanOrEqualTo(String value) {
            addCriterion("Product_B <=", value, "productB");
            return (Criteria) this;
        }

        public Criteria andProductBLike(String value) {
            addCriterion("Product_B like", value, "productB");
            return (Criteria) this;
        }

        public Criteria andProductBNotLike(String value) {
            addCriterion("Product_B not like", value, "productB");
            return (Criteria) this;
        }

        public Criteria andProductBIn(List<String> values) {
            addCriterion("Product_B in", values, "productB");
            return (Criteria) this;
        }

        public Criteria andProductBNotIn(List<String> values) {
            addCriterion("Product_B not in", values, "productB");
            return (Criteria) this;
        }

        public Criteria andProductBBetween(String value1, String value2) {
            addCriterion("Product_B between", value1, value2, "productB");
            return (Criteria) this;
        }

        public Criteria andProductBNotBetween(String value1, String value2) {
            addCriterion("Product_B not between", value1, value2, "productB");
            return (Criteria) this;
        }

        public Criteria andProductCIsNull() {
            addCriterion("Product_C is null");
            return (Criteria) this;
        }

        public Criteria andProductCIsNotNull() {
            addCriterion("Product_C is not null");
            return (Criteria) this;
        }

        public Criteria andProductCEqualTo(String value) {
            addCriterion("Product_C =", value, "productC");
            return (Criteria) this;
        }

        public Criteria andProductCNotEqualTo(String value) {
            addCriterion("Product_C <>", value, "productC");
            return (Criteria) this;
        }

        public Criteria andProductCGreaterThan(String value) {
            addCriterion("Product_C >", value, "productC");
            return (Criteria) this;
        }

        public Criteria andProductCGreaterThanOrEqualTo(String value) {
            addCriterion("Product_C >=", value, "productC");
            return (Criteria) this;
        }

        public Criteria andProductCLessThan(String value) {
            addCriterion("Product_C <", value, "productC");
            return (Criteria) this;
        }

        public Criteria andProductCLessThanOrEqualTo(String value) {
            addCriterion("Product_C <=", value, "productC");
            return (Criteria) this;
        }

        public Criteria andProductCLike(String value) {
            addCriterion("Product_C like", value, "productC");
            return (Criteria) this;
        }

        public Criteria andProductCNotLike(String value) {
            addCriterion("Product_C not like", value, "productC");
            return (Criteria) this;
        }

        public Criteria andProductCIn(List<String> values) {
            addCriterion("Product_C in", values, "productC");
            return (Criteria) this;
        }

        public Criteria andProductCNotIn(List<String> values) {
            addCriterion("Product_C not in", values, "productC");
            return (Criteria) this;
        }

        public Criteria andProductCBetween(String value1, String value2) {
            addCriterion("Product_C between", value1, value2, "productC");
            return (Criteria) this;
        }

        public Criteria andProductCNotBetween(String value1, String value2) {
            addCriterion("Product_C not between", value1, value2, "productC");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}