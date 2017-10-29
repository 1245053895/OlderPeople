package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class ColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColorExample() {
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

        public Criteria andColoridIsNull() {
            addCriterion("ColorId is null");
            return (Criteria) this;
        }

        public Criteria andColoridIsNotNull() {
            addCriterion("ColorId is not null");
            return (Criteria) this;
        }

        public Criteria andColoridEqualTo(Integer value) {
            addCriterion("ColorId =", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotEqualTo(Integer value) {
            addCriterion("ColorId <>", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThan(Integer value) {
            addCriterion("ColorId >", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ColorId >=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThan(Integer value) {
            addCriterion("ColorId <", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThanOrEqualTo(Integer value) {
            addCriterion("ColorId <=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridIn(List<Integer> values) {
            addCriterion("ColorId in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotIn(List<Integer> values) {
            addCriterion("ColorId not in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridBetween(Integer value1, Integer value2) {
            addCriterion("ColorId between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotBetween(Integer value1, Integer value2) {
            addCriterion("ColorId not between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColornameIsNull() {
            addCriterion("ColorName is null");
            return (Criteria) this;
        }

        public Criteria andColornameIsNotNull() {
            addCriterion("ColorName is not null");
            return (Criteria) this;
        }

        public Criteria andColornameEqualTo(String value) {
            addCriterion("ColorName =", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotEqualTo(String value) {
            addCriterion("ColorName <>", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameGreaterThan(String value) {
            addCriterion("ColorName >", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameGreaterThanOrEqualTo(String value) {
            addCriterion("ColorName >=", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLessThan(String value) {
            addCriterion("ColorName <", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLessThanOrEqualTo(String value) {
            addCriterion("ColorName <=", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLike(String value) {
            addCriterion("ColorName like", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotLike(String value) {
            addCriterion("ColorName not like", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameIn(List<String> values) {
            addCriterion("ColorName in", values, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotIn(List<String> values) {
            addCriterion("ColorName not in", values, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameBetween(String value1, String value2) {
            addCriterion("ColorName between", value1, value2, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotBetween(String value1, String value2) {
            addCriterion("ColorName not between", value1, value2, "colorname");
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

        public Criteria andColorAIsNull() {
            addCriterion("Color_A is null");
            return (Criteria) this;
        }

        public Criteria andColorAIsNotNull() {
            addCriterion("Color_A is not null");
            return (Criteria) this;
        }

        public Criteria andColorAEqualTo(String value) {
            addCriterion("Color_A =", value, "colorA");
            return (Criteria) this;
        }

        public Criteria andColorANotEqualTo(String value) {
            addCriterion("Color_A <>", value, "colorA");
            return (Criteria) this;
        }

        public Criteria andColorAGreaterThan(String value) {
            addCriterion("Color_A >", value, "colorA");
            return (Criteria) this;
        }

        public Criteria andColorAGreaterThanOrEqualTo(String value) {
            addCriterion("Color_A >=", value, "colorA");
            return (Criteria) this;
        }

        public Criteria andColorALessThan(String value) {
            addCriterion("Color_A <", value, "colorA");
            return (Criteria) this;
        }

        public Criteria andColorALessThanOrEqualTo(String value) {
            addCriterion("Color_A <=", value, "colorA");
            return (Criteria) this;
        }

        public Criteria andColorALike(String value) {
            addCriterion("Color_A like", value, "colorA");
            return (Criteria) this;
        }

        public Criteria andColorANotLike(String value) {
            addCriterion("Color_A not like", value, "colorA");
            return (Criteria) this;
        }

        public Criteria andColorAIn(List<String> values) {
            addCriterion("Color_A in", values, "colorA");
            return (Criteria) this;
        }

        public Criteria andColorANotIn(List<String> values) {
            addCriterion("Color_A not in", values, "colorA");
            return (Criteria) this;
        }

        public Criteria andColorABetween(String value1, String value2) {
            addCriterion("Color_A between", value1, value2, "colorA");
            return (Criteria) this;
        }

        public Criteria andColorANotBetween(String value1, String value2) {
            addCriterion("Color_A not between", value1, value2, "colorA");
            return (Criteria) this;
        }

        public Criteria andColorBIsNull() {
            addCriterion("Color_B is null");
            return (Criteria) this;
        }

        public Criteria andColorBIsNotNull() {
            addCriterion("Color_B is not null");
            return (Criteria) this;
        }

        public Criteria andColorBEqualTo(String value) {
            addCriterion("Color_B =", value, "colorB");
            return (Criteria) this;
        }

        public Criteria andColorBNotEqualTo(String value) {
            addCriterion("Color_B <>", value, "colorB");
            return (Criteria) this;
        }

        public Criteria andColorBGreaterThan(String value) {
            addCriterion("Color_B >", value, "colorB");
            return (Criteria) this;
        }

        public Criteria andColorBGreaterThanOrEqualTo(String value) {
            addCriterion("Color_B >=", value, "colorB");
            return (Criteria) this;
        }

        public Criteria andColorBLessThan(String value) {
            addCriterion("Color_B <", value, "colorB");
            return (Criteria) this;
        }

        public Criteria andColorBLessThanOrEqualTo(String value) {
            addCriterion("Color_B <=", value, "colorB");
            return (Criteria) this;
        }

        public Criteria andColorBLike(String value) {
            addCriterion("Color_B like", value, "colorB");
            return (Criteria) this;
        }

        public Criteria andColorBNotLike(String value) {
            addCriterion("Color_B not like", value, "colorB");
            return (Criteria) this;
        }

        public Criteria andColorBIn(List<String> values) {
            addCriterion("Color_B in", values, "colorB");
            return (Criteria) this;
        }

        public Criteria andColorBNotIn(List<String> values) {
            addCriterion("Color_B not in", values, "colorB");
            return (Criteria) this;
        }

        public Criteria andColorBBetween(String value1, String value2) {
            addCriterion("Color_B between", value1, value2, "colorB");
            return (Criteria) this;
        }

        public Criteria andColorBNotBetween(String value1, String value2) {
            addCriterion("Color_B not between", value1, value2, "colorB");
            return (Criteria) this;
        }

        public Criteria andColorCIsNull() {
            addCriterion("Color_C is null");
            return (Criteria) this;
        }

        public Criteria andColorCIsNotNull() {
            addCriterion("Color_C is not null");
            return (Criteria) this;
        }

        public Criteria andColorCEqualTo(String value) {
            addCriterion("Color_C =", value, "colorC");
            return (Criteria) this;
        }

        public Criteria andColorCNotEqualTo(String value) {
            addCriterion("Color_C <>", value, "colorC");
            return (Criteria) this;
        }

        public Criteria andColorCGreaterThan(String value) {
            addCriterion("Color_C >", value, "colorC");
            return (Criteria) this;
        }

        public Criteria andColorCGreaterThanOrEqualTo(String value) {
            addCriterion("Color_C >=", value, "colorC");
            return (Criteria) this;
        }

        public Criteria andColorCLessThan(String value) {
            addCriterion("Color_C <", value, "colorC");
            return (Criteria) this;
        }

        public Criteria andColorCLessThanOrEqualTo(String value) {
            addCriterion("Color_C <=", value, "colorC");
            return (Criteria) this;
        }

        public Criteria andColorCLike(String value) {
            addCriterion("Color_C like", value, "colorC");
            return (Criteria) this;
        }

        public Criteria andColorCNotLike(String value) {
            addCriterion("Color_C not like", value, "colorC");
            return (Criteria) this;
        }

        public Criteria andColorCIn(List<String> values) {
            addCriterion("Color_C in", values, "colorC");
            return (Criteria) this;
        }

        public Criteria andColorCNotIn(List<String> values) {
            addCriterion("Color_C not in", values, "colorC");
            return (Criteria) this;
        }

        public Criteria andColorCBetween(String value1, String value2) {
            addCriterion("Color_C between", value1, value2, "colorC");
            return (Criteria) this;
        }

        public Criteria andColorCNotBetween(String value1, String value2) {
            addCriterion("Color_C not between", value1, value2, "colorC");
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