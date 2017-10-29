package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class GainaddresExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GainaddresExample() {
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

        public Criteria andGainidIsNull() {
            addCriterion("GainId is null");
            return (Criteria) this;
        }

        public Criteria andGainidIsNotNull() {
            addCriterion("GainId is not null");
            return (Criteria) this;
        }

        public Criteria andGainidEqualTo(Integer value) {
            addCriterion("GainId =", value, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidNotEqualTo(Integer value) {
            addCriterion("GainId <>", value, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidGreaterThan(Integer value) {
            addCriterion("GainId >", value, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GainId >=", value, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidLessThan(Integer value) {
            addCriterion("GainId <", value, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidLessThanOrEqualTo(Integer value) {
            addCriterion("GainId <=", value, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidIn(List<Integer> values) {
            addCriterion("GainId in", values, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidNotIn(List<Integer> values) {
            addCriterion("GainId not in", values, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidBetween(Integer value1, Integer value2) {
            addCriterion("GainId between", value1, value2, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidNotBetween(Integer value1, Integer value2) {
            addCriterion("GainId not between", value1, value2, "gainid");
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

        public Criteria andGainnameIsNull() {
            addCriterion("GainName is null");
            return (Criteria) this;
        }

        public Criteria andGainnameIsNotNull() {
            addCriterion("GainName is not null");
            return (Criteria) this;
        }

        public Criteria andGainnameEqualTo(String value) {
            addCriterion("GainName =", value, "gainname");
            return (Criteria) this;
        }

        public Criteria andGainnameNotEqualTo(String value) {
            addCriterion("GainName <>", value, "gainname");
            return (Criteria) this;
        }

        public Criteria andGainnameGreaterThan(String value) {
            addCriterion("GainName >", value, "gainname");
            return (Criteria) this;
        }

        public Criteria andGainnameGreaterThanOrEqualTo(String value) {
            addCriterion("GainName >=", value, "gainname");
            return (Criteria) this;
        }

        public Criteria andGainnameLessThan(String value) {
            addCriterion("GainName <", value, "gainname");
            return (Criteria) this;
        }

        public Criteria andGainnameLessThanOrEqualTo(String value) {
            addCriterion("GainName <=", value, "gainname");
            return (Criteria) this;
        }

        public Criteria andGainnameLike(String value) {
            addCriterion("GainName like", value, "gainname");
            return (Criteria) this;
        }

        public Criteria andGainnameNotLike(String value) {
            addCriterion("GainName not like", value, "gainname");
            return (Criteria) this;
        }

        public Criteria andGainnameIn(List<String> values) {
            addCriterion("GainName in", values, "gainname");
            return (Criteria) this;
        }

        public Criteria andGainnameNotIn(List<String> values) {
            addCriterion("GainName not in", values, "gainname");
            return (Criteria) this;
        }

        public Criteria andGainnameBetween(String value1, String value2) {
            addCriterion("GainName between", value1, value2, "gainname");
            return (Criteria) this;
        }

        public Criteria andGainnameNotBetween(String value1, String value2) {
            addCriterion("GainName not between", value1, value2, "gainname");
            return (Criteria) this;
        }

        public Criteria andGainmobileIsNull() {
            addCriterion("GainMobile is null");
            return (Criteria) this;
        }

        public Criteria andGainmobileIsNotNull() {
            addCriterion("GainMobile is not null");
            return (Criteria) this;
        }

        public Criteria andGainmobileEqualTo(String value) {
            addCriterion("GainMobile =", value, "gainmobile");
            return (Criteria) this;
        }

        public Criteria andGainmobileNotEqualTo(String value) {
            addCriterion("GainMobile <>", value, "gainmobile");
            return (Criteria) this;
        }

        public Criteria andGainmobileGreaterThan(String value) {
            addCriterion("GainMobile >", value, "gainmobile");
            return (Criteria) this;
        }

        public Criteria andGainmobileGreaterThanOrEqualTo(String value) {
            addCriterion("GainMobile >=", value, "gainmobile");
            return (Criteria) this;
        }

        public Criteria andGainmobileLessThan(String value) {
            addCriterion("GainMobile <", value, "gainmobile");
            return (Criteria) this;
        }

        public Criteria andGainmobileLessThanOrEqualTo(String value) {
            addCriterion("GainMobile <=", value, "gainmobile");
            return (Criteria) this;
        }

        public Criteria andGainmobileLike(String value) {
            addCriterion("GainMobile like", value, "gainmobile");
            return (Criteria) this;
        }

        public Criteria andGainmobileNotLike(String value) {
            addCriterion("GainMobile not like", value, "gainmobile");
            return (Criteria) this;
        }

        public Criteria andGainmobileIn(List<String> values) {
            addCriterion("GainMobile in", values, "gainmobile");
            return (Criteria) this;
        }

        public Criteria andGainmobileNotIn(List<String> values) {
            addCriterion("GainMobile not in", values, "gainmobile");
            return (Criteria) this;
        }

        public Criteria andGainmobileBetween(String value1, String value2) {
            addCriterion("GainMobile between", value1, value2, "gainmobile");
            return (Criteria) this;
        }

        public Criteria andGainmobileNotBetween(String value1, String value2) {
            addCriterion("GainMobile not between", value1, value2, "gainmobile");
            return (Criteria) this;
        }

        public Criteria andGainaddressIsNull() {
            addCriterion("GainAddress is null");
            return (Criteria) this;
        }

        public Criteria andGainaddressIsNotNull() {
            addCriterion("GainAddress is not null");
            return (Criteria) this;
        }

        public Criteria andGainaddressEqualTo(String value) {
            addCriterion("GainAddress =", value, "gainaddress");
            return (Criteria) this;
        }

        public Criteria andGainaddressNotEqualTo(String value) {
            addCriterion("GainAddress <>", value, "gainaddress");
            return (Criteria) this;
        }

        public Criteria andGainaddressGreaterThan(String value) {
            addCriterion("GainAddress >", value, "gainaddress");
            return (Criteria) this;
        }

        public Criteria andGainaddressGreaterThanOrEqualTo(String value) {
            addCriterion("GainAddress >=", value, "gainaddress");
            return (Criteria) this;
        }

        public Criteria andGainaddressLessThan(String value) {
            addCriterion("GainAddress <", value, "gainaddress");
            return (Criteria) this;
        }

        public Criteria andGainaddressLessThanOrEqualTo(String value) {
            addCriterion("GainAddress <=", value, "gainaddress");
            return (Criteria) this;
        }

        public Criteria andGainaddressLike(String value) {
            addCriterion("GainAddress like", value, "gainaddress");
            return (Criteria) this;
        }

        public Criteria andGainaddressNotLike(String value) {
            addCriterion("GainAddress not like", value, "gainaddress");
            return (Criteria) this;
        }

        public Criteria andGainaddressIn(List<String> values) {
            addCriterion("GainAddress in", values, "gainaddress");
            return (Criteria) this;
        }

        public Criteria andGainaddressNotIn(List<String> values) {
            addCriterion("GainAddress not in", values, "gainaddress");
            return (Criteria) this;
        }

        public Criteria andGainaddressBetween(String value1, String value2) {
            addCriterion("GainAddress between", value1, value2, "gainaddress");
            return (Criteria) this;
        }

        public Criteria andGainaddressNotBetween(String value1, String value2) {
            addCriterion("GainAddress not between", value1, value2, "gainaddress");
            return (Criteria) this;
        }

        public Criteria andGaincodeIsNull() {
            addCriterion("GainCode is null");
            return (Criteria) this;
        }

        public Criteria andGaincodeIsNotNull() {
            addCriterion("GainCode is not null");
            return (Criteria) this;
        }

        public Criteria andGaincodeEqualTo(Integer value) {
            addCriterion("GainCode =", value, "gaincode");
            return (Criteria) this;
        }

        public Criteria andGaincodeNotEqualTo(Integer value) {
            addCriterion("GainCode <>", value, "gaincode");
            return (Criteria) this;
        }

        public Criteria andGaincodeGreaterThan(Integer value) {
            addCriterion("GainCode >", value, "gaincode");
            return (Criteria) this;
        }

        public Criteria andGaincodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("GainCode >=", value, "gaincode");
            return (Criteria) this;
        }

        public Criteria andGaincodeLessThan(Integer value) {
            addCriterion("GainCode <", value, "gaincode");
            return (Criteria) this;
        }

        public Criteria andGaincodeLessThanOrEqualTo(Integer value) {
            addCriterion("GainCode <=", value, "gaincode");
            return (Criteria) this;
        }

        public Criteria andGaincodeIn(List<Integer> values) {
            addCriterion("GainCode in", values, "gaincode");
            return (Criteria) this;
        }

        public Criteria andGaincodeNotIn(List<Integer> values) {
            addCriterion("GainCode not in", values, "gaincode");
            return (Criteria) this;
        }

        public Criteria andGaincodeBetween(Integer value1, Integer value2) {
            addCriterion("GainCode between", value1, value2, "gaincode");
            return (Criteria) this;
        }

        public Criteria andGaincodeNotBetween(Integer value1, Integer value2) {
            addCriterion("GainCode not between", value1, value2, "gaincode");
            return (Criteria) this;
        }

        public Criteria andGainAIsNull() {
            addCriterion("Gain_A is null");
            return (Criteria) this;
        }

        public Criteria andGainAIsNotNull() {
            addCriterion("Gain_A is not null");
            return (Criteria) this;
        }

        public Criteria andGainAEqualTo(String value) {
            addCriterion("Gain_A =", value, "gainA");
            return (Criteria) this;
        }

        public Criteria andGainANotEqualTo(String value) {
            addCriterion("Gain_A <>", value, "gainA");
            return (Criteria) this;
        }

        public Criteria andGainAGreaterThan(String value) {
            addCriterion("Gain_A >", value, "gainA");
            return (Criteria) this;
        }

        public Criteria andGainAGreaterThanOrEqualTo(String value) {
            addCriterion("Gain_A >=", value, "gainA");
            return (Criteria) this;
        }

        public Criteria andGainALessThan(String value) {
            addCriterion("Gain_A <", value, "gainA");
            return (Criteria) this;
        }

        public Criteria andGainALessThanOrEqualTo(String value) {
            addCriterion("Gain_A <=", value, "gainA");
            return (Criteria) this;
        }

        public Criteria andGainALike(String value) {
            addCriterion("Gain_A like", value, "gainA");
            return (Criteria) this;
        }

        public Criteria andGainANotLike(String value) {
            addCriterion("Gain_A not like", value, "gainA");
            return (Criteria) this;
        }

        public Criteria andGainAIn(List<String> values) {
            addCriterion("Gain_A in", values, "gainA");
            return (Criteria) this;
        }

        public Criteria andGainANotIn(List<String> values) {
            addCriterion("Gain_A not in", values, "gainA");
            return (Criteria) this;
        }

        public Criteria andGainABetween(String value1, String value2) {
            addCriterion("Gain_A between", value1, value2, "gainA");
            return (Criteria) this;
        }

        public Criteria andGainANotBetween(String value1, String value2) {
            addCriterion("Gain_A not between", value1, value2, "gainA");
            return (Criteria) this;
        }

        public Criteria andGainBIsNull() {
            addCriterion("Gain_B is null");
            return (Criteria) this;
        }

        public Criteria andGainBIsNotNull() {
            addCriterion("Gain_B is not null");
            return (Criteria) this;
        }

        public Criteria andGainBEqualTo(String value) {
            addCriterion("Gain_B =", value, "gainB");
            return (Criteria) this;
        }

        public Criteria andGainBNotEqualTo(String value) {
            addCriterion("Gain_B <>", value, "gainB");
            return (Criteria) this;
        }

        public Criteria andGainBGreaterThan(String value) {
            addCriterion("Gain_B >", value, "gainB");
            return (Criteria) this;
        }

        public Criteria andGainBGreaterThanOrEqualTo(String value) {
            addCriterion("Gain_B >=", value, "gainB");
            return (Criteria) this;
        }

        public Criteria andGainBLessThan(String value) {
            addCriterion("Gain_B <", value, "gainB");
            return (Criteria) this;
        }

        public Criteria andGainBLessThanOrEqualTo(String value) {
            addCriterion("Gain_B <=", value, "gainB");
            return (Criteria) this;
        }

        public Criteria andGainBLike(String value) {
            addCriterion("Gain_B like", value, "gainB");
            return (Criteria) this;
        }

        public Criteria andGainBNotLike(String value) {
            addCriterion("Gain_B not like", value, "gainB");
            return (Criteria) this;
        }

        public Criteria andGainBIn(List<String> values) {
            addCriterion("Gain_B in", values, "gainB");
            return (Criteria) this;
        }

        public Criteria andGainBNotIn(List<String> values) {
            addCriterion("Gain_B not in", values, "gainB");
            return (Criteria) this;
        }

        public Criteria andGainBBetween(String value1, String value2) {
            addCriterion("Gain_B between", value1, value2, "gainB");
            return (Criteria) this;
        }

        public Criteria andGainBNotBetween(String value1, String value2) {
            addCriterion("Gain_B not between", value1, value2, "gainB");
            return (Criteria) this;
        }

        public Criteria andGainCIsNull() {
            addCriterion("Gain_C is null");
            return (Criteria) this;
        }

        public Criteria andGainCIsNotNull() {
            addCriterion("Gain_C is not null");
            return (Criteria) this;
        }

        public Criteria andGainCEqualTo(String value) {
            addCriterion("Gain_C =", value, "gainC");
            return (Criteria) this;
        }

        public Criteria andGainCNotEqualTo(String value) {
            addCriterion("Gain_C <>", value, "gainC");
            return (Criteria) this;
        }

        public Criteria andGainCGreaterThan(String value) {
            addCriterion("Gain_C >", value, "gainC");
            return (Criteria) this;
        }

        public Criteria andGainCGreaterThanOrEqualTo(String value) {
            addCriterion("Gain_C >=", value, "gainC");
            return (Criteria) this;
        }

        public Criteria andGainCLessThan(String value) {
            addCriterion("Gain_C <", value, "gainC");
            return (Criteria) this;
        }

        public Criteria andGainCLessThanOrEqualTo(String value) {
            addCriterion("Gain_C <=", value, "gainC");
            return (Criteria) this;
        }

        public Criteria andGainCLike(String value) {
            addCriterion("Gain_C like", value, "gainC");
            return (Criteria) this;
        }

        public Criteria andGainCNotLike(String value) {
            addCriterion("Gain_C not like", value, "gainC");
            return (Criteria) this;
        }

        public Criteria andGainCIn(List<String> values) {
            addCriterion("Gain_C in", values, "gainC");
            return (Criteria) this;
        }

        public Criteria andGainCNotIn(List<String> values) {
            addCriterion("Gain_C not in", values, "gainC");
            return (Criteria) this;
        }

        public Criteria andGainCBetween(String value1, String value2) {
            addCriterion("Gain_C between", value1, value2, "gainC");
            return (Criteria) this;
        }

        public Criteria andGainCNotBetween(String value1, String value2) {
            addCriterion("Gain_C not between", value1, value2, "gainC");
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