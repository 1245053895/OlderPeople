package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class ProxyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProxyExample() {
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

        public Criteria andProxynameIsNull() {
            addCriterion("ProxyName is null");
            return (Criteria) this;
        }

        public Criteria andProxynameIsNotNull() {
            addCriterion("ProxyName is not null");
            return (Criteria) this;
        }

        public Criteria andProxynameEqualTo(String value) {
            addCriterion("ProxyName =", value, "proxyname");
            return (Criteria) this;
        }

        public Criteria andProxynameNotEqualTo(String value) {
            addCriterion("ProxyName <>", value, "proxyname");
            return (Criteria) this;
        }

        public Criteria andProxynameGreaterThan(String value) {
            addCriterion("ProxyName >", value, "proxyname");
            return (Criteria) this;
        }

        public Criteria andProxynameGreaterThanOrEqualTo(String value) {
            addCriterion("ProxyName >=", value, "proxyname");
            return (Criteria) this;
        }

        public Criteria andProxynameLessThan(String value) {
            addCriterion("ProxyName <", value, "proxyname");
            return (Criteria) this;
        }

        public Criteria andProxynameLessThanOrEqualTo(String value) {
            addCriterion("ProxyName <=", value, "proxyname");
            return (Criteria) this;
        }

        public Criteria andProxynameLike(String value) {
            addCriterion("ProxyName like", value, "proxyname");
            return (Criteria) this;
        }

        public Criteria andProxynameNotLike(String value) {
            addCriterion("ProxyName not like", value, "proxyname");
            return (Criteria) this;
        }

        public Criteria andProxynameIn(List<String> values) {
            addCriterion("ProxyName in", values, "proxyname");
            return (Criteria) this;
        }

        public Criteria andProxynameNotIn(List<String> values) {
            addCriterion("ProxyName not in", values, "proxyname");
            return (Criteria) this;
        }

        public Criteria andProxynameBetween(String value1, String value2) {
            addCriterion("ProxyName between", value1, value2, "proxyname");
            return (Criteria) this;
        }

        public Criteria andProxynameNotBetween(String value1, String value2) {
            addCriterion("ProxyName not between", value1, value2, "proxyname");
            return (Criteria) this;
        }

        public Criteria andProxypwdIsNull() {
            addCriterion("ProxyPwd is null");
            return (Criteria) this;
        }

        public Criteria andProxypwdIsNotNull() {
            addCriterion("ProxyPwd is not null");
            return (Criteria) this;
        }

        public Criteria andProxypwdEqualTo(String value) {
            addCriterion("ProxyPwd =", value, "proxypwd");
            return (Criteria) this;
        }

        public Criteria andProxypwdNotEqualTo(String value) {
            addCriterion("ProxyPwd <>", value, "proxypwd");
            return (Criteria) this;
        }

        public Criteria andProxypwdGreaterThan(String value) {
            addCriterion("ProxyPwd >", value, "proxypwd");
            return (Criteria) this;
        }

        public Criteria andProxypwdGreaterThanOrEqualTo(String value) {
            addCriterion("ProxyPwd >=", value, "proxypwd");
            return (Criteria) this;
        }

        public Criteria andProxypwdLessThan(String value) {
            addCriterion("ProxyPwd <", value, "proxypwd");
            return (Criteria) this;
        }

        public Criteria andProxypwdLessThanOrEqualTo(String value) {
            addCriterion("ProxyPwd <=", value, "proxypwd");
            return (Criteria) this;
        }

        public Criteria andProxypwdLike(String value) {
            addCriterion("ProxyPwd like", value, "proxypwd");
            return (Criteria) this;
        }

        public Criteria andProxypwdNotLike(String value) {
            addCriterion("ProxyPwd not like", value, "proxypwd");
            return (Criteria) this;
        }

        public Criteria andProxypwdIn(List<String> values) {
            addCriterion("ProxyPwd in", values, "proxypwd");
            return (Criteria) this;
        }

        public Criteria andProxypwdNotIn(List<String> values) {
            addCriterion("ProxyPwd not in", values, "proxypwd");
            return (Criteria) this;
        }

        public Criteria andProxypwdBetween(String value1, String value2) {
            addCriterion("ProxyPwd between", value1, value2, "proxypwd");
            return (Criteria) this;
        }

        public Criteria andProxypwdNotBetween(String value1, String value2) {
            addCriterion("ProxyPwd not between", value1, value2, "proxypwd");
            return (Criteria) this;
        }

        public Criteria andProxyaddrIsNull() {
            addCriterion("ProxyAddr is null");
            return (Criteria) this;
        }

        public Criteria andProxyaddrIsNotNull() {
            addCriterion("ProxyAddr is not null");
            return (Criteria) this;
        }

        public Criteria andProxyaddrEqualTo(String value) {
            addCriterion("ProxyAddr =", value, "proxyaddr");
            return (Criteria) this;
        }

        public Criteria andProxyaddrNotEqualTo(String value) {
            addCriterion("ProxyAddr <>", value, "proxyaddr");
            return (Criteria) this;
        }

        public Criteria andProxyaddrGreaterThan(String value) {
            addCriterion("ProxyAddr >", value, "proxyaddr");
            return (Criteria) this;
        }

        public Criteria andProxyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("ProxyAddr >=", value, "proxyaddr");
            return (Criteria) this;
        }

        public Criteria andProxyaddrLessThan(String value) {
            addCriterion("ProxyAddr <", value, "proxyaddr");
            return (Criteria) this;
        }

        public Criteria andProxyaddrLessThanOrEqualTo(String value) {
            addCriterion("ProxyAddr <=", value, "proxyaddr");
            return (Criteria) this;
        }

        public Criteria andProxyaddrLike(String value) {
            addCriterion("ProxyAddr like", value, "proxyaddr");
            return (Criteria) this;
        }

        public Criteria andProxyaddrNotLike(String value) {
            addCriterion("ProxyAddr not like", value, "proxyaddr");
            return (Criteria) this;
        }

        public Criteria andProxyaddrIn(List<String> values) {
            addCriterion("ProxyAddr in", values, "proxyaddr");
            return (Criteria) this;
        }

        public Criteria andProxyaddrNotIn(List<String> values) {
            addCriterion("ProxyAddr not in", values, "proxyaddr");
            return (Criteria) this;
        }

        public Criteria andProxyaddrBetween(String value1, String value2) {
            addCriterion("ProxyAddr between", value1, value2, "proxyaddr");
            return (Criteria) this;
        }

        public Criteria andProxyaddrNotBetween(String value1, String value2) {
            addCriterion("ProxyAddr not between", value1, value2, "proxyaddr");
            return (Criteria) this;
        }

        public Criteria andProxyphoneIsNull() {
            addCriterion("ProxyPhone is null");
            return (Criteria) this;
        }

        public Criteria andProxyphoneIsNotNull() {
            addCriterion("ProxyPhone is not null");
            return (Criteria) this;
        }

        public Criteria andProxyphoneEqualTo(String value) {
            addCriterion("ProxyPhone =", value, "proxyphone");
            return (Criteria) this;
        }

        public Criteria andProxyphoneNotEqualTo(String value) {
            addCriterion("ProxyPhone <>", value, "proxyphone");
            return (Criteria) this;
        }

        public Criteria andProxyphoneGreaterThan(String value) {
            addCriterion("ProxyPhone >", value, "proxyphone");
            return (Criteria) this;
        }

        public Criteria andProxyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("ProxyPhone >=", value, "proxyphone");
            return (Criteria) this;
        }

        public Criteria andProxyphoneLessThan(String value) {
            addCriterion("ProxyPhone <", value, "proxyphone");
            return (Criteria) this;
        }

        public Criteria andProxyphoneLessThanOrEqualTo(String value) {
            addCriterion("ProxyPhone <=", value, "proxyphone");
            return (Criteria) this;
        }

        public Criteria andProxyphoneLike(String value) {
            addCriterion("ProxyPhone like", value, "proxyphone");
            return (Criteria) this;
        }

        public Criteria andProxyphoneNotLike(String value) {
            addCriterion("ProxyPhone not like", value, "proxyphone");
            return (Criteria) this;
        }

        public Criteria andProxyphoneIn(List<String> values) {
            addCriterion("ProxyPhone in", values, "proxyphone");
            return (Criteria) this;
        }

        public Criteria andProxyphoneNotIn(List<String> values) {
            addCriterion("ProxyPhone not in", values, "proxyphone");
            return (Criteria) this;
        }

        public Criteria andProxyphoneBetween(String value1, String value2) {
            addCriterion("ProxyPhone between", value1, value2, "proxyphone");
            return (Criteria) this;
        }

        public Criteria andProxyphoneNotBetween(String value1, String value2) {
            addCriterion("ProxyPhone not between", value1, value2, "proxyphone");
            return (Criteria) this;
        }

        public Criteria andProxyzipIsNull() {
            addCriterion("ProxyZip is null");
            return (Criteria) this;
        }

        public Criteria andProxyzipIsNotNull() {
            addCriterion("ProxyZip is not null");
            return (Criteria) this;
        }

        public Criteria andProxyzipEqualTo(Integer value) {
            addCriterion("ProxyZip =", value, "proxyzip");
            return (Criteria) this;
        }

        public Criteria andProxyzipNotEqualTo(Integer value) {
            addCriterion("ProxyZip <>", value, "proxyzip");
            return (Criteria) this;
        }

        public Criteria andProxyzipGreaterThan(Integer value) {
            addCriterion("ProxyZip >", value, "proxyzip");
            return (Criteria) this;
        }

        public Criteria andProxyzipGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProxyZip >=", value, "proxyzip");
            return (Criteria) this;
        }

        public Criteria andProxyzipLessThan(Integer value) {
            addCriterion("ProxyZip <", value, "proxyzip");
            return (Criteria) this;
        }

        public Criteria andProxyzipLessThanOrEqualTo(Integer value) {
            addCriterion("ProxyZip <=", value, "proxyzip");
            return (Criteria) this;
        }

        public Criteria andProxyzipIn(List<Integer> values) {
            addCriterion("ProxyZip in", values, "proxyzip");
            return (Criteria) this;
        }

        public Criteria andProxyzipNotIn(List<Integer> values) {
            addCriterion("ProxyZip not in", values, "proxyzip");
            return (Criteria) this;
        }

        public Criteria andProxyzipBetween(Integer value1, Integer value2) {
            addCriterion("ProxyZip between", value1, value2, "proxyzip");
            return (Criteria) this;
        }

        public Criteria andProxyzipNotBetween(Integer value1, Integer value2) {
            addCriterion("ProxyZip not between", value1, value2, "proxyzip");
            return (Criteria) this;
        }

        public Criteria andProxyAIsNull() {
            addCriterion("Proxy_A is null");
            return (Criteria) this;
        }

        public Criteria andProxyAIsNotNull() {
            addCriterion("Proxy_A is not null");
            return (Criteria) this;
        }

        public Criteria andProxyAEqualTo(String value) {
            addCriterion("Proxy_A =", value, "proxyA");
            return (Criteria) this;
        }

        public Criteria andProxyANotEqualTo(String value) {
            addCriterion("Proxy_A <>", value, "proxyA");
            return (Criteria) this;
        }

        public Criteria andProxyAGreaterThan(String value) {
            addCriterion("Proxy_A >", value, "proxyA");
            return (Criteria) this;
        }

        public Criteria andProxyAGreaterThanOrEqualTo(String value) {
            addCriterion("Proxy_A >=", value, "proxyA");
            return (Criteria) this;
        }

        public Criteria andProxyALessThan(String value) {
            addCriterion("Proxy_A <", value, "proxyA");
            return (Criteria) this;
        }

        public Criteria andProxyALessThanOrEqualTo(String value) {
            addCriterion("Proxy_A <=", value, "proxyA");
            return (Criteria) this;
        }

        public Criteria andProxyALike(String value) {
            addCriterion("Proxy_A like", value, "proxyA");
            return (Criteria) this;
        }

        public Criteria andProxyANotLike(String value) {
            addCriterion("Proxy_A not like", value, "proxyA");
            return (Criteria) this;
        }

        public Criteria andProxyAIn(List<String> values) {
            addCriterion("Proxy_A in", values, "proxyA");
            return (Criteria) this;
        }

        public Criteria andProxyANotIn(List<String> values) {
            addCriterion("Proxy_A not in", values, "proxyA");
            return (Criteria) this;
        }

        public Criteria andProxyABetween(String value1, String value2) {
            addCriterion("Proxy_A between", value1, value2, "proxyA");
            return (Criteria) this;
        }

        public Criteria andProxyANotBetween(String value1, String value2) {
            addCriterion("Proxy_A not between", value1, value2, "proxyA");
            return (Criteria) this;
        }

        public Criteria andProxyBIsNull() {
            addCriterion("Proxy_B is null");
            return (Criteria) this;
        }

        public Criteria andProxyBIsNotNull() {
            addCriterion("Proxy_B is not null");
            return (Criteria) this;
        }

        public Criteria andProxyBEqualTo(String value) {
            addCriterion("Proxy_B =", value, "proxyB");
            return (Criteria) this;
        }

        public Criteria andProxyBNotEqualTo(String value) {
            addCriterion("Proxy_B <>", value, "proxyB");
            return (Criteria) this;
        }

        public Criteria andProxyBGreaterThan(String value) {
            addCriterion("Proxy_B >", value, "proxyB");
            return (Criteria) this;
        }

        public Criteria andProxyBGreaterThanOrEqualTo(String value) {
            addCriterion("Proxy_B >=", value, "proxyB");
            return (Criteria) this;
        }

        public Criteria andProxyBLessThan(String value) {
            addCriterion("Proxy_B <", value, "proxyB");
            return (Criteria) this;
        }

        public Criteria andProxyBLessThanOrEqualTo(String value) {
            addCriterion("Proxy_B <=", value, "proxyB");
            return (Criteria) this;
        }

        public Criteria andProxyBLike(String value) {
            addCriterion("Proxy_B like", value, "proxyB");
            return (Criteria) this;
        }

        public Criteria andProxyBNotLike(String value) {
            addCriterion("Proxy_B not like", value, "proxyB");
            return (Criteria) this;
        }

        public Criteria andProxyBIn(List<String> values) {
            addCriterion("Proxy_B in", values, "proxyB");
            return (Criteria) this;
        }

        public Criteria andProxyBNotIn(List<String> values) {
            addCriterion("Proxy_B not in", values, "proxyB");
            return (Criteria) this;
        }

        public Criteria andProxyBBetween(String value1, String value2) {
            addCriterion("Proxy_B between", value1, value2, "proxyB");
            return (Criteria) this;
        }

        public Criteria andProxyBNotBetween(String value1, String value2) {
            addCriterion("Proxy_B not between", value1, value2, "proxyB");
            return (Criteria) this;
        }

        public Criteria andProxyCIsNull() {
            addCriterion("Proxy_C is null");
            return (Criteria) this;
        }

        public Criteria andProxyCIsNotNull() {
            addCriterion("Proxy_C is not null");
            return (Criteria) this;
        }

        public Criteria andProxyCEqualTo(String value) {
            addCriterion("Proxy_C =", value, "proxyC");
            return (Criteria) this;
        }

        public Criteria andProxyCNotEqualTo(String value) {
            addCriterion("Proxy_C <>", value, "proxyC");
            return (Criteria) this;
        }

        public Criteria andProxyCGreaterThan(String value) {
            addCriterion("Proxy_C >", value, "proxyC");
            return (Criteria) this;
        }

        public Criteria andProxyCGreaterThanOrEqualTo(String value) {
            addCriterion("Proxy_C >=", value, "proxyC");
            return (Criteria) this;
        }

        public Criteria andProxyCLessThan(String value) {
            addCriterion("Proxy_C <", value, "proxyC");
            return (Criteria) this;
        }

        public Criteria andProxyCLessThanOrEqualTo(String value) {
            addCriterion("Proxy_C <=", value, "proxyC");
            return (Criteria) this;
        }

        public Criteria andProxyCLike(String value) {
            addCriterion("Proxy_C like", value, "proxyC");
            return (Criteria) this;
        }

        public Criteria andProxyCNotLike(String value) {
            addCriterion("Proxy_C not like", value, "proxyC");
            return (Criteria) this;
        }

        public Criteria andProxyCIn(List<String> values) {
            addCriterion("Proxy_C in", values, "proxyC");
            return (Criteria) this;
        }

        public Criteria andProxyCNotIn(List<String> values) {
            addCriterion("Proxy_C not in", values, "proxyC");
            return (Criteria) this;
        }

        public Criteria andProxyCBetween(String value1, String value2) {
            addCriterion("Proxy_C between", value1, value2, "proxyC");
            return (Criteria) this;
        }

        public Criteria andProxyCNotBetween(String value1, String value2) {
            addCriterion("Proxy_C not between", value1, value2, "proxyC");
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