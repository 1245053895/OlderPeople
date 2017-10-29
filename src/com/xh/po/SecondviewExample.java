package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class SecondviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecondviewExample() {
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

        public Criteria andSecondviewidIsNull() {
            addCriterion("SecondViewId is null");
            return (Criteria) this;
        }

        public Criteria andSecondviewidIsNotNull() {
            addCriterion("SecondViewId is not null");
            return (Criteria) this;
        }

        public Criteria andSecondviewidEqualTo(Integer value) {
            addCriterion("SecondViewId =", value, "secondviewid");
            return (Criteria) this;
        }

        public Criteria andSecondviewidNotEqualTo(Integer value) {
            addCriterion("SecondViewId <>", value, "secondviewid");
            return (Criteria) this;
        }

        public Criteria andSecondviewidGreaterThan(Integer value) {
            addCriterion("SecondViewId >", value, "secondviewid");
            return (Criteria) this;
        }

        public Criteria andSecondviewidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SecondViewId >=", value, "secondviewid");
            return (Criteria) this;
        }

        public Criteria andSecondviewidLessThan(Integer value) {
            addCriterion("SecondViewId <", value, "secondviewid");
            return (Criteria) this;
        }

        public Criteria andSecondviewidLessThanOrEqualTo(Integer value) {
            addCriterion("SecondViewId <=", value, "secondviewid");
            return (Criteria) this;
        }

        public Criteria andSecondviewidIn(List<Integer> values) {
            addCriterion("SecondViewId in", values, "secondviewid");
            return (Criteria) this;
        }

        public Criteria andSecondviewidNotIn(List<Integer> values) {
            addCriterion("SecondViewId not in", values, "secondviewid");
            return (Criteria) this;
        }

        public Criteria andSecondviewidBetween(Integer value1, Integer value2) {
            addCriterion("SecondViewId between", value1, value2, "secondviewid");
            return (Criteria) this;
        }

        public Criteria andSecondviewidNotBetween(Integer value1, Integer value2) {
            addCriterion("SecondViewId not between", value1, value2, "secondviewid");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionIsNull() {
            addCriterion("SecondViewAction is null");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionIsNotNull() {
            addCriterion("SecondViewAction is not null");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionEqualTo(String value) {
            addCriterion("SecondViewAction =", value, "secondviewaction");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionNotEqualTo(String value) {
            addCriterion("SecondViewAction <>", value, "secondviewaction");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionGreaterThan(String value) {
            addCriterion("SecondViewAction >", value, "secondviewaction");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionGreaterThanOrEqualTo(String value) {
            addCriterion("SecondViewAction >=", value, "secondviewaction");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionLessThan(String value) {
            addCriterion("SecondViewAction <", value, "secondviewaction");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionLessThanOrEqualTo(String value) {
            addCriterion("SecondViewAction <=", value, "secondviewaction");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionLike(String value) {
            addCriterion("SecondViewAction like", value, "secondviewaction");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionNotLike(String value) {
            addCriterion("SecondViewAction not like", value, "secondviewaction");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionIn(List<String> values) {
            addCriterion("SecondViewAction in", values, "secondviewaction");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionNotIn(List<String> values) {
            addCriterion("SecondViewAction not in", values, "secondviewaction");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionBetween(String value1, String value2) {
            addCriterion("SecondViewAction between", value1, value2, "secondviewaction");
            return (Criteria) this;
        }

        public Criteria andSecondviewactionNotBetween(String value1, String value2) {
            addCriterion("SecondViewAction not between", value1, value2, "secondviewaction");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeIsNull() {
            addCriterion("SecondViewDescribe is null");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeIsNotNull() {
            addCriterion("SecondViewDescribe is not null");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeEqualTo(String value) {
            addCriterion("SecondViewDescribe =", value, "secondviewdescribe");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeNotEqualTo(String value) {
            addCriterion("SecondViewDescribe <>", value, "secondviewdescribe");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeGreaterThan(String value) {
            addCriterion("SecondViewDescribe >", value, "secondviewdescribe");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("SecondViewDescribe >=", value, "secondviewdescribe");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeLessThan(String value) {
            addCriterion("SecondViewDescribe <", value, "secondviewdescribe");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeLessThanOrEqualTo(String value) {
            addCriterion("SecondViewDescribe <=", value, "secondviewdescribe");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeLike(String value) {
            addCriterion("SecondViewDescribe like", value, "secondviewdescribe");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeNotLike(String value) {
            addCriterion("SecondViewDescribe not like", value, "secondviewdescribe");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeIn(List<String> values) {
            addCriterion("SecondViewDescribe in", values, "secondviewdescribe");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeNotIn(List<String> values) {
            addCriterion("SecondViewDescribe not in", values, "secondviewdescribe");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeBetween(String value1, String value2) {
            addCriterion("SecondViewDescribe between", value1, value2, "secondviewdescribe");
            return (Criteria) this;
        }

        public Criteria andSecondviewdescribeNotBetween(String value1, String value2) {
            addCriterion("SecondViewDescribe not between", value1, value2, "secondviewdescribe");
            return (Criteria) this;
        }

        public Criteria andSecondviewAIsNull() {
            addCriterion("SecondView_A is null");
            return (Criteria) this;
        }

        public Criteria andSecondviewAIsNotNull() {
            addCriterion("SecondView_A is not null");
            return (Criteria) this;
        }

        public Criteria andSecondviewAEqualTo(String value) {
            addCriterion("SecondView_A =", value, "secondviewA");
            return (Criteria) this;
        }

        public Criteria andSecondviewANotEqualTo(String value) {
            addCriterion("SecondView_A <>", value, "secondviewA");
            return (Criteria) this;
        }

        public Criteria andSecondviewAGreaterThan(String value) {
            addCriterion("SecondView_A >", value, "secondviewA");
            return (Criteria) this;
        }

        public Criteria andSecondviewAGreaterThanOrEqualTo(String value) {
            addCriterion("SecondView_A >=", value, "secondviewA");
            return (Criteria) this;
        }

        public Criteria andSecondviewALessThan(String value) {
            addCriterion("SecondView_A <", value, "secondviewA");
            return (Criteria) this;
        }

        public Criteria andSecondviewALessThanOrEqualTo(String value) {
            addCriterion("SecondView_A <=", value, "secondviewA");
            return (Criteria) this;
        }

        public Criteria andSecondviewALike(String value) {
            addCriterion("SecondView_A like", value, "secondviewA");
            return (Criteria) this;
        }

        public Criteria andSecondviewANotLike(String value) {
            addCriterion("SecondView_A not like", value, "secondviewA");
            return (Criteria) this;
        }

        public Criteria andSecondviewAIn(List<String> values) {
            addCriterion("SecondView_A in", values, "secondviewA");
            return (Criteria) this;
        }

        public Criteria andSecondviewANotIn(List<String> values) {
            addCriterion("SecondView_A not in", values, "secondviewA");
            return (Criteria) this;
        }

        public Criteria andSecondviewABetween(String value1, String value2) {
            addCriterion("SecondView_A between", value1, value2, "secondviewA");
            return (Criteria) this;
        }

        public Criteria andSecondviewANotBetween(String value1, String value2) {
            addCriterion("SecondView_A not between", value1, value2, "secondviewA");
            return (Criteria) this;
        }

        public Criteria andSecondviewBIsNull() {
            addCriterion("SecondView_B is null");
            return (Criteria) this;
        }

        public Criteria andSecondviewBIsNotNull() {
            addCriterion("SecondView_B is not null");
            return (Criteria) this;
        }

        public Criteria andSecondviewBEqualTo(String value) {
            addCriterion("SecondView_B =", value, "secondviewB");
            return (Criteria) this;
        }

        public Criteria andSecondviewBNotEqualTo(String value) {
            addCriterion("SecondView_B <>", value, "secondviewB");
            return (Criteria) this;
        }

        public Criteria andSecondviewBGreaterThan(String value) {
            addCriterion("SecondView_B >", value, "secondviewB");
            return (Criteria) this;
        }

        public Criteria andSecondviewBGreaterThanOrEqualTo(String value) {
            addCriterion("SecondView_B >=", value, "secondviewB");
            return (Criteria) this;
        }

        public Criteria andSecondviewBLessThan(String value) {
            addCriterion("SecondView_B <", value, "secondviewB");
            return (Criteria) this;
        }

        public Criteria andSecondviewBLessThanOrEqualTo(String value) {
            addCriterion("SecondView_B <=", value, "secondviewB");
            return (Criteria) this;
        }

        public Criteria andSecondviewBLike(String value) {
            addCriterion("SecondView_B like", value, "secondviewB");
            return (Criteria) this;
        }

        public Criteria andSecondviewBNotLike(String value) {
            addCriterion("SecondView_B not like", value, "secondviewB");
            return (Criteria) this;
        }

        public Criteria andSecondviewBIn(List<String> values) {
            addCriterion("SecondView_B in", values, "secondviewB");
            return (Criteria) this;
        }

        public Criteria andSecondviewBNotIn(List<String> values) {
            addCriterion("SecondView_B not in", values, "secondviewB");
            return (Criteria) this;
        }

        public Criteria andSecondviewBBetween(String value1, String value2) {
            addCriterion("SecondView_B between", value1, value2, "secondviewB");
            return (Criteria) this;
        }

        public Criteria andSecondviewBNotBetween(String value1, String value2) {
            addCriterion("SecondView_B not between", value1, value2, "secondviewB");
            return (Criteria) this;
        }

        public Criteria andSecondviewCIsNull() {
            addCriterion("SecondView_C is null");
            return (Criteria) this;
        }

        public Criteria andSecondviewCIsNotNull() {
            addCriterion("SecondView_C is not null");
            return (Criteria) this;
        }

        public Criteria andSecondviewCEqualTo(String value) {
            addCriterion("SecondView_C =", value, "secondviewC");
            return (Criteria) this;
        }

        public Criteria andSecondviewCNotEqualTo(String value) {
            addCriterion("SecondView_C <>", value, "secondviewC");
            return (Criteria) this;
        }

        public Criteria andSecondviewCGreaterThan(String value) {
            addCriterion("SecondView_C >", value, "secondviewC");
            return (Criteria) this;
        }

        public Criteria andSecondviewCGreaterThanOrEqualTo(String value) {
            addCriterion("SecondView_C >=", value, "secondviewC");
            return (Criteria) this;
        }

        public Criteria andSecondviewCLessThan(String value) {
            addCriterion("SecondView_C <", value, "secondviewC");
            return (Criteria) this;
        }

        public Criteria andSecondviewCLessThanOrEqualTo(String value) {
            addCriterion("SecondView_C <=", value, "secondviewC");
            return (Criteria) this;
        }

        public Criteria andSecondviewCLike(String value) {
            addCriterion("SecondView_C like", value, "secondviewC");
            return (Criteria) this;
        }

        public Criteria andSecondviewCNotLike(String value) {
            addCriterion("SecondView_C not like", value, "secondviewC");
            return (Criteria) this;
        }

        public Criteria andSecondviewCIn(List<String> values) {
            addCriterion("SecondView_C in", values, "secondviewC");
            return (Criteria) this;
        }

        public Criteria andSecondviewCNotIn(List<String> values) {
            addCriterion("SecondView_C not in", values, "secondviewC");
            return (Criteria) this;
        }

        public Criteria andSecondviewCBetween(String value1, String value2) {
            addCriterion("SecondView_C between", value1, value2, "secondviewC");
            return (Criteria) this;
        }

        public Criteria andSecondviewCNotBetween(String value1, String value2) {
            addCriterion("SecondView_C not between", value1, value2, "secondviewC");
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