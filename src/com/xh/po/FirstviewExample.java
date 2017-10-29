package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class FirstviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FirstviewExample() {
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

        public Criteria andFirstviewidIsNull() {
            addCriterion("FirstViewId is null");
            return (Criteria) this;
        }

        public Criteria andFirstviewidIsNotNull() {
            addCriterion("FirstViewId is not null");
            return (Criteria) this;
        }

        public Criteria andFirstviewidEqualTo(Integer value) {
            addCriterion("FirstViewId =", value, "firstviewid");
            return (Criteria) this;
        }

        public Criteria andFirstviewidNotEqualTo(Integer value) {
            addCriterion("FirstViewId <>", value, "firstviewid");
            return (Criteria) this;
        }

        public Criteria andFirstviewidGreaterThan(Integer value) {
            addCriterion("FirstViewId >", value, "firstviewid");
            return (Criteria) this;
        }

        public Criteria andFirstviewidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FirstViewId >=", value, "firstviewid");
            return (Criteria) this;
        }

        public Criteria andFirstviewidLessThan(Integer value) {
            addCriterion("FirstViewId <", value, "firstviewid");
            return (Criteria) this;
        }

        public Criteria andFirstviewidLessThanOrEqualTo(Integer value) {
            addCriterion("FirstViewId <=", value, "firstviewid");
            return (Criteria) this;
        }

        public Criteria andFirstviewidIn(List<Integer> values) {
            addCriterion("FirstViewId in", values, "firstviewid");
            return (Criteria) this;
        }

        public Criteria andFirstviewidNotIn(List<Integer> values) {
            addCriterion("FirstViewId not in", values, "firstviewid");
            return (Criteria) this;
        }

        public Criteria andFirstviewidBetween(Integer value1, Integer value2) {
            addCriterion("FirstViewId between", value1, value2, "firstviewid");
            return (Criteria) this;
        }

        public Criteria andFirstviewidNotBetween(Integer value1, Integer value2) {
            addCriterion("FirstViewId not between", value1, value2, "firstviewid");
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

        public Criteria andFirstviewdescriptionIsNull() {
            addCriterion("FirstViewDescription is null");
            return (Criteria) this;
        }

        public Criteria andFirstviewdescriptionIsNotNull() {
            addCriterion("FirstViewDescription is not null");
            return (Criteria) this;
        }

        public Criteria andFirstviewdescriptionEqualTo(String value) {
            addCriterion("FirstViewDescription =", value, "firstviewdescription");
            return (Criteria) this;
        }

        public Criteria andFirstviewdescriptionNotEqualTo(String value) {
            addCriterion("FirstViewDescription <>", value, "firstviewdescription");
            return (Criteria) this;
        }

        public Criteria andFirstviewdescriptionGreaterThan(String value) {
            addCriterion("FirstViewDescription >", value, "firstviewdescription");
            return (Criteria) this;
        }

        public Criteria andFirstviewdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("FirstViewDescription >=", value, "firstviewdescription");
            return (Criteria) this;
        }

        public Criteria andFirstviewdescriptionLessThan(String value) {
            addCriterion("FirstViewDescription <", value, "firstviewdescription");
            return (Criteria) this;
        }

        public Criteria andFirstviewdescriptionLessThanOrEqualTo(String value) {
            addCriterion("FirstViewDescription <=", value, "firstviewdescription");
            return (Criteria) this;
        }

        public Criteria andFirstviewdescriptionLike(String value) {
            addCriterion("FirstViewDescription like", value, "firstviewdescription");
            return (Criteria) this;
        }

        public Criteria andFirstviewdescriptionNotLike(String value) {
            addCriterion("FirstViewDescription not like", value, "firstviewdescription");
            return (Criteria) this;
        }

        public Criteria andFirstviewdescriptionIn(List<String> values) {
            addCriterion("FirstViewDescription in", values, "firstviewdescription");
            return (Criteria) this;
        }

        public Criteria andFirstviewdescriptionNotIn(List<String> values) {
            addCriterion("FirstViewDescription not in", values, "firstviewdescription");
            return (Criteria) this;
        }

        public Criteria andFirstviewdescriptionBetween(String value1, String value2) {
            addCriterion("FirstViewDescription between", value1, value2, "firstviewdescription");
            return (Criteria) this;
        }

        public Criteria andFirstviewdescriptionNotBetween(String value1, String value2) {
            addCriterion("FirstViewDescription not between", value1, value2, "firstviewdescription");
            return (Criteria) this;
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

        public Criteria andFirstviewAIsNull() {
            addCriterion("FirstView_A is null");
            return (Criteria) this;
        }

        public Criteria andFirstviewAIsNotNull() {
            addCriterion("FirstView_A is not null");
            return (Criteria) this;
        }

        public Criteria andFirstviewAEqualTo(String value) {
            addCriterion("FirstView_A =", value, "firstviewA");
            return (Criteria) this;
        }

        public Criteria andFirstviewANotEqualTo(String value) {
            addCriterion("FirstView_A <>", value, "firstviewA");
            return (Criteria) this;
        }

        public Criteria andFirstviewAGreaterThan(String value) {
            addCriterion("FirstView_A >", value, "firstviewA");
            return (Criteria) this;
        }

        public Criteria andFirstviewAGreaterThanOrEqualTo(String value) {
            addCriterion("FirstView_A >=", value, "firstviewA");
            return (Criteria) this;
        }

        public Criteria andFirstviewALessThan(String value) {
            addCriterion("FirstView_A <", value, "firstviewA");
            return (Criteria) this;
        }

        public Criteria andFirstviewALessThanOrEqualTo(String value) {
            addCriterion("FirstView_A <=", value, "firstviewA");
            return (Criteria) this;
        }

        public Criteria andFirstviewALike(String value) {
            addCriterion("FirstView_A like", value, "firstviewA");
            return (Criteria) this;
        }

        public Criteria andFirstviewANotLike(String value) {
            addCriterion("FirstView_A not like", value, "firstviewA");
            return (Criteria) this;
        }

        public Criteria andFirstviewAIn(List<String> values) {
            addCriterion("FirstView_A in", values, "firstviewA");
            return (Criteria) this;
        }

        public Criteria andFirstviewANotIn(List<String> values) {
            addCriterion("FirstView_A not in", values, "firstviewA");
            return (Criteria) this;
        }

        public Criteria andFirstviewABetween(String value1, String value2) {
            addCriterion("FirstView_A between", value1, value2, "firstviewA");
            return (Criteria) this;
        }

        public Criteria andFirstviewANotBetween(String value1, String value2) {
            addCriterion("FirstView_A not between", value1, value2, "firstviewA");
            return (Criteria) this;
        }

        public Criteria andFirstviewBIsNull() {
            addCriterion("FirstView_B is null");
            return (Criteria) this;
        }

        public Criteria andFirstviewBIsNotNull() {
            addCriterion("FirstView_B is not null");
            return (Criteria) this;
        }

        public Criteria andFirstviewBEqualTo(String value) {
            addCriterion("FirstView_B =", value, "firstviewB");
            return (Criteria) this;
        }

        public Criteria andFirstviewBNotEqualTo(String value) {
            addCriterion("FirstView_B <>", value, "firstviewB");
            return (Criteria) this;
        }

        public Criteria andFirstviewBGreaterThan(String value) {
            addCriterion("FirstView_B >", value, "firstviewB");
            return (Criteria) this;
        }

        public Criteria andFirstviewBGreaterThanOrEqualTo(String value) {
            addCriterion("FirstView_B >=", value, "firstviewB");
            return (Criteria) this;
        }

        public Criteria andFirstviewBLessThan(String value) {
            addCriterion("FirstView_B <", value, "firstviewB");
            return (Criteria) this;
        }

        public Criteria andFirstviewBLessThanOrEqualTo(String value) {
            addCriterion("FirstView_B <=", value, "firstviewB");
            return (Criteria) this;
        }

        public Criteria andFirstviewBLike(String value) {
            addCriterion("FirstView_B like", value, "firstviewB");
            return (Criteria) this;
        }

        public Criteria andFirstviewBNotLike(String value) {
            addCriterion("FirstView_B not like", value, "firstviewB");
            return (Criteria) this;
        }

        public Criteria andFirstviewBIn(List<String> values) {
            addCriterion("FirstView_B in", values, "firstviewB");
            return (Criteria) this;
        }

        public Criteria andFirstviewBNotIn(List<String> values) {
            addCriterion("FirstView_B not in", values, "firstviewB");
            return (Criteria) this;
        }

        public Criteria andFirstviewBBetween(String value1, String value2) {
            addCriterion("FirstView_B between", value1, value2, "firstviewB");
            return (Criteria) this;
        }

        public Criteria andFirstviewBNotBetween(String value1, String value2) {
            addCriterion("FirstView_B not between", value1, value2, "firstviewB");
            return (Criteria) this;
        }

        public Criteria andFirstviewCIsNull() {
            addCriterion("FirstView_C is null");
            return (Criteria) this;
        }

        public Criteria andFirstviewCIsNotNull() {
            addCriterion("FirstView_C is not null");
            return (Criteria) this;
        }

        public Criteria andFirstviewCEqualTo(String value) {
            addCriterion("FirstView_C =", value, "firstviewC");
            return (Criteria) this;
        }

        public Criteria andFirstviewCNotEqualTo(String value) {
            addCriterion("FirstView_C <>", value, "firstviewC");
            return (Criteria) this;
        }

        public Criteria andFirstviewCGreaterThan(String value) {
            addCriterion("FirstView_C >", value, "firstviewC");
            return (Criteria) this;
        }

        public Criteria andFirstviewCGreaterThanOrEqualTo(String value) {
            addCriterion("FirstView_C >=", value, "firstviewC");
            return (Criteria) this;
        }

        public Criteria andFirstviewCLessThan(String value) {
            addCriterion("FirstView_C <", value, "firstviewC");
            return (Criteria) this;
        }

        public Criteria andFirstviewCLessThanOrEqualTo(String value) {
            addCriterion("FirstView_C <=", value, "firstviewC");
            return (Criteria) this;
        }

        public Criteria andFirstviewCLike(String value) {
            addCriterion("FirstView_C like", value, "firstviewC");
            return (Criteria) this;
        }

        public Criteria andFirstviewCNotLike(String value) {
            addCriterion("FirstView_C not like", value, "firstviewC");
            return (Criteria) this;
        }

        public Criteria andFirstviewCIn(List<String> values) {
            addCriterion("FirstView_C in", values, "firstviewC");
            return (Criteria) this;
        }

        public Criteria andFirstviewCNotIn(List<String> values) {
            addCriterion("FirstView_C not in", values, "firstviewC");
            return (Criteria) this;
        }

        public Criteria andFirstviewCBetween(String value1, String value2) {
            addCriterion("FirstView_C between", value1, value2, "firstviewC");
            return (Criteria) this;
        }

        public Criteria andFirstviewCNotBetween(String value1, String value2) {
            addCriterion("FirstView_C not between", value1, value2, "firstviewC");
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