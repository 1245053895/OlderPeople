package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class AdmingroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdmingroupExample() {
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

        public Criteria andAdmingroupidIsNull() {
            addCriterion("AdminGroupId is null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidIsNotNull() {
            addCriterion("AdminGroupId is not null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidEqualTo(Integer value) {
            addCriterion("AdminGroupId =", value, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidNotEqualTo(Integer value) {
            addCriterion("AdminGroupId <>", value, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidGreaterThan(Integer value) {
            addCriterion("AdminGroupId >", value, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdminGroupId >=", value, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidLessThan(Integer value) {
            addCriterion("AdminGroupId <", value, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidLessThanOrEqualTo(Integer value) {
            addCriterion("AdminGroupId <=", value, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidIn(List<Integer> values) {
            addCriterion("AdminGroupId in", values, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidNotIn(List<Integer> values) {
            addCriterion("AdminGroupId not in", values, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBetween(Integer value1, Integer value2) {
            addCriterion("AdminGroupId between", value1, value2, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("AdminGroupId not between", value1, value2, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameIsNull() {
            addCriterion("AdminGroupName is null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameIsNotNull() {
            addCriterion("AdminGroupName is not null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameEqualTo(String value) {
            addCriterion("AdminGroupName =", value, "admingroupname");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameNotEqualTo(String value) {
            addCriterion("AdminGroupName <>", value, "admingroupname");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameGreaterThan(String value) {
            addCriterion("AdminGroupName >", value, "admingroupname");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("AdminGroupName >=", value, "admingroupname");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameLessThan(String value) {
            addCriterion("AdminGroupName <", value, "admingroupname");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameLessThanOrEqualTo(String value) {
            addCriterion("AdminGroupName <=", value, "admingroupname");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameLike(String value) {
            addCriterion("AdminGroupName like", value, "admingroupname");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameNotLike(String value) {
            addCriterion("AdminGroupName not like", value, "admingroupname");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameIn(List<String> values) {
            addCriterion("AdminGroupName in", values, "admingroupname");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameNotIn(List<String> values) {
            addCriterion("AdminGroupName not in", values, "admingroupname");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameBetween(String value1, String value2) {
            addCriterion("AdminGroupName between", value1, value2, "admingroupname");
            return (Criteria) this;
        }

        public Criteria andAdmingroupnameNotBetween(String value1, String value2) {
            addCriterion("AdminGroupName not between", value1, value2, "admingroupname");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionIsNull() {
            addCriterion("AdminGroupDescription is null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionIsNotNull() {
            addCriterion("AdminGroupDescription is not null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionEqualTo(String value) {
            addCriterion("AdminGroupDescription =", value, "admingroupdescription");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionNotEqualTo(String value) {
            addCriterion("AdminGroupDescription <>", value, "admingroupdescription");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionGreaterThan(String value) {
            addCriterion("AdminGroupDescription >", value, "admingroupdescription");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("AdminGroupDescription >=", value, "admingroupdescription");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionLessThan(String value) {
            addCriterion("AdminGroupDescription <", value, "admingroupdescription");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionLessThanOrEqualTo(String value) {
            addCriterion("AdminGroupDescription <=", value, "admingroupdescription");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionLike(String value) {
            addCriterion("AdminGroupDescription like", value, "admingroupdescription");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionNotLike(String value) {
            addCriterion("AdminGroupDescription not like", value, "admingroupdescription");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionIn(List<String> values) {
            addCriterion("AdminGroupDescription in", values, "admingroupdescription");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionNotIn(List<String> values) {
            addCriterion("AdminGroupDescription not in", values, "admingroupdescription");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionBetween(String value1, String value2) {
            addCriterion("AdminGroupDescription between", value1, value2, "admingroupdescription");
            return (Criteria) this;
        }

        public Criteria andAdmingroupdescriptionNotBetween(String value1, String value2) {
            addCriterion("AdminGroupDescription not between", value1, value2, "admingroupdescription");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidAIsNull() {
            addCriterion("AdminGroupId_A is null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidAIsNotNull() {
            addCriterion("AdminGroupId_A is not null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidAEqualTo(String value) {
            addCriterion("AdminGroupId_A =", value, "admingroupidA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidANotEqualTo(String value) {
            addCriterion("AdminGroupId_A <>", value, "admingroupidA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidAGreaterThan(String value) {
            addCriterion("AdminGroupId_A >", value, "admingroupidA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidAGreaterThanOrEqualTo(String value) {
            addCriterion("AdminGroupId_A >=", value, "admingroupidA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidALessThan(String value) {
            addCriterion("AdminGroupId_A <", value, "admingroupidA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidALessThanOrEqualTo(String value) {
            addCriterion("AdminGroupId_A <=", value, "admingroupidA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidALike(String value) {
            addCriterion("AdminGroupId_A like", value, "admingroupidA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidANotLike(String value) {
            addCriterion("AdminGroupId_A not like", value, "admingroupidA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidAIn(List<String> values) {
            addCriterion("AdminGroupId_A in", values, "admingroupidA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidANotIn(List<String> values) {
            addCriterion("AdminGroupId_A not in", values, "admingroupidA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidABetween(String value1, String value2) {
            addCriterion("AdminGroupId_A between", value1, value2, "admingroupidA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidANotBetween(String value1, String value2) {
            addCriterion("AdminGroupId_A not between", value1, value2, "admingroupidA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBIsNull() {
            addCriterion("AdminGroupId_B is null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBIsNotNull() {
            addCriterion("AdminGroupId_B is not null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBEqualTo(String value) {
            addCriterion("AdminGroupId_B =", value, "admingroupidB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBNotEqualTo(String value) {
            addCriterion("AdminGroupId_B <>", value, "admingroupidB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBGreaterThan(String value) {
            addCriterion("AdminGroupId_B >", value, "admingroupidB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBGreaterThanOrEqualTo(String value) {
            addCriterion("AdminGroupId_B >=", value, "admingroupidB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBLessThan(String value) {
            addCriterion("AdminGroupId_B <", value, "admingroupidB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBLessThanOrEqualTo(String value) {
            addCriterion("AdminGroupId_B <=", value, "admingroupidB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBLike(String value) {
            addCriterion("AdminGroupId_B like", value, "admingroupidB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBNotLike(String value) {
            addCriterion("AdminGroupId_B not like", value, "admingroupidB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBIn(List<String> values) {
            addCriterion("AdminGroupId_B in", values, "admingroupidB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBNotIn(List<String> values) {
            addCriterion("AdminGroupId_B not in", values, "admingroupidB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBBetween(String value1, String value2) {
            addCriterion("AdminGroupId_B between", value1, value2, "admingroupidB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBNotBetween(String value1, String value2) {
            addCriterion("AdminGroupId_B not between", value1, value2, "admingroupidB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCIsNull() {
            addCriterion("AdminGroupId_C is null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCIsNotNull() {
            addCriterion("AdminGroupId_C is not null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCEqualTo(String value) {
            addCriterion("AdminGroupId_C =", value, "admingroupidC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCNotEqualTo(String value) {
            addCriterion("AdminGroupId_C <>", value, "admingroupidC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCGreaterThan(String value) {
            addCriterion("AdminGroupId_C >", value, "admingroupidC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCGreaterThanOrEqualTo(String value) {
            addCriterion("AdminGroupId_C >=", value, "admingroupidC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCLessThan(String value) {
            addCriterion("AdminGroupId_C <", value, "admingroupidC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCLessThanOrEqualTo(String value) {
            addCriterion("AdminGroupId_C <=", value, "admingroupidC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCLike(String value) {
            addCriterion("AdminGroupId_C like", value, "admingroupidC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCNotLike(String value) {
            addCriterion("AdminGroupId_C not like", value, "admingroupidC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCIn(List<String> values) {
            addCriterion("AdminGroupId_C in", values, "admingroupidC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCNotIn(List<String> values) {
            addCriterion("AdminGroupId_C not in", values, "admingroupidC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCBetween(String value1, String value2) {
            addCriterion("AdminGroupId_C between", value1, value2, "admingroupidC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidCNotBetween(String value1, String value2) {
            addCriterion("AdminGroupId_C not between", value1, value2, "admingroupidC");
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