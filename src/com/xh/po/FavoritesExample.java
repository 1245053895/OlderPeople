package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class FavoritesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FavoritesExample() {
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

        public Criteria andFavoritesidIsNull() {
            addCriterion("FavoritesId is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesidIsNotNull() {
            addCriterion("FavoritesId is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesidEqualTo(Integer value) {
            addCriterion("FavoritesId =", value, "favoritesid");
            return (Criteria) this;
        }

        public Criteria andFavoritesidNotEqualTo(Integer value) {
            addCriterion("FavoritesId <>", value, "favoritesid");
            return (Criteria) this;
        }

        public Criteria andFavoritesidGreaterThan(Integer value) {
            addCriterion("FavoritesId >", value, "favoritesid");
            return (Criteria) this;
        }

        public Criteria andFavoritesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FavoritesId >=", value, "favoritesid");
            return (Criteria) this;
        }

        public Criteria andFavoritesidLessThan(Integer value) {
            addCriterion("FavoritesId <", value, "favoritesid");
            return (Criteria) this;
        }

        public Criteria andFavoritesidLessThanOrEqualTo(Integer value) {
            addCriterion("FavoritesId <=", value, "favoritesid");
            return (Criteria) this;
        }

        public Criteria andFavoritesidIn(List<Integer> values) {
            addCriterion("FavoritesId in", values, "favoritesid");
            return (Criteria) this;
        }

        public Criteria andFavoritesidNotIn(List<Integer> values) {
            addCriterion("FavoritesId not in", values, "favoritesid");
            return (Criteria) this;
        }

        public Criteria andFavoritesidBetween(Integer value1, Integer value2) {
            addCriterion("FavoritesId between", value1, value2, "favoritesid");
            return (Criteria) this;
        }

        public Criteria andFavoritesidNotBetween(Integer value1, Integer value2) {
            addCriterion("FavoritesId not between", value1, value2, "favoritesid");
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

        public Criteria andFavoritesAIsNull() {
            addCriterion("Favorites_A is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesAIsNotNull() {
            addCriterion("Favorites_A is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesAEqualTo(String value) {
            addCriterion("Favorites_A =", value, "favoritesA");
            return (Criteria) this;
        }

        public Criteria andFavoritesANotEqualTo(String value) {
            addCriterion("Favorites_A <>", value, "favoritesA");
            return (Criteria) this;
        }

        public Criteria andFavoritesAGreaterThan(String value) {
            addCriterion("Favorites_A >", value, "favoritesA");
            return (Criteria) this;
        }

        public Criteria andFavoritesAGreaterThanOrEqualTo(String value) {
            addCriterion("Favorites_A >=", value, "favoritesA");
            return (Criteria) this;
        }

        public Criteria andFavoritesALessThan(String value) {
            addCriterion("Favorites_A <", value, "favoritesA");
            return (Criteria) this;
        }

        public Criteria andFavoritesALessThanOrEqualTo(String value) {
            addCriterion("Favorites_A <=", value, "favoritesA");
            return (Criteria) this;
        }

        public Criteria andFavoritesALike(String value) {
            addCriterion("Favorites_A like", value, "favoritesA");
            return (Criteria) this;
        }

        public Criteria andFavoritesANotLike(String value) {
            addCriterion("Favorites_A not like", value, "favoritesA");
            return (Criteria) this;
        }

        public Criteria andFavoritesAIn(List<String> values) {
            addCriterion("Favorites_A in", values, "favoritesA");
            return (Criteria) this;
        }

        public Criteria andFavoritesANotIn(List<String> values) {
            addCriterion("Favorites_A not in", values, "favoritesA");
            return (Criteria) this;
        }

        public Criteria andFavoritesABetween(String value1, String value2) {
            addCriterion("Favorites_A between", value1, value2, "favoritesA");
            return (Criteria) this;
        }

        public Criteria andFavoritesANotBetween(String value1, String value2) {
            addCriterion("Favorites_A not between", value1, value2, "favoritesA");
            return (Criteria) this;
        }

        public Criteria andFavoritesBIsNull() {
            addCriterion("Favorites_B is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesBIsNotNull() {
            addCriterion("Favorites_B is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesBEqualTo(String value) {
            addCriterion("Favorites_B =", value, "favoritesB");
            return (Criteria) this;
        }

        public Criteria andFavoritesBNotEqualTo(String value) {
            addCriterion("Favorites_B <>", value, "favoritesB");
            return (Criteria) this;
        }

        public Criteria andFavoritesBGreaterThan(String value) {
            addCriterion("Favorites_B >", value, "favoritesB");
            return (Criteria) this;
        }

        public Criteria andFavoritesBGreaterThanOrEqualTo(String value) {
            addCriterion("Favorites_B >=", value, "favoritesB");
            return (Criteria) this;
        }

        public Criteria andFavoritesBLessThan(String value) {
            addCriterion("Favorites_B <", value, "favoritesB");
            return (Criteria) this;
        }

        public Criteria andFavoritesBLessThanOrEqualTo(String value) {
            addCriterion("Favorites_B <=", value, "favoritesB");
            return (Criteria) this;
        }

        public Criteria andFavoritesBLike(String value) {
            addCriterion("Favorites_B like", value, "favoritesB");
            return (Criteria) this;
        }

        public Criteria andFavoritesBNotLike(String value) {
            addCriterion("Favorites_B not like", value, "favoritesB");
            return (Criteria) this;
        }

        public Criteria andFavoritesBIn(List<String> values) {
            addCriterion("Favorites_B in", values, "favoritesB");
            return (Criteria) this;
        }

        public Criteria andFavoritesBNotIn(List<String> values) {
            addCriterion("Favorites_B not in", values, "favoritesB");
            return (Criteria) this;
        }

        public Criteria andFavoritesBBetween(String value1, String value2) {
            addCriterion("Favorites_B between", value1, value2, "favoritesB");
            return (Criteria) this;
        }

        public Criteria andFavoritesBNotBetween(String value1, String value2) {
            addCriterion("Favorites_B not between", value1, value2, "favoritesB");
            return (Criteria) this;
        }

        public Criteria andFavoritesCIsNull() {
            addCriterion("Favorites_C is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesCIsNotNull() {
            addCriterion("Favorites_C is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesCEqualTo(String value) {
            addCriterion("Favorites_C =", value, "favoritesC");
            return (Criteria) this;
        }

        public Criteria andFavoritesCNotEqualTo(String value) {
            addCriterion("Favorites_C <>", value, "favoritesC");
            return (Criteria) this;
        }

        public Criteria andFavoritesCGreaterThan(String value) {
            addCriterion("Favorites_C >", value, "favoritesC");
            return (Criteria) this;
        }

        public Criteria andFavoritesCGreaterThanOrEqualTo(String value) {
            addCriterion("Favorites_C >=", value, "favoritesC");
            return (Criteria) this;
        }

        public Criteria andFavoritesCLessThan(String value) {
            addCriterion("Favorites_C <", value, "favoritesC");
            return (Criteria) this;
        }

        public Criteria andFavoritesCLessThanOrEqualTo(String value) {
            addCriterion("Favorites_C <=", value, "favoritesC");
            return (Criteria) this;
        }

        public Criteria andFavoritesCLike(String value) {
            addCriterion("Favorites_C like", value, "favoritesC");
            return (Criteria) this;
        }

        public Criteria andFavoritesCNotLike(String value) {
            addCriterion("Favorites_C not like", value, "favoritesC");
            return (Criteria) this;
        }

        public Criteria andFavoritesCIn(List<String> values) {
            addCriterion("Favorites_C in", values, "favoritesC");
            return (Criteria) this;
        }

        public Criteria andFavoritesCNotIn(List<String> values) {
            addCriterion("Favorites_C not in", values, "favoritesC");
            return (Criteria) this;
        }

        public Criteria andFavoritesCBetween(String value1, String value2) {
            addCriterion("Favorites_C between", value1, value2, "favoritesC");
            return (Criteria) this;
        }

        public Criteria andFavoritesCNotBetween(String value1, String value2) {
            addCriterion("Favorites_C not between", value1, value2, "favoritesC");
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