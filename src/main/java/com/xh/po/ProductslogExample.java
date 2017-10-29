package com.xh.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductslogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductslogExample() {
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

        public Criteria andProductslogidIsNull() {
            addCriterion("ProductsLogId is null");
            return (Criteria) this;
        }

        public Criteria andProductslogidIsNotNull() {
            addCriterion("ProductsLogId is not null");
            return (Criteria) this;
        }

        public Criteria andProductslogidEqualTo(Integer value) {
            addCriterion("ProductsLogId =", value, "productslogid");
            return (Criteria) this;
        }

        public Criteria andProductslogidNotEqualTo(Integer value) {
            addCriterion("ProductsLogId <>", value, "productslogid");
            return (Criteria) this;
        }

        public Criteria andProductslogidGreaterThan(Integer value) {
            addCriterion("ProductsLogId >", value, "productslogid");
            return (Criteria) this;
        }

        public Criteria andProductslogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductsLogId >=", value, "productslogid");
            return (Criteria) this;
        }

        public Criteria andProductslogidLessThan(Integer value) {
            addCriterion("ProductsLogId <", value, "productslogid");
            return (Criteria) this;
        }

        public Criteria andProductslogidLessThanOrEqualTo(Integer value) {
            addCriterion("ProductsLogId <=", value, "productslogid");
            return (Criteria) this;
        }

        public Criteria andProductslogidIn(List<Integer> values) {
            addCriterion("ProductsLogId in", values, "productslogid");
            return (Criteria) this;
        }

        public Criteria andProductslogidNotIn(List<Integer> values) {
            addCriterion("ProductsLogId not in", values, "productslogid");
            return (Criteria) this;
        }

        public Criteria andProductslogidBetween(Integer value1, Integer value2) {
            addCriterion("ProductsLogId between", value1, value2, "productslogid");
            return (Criteria) this;
        }

        public Criteria andProductslogidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductsLogId not between", value1, value2, "productslogid");
            return (Criteria) this;
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

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andStartbrowsetimeIsNull() {
            addCriterion("StartBrowseTime is null");
            return (Criteria) this;
        }

        public Criteria andStartbrowsetimeIsNotNull() {
            addCriterion("StartBrowseTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartbrowsetimeEqualTo(Date value) {
            addCriterion("StartBrowseTime =", value, "startbrowsetime");
            return (Criteria) this;
        }

        public Criteria andStartbrowsetimeNotEqualTo(Date value) {
            addCriterion("StartBrowseTime <>", value, "startbrowsetime");
            return (Criteria) this;
        }

        public Criteria andStartbrowsetimeGreaterThan(Date value) {
            addCriterion("StartBrowseTime >", value, "startbrowsetime");
            return (Criteria) this;
        }

        public Criteria andStartbrowsetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartBrowseTime >=", value, "startbrowsetime");
            return (Criteria) this;
        }

        public Criteria andStartbrowsetimeLessThan(Date value) {
            addCriterion("StartBrowseTime <", value, "startbrowsetime");
            return (Criteria) this;
        }

        public Criteria andStartbrowsetimeLessThanOrEqualTo(Date value) {
            addCriterion("StartBrowseTime <=", value, "startbrowsetime");
            return (Criteria) this;
        }

        public Criteria andStartbrowsetimeIn(List<Date> values) {
            addCriterion("StartBrowseTime in", values, "startbrowsetime");
            return (Criteria) this;
        }

        public Criteria andStartbrowsetimeNotIn(List<Date> values) {
            addCriterion("StartBrowseTime not in", values, "startbrowsetime");
            return (Criteria) this;
        }

        public Criteria andStartbrowsetimeBetween(Date value1, Date value2) {
            addCriterion("StartBrowseTime between", value1, value2, "startbrowsetime");
            return (Criteria) this;
        }

        public Criteria andStartbrowsetimeNotBetween(Date value1, Date value2) {
            addCriterion("StartBrowseTime not between", value1, value2, "startbrowsetime");
            return (Criteria) this;
        }

        public Criteria andEndbrowsetimeIsNull() {
            addCriterion("EndBrowseTime is null");
            return (Criteria) this;
        }

        public Criteria andEndbrowsetimeIsNotNull() {
            addCriterion("EndBrowseTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndbrowsetimeEqualTo(Date value) {
            addCriterion("EndBrowseTime =", value, "endbrowsetime");
            return (Criteria) this;
        }

        public Criteria andEndbrowsetimeNotEqualTo(Date value) {
            addCriterion("EndBrowseTime <>", value, "endbrowsetime");
            return (Criteria) this;
        }

        public Criteria andEndbrowsetimeGreaterThan(Date value) {
            addCriterion("EndBrowseTime >", value, "endbrowsetime");
            return (Criteria) this;
        }

        public Criteria andEndbrowsetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EndBrowseTime >=", value, "endbrowsetime");
            return (Criteria) this;
        }

        public Criteria andEndbrowsetimeLessThan(Date value) {
            addCriterion("EndBrowseTime <", value, "endbrowsetime");
            return (Criteria) this;
        }

        public Criteria andEndbrowsetimeLessThanOrEqualTo(Date value) {
            addCriterion("EndBrowseTime <=", value, "endbrowsetime");
            return (Criteria) this;
        }

        public Criteria andEndbrowsetimeIn(List<Date> values) {
            addCriterion("EndBrowseTime in", values, "endbrowsetime");
            return (Criteria) this;
        }

        public Criteria andEndbrowsetimeNotIn(List<Date> values) {
            addCriterion("EndBrowseTime not in", values, "endbrowsetime");
            return (Criteria) this;
        }

        public Criteria andEndbrowsetimeBetween(Date value1, Date value2) {
            addCriterion("EndBrowseTime between", value1, value2, "endbrowsetime");
            return (Criteria) this;
        }

        public Criteria andEndbrowsetimeNotBetween(Date value1, Date value2) {
            addCriterion("EndBrowseTime not between", value1, value2, "endbrowsetime");
            return (Criteria) this;
        }

        public Criteria andIsshopIsNull() {
            addCriterion("IsShop is null");
            return (Criteria) this;
        }

        public Criteria andIsshopIsNotNull() {
            addCriterion("IsShop is not null");
            return (Criteria) this;
        }

        public Criteria andIsshopEqualTo(Integer value) {
            addCriterion("IsShop =", value, "isshop");
            return (Criteria) this;
        }

        public Criteria andIsshopNotEqualTo(Integer value) {
            addCriterion("IsShop <>", value, "isshop");
            return (Criteria) this;
        }

        public Criteria andIsshopGreaterThan(Integer value) {
            addCriterion("IsShop >", value, "isshop");
            return (Criteria) this;
        }

        public Criteria andIsshopGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsShop >=", value, "isshop");
            return (Criteria) this;
        }

        public Criteria andIsshopLessThan(Integer value) {
            addCriterion("IsShop <", value, "isshop");
            return (Criteria) this;
        }

        public Criteria andIsshopLessThanOrEqualTo(Integer value) {
            addCriterion("IsShop <=", value, "isshop");
            return (Criteria) this;
        }

        public Criteria andIsshopIn(List<Integer> values) {
            addCriterion("IsShop in", values, "isshop");
            return (Criteria) this;
        }

        public Criteria andIsshopNotIn(List<Integer> values) {
            addCriterion("IsShop not in", values, "isshop");
            return (Criteria) this;
        }

        public Criteria andIsshopBetween(Integer value1, Integer value2) {
            addCriterion("IsShop between", value1, value2, "isshop");
            return (Criteria) this;
        }

        public Criteria andIsshopNotBetween(Integer value1, Integer value2) {
            addCriterion("IsShop not between", value1, value2, "isshop");
            return (Criteria) this;
        }

        public Criteria andProductslogAIsNull() {
            addCriterion("ProductsLog_A is null");
            return (Criteria) this;
        }

        public Criteria andProductslogAIsNotNull() {
            addCriterion("ProductsLog_A is not null");
            return (Criteria) this;
        }

        public Criteria andProductslogAEqualTo(String value) {
            addCriterion("ProductsLog_A =", value, "productslogA");
            return (Criteria) this;
        }

        public Criteria andProductslogANotEqualTo(String value) {
            addCriterion("ProductsLog_A <>", value, "productslogA");
            return (Criteria) this;
        }

        public Criteria andProductslogAGreaterThan(String value) {
            addCriterion("ProductsLog_A >", value, "productslogA");
            return (Criteria) this;
        }

        public Criteria andProductslogAGreaterThanOrEqualTo(String value) {
            addCriterion("ProductsLog_A >=", value, "productslogA");
            return (Criteria) this;
        }

        public Criteria andProductslogALessThan(String value) {
            addCriterion("ProductsLog_A <", value, "productslogA");
            return (Criteria) this;
        }

        public Criteria andProductslogALessThanOrEqualTo(String value) {
            addCriterion("ProductsLog_A <=", value, "productslogA");
            return (Criteria) this;
        }

        public Criteria andProductslogALike(String value) {
            addCriterion("ProductsLog_A like", value, "productslogA");
            return (Criteria) this;
        }

        public Criteria andProductslogANotLike(String value) {
            addCriterion("ProductsLog_A not like", value, "productslogA");
            return (Criteria) this;
        }

        public Criteria andProductslogAIn(List<String> values) {
            addCriterion("ProductsLog_A in", values, "productslogA");
            return (Criteria) this;
        }

        public Criteria andProductslogANotIn(List<String> values) {
            addCriterion("ProductsLog_A not in", values, "productslogA");
            return (Criteria) this;
        }

        public Criteria andProductslogABetween(String value1, String value2) {
            addCriterion("ProductsLog_A between", value1, value2, "productslogA");
            return (Criteria) this;
        }

        public Criteria andProductslogANotBetween(String value1, String value2) {
            addCriterion("ProductsLog_A not between", value1, value2, "productslogA");
            return (Criteria) this;
        }

        public Criteria andProductslogBIsNull() {
            addCriterion("ProductsLog_B is null");
            return (Criteria) this;
        }

        public Criteria andProductslogBIsNotNull() {
            addCriterion("ProductsLog_B is not null");
            return (Criteria) this;
        }

        public Criteria andProductslogBEqualTo(String value) {
            addCriterion("ProductsLog_B =", value, "productslogB");
            return (Criteria) this;
        }

        public Criteria andProductslogBNotEqualTo(String value) {
            addCriterion("ProductsLog_B <>", value, "productslogB");
            return (Criteria) this;
        }

        public Criteria andProductslogBGreaterThan(String value) {
            addCriterion("ProductsLog_B >", value, "productslogB");
            return (Criteria) this;
        }

        public Criteria andProductslogBGreaterThanOrEqualTo(String value) {
            addCriterion("ProductsLog_B >=", value, "productslogB");
            return (Criteria) this;
        }

        public Criteria andProductslogBLessThan(String value) {
            addCriterion("ProductsLog_B <", value, "productslogB");
            return (Criteria) this;
        }

        public Criteria andProductslogBLessThanOrEqualTo(String value) {
            addCriterion("ProductsLog_B <=", value, "productslogB");
            return (Criteria) this;
        }

        public Criteria andProductslogBLike(String value) {
            addCriterion("ProductsLog_B like", value, "productslogB");
            return (Criteria) this;
        }

        public Criteria andProductslogBNotLike(String value) {
            addCriterion("ProductsLog_B not like", value, "productslogB");
            return (Criteria) this;
        }

        public Criteria andProductslogBIn(List<String> values) {
            addCriterion("ProductsLog_B in", values, "productslogB");
            return (Criteria) this;
        }

        public Criteria andProductslogBNotIn(List<String> values) {
            addCriterion("ProductsLog_B not in", values, "productslogB");
            return (Criteria) this;
        }

        public Criteria andProductslogBBetween(String value1, String value2) {
            addCriterion("ProductsLog_B between", value1, value2, "productslogB");
            return (Criteria) this;
        }

        public Criteria andProductslogBNotBetween(String value1, String value2) {
            addCriterion("ProductsLog_B not between", value1, value2, "productslogB");
            return (Criteria) this;
        }

        public Criteria andProductslogCIsNull() {
            addCriterion("ProductsLog_c is null");
            return (Criteria) this;
        }

        public Criteria andProductslogCIsNotNull() {
            addCriterion("ProductsLog_c is not null");
            return (Criteria) this;
        }

        public Criteria andProductslogCEqualTo(String value) {
            addCriterion("ProductsLog_c =", value, "productslogC");
            return (Criteria) this;
        }

        public Criteria andProductslogCNotEqualTo(String value) {
            addCriterion("ProductsLog_c <>", value, "productslogC");
            return (Criteria) this;
        }

        public Criteria andProductslogCGreaterThan(String value) {
            addCriterion("ProductsLog_c >", value, "productslogC");
            return (Criteria) this;
        }

        public Criteria andProductslogCGreaterThanOrEqualTo(String value) {
            addCriterion("ProductsLog_c >=", value, "productslogC");
            return (Criteria) this;
        }

        public Criteria andProductslogCLessThan(String value) {
            addCriterion("ProductsLog_c <", value, "productslogC");
            return (Criteria) this;
        }

        public Criteria andProductslogCLessThanOrEqualTo(String value) {
            addCriterion("ProductsLog_c <=", value, "productslogC");
            return (Criteria) this;
        }

        public Criteria andProductslogCLike(String value) {
            addCriterion("ProductsLog_c like", value, "productslogC");
            return (Criteria) this;
        }

        public Criteria andProductslogCNotLike(String value) {
            addCriterion("ProductsLog_c not like", value, "productslogC");
            return (Criteria) this;
        }

        public Criteria andProductslogCIn(List<String> values) {
            addCriterion("ProductsLog_c in", values, "productslogC");
            return (Criteria) this;
        }

        public Criteria andProductslogCNotIn(List<String> values) {
            addCriterion("ProductsLog_c not in", values, "productslogC");
            return (Criteria) this;
        }

        public Criteria andProductslogCBetween(String value1, String value2) {
            addCriterion("ProductsLog_c between", value1, value2, "productslogC");
            return (Criteria) this;
        }

        public Criteria andProductslogCNotBetween(String value1, String value2) {
            addCriterion("ProductsLog_c not between", value1, value2, "productslogC");
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