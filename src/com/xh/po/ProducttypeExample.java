package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class ProducttypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProducttypeExample() {
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

        public Criteria andProducttypenameIsNull() {
            addCriterion("ProductTypeName is null");
            return (Criteria) this;
        }

        public Criteria andProducttypenameIsNotNull() {
            addCriterion("ProductTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypenameEqualTo(String value) {
            addCriterion("ProductTypeName =", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameNotEqualTo(String value) {
            addCriterion("ProductTypeName <>", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameGreaterThan(String value) {
            addCriterion("ProductTypeName >", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductTypeName >=", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameLessThan(String value) {
            addCriterion("ProductTypeName <", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameLessThanOrEqualTo(String value) {
            addCriterion("ProductTypeName <=", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameLike(String value) {
            addCriterion("ProductTypeName like", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameNotLike(String value) {
            addCriterion("ProductTypeName not like", value, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameIn(List<String> values) {
            addCriterion("ProductTypeName in", values, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameNotIn(List<String> values) {
            addCriterion("ProductTypeName not in", values, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameBetween(String value1, String value2) {
            addCriterion("ProductTypeName between", value1, value2, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypenameNotBetween(String value1, String value2) {
            addCriterion("ProductTypeName not between", value1, value2, "producttypename");
            return (Criteria) this;
        }

        public Criteria andProducttypeAIsNull() {
            addCriterion("ProductType_A is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeAIsNotNull() {
            addCriterion("ProductType_A is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeAEqualTo(String value) {
            addCriterion("ProductType_A =", value, "producttypeA");
            return (Criteria) this;
        }

        public Criteria andProducttypeANotEqualTo(String value) {
            addCriterion("ProductType_A <>", value, "producttypeA");
            return (Criteria) this;
        }

        public Criteria andProducttypeAGreaterThan(String value) {
            addCriterion("ProductType_A >", value, "producttypeA");
            return (Criteria) this;
        }

        public Criteria andProducttypeAGreaterThanOrEqualTo(String value) {
            addCriterion("ProductType_A >=", value, "producttypeA");
            return (Criteria) this;
        }

        public Criteria andProducttypeALessThan(String value) {
            addCriterion("ProductType_A <", value, "producttypeA");
            return (Criteria) this;
        }

        public Criteria andProducttypeALessThanOrEqualTo(String value) {
            addCriterion("ProductType_A <=", value, "producttypeA");
            return (Criteria) this;
        }

        public Criteria andProducttypeALike(String value) {
            addCriterion("ProductType_A like", value, "producttypeA");
            return (Criteria) this;
        }

        public Criteria andProducttypeANotLike(String value) {
            addCriterion("ProductType_A not like", value, "producttypeA");
            return (Criteria) this;
        }

        public Criteria andProducttypeAIn(List<String> values) {
            addCriterion("ProductType_A in", values, "producttypeA");
            return (Criteria) this;
        }

        public Criteria andProducttypeANotIn(List<String> values) {
            addCriterion("ProductType_A not in", values, "producttypeA");
            return (Criteria) this;
        }

        public Criteria andProducttypeABetween(String value1, String value2) {
            addCriterion("ProductType_A between", value1, value2, "producttypeA");
            return (Criteria) this;
        }

        public Criteria andProducttypeANotBetween(String value1, String value2) {
            addCriterion("ProductType_A not between", value1, value2, "producttypeA");
            return (Criteria) this;
        }

        public Criteria andProducttypeBIsNull() {
            addCriterion("ProductType_B is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeBIsNotNull() {
            addCriterion("ProductType_B is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeBEqualTo(String value) {
            addCriterion("ProductType_B =", value, "producttypeB");
            return (Criteria) this;
        }

        public Criteria andProducttypeBNotEqualTo(String value) {
            addCriterion("ProductType_B <>", value, "producttypeB");
            return (Criteria) this;
        }

        public Criteria andProducttypeBGreaterThan(String value) {
            addCriterion("ProductType_B >", value, "producttypeB");
            return (Criteria) this;
        }

        public Criteria andProducttypeBGreaterThanOrEqualTo(String value) {
            addCriterion("ProductType_B >=", value, "producttypeB");
            return (Criteria) this;
        }

        public Criteria andProducttypeBLessThan(String value) {
            addCriterion("ProductType_B <", value, "producttypeB");
            return (Criteria) this;
        }

        public Criteria andProducttypeBLessThanOrEqualTo(String value) {
            addCriterion("ProductType_B <=", value, "producttypeB");
            return (Criteria) this;
        }

        public Criteria andProducttypeBLike(String value) {
            addCriterion("ProductType_B like", value, "producttypeB");
            return (Criteria) this;
        }

        public Criteria andProducttypeBNotLike(String value) {
            addCriterion("ProductType_B not like", value, "producttypeB");
            return (Criteria) this;
        }

        public Criteria andProducttypeBIn(List<String> values) {
            addCriterion("ProductType_B in", values, "producttypeB");
            return (Criteria) this;
        }

        public Criteria andProducttypeBNotIn(List<String> values) {
            addCriterion("ProductType_B not in", values, "producttypeB");
            return (Criteria) this;
        }

        public Criteria andProducttypeBBetween(String value1, String value2) {
            addCriterion("ProductType_B between", value1, value2, "producttypeB");
            return (Criteria) this;
        }

        public Criteria andProducttypeBNotBetween(String value1, String value2) {
            addCriterion("ProductType_B not between", value1, value2, "producttypeB");
            return (Criteria) this;
        }

        public Criteria andProducttypeCIsNull() {
            addCriterion("ProductType_C is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeCIsNotNull() {
            addCriterion("ProductType_C is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeCEqualTo(String value) {
            addCriterion("ProductType_C =", value, "producttypeC");
            return (Criteria) this;
        }

        public Criteria andProducttypeCNotEqualTo(String value) {
            addCriterion("ProductType_C <>", value, "producttypeC");
            return (Criteria) this;
        }

        public Criteria andProducttypeCGreaterThan(String value) {
            addCriterion("ProductType_C >", value, "producttypeC");
            return (Criteria) this;
        }

        public Criteria andProducttypeCGreaterThanOrEqualTo(String value) {
            addCriterion("ProductType_C >=", value, "producttypeC");
            return (Criteria) this;
        }

        public Criteria andProducttypeCLessThan(String value) {
            addCriterion("ProductType_C <", value, "producttypeC");
            return (Criteria) this;
        }

        public Criteria andProducttypeCLessThanOrEqualTo(String value) {
            addCriterion("ProductType_C <=", value, "producttypeC");
            return (Criteria) this;
        }

        public Criteria andProducttypeCLike(String value) {
            addCriterion("ProductType_C like", value, "producttypeC");
            return (Criteria) this;
        }

        public Criteria andProducttypeCNotLike(String value) {
            addCriterion("ProductType_C not like", value, "producttypeC");
            return (Criteria) this;
        }

        public Criteria andProducttypeCIn(List<String> values) {
            addCriterion("ProductType_C in", values, "producttypeC");
            return (Criteria) this;
        }

        public Criteria andProducttypeCNotIn(List<String> values) {
            addCriterion("ProductType_C not in", values, "producttypeC");
            return (Criteria) this;
        }

        public Criteria andProducttypeCBetween(String value1, String value2) {
            addCriterion("ProductType_C between", value1, value2, "producttypeC");
            return (Criteria) this;
        }

        public Criteria andProducttypeCNotBetween(String value1, String value2) {
            addCriterion("ProductType_C not between", value1, value2, "producttypeC");
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