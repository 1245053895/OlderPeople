package com.xh.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserlogExample() {
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

        public Criteria andUserlogidIsNull() {
            addCriterion("UserLogId is null");
            return (Criteria) this;
        }

        public Criteria andUserlogidIsNotNull() {
            addCriterion("UserLogId is not null");
            return (Criteria) this;
        }

        public Criteria andUserlogidEqualTo(Integer value) {
            addCriterion("UserLogId =", value, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidNotEqualTo(Integer value) {
            addCriterion("UserLogId <>", value, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidGreaterThan(Integer value) {
            addCriterion("UserLogId >", value, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserLogId >=", value, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidLessThan(Integer value) {
            addCriterion("UserLogId <", value, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidLessThanOrEqualTo(Integer value) {
            addCriterion("UserLogId <=", value, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidIn(List<Integer> values) {
            addCriterion("UserLogId in", values, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidNotIn(List<Integer> values) {
            addCriterion("UserLogId not in", values, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidBetween(Integer value1, Integer value2) {
            addCriterion("UserLogId between", value1, value2, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidNotBetween(Integer value1, Integer value2) {
            addCriterion("UserLogId not between", value1, value2, "userlogid");
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

        public Criteria andStartlogintimeIsNull() {
            addCriterion("StartLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andStartlogintimeIsNotNull() {
            addCriterion("StartLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartlogintimeEqualTo(Date value) {
            addCriterion("StartLoginTime =", value, "startlogintime");
            return (Criteria) this;
        }

        public Criteria andStartlogintimeNotEqualTo(Date value) {
            addCriterion("StartLoginTime <>", value, "startlogintime");
            return (Criteria) this;
        }

        public Criteria andStartlogintimeGreaterThan(Date value) {
            addCriterion("StartLoginTime >", value, "startlogintime");
            return (Criteria) this;
        }

        public Criteria andStartlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartLoginTime >=", value, "startlogintime");
            return (Criteria) this;
        }

        public Criteria andStartlogintimeLessThan(Date value) {
            addCriterion("StartLoginTime <", value, "startlogintime");
            return (Criteria) this;
        }

        public Criteria andStartlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("StartLoginTime <=", value, "startlogintime");
            return (Criteria) this;
        }

        public Criteria andStartlogintimeIn(List<Date> values) {
            addCriterion("StartLoginTime in", values, "startlogintime");
            return (Criteria) this;
        }

        public Criteria andStartlogintimeNotIn(List<Date> values) {
            addCriterion("StartLoginTime not in", values, "startlogintime");
            return (Criteria) this;
        }

        public Criteria andStartlogintimeBetween(Date value1, Date value2) {
            addCriterion("StartLoginTime between", value1, value2, "startlogintime");
            return (Criteria) this;
        }

        public Criteria andStartlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("StartLoginTime not between", value1, value2, "startlogintime");
            return (Criteria) this;
        }

        public Criteria andEndlogintimeIsNull() {
            addCriterion("EndLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andEndlogintimeIsNotNull() {
            addCriterion("EndLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndlogintimeEqualTo(Date value) {
            addCriterion("EndLoginTime =", value, "endlogintime");
            return (Criteria) this;
        }

        public Criteria andEndlogintimeNotEqualTo(Date value) {
            addCriterion("EndLoginTime <>", value, "endlogintime");
            return (Criteria) this;
        }

        public Criteria andEndlogintimeGreaterThan(Date value) {
            addCriterion("EndLoginTime >", value, "endlogintime");
            return (Criteria) this;
        }

        public Criteria andEndlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EndLoginTime >=", value, "endlogintime");
            return (Criteria) this;
        }

        public Criteria andEndlogintimeLessThan(Date value) {
            addCriterion("EndLoginTime <", value, "endlogintime");
            return (Criteria) this;
        }

        public Criteria andEndlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("EndLoginTime <=", value, "endlogintime");
            return (Criteria) this;
        }

        public Criteria andEndlogintimeIn(List<Date> values) {
            addCriterion("EndLoginTime in", values, "endlogintime");
            return (Criteria) this;
        }

        public Criteria andEndlogintimeNotIn(List<Date> values) {
            addCriterion("EndLoginTime not in", values, "endlogintime");
            return (Criteria) this;
        }

        public Criteria andEndlogintimeBetween(Date value1, Date value2) {
            addCriterion("EndLoginTime between", value1, value2, "endlogintime");
            return (Criteria) this;
        }

        public Criteria andEndlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("EndLoginTime not between", value1, value2, "endlogintime");
            return (Criteria) this;
        }

        public Criteria andUseripIsNull() {
            addCriterion("UserIp is null");
            return (Criteria) this;
        }

        public Criteria andUseripIsNotNull() {
            addCriterion("UserIp is not null");
            return (Criteria) this;
        }

        public Criteria andUseripEqualTo(String value) {
            addCriterion("UserIp =", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotEqualTo(String value) {
            addCriterion("UserIp <>", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripGreaterThan(String value) {
            addCriterion("UserIp >", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripGreaterThanOrEqualTo(String value) {
            addCriterion("UserIp >=", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripLessThan(String value) {
            addCriterion("UserIp <", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripLessThanOrEqualTo(String value) {
            addCriterion("UserIp <=", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripLike(String value) {
            addCriterion("UserIp like", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotLike(String value) {
            addCriterion("UserIp not like", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripIn(List<String> values) {
            addCriterion("UserIp in", values, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotIn(List<String> values) {
            addCriterion("UserIp not in", values, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripBetween(String value1, String value2) {
            addCriterion("UserIp between", value1, value2, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotBetween(String value1, String value2) {
            addCriterion("UserIp not between", value1, value2, "userip");
            return (Criteria) this;
        }

        public Criteria andUserlogAIsNull() {
            addCriterion("UserLog_A is null");
            return (Criteria) this;
        }

        public Criteria andUserlogAIsNotNull() {
            addCriterion("UserLog_A is not null");
            return (Criteria) this;
        }

        public Criteria andUserlogAEqualTo(String value) {
            addCriterion("UserLog_A =", value, "userlogA");
            return (Criteria) this;
        }

        public Criteria andUserlogANotEqualTo(String value) {
            addCriterion("UserLog_A <>", value, "userlogA");
            return (Criteria) this;
        }

        public Criteria andUserlogAGreaterThan(String value) {
            addCriterion("UserLog_A >", value, "userlogA");
            return (Criteria) this;
        }

        public Criteria andUserlogAGreaterThanOrEqualTo(String value) {
            addCriterion("UserLog_A >=", value, "userlogA");
            return (Criteria) this;
        }

        public Criteria andUserlogALessThan(String value) {
            addCriterion("UserLog_A <", value, "userlogA");
            return (Criteria) this;
        }

        public Criteria andUserlogALessThanOrEqualTo(String value) {
            addCriterion("UserLog_A <=", value, "userlogA");
            return (Criteria) this;
        }

        public Criteria andUserlogALike(String value) {
            addCriterion("UserLog_A like", value, "userlogA");
            return (Criteria) this;
        }

        public Criteria andUserlogANotLike(String value) {
            addCriterion("UserLog_A not like", value, "userlogA");
            return (Criteria) this;
        }

        public Criteria andUserlogAIn(List<String> values) {
            addCriterion("UserLog_A in", values, "userlogA");
            return (Criteria) this;
        }

        public Criteria andUserlogANotIn(List<String> values) {
            addCriterion("UserLog_A not in", values, "userlogA");
            return (Criteria) this;
        }

        public Criteria andUserlogABetween(String value1, String value2) {
            addCriterion("UserLog_A between", value1, value2, "userlogA");
            return (Criteria) this;
        }

        public Criteria andUserlogANotBetween(String value1, String value2) {
            addCriterion("UserLog_A not between", value1, value2, "userlogA");
            return (Criteria) this;
        }

        public Criteria andUserlogBIsNull() {
            addCriterion("UserLog_B is null");
            return (Criteria) this;
        }

        public Criteria andUserlogBIsNotNull() {
            addCriterion("UserLog_B is not null");
            return (Criteria) this;
        }

        public Criteria andUserlogBEqualTo(String value) {
            addCriterion("UserLog_B =", value, "userlogB");
            return (Criteria) this;
        }

        public Criteria andUserlogBNotEqualTo(String value) {
            addCriterion("UserLog_B <>", value, "userlogB");
            return (Criteria) this;
        }

        public Criteria andUserlogBGreaterThan(String value) {
            addCriterion("UserLog_B >", value, "userlogB");
            return (Criteria) this;
        }

        public Criteria andUserlogBGreaterThanOrEqualTo(String value) {
            addCriterion("UserLog_B >=", value, "userlogB");
            return (Criteria) this;
        }

        public Criteria andUserlogBLessThan(String value) {
            addCriterion("UserLog_B <", value, "userlogB");
            return (Criteria) this;
        }

        public Criteria andUserlogBLessThanOrEqualTo(String value) {
            addCriterion("UserLog_B <=", value, "userlogB");
            return (Criteria) this;
        }

        public Criteria andUserlogBLike(String value) {
            addCriterion("UserLog_B like", value, "userlogB");
            return (Criteria) this;
        }

        public Criteria andUserlogBNotLike(String value) {
            addCriterion("UserLog_B not like", value, "userlogB");
            return (Criteria) this;
        }

        public Criteria andUserlogBIn(List<String> values) {
            addCriterion("UserLog_B in", values, "userlogB");
            return (Criteria) this;
        }

        public Criteria andUserlogBNotIn(List<String> values) {
            addCriterion("UserLog_B not in", values, "userlogB");
            return (Criteria) this;
        }

        public Criteria andUserlogBBetween(String value1, String value2) {
            addCriterion("UserLog_B between", value1, value2, "userlogB");
            return (Criteria) this;
        }

        public Criteria andUserlogBNotBetween(String value1, String value2) {
            addCriterion("UserLog_B not between", value1, value2, "userlogB");
            return (Criteria) this;
        }

        public Criteria andUserlogCIsNull() {
            addCriterion("UserLog_C is null");
            return (Criteria) this;
        }

        public Criteria andUserlogCIsNotNull() {
            addCriterion("UserLog_C is not null");
            return (Criteria) this;
        }

        public Criteria andUserlogCEqualTo(String value) {
            addCriterion("UserLog_C =", value, "userlogC");
            return (Criteria) this;
        }

        public Criteria andUserlogCNotEqualTo(String value) {
            addCriterion("UserLog_C <>", value, "userlogC");
            return (Criteria) this;
        }

        public Criteria andUserlogCGreaterThan(String value) {
            addCriterion("UserLog_C >", value, "userlogC");
            return (Criteria) this;
        }

        public Criteria andUserlogCGreaterThanOrEqualTo(String value) {
            addCriterion("UserLog_C >=", value, "userlogC");
            return (Criteria) this;
        }

        public Criteria andUserlogCLessThan(String value) {
            addCriterion("UserLog_C <", value, "userlogC");
            return (Criteria) this;
        }

        public Criteria andUserlogCLessThanOrEqualTo(String value) {
            addCriterion("UserLog_C <=", value, "userlogC");
            return (Criteria) this;
        }

        public Criteria andUserlogCLike(String value) {
            addCriterion("UserLog_C like", value, "userlogC");
            return (Criteria) this;
        }

        public Criteria andUserlogCNotLike(String value) {
            addCriterion("UserLog_C not like", value, "userlogC");
            return (Criteria) this;
        }

        public Criteria andUserlogCIn(List<String> values) {
            addCriterion("UserLog_C in", values, "userlogC");
            return (Criteria) this;
        }

        public Criteria andUserlogCNotIn(List<String> values) {
            addCriterion("UserLog_C not in", values, "userlogC");
            return (Criteria) this;
        }

        public Criteria andUserlogCBetween(String value1, String value2) {
            addCriterion("UserLog_C between", value1, value2, "userlogC");
            return (Criteria) this;
        }

        public Criteria andUserlogCNotBetween(String value1, String value2) {
            addCriterion("UserLog_C not between", value1, value2, "userlogC");
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