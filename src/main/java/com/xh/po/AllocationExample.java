package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class AllocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AllocationExample() {
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

        public Criteria andAllocationidIsNull() {
            addCriterion("AllocationId is null");
            return (Criteria) this;
        }

        public Criteria andAllocationidIsNotNull() {
            addCriterion("AllocationId is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationidEqualTo(Integer value) {
            addCriterion("AllocationId =", value, "allocationid");
            return (Criteria) this;
        }

        public Criteria andAllocationidNotEqualTo(Integer value) {
            addCriterion("AllocationId <>", value, "allocationid");
            return (Criteria) this;
        }

        public Criteria andAllocationidGreaterThan(Integer value) {
            addCriterion("AllocationId >", value, "allocationid");
            return (Criteria) this;
        }

        public Criteria andAllocationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AllocationId >=", value, "allocationid");
            return (Criteria) this;
        }

        public Criteria andAllocationidLessThan(Integer value) {
            addCriterion("AllocationId <", value, "allocationid");
            return (Criteria) this;
        }

        public Criteria andAllocationidLessThanOrEqualTo(Integer value) {
            addCriterion("AllocationId <=", value, "allocationid");
            return (Criteria) this;
        }

        public Criteria andAllocationidIn(List<Integer> values) {
            addCriterion("AllocationId in", values, "allocationid");
            return (Criteria) this;
        }

        public Criteria andAllocationidNotIn(List<Integer> values) {
            addCriterion("AllocationId not in", values, "allocationid");
            return (Criteria) this;
        }

        public Criteria andAllocationidBetween(Integer value1, Integer value2) {
            addCriterion("AllocationId between", value1, value2, "allocationid");
            return (Criteria) this;
        }

        public Criteria andAllocationidNotBetween(Integer value1, Integer value2) {
            addCriterion("AllocationId not between", value1, value2, "allocationid");
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

        public Criteria andProxyidIsNull() {
            addCriterion("ProxyId is null");
            return (Criteria) this;
        }

        public Criteria andProxyidIsNotNull() {
            addCriterion("ProxyId is not null");
            return (Criteria) this;
        }

        public Criteria andProxyidEqualTo(Integer value) {
            addCriterion("ProxyId =", value, "proxyid");
            return (Criteria) this;
        }

        public Criteria andProxyidNotEqualTo(Integer value) {
            addCriterion("ProxyId <>", value, "proxyid");
            return (Criteria) this;
        }

        public Criteria andProxyidGreaterThan(Integer value) {
            addCriterion("ProxyId >", value, "proxyid");
            return (Criteria) this;
        }

        public Criteria andProxyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProxyId >=", value, "proxyid");
            return (Criteria) this;
        }

        public Criteria andProxyidLessThan(Integer value) {
            addCriterion("ProxyId <", value, "proxyid");
            return (Criteria) this;
        }

        public Criteria andProxyidLessThanOrEqualTo(Integer value) {
            addCriterion("ProxyId <=", value, "proxyid");
            return (Criteria) this;
        }

        public Criteria andProxyidIn(List<Integer> values) {
            addCriterion("ProxyId in", values, "proxyid");
            return (Criteria) this;
        }

        public Criteria andProxyidNotIn(List<Integer> values) {
            addCriterion("ProxyId not in", values, "proxyid");
            return (Criteria) this;
        }

        public Criteria andProxyidBetween(Integer value1, Integer value2) {
            addCriterion("ProxyId between", value1, value2, "proxyid");
            return (Criteria) this;
        }

        public Criteria andProxyidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProxyId not between", value1, value2, "proxyid");
            return (Criteria) this;
        }

        public Criteria andAllocationnumbleIsNull() {
            addCriterion("AllocationNumble is null");
            return (Criteria) this;
        }

        public Criteria andAllocationnumbleIsNotNull() {
            addCriterion("AllocationNumble is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationnumbleEqualTo(Integer value) {
            addCriterion("AllocationNumble =", value, "allocationnumble");
            return (Criteria) this;
        }

        public Criteria andAllocationnumbleNotEqualTo(Integer value) {
            addCriterion("AllocationNumble <>", value, "allocationnumble");
            return (Criteria) this;
        }

        public Criteria andAllocationnumbleGreaterThan(Integer value) {
            addCriterion("AllocationNumble >", value, "allocationnumble");
            return (Criteria) this;
        }

        public Criteria andAllocationnumbleGreaterThanOrEqualTo(Integer value) {
            addCriterion("AllocationNumble >=", value, "allocationnumble");
            return (Criteria) this;
        }

        public Criteria andAllocationnumbleLessThan(Integer value) {
            addCriterion("AllocationNumble <", value, "allocationnumble");
            return (Criteria) this;
        }

        public Criteria andAllocationnumbleLessThanOrEqualTo(Integer value) {
            addCriterion("AllocationNumble <=", value, "allocationnumble");
            return (Criteria) this;
        }

        public Criteria andAllocationnumbleIn(List<Integer> values) {
            addCriterion("AllocationNumble in", values, "allocationnumble");
            return (Criteria) this;
        }

        public Criteria andAllocationnumbleNotIn(List<Integer> values) {
            addCriterion("AllocationNumble not in", values, "allocationnumble");
            return (Criteria) this;
        }

        public Criteria andAllocationnumbleBetween(Integer value1, Integer value2) {
            addCriterion("AllocationNumble between", value1, value2, "allocationnumble");
            return (Criteria) this;
        }

        public Criteria andAllocationnumbleNotBetween(Integer value1, Integer value2) {
            addCriterion("AllocationNumble not between", value1, value2, "allocationnumble");
            return (Criteria) this;
        }

        public Criteria andAllocationAIsNull() {
            addCriterion("Allocation_A is null");
            return (Criteria) this;
        }

        public Criteria andAllocationAIsNotNull() {
            addCriterion("Allocation_A is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationAEqualTo(String value) {
            addCriterion("Allocation_A =", value, "allocationA");
            return (Criteria) this;
        }

        public Criteria andAllocationANotEqualTo(String value) {
            addCriterion("Allocation_A <>", value, "allocationA");
            return (Criteria) this;
        }

        public Criteria andAllocationAGreaterThan(String value) {
            addCriterion("Allocation_A >", value, "allocationA");
            return (Criteria) this;
        }

        public Criteria andAllocationAGreaterThanOrEqualTo(String value) {
            addCriterion("Allocation_A >=", value, "allocationA");
            return (Criteria) this;
        }

        public Criteria andAllocationALessThan(String value) {
            addCriterion("Allocation_A <", value, "allocationA");
            return (Criteria) this;
        }

        public Criteria andAllocationALessThanOrEqualTo(String value) {
            addCriterion("Allocation_A <=", value, "allocationA");
            return (Criteria) this;
        }

        public Criteria andAllocationALike(String value) {
            addCriterion("Allocation_A like", value, "allocationA");
            return (Criteria) this;
        }

        public Criteria andAllocationANotLike(String value) {
            addCriterion("Allocation_A not like", value, "allocationA");
            return (Criteria) this;
        }

        public Criteria andAllocationAIn(List<String> values) {
            addCriterion("Allocation_A in", values, "allocationA");
            return (Criteria) this;
        }

        public Criteria andAllocationANotIn(List<String> values) {
            addCriterion("Allocation_A not in", values, "allocationA");
            return (Criteria) this;
        }

        public Criteria andAllocationABetween(String value1, String value2) {
            addCriterion("Allocation_A between", value1, value2, "allocationA");
            return (Criteria) this;
        }

        public Criteria andAllocationANotBetween(String value1, String value2) {
            addCriterion("Allocation_A not between", value1, value2, "allocationA");
            return (Criteria) this;
        }

        public Criteria andAllocationBIsNull() {
            addCriterion("Allocation_B is null");
            return (Criteria) this;
        }

        public Criteria andAllocationBIsNotNull() {
            addCriterion("Allocation_B is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationBEqualTo(String value) {
            addCriterion("Allocation_B =", value, "allocationB");
            return (Criteria) this;
        }

        public Criteria andAllocationBNotEqualTo(String value) {
            addCriterion("Allocation_B <>", value, "allocationB");
            return (Criteria) this;
        }

        public Criteria andAllocationBGreaterThan(String value) {
            addCriterion("Allocation_B >", value, "allocationB");
            return (Criteria) this;
        }

        public Criteria andAllocationBGreaterThanOrEqualTo(String value) {
            addCriterion("Allocation_B >=", value, "allocationB");
            return (Criteria) this;
        }

        public Criteria andAllocationBLessThan(String value) {
            addCriterion("Allocation_B <", value, "allocationB");
            return (Criteria) this;
        }

        public Criteria andAllocationBLessThanOrEqualTo(String value) {
            addCriterion("Allocation_B <=", value, "allocationB");
            return (Criteria) this;
        }

        public Criteria andAllocationBLike(String value) {
            addCriterion("Allocation_B like", value, "allocationB");
            return (Criteria) this;
        }

        public Criteria andAllocationBNotLike(String value) {
            addCriterion("Allocation_B not like", value, "allocationB");
            return (Criteria) this;
        }

        public Criteria andAllocationBIn(List<String> values) {
            addCriterion("Allocation_B in", values, "allocationB");
            return (Criteria) this;
        }

        public Criteria andAllocationBNotIn(List<String> values) {
            addCriterion("Allocation_B not in", values, "allocationB");
            return (Criteria) this;
        }

        public Criteria andAllocationBBetween(String value1, String value2) {
            addCriterion("Allocation_B between", value1, value2, "allocationB");
            return (Criteria) this;
        }

        public Criteria andAllocationBNotBetween(String value1, String value2) {
            addCriterion("Allocation_B not between", value1, value2, "allocationB");
            return (Criteria) this;
        }

        public Criteria andAllocationCIsNull() {
            addCriterion("Allocation_C is null");
            return (Criteria) this;
        }

        public Criteria andAllocationCIsNotNull() {
            addCriterion("Allocation_C is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationCEqualTo(String value) {
            addCriterion("Allocation_C =", value, "allocationC");
            return (Criteria) this;
        }

        public Criteria andAllocationCNotEqualTo(String value) {
            addCriterion("Allocation_C <>", value, "allocationC");
            return (Criteria) this;
        }

        public Criteria andAllocationCGreaterThan(String value) {
            addCriterion("Allocation_C >", value, "allocationC");
            return (Criteria) this;
        }

        public Criteria andAllocationCGreaterThanOrEqualTo(String value) {
            addCriterion("Allocation_C >=", value, "allocationC");
            return (Criteria) this;
        }

        public Criteria andAllocationCLessThan(String value) {
            addCriterion("Allocation_C <", value, "allocationC");
            return (Criteria) this;
        }

        public Criteria andAllocationCLessThanOrEqualTo(String value) {
            addCriterion("Allocation_C <=", value, "allocationC");
            return (Criteria) this;
        }

        public Criteria andAllocationCLike(String value) {
            addCriterion("Allocation_C like", value, "allocationC");
            return (Criteria) this;
        }

        public Criteria andAllocationCNotLike(String value) {
            addCriterion("Allocation_C not like", value, "allocationC");
            return (Criteria) this;
        }

        public Criteria andAllocationCIn(List<String> values) {
            addCriterion("Allocation_C in", values, "allocationC");
            return (Criteria) this;
        }

        public Criteria andAllocationCNotIn(List<String> values) {
            addCriterion("Allocation_C not in", values, "allocationC");
            return (Criteria) this;
        }

        public Criteria andAllocationCBetween(String value1, String value2) {
            addCriterion("Allocation_C between", value1, value2, "allocationC");
            return (Criteria) this;
        }

        public Criteria andAllocationCNotBetween(String value1, String value2) {
            addCriterion("Allocation_C not between", value1, value2, "allocationC");
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