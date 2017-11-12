package com.xh.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransportExample() {
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

        public Criteria andTransportidIsNull() {
            addCriterion("TransportId is null");
            return (Criteria) this;
        }

        public Criteria andTransportidIsNotNull() {
            addCriterion("TransportId is not null");
            return (Criteria) this;
        }

        public Criteria andTransportidEqualTo(Integer value) {
            addCriterion("TransportId =", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidNotEqualTo(Integer value) {
            addCriterion("TransportId <>", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidGreaterThan(Integer value) {
            addCriterion("TransportId >", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TransportId >=", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidLessThan(Integer value) {
            addCriterion("TransportId <", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidLessThanOrEqualTo(Integer value) {
            addCriterion("TransportId <=", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidIn(List<Integer> values) {
            addCriterion("TransportId in", values, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidNotIn(List<Integer> values) {
            addCriterion("TransportId not in", values, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidBetween(Integer value1, Integer value2) {
            addCriterion("TransportId between", value1, value2, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidNotBetween(Integer value1, Integer value2) {
            addCriterion("TransportId not between", value1, value2, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportnameIsNull() {
            addCriterion("TransportName is null");
            return (Criteria) this;
        }

        public Criteria andTransportnameIsNotNull() {
            addCriterion("TransportName is not null");
            return (Criteria) this;
        }

        public Criteria andTransportnameEqualTo(String value) {
            addCriterion("TransportName =", value, "transportname");
            return (Criteria) this;
        }

        public Criteria andTransportnameNotEqualTo(String value) {
            addCriterion("TransportName <>", value, "transportname");
            return (Criteria) this;
        }

        public Criteria andTransportnameGreaterThan(String value) {
            addCriterion("TransportName >", value, "transportname");
            return (Criteria) this;
        }

        public Criteria andTransportnameGreaterThanOrEqualTo(String value) {
            addCriterion("TransportName >=", value, "transportname");
            return (Criteria) this;
        }

        public Criteria andTransportnameLessThan(String value) {
            addCriterion("TransportName <", value, "transportname");
            return (Criteria) this;
        }

        public Criteria andTransportnameLessThanOrEqualTo(String value) {
            addCriterion("TransportName <=", value, "transportname");
            return (Criteria) this;
        }

        public Criteria andTransportnameLike(String value) {
            addCriterion("TransportName like", value, "transportname");
            return (Criteria) this;
        }

        public Criteria andTransportnameNotLike(String value) {
            addCriterion("TransportName not like", value, "transportname");
            return (Criteria) this;
        }

        public Criteria andTransportnameIn(List<String> values) {
            addCriterion("TransportName in", values, "transportname");
            return (Criteria) this;
        }

        public Criteria andTransportnameNotIn(List<String> values) {
            addCriterion("TransportName not in", values, "transportname");
            return (Criteria) this;
        }

        public Criteria andTransportnameBetween(String value1, String value2) {
            addCriterion("TransportName between", value1, value2, "transportname");
            return (Criteria) this;
        }

        public Criteria andTransportnameNotBetween(String value1, String value2) {
            addCriterion("TransportName not between", value1, value2, "transportname");
            return (Criteria) this;
        }

        public Criteria andTransportimgIsNull() {
            addCriterion("TransportImg is null");
            return (Criteria) this;
        }

        public Criteria andTransportimgIsNotNull() {
            addCriterion("TransportImg is not null");
            return (Criteria) this;
        }

        public Criteria andTransportimgEqualTo(String value) {
            addCriterion("TransportImg =", value, "transportimg");
            return (Criteria) this;
        }

        public Criteria andTransportimgNotEqualTo(String value) {
            addCriterion("TransportImg <>", value, "transportimg");
            return (Criteria) this;
        }

        public Criteria andTransportimgGreaterThan(String value) {
            addCriterion("TransportImg >", value, "transportimg");
            return (Criteria) this;
        }

        public Criteria andTransportimgGreaterThanOrEqualTo(String value) {
            addCriterion("TransportImg >=", value, "transportimg");
            return (Criteria) this;
        }

        public Criteria andTransportimgLessThan(String value) {
            addCriterion("TransportImg <", value, "transportimg");
            return (Criteria) this;
        }

        public Criteria andTransportimgLessThanOrEqualTo(String value) {
            addCriterion("TransportImg <=", value, "transportimg");
            return (Criteria) this;
        }

        public Criteria andTransportimgLike(String value) {
            addCriterion("TransportImg like", value, "transportimg");
            return (Criteria) this;
        }

        public Criteria andTransportimgNotLike(String value) {
            addCriterion("TransportImg not like", value, "transportimg");
            return (Criteria) this;
        }

        public Criteria andTransportimgIn(List<String> values) {
            addCriterion("TransportImg in", values, "transportimg");
            return (Criteria) this;
        }

        public Criteria andTransportimgNotIn(List<String> values) {
            addCriterion("TransportImg not in", values, "transportimg");
            return (Criteria) this;
        }

        public Criteria andTransportimgBetween(String value1, String value2) {
            addCriterion("TransportImg between", value1, value2, "transportimg");
            return (Criteria) this;
        }

        public Criteria andTransportimgNotBetween(String value1, String value2) {
            addCriterion("TransportImg not between", value1, value2, "transportimg");
            return (Criteria) this;
        }

        public Criteria andTransportAIsNull() {
            addCriterion("Transport_A is null");
            return (Criteria) this;
        }

        public Criteria andTransportAIsNotNull() {
            addCriterion("Transport_A is not null");
            return (Criteria) this;
        }

        public Criteria andTransportAEqualTo(Date value) {
            addCriterion("Transport_A =", value, "transportA");
            return (Criteria) this;
        }

        public Criteria andTransportANotEqualTo(Date value) {
            addCriterion("Transport_A <>", value, "transportA");
            return (Criteria) this;
        }

        public Criteria andTransportAGreaterThan(Date value) {
            addCriterion("Transport_A >", value, "transportA");
            return (Criteria) this;
        }

        public Criteria andTransportAGreaterThanOrEqualTo(Date value) {
            addCriterion("Transport_A >=", value, "transportA");
            return (Criteria) this;
        }

        public Criteria andTransportALessThan(Date value) {
            addCriterion("Transport_A <", value, "transportA");
            return (Criteria) this;
        }

        public Criteria andTransportALessThanOrEqualTo(Date value) {
            addCriterion("Transport_A <=", value, "transportA");
            return (Criteria) this;
        }

        public Criteria andTransportAIn(List<Date> values) {
            addCriterion("Transport_A in", values, "transportA");
            return (Criteria) this;
        }

        public Criteria andTransportANotIn(List<Date> values) {
            addCriterion("Transport_A not in", values, "transportA");
            return (Criteria) this;
        }

        public Criteria andTransportABetween(Date value1, Date value2) {
            addCriterion("Transport_A between", value1, value2, "transportA");
            return (Criteria) this;
        }

        public Criteria andTransportANotBetween(Date value1, Date value2) {
            addCriterion("Transport_A not between", value1, value2, "transportA");
            return (Criteria) this;
        }

        public Criteria andTransportBIsNull() {
            addCriterion("Transport_B is null");
            return (Criteria) this;
        }

        public Criteria andTransportBIsNotNull() {
            addCriterion("Transport_B is not null");
            return (Criteria) this;
        }

        public Criteria andTransportBEqualTo(String value) {
            addCriterion("Transport_B =", value, "transportB");
            return (Criteria) this;
        }

        public Criteria andTransportBNotEqualTo(String value) {
            addCriterion("Transport_B <>", value, "transportB");
            return (Criteria) this;
        }

        public Criteria andTransportBGreaterThan(String value) {
            addCriterion("Transport_B >", value, "transportB");
            return (Criteria) this;
        }

        public Criteria andTransportBGreaterThanOrEqualTo(String value) {
            addCriterion("Transport_B >=", value, "transportB");
            return (Criteria) this;
        }

        public Criteria andTransportBLessThan(String value) {
            addCriterion("Transport_B <", value, "transportB");
            return (Criteria) this;
        }

        public Criteria andTransportBLessThanOrEqualTo(String value) {
            addCriterion("Transport_B <=", value, "transportB");
            return (Criteria) this;
        }

        public Criteria andTransportBLike(String value) {
            addCriterion("Transport_B like", value, "transportB");
            return (Criteria) this;
        }

        public Criteria andTransportBNotLike(String value) {
            addCriterion("Transport_B not like", value, "transportB");
            return (Criteria) this;
        }

        public Criteria andTransportBIn(List<String> values) {
            addCriterion("Transport_B in", values, "transportB");
            return (Criteria) this;
        }

        public Criteria andTransportBNotIn(List<String> values) {
            addCriterion("Transport_B not in", values, "transportB");
            return (Criteria) this;
        }

        public Criteria andTransportBBetween(String value1, String value2) {
            addCriterion("Transport_B between", value1, value2, "transportB");
            return (Criteria) this;
        }

        public Criteria andTransportBNotBetween(String value1, String value2) {
            addCriterion("Transport_B not between", value1, value2, "transportB");
            return (Criteria) this;
        }

        public Criteria andTransportCIsNull() {
            addCriterion("Transport_C is null");
            return (Criteria) this;
        }

        public Criteria andTransportCIsNotNull() {
            addCriterion("Transport_C is not null");
            return (Criteria) this;
        }

        public Criteria andTransportCEqualTo(String value) {
            addCriterion("Transport_C =", value, "transportC");
            return (Criteria) this;
        }

        public Criteria andTransportCNotEqualTo(String value) {
            addCriterion("Transport_C <>", value, "transportC");
            return (Criteria) this;
        }

        public Criteria andTransportCGreaterThan(String value) {
            addCriterion("Transport_C >", value, "transportC");
            return (Criteria) this;
        }

        public Criteria andTransportCGreaterThanOrEqualTo(String value) {
            addCriterion("Transport_C >=", value, "transportC");
            return (Criteria) this;
        }

        public Criteria andTransportCLessThan(String value) {
            addCriterion("Transport_C <", value, "transportC");
            return (Criteria) this;
        }

        public Criteria andTransportCLessThanOrEqualTo(String value) {
            addCriterion("Transport_C <=", value, "transportC");
            return (Criteria) this;
        }

        public Criteria andTransportCLike(String value) {
            addCriterion("Transport_C like", value, "transportC");
            return (Criteria) this;
        }

        public Criteria andTransportCNotLike(String value) {
            addCriterion("Transport_C not like", value, "transportC");
            return (Criteria) this;
        }

        public Criteria andTransportCIn(List<String> values) {
            addCriterion("Transport_C in", values, "transportC");
            return (Criteria) this;
        }

        public Criteria andTransportCNotIn(List<String> values) {
            addCriterion("Transport_C not in", values, "transportC");
            return (Criteria) this;
        }

        public Criteria andTransportCBetween(String value1, String value2) {
            addCriterion("Transport_C between", value1, value2, "transportC");
            return (Criteria) this;
        }

        public Criteria andTransportCNotBetween(String value1, String value2) {
            addCriterion("Transport_C not between", value1, value2, "transportC");
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