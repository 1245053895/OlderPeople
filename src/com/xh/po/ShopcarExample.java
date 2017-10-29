package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class ShopcarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopcarExample() {
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

        public Criteria andShopcaridIsNull() {
            addCriterion("ShopCarId is null");
            return (Criteria) this;
        }

        public Criteria andShopcaridIsNotNull() {
            addCriterion("ShopCarId is not null");
            return (Criteria) this;
        }

        public Criteria andShopcaridEqualTo(Integer value) {
            addCriterion("ShopCarId =", value, "shopcarid");
            return (Criteria) this;
        }

        public Criteria andShopcaridNotEqualTo(Integer value) {
            addCriterion("ShopCarId <>", value, "shopcarid");
            return (Criteria) this;
        }

        public Criteria andShopcaridGreaterThan(Integer value) {
            addCriterion("ShopCarId >", value, "shopcarid");
            return (Criteria) this;
        }

        public Criteria andShopcaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShopCarId >=", value, "shopcarid");
            return (Criteria) this;
        }

        public Criteria andShopcaridLessThan(Integer value) {
            addCriterion("ShopCarId <", value, "shopcarid");
            return (Criteria) this;
        }

        public Criteria andShopcaridLessThanOrEqualTo(Integer value) {
            addCriterion("ShopCarId <=", value, "shopcarid");
            return (Criteria) this;
        }

        public Criteria andShopcaridIn(List<Integer> values) {
            addCriterion("ShopCarId in", values, "shopcarid");
            return (Criteria) this;
        }

        public Criteria andShopcaridNotIn(List<Integer> values) {
            addCriterion("ShopCarId not in", values, "shopcarid");
            return (Criteria) this;
        }

        public Criteria andShopcaridBetween(Integer value1, Integer value2) {
            addCriterion("ShopCarId between", value1, value2, "shopcarid");
            return (Criteria) this;
        }

        public Criteria andShopcaridNotBetween(Integer value1, Integer value2) {
            addCriterion("ShopCarId not between", value1, value2, "shopcarid");
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

        public Criteria andOrderamountIsNull() {
            addCriterion("orderamount is null");
            return (Criteria) this;
        }

        public Criteria andOrderamountIsNotNull() {
            addCriterion("orderamount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderamountEqualTo(Integer value) {
            addCriterion("orderamount =", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountNotEqualTo(Integer value) {
            addCriterion("orderamount <>", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountGreaterThan(Integer value) {
            addCriterion("orderamount >", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderamount >=", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountLessThan(Integer value) {
            addCriterion("orderamount <", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountLessThanOrEqualTo(Integer value) {
            addCriterion("orderamount <=", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountIn(List<Integer> values) {
            addCriterion("orderamount in", values, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountNotIn(List<Integer> values) {
            addCriterion("orderamount not in", values, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountBetween(Integer value1, Integer value2) {
            addCriterion("orderamount between", value1, value2, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountNotBetween(Integer value1, Integer value2) {
            addCriterion("orderamount not between", value1, value2, "orderamount");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andShopcarAIsNull() {
            addCriterion("ShopCar_A is null");
            return (Criteria) this;
        }

        public Criteria andShopcarAIsNotNull() {
            addCriterion("ShopCar_A is not null");
            return (Criteria) this;
        }

        public Criteria andShopcarAEqualTo(String value) {
            addCriterion("ShopCar_A =", value, "shopcarA");
            return (Criteria) this;
        }

        public Criteria andShopcarANotEqualTo(String value) {
            addCriterion("ShopCar_A <>", value, "shopcarA");
            return (Criteria) this;
        }

        public Criteria andShopcarAGreaterThan(String value) {
            addCriterion("ShopCar_A >", value, "shopcarA");
            return (Criteria) this;
        }

        public Criteria andShopcarAGreaterThanOrEqualTo(String value) {
            addCriterion("ShopCar_A >=", value, "shopcarA");
            return (Criteria) this;
        }

        public Criteria andShopcarALessThan(String value) {
            addCriterion("ShopCar_A <", value, "shopcarA");
            return (Criteria) this;
        }

        public Criteria andShopcarALessThanOrEqualTo(String value) {
            addCriterion("ShopCar_A <=", value, "shopcarA");
            return (Criteria) this;
        }

        public Criteria andShopcarALike(String value) {
            addCriterion("ShopCar_A like", value, "shopcarA");
            return (Criteria) this;
        }

        public Criteria andShopcarANotLike(String value) {
            addCriterion("ShopCar_A not like", value, "shopcarA");
            return (Criteria) this;
        }

        public Criteria andShopcarAIn(List<String> values) {
            addCriterion("ShopCar_A in", values, "shopcarA");
            return (Criteria) this;
        }

        public Criteria andShopcarANotIn(List<String> values) {
            addCriterion("ShopCar_A not in", values, "shopcarA");
            return (Criteria) this;
        }

        public Criteria andShopcarABetween(String value1, String value2) {
            addCriterion("ShopCar_A between", value1, value2, "shopcarA");
            return (Criteria) this;
        }

        public Criteria andShopcarANotBetween(String value1, String value2) {
            addCriterion("ShopCar_A not between", value1, value2, "shopcarA");
            return (Criteria) this;
        }

        public Criteria andShopcarBIsNull() {
            addCriterion("ShopCar_B is null");
            return (Criteria) this;
        }

        public Criteria andShopcarBIsNotNull() {
            addCriterion("ShopCar_B is not null");
            return (Criteria) this;
        }

        public Criteria andShopcarBEqualTo(String value) {
            addCriterion("ShopCar_B =", value, "shopcarB");
            return (Criteria) this;
        }

        public Criteria andShopcarBNotEqualTo(String value) {
            addCriterion("ShopCar_B <>", value, "shopcarB");
            return (Criteria) this;
        }

        public Criteria andShopcarBGreaterThan(String value) {
            addCriterion("ShopCar_B >", value, "shopcarB");
            return (Criteria) this;
        }

        public Criteria andShopcarBGreaterThanOrEqualTo(String value) {
            addCriterion("ShopCar_B >=", value, "shopcarB");
            return (Criteria) this;
        }

        public Criteria andShopcarBLessThan(String value) {
            addCriterion("ShopCar_B <", value, "shopcarB");
            return (Criteria) this;
        }

        public Criteria andShopcarBLessThanOrEqualTo(String value) {
            addCriterion("ShopCar_B <=", value, "shopcarB");
            return (Criteria) this;
        }

        public Criteria andShopcarBLike(String value) {
            addCriterion("ShopCar_B like", value, "shopcarB");
            return (Criteria) this;
        }

        public Criteria andShopcarBNotLike(String value) {
            addCriterion("ShopCar_B not like", value, "shopcarB");
            return (Criteria) this;
        }

        public Criteria andShopcarBIn(List<String> values) {
            addCriterion("ShopCar_B in", values, "shopcarB");
            return (Criteria) this;
        }

        public Criteria andShopcarBNotIn(List<String> values) {
            addCriterion("ShopCar_B not in", values, "shopcarB");
            return (Criteria) this;
        }

        public Criteria andShopcarBBetween(String value1, String value2) {
            addCriterion("ShopCar_B between", value1, value2, "shopcarB");
            return (Criteria) this;
        }

        public Criteria andShopcarBNotBetween(String value1, String value2) {
            addCriterion("ShopCar_B not between", value1, value2, "shopcarB");
            return (Criteria) this;
        }

        public Criteria andShopcarCIsNull() {
            addCriterion("ShopCar_C is null");
            return (Criteria) this;
        }

        public Criteria andShopcarCIsNotNull() {
            addCriterion("ShopCar_C is not null");
            return (Criteria) this;
        }

        public Criteria andShopcarCEqualTo(String value) {
            addCriterion("ShopCar_C =", value, "shopcarC");
            return (Criteria) this;
        }

        public Criteria andShopcarCNotEqualTo(String value) {
            addCriterion("ShopCar_C <>", value, "shopcarC");
            return (Criteria) this;
        }

        public Criteria andShopcarCGreaterThan(String value) {
            addCriterion("ShopCar_C >", value, "shopcarC");
            return (Criteria) this;
        }

        public Criteria andShopcarCGreaterThanOrEqualTo(String value) {
            addCriterion("ShopCar_C >=", value, "shopcarC");
            return (Criteria) this;
        }

        public Criteria andShopcarCLessThan(String value) {
            addCriterion("ShopCar_C <", value, "shopcarC");
            return (Criteria) this;
        }

        public Criteria andShopcarCLessThanOrEqualTo(String value) {
            addCriterion("ShopCar_C <=", value, "shopcarC");
            return (Criteria) this;
        }

        public Criteria andShopcarCLike(String value) {
            addCriterion("ShopCar_C like", value, "shopcarC");
            return (Criteria) this;
        }

        public Criteria andShopcarCNotLike(String value) {
            addCriterion("ShopCar_C not like", value, "shopcarC");
            return (Criteria) this;
        }

        public Criteria andShopcarCIn(List<String> values) {
            addCriterion("ShopCar_C in", values, "shopcarC");
            return (Criteria) this;
        }

        public Criteria andShopcarCNotIn(List<String> values) {
            addCriterion("ShopCar_C not in", values, "shopcarC");
            return (Criteria) this;
        }

        public Criteria andShopcarCBetween(String value1, String value2) {
            addCriterion("ShopCar_C between", value1, value2, "shopcarC");
            return (Criteria) this;
        }

        public Criteria andShopcarCNotBetween(String value1, String value2) {
            addCriterion("ShopCar_C not between", value1, value2, "shopcarC");
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