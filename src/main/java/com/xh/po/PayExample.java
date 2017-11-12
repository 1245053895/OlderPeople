package com.xh.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayExample() {
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

        public Criteria andPayidIsNull() {
            addCriterion("PayId is null");
            return (Criteria) this;
        }

        public Criteria andPayidIsNotNull() {
            addCriterion("PayId is not null");
            return (Criteria) this;
        }

        public Criteria andPayidEqualTo(Integer value) {
            addCriterion("PayId =", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotEqualTo(Integer value) {
            addCriterion("PayId <>", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThan(Integer value) {
            addCriterion("PayId >", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayId >=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThan(Integer value) {
            addCriterion("PayId <", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThanOrEqualTo(Integer value) {
            addCriterion("PayId <=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidIn(List<Integer> values) {
            addCriterion("PayId in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotIn(List<Integer> values) {
            addCriterion("PayId not in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidBetween(Integer value1, Integer value2) {
            addCriterion("PayId between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotBetween(Integer value1, Integer value2) {
            addCriterion("PayId not between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPaynameIsNull() {
            addCriterion("PayName is null");
            return (Criteria) this;
        }

        public Criteria andPaynameIsNotNull() {
            addCriterion("PayName is not null");
            return (Criteria) this;
        }

        public Criteria andPaynameEqualTo(String value) {
            addCriterion("PayName =", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotEqualTo(String value) {
            addCriterion("PayName <>", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameGreaterThan(String value) {
            addCriterion("PayName >", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameGreaterThanOrEqualTo(String value) {
            addCriterion("PayName >=", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLessThan(String value) {
            addCriterion("PayName <", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLessThanOrEqualTo(String value) {
            addCriterion("PayName <=", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLike(String value) {
            addCriterion("PayName like", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotLike(String value) {
            addCriterion("PayName not like", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameIn(List<String> values) {
            addCriterion("PayName in", values, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotIn(List<String> values) {
            addCriterion("PayName not in", values, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameBetween(String value1, String value2) {
            addCriterion("PayName between", value1, value2, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotBetween(String value1, String value2) {
            addCriterion("PayName not between", value1, value2, "payname");
            return (Criteria) this;
        }

        public Criteria andPaypictureIsNull() {
            addCriterion("PayPicture is null");
            return (Criteria) this;
        }

        public Criteria andPaypictureIsNotNull() {
            addCriterion("PayPicture is not null");
            return (Criteria) this;
        }

        public Criteria andPaypictureEqualTo(String value) {
            addCriterion("PayPicture =", value, "paypicture");
            return (Criteria) this;
        }

        public Criteria andPaypictureNotEqualTo(String value) {
            addCriterion("PayPicture <>", value, "paypicture");
            return (Criteria) this;
        }

        public Criteria andPaypictureGreaterThan(String value) {
            addCriterion("PayPicture >", value, "paypicture");
            return (Criteria) this;
        }

        public Criteria andPaypictureGreaterThanOrEqualTo(String value) {
            addCriterion("PayPicture >=", value, "paypicture");
            return (Criteria) this;
        }

        public Criteria andPaypictureLessThan(String value) {
            addCriterion("PayPicture <", value, "paypicture");
            return (Criteria) this;
        }

        public Criteria andPaypictureLessThanOrEqualTo(String value) {
            addCriterion("PayPicture <=", value, "paypicture");
            return (Criteria) this;
        }

        public Criteria andPaypictureLike(String value) {
            addCriterion("PayPicture like", value, "paypicture");
            return (Criteria) this;
        }

        public Criteria andPaypictureNotLike(String value) {
            addCriterion("PayPicture not like", value, "paypicture");
            return (Criteria) this;
        }

        public Criteria andPaypictureIn(List<String> values) {
            addCriterion("PayPicture in", values, "paypicture");
            return (Criteria) this;
        }

        public Criteria andPaypictureNotIn(List<String> values) {
            addCriterion("PayPicture not in", values, "paypicture");
            return (Criteria) this;
        }

        public Criteria andPaypictureBetween(String value1, String value2) {
            addCriterion("PayPicture between", value1, value2, "paypicture");
            return (Criteria) this;
        }

        public Criteria andPaypictureNotBetween(String value1, String value2) {
            addCriterion("PayPicture not between", value1, value2, "paypicture");
            return (Criteria) this;
        }

        public Criteria andPayAIsNull() {
            addCriterion("Pay_A is null");
            return (Criteria) this;
        }

        public Criteria andPayAIsNotNull() {
            addCriterion("Pay_A is not null");
            return (Criteria) this;
        }

        public Criteria andPayAEqualTo(Date value) {
            addCriterion("Pay_A =", value, "payA");
            return (Criteria) this;
        }

        public Criteria andPayANotEqualTo(Date value) {
            addCriterion("Pay_A <>", value, "payA");
            return (Criteria) this;
        }

        public Criteria andPayAGreaterThan(Date value) {
            addCriterion("Pay_A >", value, "payA");
            return (Criteria) this;
        }

        public Criteria andPayAGreaterThanOrEqualTo(Date value) {
            addCriterion("Pay_A >=", value, "payA");
            return (Criteria) this;
        }

        public Criteria andPayALessThan(Date value) {
            addCriterion("Pay_A <", value, "payA");
            return (Criteria) this;
        }

        public Criteria andPayALessThanOrEqualTo(Date value) {
            addCriterion("Pay_A <=", value, "payA");
            return (Criteria) this;
        }

        public Criteria andPayAIn(List<Date> values) {
            addCriterion("Pay_A in", values, "payA");
            return (Criteria) this;
        }

        public Criteria andPayANotIn(List<Date> values) {
            addCriterion("Pay_A not in", values, "payA");
            return (Criteria) this;
        }

        public Criteria andPayABetween(Date value1, Date value2) {
            addCriterion("Pay_A between", value1, value2, "payA");
            return (Criteria) this;
        }

        public Criteria andPayANotBetween(Date value1, Date value2) {
            addCriterion("Pay_A not between", value1, value2, "payA");
            return (Criteria) this;
        }

        public Criteria andPayBIsNull() {
            addCriterion("Pay_B is null");
            return (Criteria) this;
        }

        public Criteria andPayBIsNotNull() {
            addCriterion("Pay_B is not null");
            return (Criteria) this;
        }

        public Criteria andPayBEqualTo(String value) {
            addCriterion("Pay_B =", value, "payB");
            return (Criteria) this;
        }

        public Criteria andPayBNotEqualTo(String value) {
            addCriterion("Pay_B <>", value, "payB");
            return (Criteria) this;
        }

        public Criteria andPayBGreaterThan(String value) {
            addCriterion("Pay_B >", value, "payB");
            return (Criteria) this;
        }

        public Criteria andPayBGreaterThanOrEqualTo(String value) {
            addCriterion("Pay_B >=", value, "payB");
            return (Criteria) this;
        }

        public Criteria andPayBLessThan(String value) {
            addCriterion("Pay_B <", value, "payB");
            return (Criteria) this;
        }

        public Criteria andPayBLessThanOrEqualTo(String value) {
            addCriterion("Pay_B <=", value, "payB");
            return (Criteria) this;
        }

        public Criteria andPayBLike(String value) {
            addCriterion("Pay_B like", value, "payB");
            return (Criteria) this;
        }

        public Criteria andPayBNotLike(String value) {
            addCriterion("Pay_B not like", value, "payB");
            return (Criteria) this;
        }

        public Criteria andPayBIn(List<String> values) {
            addCriterion("Pay_B in", values, "payB");
            return (Criteria) this;
        }

        public Criteria andPayBNotIn(List<String> values) {
            addCriterion("Pay_B not in", values, "payB");
            return (Criteria) this;
        }

        public Criteria andPayBBetween(String value1, String value2) {
            addCriterion("Pay_B between", value1, value2, "payB");
            return (Criteria) this;
        }

        public Criteria andPayBNotBetween(String value1, String value2) {
            addCriterion("Pay_B not between", value1, value2, "payB");
            return (Criteria) this;
        }

        public Criteria andPayCIsNull() {
            addCriterion("Pay_C is null");
            return (Criteria) this;
        }

        public Criteria andPayCIsNotNull() {
            addCriterion("Pay_C is not null");
            return (Criteria) this;
        }

        public Criteria andPayCEqualTo(String value) {
            addCriterion("Pay_C =", value, "payC");
            return (Criteria) this;
        }

        public Criteria andPayCNotEqualTo(String value) {
            addCriterion("Pay_C <>", value, "payC");
            return (Criteria) this;
        }

        public Criteria andPayCGreaterThan(String value) {
            addCriterion("Pay_C >", value, "payC");
            return (Criteria) this;
        }

        public Criteria andPayCGreaterThanOrEqualTo(String value) {
            addCriterion("Pay_C >=", value, "payC");
            return (Criteria) this;
        }

        public Criteria andPayCLessThan(String value) {
            addCriterion("Pay_C <", value, "payC");
            return (Criteria) this;
        }

        public Criteria andPayCLessThanOrEqualTo(String value) {
            addCriterion("Pay_C <=", value, "payC");
            return (Criteria) this;
        }

        public Criteria andPayCLike(String value) {
            addCriterion("Pay_C like", value, "payC");
            return (Criteria) this;
        }

        public Criteria andPayCNotLike(String value) {
            addCriterion("Pay_C not like", value, "payC");
            return (Criteria) this;
        }

        public Criteria andPayCIn(List<String> values) {
            addCriterion("Pay_C in", values, "payC");
            return (Criteria) this;
        }

        public Criteria andPayCNotIn(List<String> values) {
            addCriterion("Pay_C not in", values, "payC");
            return (Criteria) this;
        }

        public Criteria andPayCBetween(String value1, String value2) {
            addCriterion("Pay_C between", value1, value2, "payC");
            return (Criteria) this;
        }

        public Criteria andPayCNotBetween(String value1, String value2) {
            addCriterion("Pay_C not between", value1, value2, "payC");
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