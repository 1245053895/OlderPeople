package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class OrderproductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderproductExample() {
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

        public Criteria andOrderproductidIsNull() {
            addCriterion("OrderProductId is null");
            return (Criteria) this;
        }

        public Criteria andOrderproductidIsNotNull() {
            addCriterion("OrderProductId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderproductidEqualTo(Integer value) {
            addCriterion("OrderProductId =", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidNotEqualTo(Integer value) {
            addCriterion("OrderProductId <>", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidGreaterThan(Integer value) {
            addCriterion("OrderProductId >", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderProductId >=", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidLessThan(Integer value) {
            addCriterion("OrderProductId <", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidLessThanOrEqualTo(Integer value) {
            addCriterion("OrderProductId <=", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidIn(List<Integer> values) {
            addCriterion("OrderProductId in", values, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidNotIn(List<Integer> values) {
            addCriterion("OrderProductId not in", values, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidBetween(Integer value1, Integer value2) {
            addCriterion("OrderProductId between", value1, value2, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderProductId not between", value1, value2, "orderproductid");
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

        public Criteria andOrderidIsNull() {
            addCriterion("OrderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("OrderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("OrderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("OrderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("OrderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("OrderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("OrderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("OrderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("OrderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andShoppingcountIsNull() {
            addCriterion("ShoppingCount is null");
            return (Criteria) this;
        }

        public Criteria andShoppingcountIsNotNull() {
            addCriterion("ShoppingCount is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingcountEqualTo(Integer value) {
            addCriterion("ShoppingCount =", value, "shoppingcount");
            return (Criteria) this;
        }

        public Criteria andShoppingcountNotEqualTo(Integer value) {
            addCriterion("ShoppingCount <>", value, "shoppingcount");
            return (Criteria) this;
        }

        public Criteria andShoppingcountGreaterThan(Integer value) {
            addCriterion("ShoppingCount >", value, "shoppingcount");
            return (Criteria) this;
        }

        public Criteria andShoppingcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShoppingCount >=", value, "shoppingcount");
            return (Criteria) this;
        }

        public Criteria andShoppingcountLessThan(Integer value) {
            addCriterion("ShoppingCount <", value, "shoppingcount");
            return (Criteria) this;
        }

        public Criteria andShoppingcountLessThanOrEqualTo(Integer value) {
            addCriterion("ShoppingCount <=", value, "shoppingcount");
            return (Criteria) this;
        }

        public Criteria andShoppingcountIn(List<Integer> values) {
            addCriterion("ShoppingCount in", values, "shoppingcount");
            return (Criteria) this;
        }

        public Criteria andShoppingcountNotIn(List<Integer> values) {
            addCriterion("ShoppingCount not in", values, "shoppingcount");
            return (Criteria) this;
        }

        public Criteria andShoppingcountBetween(Integer value1, Integer value2) {
            addCriterion("ShoppingCount between", value1, value2, "shoppingcount");
            return (Criteria) this;
        }

        public Criteria andShoppingcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ShoppingCount not between", value1, value2, "shoppingcount");
            return (Criteria) this;
        }

        public Criteria andTotalmoneycountIsNull() {
            addCriterion("TotalMoneyCount is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneycountIsNotNull() {
            addCriterion("TotalMoneyCount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneycountEqualTo(Double value) {
            addCriterion("TotalMoneyCount =", value, "totalmoneycount");
            return (Criteria) this;
        }

        public Criteria andTotalmoneycountNotEqualTo(Double value) {
            addCriterion("TotalMoneyCount <>", value, "totalmoneycount");
            return (Criteria) this;
        }

        public Criteria andTotalmoneycountGreaterThan(Double value) {
            addCriterion("TotalMoneyCount >", value, "totalmoneycount");
            return (Criteria) this;
        }

        public Criteria andTotalmoneycountGreaterThanOrEqualTo(Double value) {
            addCriterion("TotalMoneyCount >=", value, "totalmoneycount");
            return (Criteria) this;
        }

        public Criteria andTotalmoneycountLessThan(Double value) {
            addCriterion("TotalMoneyCount <", value, "totalmoneycount");
            return (Criteria) this;
        }

        public Criteria andTotalmoneycountLessThanOrEqualTo(Double value) {
            addCriterion("TotalMoneyCount <=", value, "totalmoneycount");
            return (Criteria) this;
        }

        public Criteria andTotalmoneycountIn(List<Double> values) {
            addCriterion("TotalMoneyCount in", values, "totalmoneycount");
            return (Criteria) this;
        }

        public Criteria andTotalmoneycountNotIn(List<Double> values) {
            addCriterion("TotalMoneyCount not in", values, "totalmoneycount");
            return (Criteria) this;
        }

        public Criteria andTotalmoneycountBetween(Double value1, Double value2) {
            addCriterion("TotalMoneyCount between", value1, value2, "totalmoneycount");
            return (Criteria) this;
        }

        public Criteria andTotalmoneycountNotBetween(Double value1, Double value2) {
            addCriterion("TotalMoneyCount not between", value1, value2, "totalmoneycount");
            return (Criteria) this;
        }

        public Criteria andOrderproductAIsNull() {
            addCriterion("OrderProduct_A is null");
            return (Criteria) this;
        }

        public Criteria andOrderproductAIsNotNull() {
            addCriterion("OrderProduct_A is not null");
            return (Criteria) this;
        }

        public Criteria andOrderproductAEqualTo(String value) {
            addCriterion("OrderProduct_A =", value, "orderproductA");
            return (Criteria) this;
        }

        public Criteria andOrderproductANotEqualTo(String value) {
            addCriterion("OrderProduct_A <>", value, "orderproductA");
            return (Criteria) this;
        }

        public Criteria andOrderproductAGreaterThan(String value) {
            addCriterion("OrderProduct_A >", value, "orderproductA");
            return (Criteria) this;
        }

        public Criteria andOrderproductAGreaterThanOrEqualTo(String value) {
            addCriterion("OrderProduct_A >=", value, "orderproductA");
            return (Criteria) this;
        }

        public Criteria andOrderproductALessThan(String value) {
            addCriterion("OrderProduct_A <", value, "orderproductA");
            return (Criteria) this;
        }

        public Criteria andOrderproductALessThanOrEqualTo(String value) {
            addCriterion("OrderProduct_A <=", value, "orderproductA");
            return (Criteria) this;
        }

        public Criteria andOrderproductALike(String value) {
            addCriterion("OrderProduct_A like", value, "orderproductA");
            return (Criteria) this;
        }

        public Criteria andOrderproductANotLike(String value) {
            addCriterion("OrderProduct_A not like", value, "orderproductA");
            return (Criteria) this;
        }

        public Criteria andOrderproductAIn(List<String> values) {
            addCriterion("OrderProduct_A in", values, "orderproductA");
            return (Criteria) this;
        }

        public Criteria andOrderproductANotIn(List<String> values) {
            addCriterion("OrderProduct_A not in", values, "orderproductA");
            return (Criteria) this;
        }

        public Criteria andOrderproductABetween(String value1, String value2) {
            addCriterion("OrderProduct_A between", value1, value2, "orderproductA");
            return (Criteria) this;
        }

        public Criteria andOrderproductANotBetween(String value1, String value2) {
            addCriterion("OrderProduct_A not between", value1, value2, "orderproductA");
            return (Criteria) this;
        }

        public Criteria andOrderproductBIsNull() {
            addCriterion("OrderProduct_B is null");
            return (Criteria) this;
        }

        public Criteria andOrderproductBIsNotNull() {
            addCriterion("OrderProduct_B is not null");
            return (Criteria) this;
        }

        public Criteria andOrderproductBEqualTo(String value) {
            addCriterion("OrderProduct_B =", value, "orderproductB");
            return (Criteria) this;
        }

        public Criteria andOrderproductBNotEqualTo(String value) {
            addCriterion("OrderProduct_B <>", value, "orderproductB");
            return (Criteria) this;
        }

        public Criteria andOrderproductBGreaterThan(String value) {
            addCriterion("OrderProduct_B >", value, "orderproductB");
            return (Criteria) this;
        }

        public Criteria andOrderproductBGreaterThanOrEqualTo(String value) {
            addCriterion("OrderProduct_B >=", value, "orderproductB");
            return (Criteria) this;
        }

        public Criteria andOrderproductBLessThan(String value) {
            addCriterion("OrderProduct_B <", value, "orderproductB");
            return (Criteria) this;
        }

        public Criteria andOrderproductBLessThanOrEqualTo(String value) {
            addCriterion("OrderProduct_B <=", value, "orderproductB");
            return (Criteria) this;
        }

        public Criteria andOrderproductBLike(String value) {
            addCriterion("OrderProduct_B like", value, "orderproductB");
            return (Criteria) this;
        }

        public Criteria andOrderproductBNotLike(String value) {
            addCriterion("OrderProduct_B not like", value, "orderproductB");
            return (Criteria) this;
        }

        public Criteria andOrderproductBIn(List<String> values) {
            addCriterion("OrderProduct_B in", values, "orderproductB");
            return (Criteria) this;
        }

        public Criteria andOrderproductBNotIn(List<String> values) {
            addCriterion("OrderProduct_B not in", values, "orderproductB");
            return (Criteria) this;
        }

        public Criteria andOrderproductBBetween(String value1, String value2) {
            addCriterion("OrderProduct_B between", value1, value2, "orderproductB");
            return (Criteria) this;
        }

        public Criteria andOrderproductBNotBetween(String value1, String value2) {
            addCriterion("OrderProduct_B not between", value1, value2, "orderproductB");
            return (Criteria) this;
        }

        public Criteria andOrderproductCIsNull() {
            addCriterion("OrderProduct_C is null");
            return (Criteria) this;
        }

        public Criteria andOrderproductCIsNotNull() {
            addCriterion("OrderProduct_C is not null");
            return (Criteria) this;
        }

        public Criteria andOrderproductCEqualTo(String value) {
            addCriterion("OrderProduct_C =", value, "orderproductC");
            return (Criteria) this;
        }

        public Criteria andOrderproductCNotEqualTo(String value) {
            addCriterion("OrderProduct_C <>", value, "orderproductC");
            return (Criteria) this;
        }

        public Criteria andOrderproductCGreaterThan(String value) {
            addCriterion("OrderProduct_C >", value, "orderproductC");
            return (Criteria) this;
        }

        public Criteria andOrderproductCGreaterThanOrEqualTo(String value) {
            addCriterion("OrderProduct_C >=", value, "orderproductC");
            return (Criteria) this;
        }

        public Criteria andOrderproductCLessThan(String value) {
            addCriterion("OrderProduct_C <", value, "orderproductC");
            return (Criteria) this;
        }

        public Criteria andOrderproductCLessThanOrEqualTo(String value) {
            addCriterion("OrderProduct_C <=", value, "orderproductC");
            return (Criteria) this;
        }

        public Criteria andOrderproductCLike(String value) {
            addCriterion("OrderProduct_C like", value, "orderproductC");
            return (Criteria) this;
        }

        public Criteria andOrderproductCNotLike(String value) {
            addCriterion("OrderProduct_C not like", value, "orderproductC");
            return (Criteria) this;
        }

        public Criteria andOrderproductCIn(List<String> values) {
            addCriterion("OrderProduct_C in", values, "orderproductC");
            return (Criteria) this;
        }

        public Criteria andOrderproductCNotIn(List<String> values) {
            addCriterion("OrderProduct_C not in", values, "orderproductC");
            return (Criteria) this;
        }

        public Criteria andOrderproductCBetween(String value1, String value2) {
            addCriterion("OrderProduct_C between", value1, value2, "orderproductC");
            return (Criteria) this;
        }

        public Criteria andOrderproductCNotBetween(String value1, String value2) {
            addCriterion("OrderProduct_C not between", value1, value2, "orderproductC");
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