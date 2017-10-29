package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class AdmingroupfirstviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdmingroupfirstviewExample() {
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

        public Criteria andAdmingroupfirstviewidIsNull() {
            addCriterion("AdminGroupFirstViewId is null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewidIsNotNull() {
            addCriterion("AdminGroupFirstViewId is not null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewidEqualTo(Integer value) {
            addCriterion("AdminGroupFirstViewId =", value, "admingroupfirstviewid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewidNotEqualTo(Integer value) {
            addCriterion("AdminGroupFirstViewId <>", value, "admingroupfirstviewid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewidGreaterThan(Integer value) {
            addCriterion("AdminGroupFirstViewId >", value, "admingroupfirstviewid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdminGroupFirstViewId >=", value, "admingroupfirstviewid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewidLessThan(Integer value) {
            addCriterion("AdminGroupFirstViewId <", value, "admingroupfirstviewid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewidLessThanOrEqualTo(Integer value) {
            addCriterion("AdminGroupFirstViewId <=", value, "admingroupfirstviewid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewidIn(List<Integer> values) {
            addCriterion("AdminGroupFirstViewId in", values, "admingroupfirstviewid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewidNotIn(List<Integer> values) {
            addCriterion("AdminGroupFirstViewId not in", values, "admingroupfirstviewid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewidBetween(Integer value1, Integer value2) {
            addCriterion("AdminGroupFirstViewId between", value1, value2, "admingroupfirstviewid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewidNotBetween(Integer value1, Integer value2) {
            addCriterion("AdminGroupFirstViewId not between", value1, value2, "admingroupfirstviewid");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionIsNull() {
            addCriterion("FirstViewAction is null");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionIsNotNull() {
            addCriterion("FirstViewAction is not null");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionEqualTo(String value) {
            addCriterion("FirstViewAction =", value, "firstviewaction");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionNotEqualTo(String value) {
            addCriterion("FirstViewAction <>", value, "firstviewaction");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionGreaterThan(String value) {
            addCriterion("FirstViewAction >", value, "firstviewaction");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionGreaterThanOrEqualTo(String value) {
            addCriterion("FirstViewAction >=", value, "firstviewaction");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionLessThan(String value) {
            addCriterion("FirstViewAction <", value, "firstviewaction");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionLessThanOrEqualTo(String value) {
            addCriterion("FirstViewAction <=", value, "firstviewaction");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionLike(String value) {
            addCriterion("FirstViewAction like", value, "firstviewaction");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionNotLike(String value) {
            addCriterion("FirstViewAction not like", value, "firstviewaction");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionIn(List<String> values) {
            addCriterion("FirstViewAction in", values, "firstviewaction");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionNotIn(List<String> values) {
            addCriterion("FirstViewAction not in", values, "firstviewaction");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionBetween(String value1, String value2) {
            addCriterion("FirstViewAction between", value1, value2, "firstviewaction");
            return (Criteria) this;
        }

        public Criteria andFirstviewactionNotBetween(String value1, String value2) {
            addCriterion("FirstViewAction not between", value1, value2, "firstviewaction");
            return (Criteria) this;
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

        public Criteria andAdmingroupfirstviewAIsNull() {
            addCriterion("AdminGroupFirstView_A is null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewAIsNotNull() {
            addCriterion("AdminGroupFirstView_A is not null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewAEqualTo(String value) {
            addCriterion("AdminGroupFirstView_A =", value, "admingroupfirstviewA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewANotEqualTo(String value) {
            addCriterion("AdminGroupFirstView_A <>", value, "admingroupfirstviewA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewAGreaterThan(String value) {
            addCriterion("AdminGroupFirstView_A >", value, "admingroupfirstviewA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewAGreaterThanOrEqualTo(String value) {
            addCriterion("AdminGroupFirstView_A >=", value, "admingroupfirstviewA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewALessThan(String value) {
            addCriterion("AdminGroupFirstView_A <", value, "admingroupfirstviewA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewALessThanOrEqualTo(String value) {
            addCriterion("AdminGroupFirstView_A <=", value, "admingroupfirstviewA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewALike(String value) {
            addCriterion("AdminGroupFirstView_A like", value, "admingroupfirstviewA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewANotLike(String value) {
            addCriterion("AdminGroupFirstView_A not like", value, "admingroupfirstviewA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewAIn(List<String> values) {
            addCriterion("AdminGroupFirstView_A in", values, "admingroupfirstviewA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewANotIn(List<String> values) {
            addCriterion("AdminGroupFirstView_A not in", values, "admingroupfirstviewA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewABetween(String value1, String value2) {
            addCriterion("AdminGroupFirstView_A between", value1, value2, "admingroupfirstviewA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewANotBetween(String value1, String value2) {
            addCriterion("AdminGroupFirstView_A not between", value1, value2, "admingroupfirstviewA");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBIsNull() {
            addCriterion("AdminGroupFirstView_B is null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBIsNotNull() {
            addCriterion("AdminGroupFirstView_B is not null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBEqualTo(String value) {
            addCriterion("AdminGroupFirstView_B =", value, "admingroupfirstviewB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBNotEqualTo(String value) {
            addCriterion("AdminGroupFirstView_B <>", value, "admingroupfirstviewB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBGreaterThan(String value) {
            addCriterion("AdminGroupFirstView_B >", value, "admingroupfirstviewB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBGreaterThanOrEqualTo(String value) {
            addCriterion("AdminGroupFirstView_B >=", value, "admingroupfirstviewB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBLessThan(String value) {
            addCriterion("AdminGroupFirstView_B <", value, "admingroupfirstviewB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBLessThanOrEqualTo(String value) {
            addCriterion("AdminGroupFirstView_B <=", value, "admingroupfirstviewB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBLike(String value) {
            addCriterion("AdminGroupFirstView_B like", value, "admingroupfirstviewB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBNotLike(String value) {
            addCriterion("AdminGroupFirstView_B not like", value, "admingroupfirstviewB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBIn(List<String> values) {
            addCriterion("AdminGroupFirstView_B in", values, "admingroupfirstviewB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBNotIn(List<String> values) {
            addCriterion("AdminGroupFirstView_B not in", values, "admingroupfirstviewB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBBetween(String value1, String value2) {
            addCriterion("AdminGroupFirstView_B between", value1, value2, "admingroupfirstviewB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewBNotBetween(String value1, String value2) {
            addCriterion("AdminGroupFirstView_B not between", value1, value2, "admingroupfirstviewB");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCIsNull() {
            addCriterion("AdminGroupFirstView_C is null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCIsNotNull() {
            addCriterion("AdminGroupFirstView_C is not null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCEqualTo(String value) {
            addCriterion("AdminGroupFirstView_C =", value, "admingroupfirstviewC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCNotEqualTo(String value) {
            addCriterion("AdminGroupFirstView_C <>", value, "admingroupfirstviewC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCGreaterThan(String value) {
            addCriterion("AdminGroupFirstView_C >", value, "admingroupfirstviewC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCGreaterThanOrEqualTo(String value) {
            addCriterion("AdminGroupFirstView_C >=", value, "admingroupfirstviewC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCLessThan(String value) {
            addCriterion("AdminGroupFirstView_C <", value, "admingroupfirstviewC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCLessThanOrEqualTo(String value) {
            addCriterion("AdminGroupFirstView_C <=", value, "admingroupfirstviewC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCLike(String value) {
            addCriterion("AdminGroupFirstView_C like", value, "admingroupfirstviewC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCNotLike(String value) {
            addCriterion("AdminGroupFirstView_C not like", value, "admingroupfirstviewC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCIn(List<String> values) {
            addCriterion("AdminGroupFirstView_C in", values, "admingroupfirstviewC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCNotIn(List<String> values) {
            addCriterion("AdminGroupFirstView_C not in", values, "admingroupfirstviewC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCBetween(String value1, String value2) {
            addCriterion("AdminGroupFirstView_C between", value1, value2, "admingroupfirstviewC");
            return (Criteria) this;
        }

        public Criteria andAdmingroupfirstviewCNotBetween(String value1, String value2) {
            addCriterion("AdminGroupFirstView_C not between", value1, value2, "admingroupfirstviewC");
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