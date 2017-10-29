package com.xh.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andStockidIsNull() {
            addCriterion("StockId is null");
            return (Criteria) this;
        }

        public Criteria andStockidIsNotNull() {
            addCriterion("StockId is not null");
            return (Criteria) this;
        }

        public Criteria andStockidEqualTo(Integer value) {
            addCriterion("StockId =", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotEqualTo(Integer value) {
            addCriterion("StockId <>", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidGreaterThan(Integer value) {
            addCriterion("StockId >", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StockId >=", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLessThan(Integer value) {
            addCriterion("StockId <", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLessThanOrEqualTo(Integer value) {
            addCriterion("StockId <=", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidIn(List<Integer> values) {
            addCriterion("StockId in", values, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotIn(List<Integer> values) {
            addCriterion("StockId not in", values, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidBetween(Integer value1, Integer value2) {
            addCriterion("StockId between", value1, value2, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotBetween(Integer value1, Integer value2) {
            addCriterion("StockId not between", value1, value2, "stockid");
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

        public Criteria andSizesIsNull() {
            addCriterion("Sizes is null");
            return (Criteria) this;
        }

        public Criteria andSizesIsNotNull() {
            addCriterion("Sizes is not null");
            return (Criteria) this;
        }

        public Criteria andSizesEqualTo(String value) {
            addCriterion("Sizes =", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesNotEqualTo(String value) {
            addCriterion("Sizes <>", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesGreaterThan(String value) {
            addCriterion("Sizes >", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesGreaterThanOrEqualTo(String value) {
            addCriterion("Sizes >=", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesLessThan(String value) {
            addCriterion("Sizes <", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesLessThanOrEqualTo(String value) {
            addCriterion("Sizes <=", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesLike(String value) {
            addCriterion("Sizes like", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesNotLike(String value) {
            addCriterion("Sizes not like", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesIn(List<String> values) {
            addCriterion("Sizes in", values, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesNotIn(List<String> values) {
            addCriterion("Sizes not in", values, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesBetween(String value1, String value2) {
            addCriterion("Sizes between", value1, value2, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesNotBetween(String value1, String value2) {
            addCriterion("Sizes not between", value1, value2, "sizes");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNull() {
            addCriterion("MarketPrice is null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNotNull() {
            addCriterion("MarketPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceEqualTo(Double value) {
            addCriterion("MarketPrice =", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotEqualTo(Double value) {
            addCriterion("MarketPrice <>", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThan(Double value) {
            addCriterion("MarketPrice >", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("MarketPrice >=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThan(Double value) {
            addCriterion("MarketPrice <", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThanOrEqualTo(Double value) {
            addCriterion("MarketPrice <=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIn(List<Double> values) {
            addCriterion("MarketPrice in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotIn(List<Double> values) {
            addCriterion("MarketPrice not in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceBetween(Double value1, Double value2) {
            addCriterion("MarketPrice between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotBetween(Double value1, Double value2) {
            addCriterion("MarketPrice not between", value1, value2, "marketprice");
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

        public Criteria andStockIsNull() {
            addCriterion("Stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("Stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("Stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("Stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("Stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("Stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("Stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("Stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("Stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("Stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("Stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("Stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andUpperlimitIsNull() {
            addCriterion("UpperLimit is null");
            return (Criteria) this;
        }

        public Criteria andUpperlimitIsNotNull() {
            addCriterion("UpperLimit is not null");
            return (Criteria) this;
        }

        public Criteria andUpperlimitEqualTo(Integer value) {
            addCriterion("UpperLimit =", value, "upperlimit");
            return (Criteria) this;
        }

        public Criteria andUpperlimitNotEqualTo(Integer value) {
            addCriterion("UpperLimit <>", value, "upperlimit");
            return (Criteria) this;
        }

        public Criteria andUpperlimitGreaterThan(Integer value) {
            addCriterion("UpperLimit >", value, "upperlimit");
            return (Criteria) this;
        }

        public Criteria andUpperlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("UpperLimit >=", value, "upperlimit");
            return (Criteria) this;
        }

        public Criteria andUpperlimitLessThan(Integer value) {
            addCriterion("UpperLimit <", value, "upperlimit");
            return (Criteria) this;
        }

        public Criteria andUpperlimitLessThanOrEqualTo(Integer value) {
            addCriterion("UpperLimit <=", value, "upperlimit");
            return (Criteria) this;
        }

        public Criteria andUpperlimitIn(List<Integer> values) {
            addCriterion("UpperLimit in", values, "upperlimit");
            return (Criteria) this;
        }

        public Criteria andUpperlimitNotIn(List<Integer> values) {
            addCriterion("UpperLimit not in", values, "upperlimit");
            return (Criteria) this;
        }

        public Criteria andUpperlimitBetween(Integer value1, Integer value2) {
            addCriterion("UpperLimit between", value1, value2, "upperlimit");
            return (Criteria) this;
        }

        public Criteria andUpperlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("UpperLimit not between", value1, value2, "upperlimit");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andStockAIsNull() {
            addCriterion("Stock_A is null");
            return (Criteria) this;
        }

        public Criteria andStockAIsNotNull() {
            addCriterion("Stock_A is not null");
            return (Criteria) this;
        }

        public Criteria andStockAEqualTo(String value) {
            addCriterion("Stock_A =", value, "stockA");
            return (Criteria) this;
        }

        public Criteria andStockANotEqualTo(String value) {
            addCriterion("Stock_A <>", value, "stockA");
            return (Criteria) this;
        }

        public Criteria andStockAGreaterThan(String value) {
            addCriterion("Stock_A >", value, "stockA");
            return (Criteria) this;
        }

        public Criteria andStockAGreaterThanOrEqualTo(String value) {
            addCriterion("Stock_A >=", value, "stockA");
            return (Criteria) this;
        }

        public Criteria andStockALessThan(String value) {
            addCriterion("Stock_A <", value, "stockA");
            return (Criteria) this;
        }

        public Criteria andStockALessThanOrEqualTo(String value) {
            addCriterion("Stock_A <=", value, "stockA");
            return (Criteria) this;
        }

        public Criteria andStockALike(String value) {
            addCriterion("Stock_A like", value, "stockA");
            return (Criteria) this;
        }

        public Criteria andStockANotLike(String value) {
            addCriterion("Stock_A not like", value, "stockA");
            return (Criteria) this;
        }

        public Criteria andStockAIn(List<String> values) {
            addCriterion("Stock_A in", values, "stockA");
            return (Criteria) this;
        }

        public Criteria andStockANotIn(List<String> values) {
            addCriterion("Stock_A not in", values, "stockA");
            return (Criteria) this;
        }

        public Criteria andStockABetween(String value1, String value2) {
            addCriterion("Stock_A between", value1, value2, "stockA");
            return (Criteria) this;
        }

        public Criteria andStockANotBetween(String value1, String value2) {
            addCriterion("Stock_A not between", value1, value2, "stockA");
            return (Criteria) this;
        }

        public Criteria andStockBIsNull() {
            addCriterion("Stock_B is null");
            return (Criteria) this;
        }

        public Criteria andStockBIsNotNull() {
            addCriterion("Stock_B is not null");
            return (Criteria) this;
        }

        public Criteria andStockBEqualTo(String value) {
            addCriterion("Stock_B =", value, "stockB");
            return (Criteria) this;
        }

        public Criteria andStockBNotEqualTo(String value) {
            addCriterion("Stock_B <>", value, "stockB");
            return (Criteria) this;
        }

        public Criteria andStockBGreaterThan(String value) {
            addCriterion("Stock_B >", value, "stockB");
            return (Criteria) this;
        }

        public Criteria andStockBGreaterThanOrEqualTo(String value) {
            addCriterion("Stock_B >=", value, "stockB");
            return (Criteria) this;
        }

        public Criteria andStockBLessThan(String value) {
            addCriterion("Stock_B <", value, "stockB");
            return (Criteria) this;
        }

        public Criteria andStockBLessThanOrEqualTo(String value) {
            addCriterion("Stock_B <=", value, "stockB");
            return (Criteria) this;
        }

        public Criteria andStockBLike(String value) {
            addCriterion("Stock_B like", value, "stockB");
            return (Criteria) this;
        }

        public Criteria andStockBNotLike(String value) {
            addCriterion("Stock_B not like", value, "stockB");
            return (Criteria) this;
        }

        public Criteria andStockBIn(List<String> values) {
            addCriterion("Stock_B in", values, "stockB");
            return (Criteria) this;
        }

        public Criteria andStockBNotIn(List<String> values) {
            addCriterion("Stock_B not in", values, "stockB");
            return (Criteria) this;
        }

        public Criteria andStockBBetween(String value1, String value2) {
            addCriterion("Stock_B between", value1, value2, "stockB");
            return (Criteria) this;
        }

        public Criteria andStockBNotBetween(String value1, String value2) {
            addCriterion("Stock_B not between", value1, value2, "stockB");
            return (Criteria) this;
        }

        public Criteria andStockCIsNull() {
            addCriterion("Stock_C is null");
            return (Criteria) this;
        }

        public Criteria andStockCIsNotNull() {
            addCriterion("Stock_C is not null");
            return (Criteria) this;
        }

        public Criteria andStockCEqualTo(String value) {
            addCriterion("Stock_C =", value, "stockC");
            return (Criteria) this;
        }

        public Criteria andStockCNotEqualTo(String value) {
            addCriterion("Stock_C <>", value, "stockC");
            return (Criteria) this;
        }

        public Criteria andStockCGreaterThan(String value) {
            addCriterion("Stock_C >", value, "stockC");
            return (Criteria) this;
        }

        public Criteria andStockCGreaterThanOrEqualTo(String value) {
            addCriterion("Stock_C >=", value, "stockC");
            return (Criteria) this;
        }

        public Criteria andStockCLessThan(String value) {
            addCriterion("Stock_C <", value, "stockC");
            return (Criteria) this;
        }

        public Criteria andStockCLessThanOrEqualTo(String value) {
            addCriterion("Stock_C <=", value, "stockC");
            return (Criteria) this;
        }

        public Criteria andStockCLike(String value) {
            addCriterion("Stock_C like", value, "stockC");
            return (Criteria) this;
        }

        public Criteria andStockCNotLike(String value) {
            addCriterion("Stock_C not like", value, "stockC");
            return (Criteria) this;
        }

        public Criteria andStockCIn(List<String> values) {
            addCriterion("Stock_C in", values, "stockC");
            return (Criteria) this;
        }

        public Criteria andStockCNotIn(List<String> values) {
            addCriterion("Stock_C not in", values, "stockC");
            return (Criteria) this;
        }

        public Criteria andStockCBetween(String value1, String value2) {
            addCriterion("Stock_C between", value1, value2, "stockC");
            return (Criteria) this;
        }

        public Criteria andStockCNotBetween(String value1, String value2) {
            addCriterion("Stock_C not between", value1, value2, "stockC");
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