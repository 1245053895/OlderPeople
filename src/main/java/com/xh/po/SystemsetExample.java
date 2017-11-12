package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class SystemsetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemsetExample() {
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

        public Criteria andWebidIsNull() {
            addCriterion("WebId is null");
            return (Criteria) this;
        }

        public Criteria andWebidIsNotNull() {
            addCriterion("WebId is not null");
            return (Criteria) this;
        }

        public Criteria andWebidEqualTo(Integer value) {
            addCriterion("WebId =", value, "webid");
            return (Criteria) this;
        }

        public Criteria andWebidNotEqualTo(Integer value) {
            addCriterion("WebId <>", value, "webid");
            return (Criteria) this;
        }

        public Criteria andWebidGreaterThan(Integer value) {
            addCriterion("WebId >", value, "webid");
            return (Criteria) this;
        }

        public Criteria andWebidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WebId >=", value, "webid");
            return (Criteria) this;
        }

        public Criteria andWebidLessThan(Integer value) {
            addCriterion("WebId <", value, "webid");
            return (Criteria) this;
        }

        public Criteria andWebidLessThanOrEqualTo(Integer value) {
            addCriterion("WebId <=", value, "webid");
            return (Criteria) this;
        }

        public Criteria andWebidIn(List<Integer> values) {
            addCriterion("WebId in", values, "webid");
            return (Criteria) this;
        }

        public Criteria andWebidNotIn(List<Integer> values) {
            addCriterion("WebId not in", values, "webid");
            return (Criteria) this;
        }

        public Criteria andWebidBetween(Integer value1, Integer value2) {
            addCriterion("WebId between", value1, value2, "webid");
            return (Criteria) this;
        }

        public Criteria andWebidNotBetween(Integer value1, Integer value2) {
            addCriterion("WebId not between", value1, value2, "webid");
            return (Criteria) this;
        }

        public Criteria andWebnameIsNull() {
            addCriterion("WebName is null");
            return (Criteria) this;
        }

        public Criteria andWebnameIsNotNull() {
            addCriterion("WebName is not null");
            return (Criteria) this;
        }

        public Criteria andWebnameEqualTo(String value) {
            addCriterion("WebName =", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotEqualTo(String value) {
            addCriterion("WebName <>", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameGreaterThan(String value) {
            addCriterion("WebName >", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameGreaterThanOrEqualTo(String value) {
            addCriterion("WebName >=", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLessThan(String value) {
            addCriterion("WebName <", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLessThanOrEqualTo(String value) {
            addCriterion("WebName <=", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLike(String value) {
            addCriterion("WebName like", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotLike(String value) {
            addCriterion("WebName not like", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameIn(List<String> values) {
            addCriterion("WebName in", values, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotIn(List<String> values) {
            addCriterion("WebName not in", values, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameBetween(String value1, String value2) {
            addCriterion("WebName between", value1, value2, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotBetween(String value1, String value2) {
            addCriterion("WebName not between", value1, value2, "webname");
            return (Criteria) this;
        }

        public Criteria andWebiconIsNull() {
            addCriterion("WebIcon is null");
            return (Criteria) this;
        }

        public Criteria andWebiconIsNotNull() {
            addCriterion("WebIcon is not null");
            return (Criteria) this;
        }

        public Criteria andWebiconEqualTo(String value) {
            addCriterion("WebIcon =", value, "webicon");
            return (Criteria) this;
        }

        public Criteria andWebiconNotEqualTo(String value) {
            addCriterion("WebIcon <>", value, "webicon");
            return (Criteria) this;
        }

        public Criteria andWebiconGreaterThan(String value) {
            addCriterion("WebIcon >", value, "webicon");
            return (Criteria) this;
        }

        public Criteria andWebiconGreaterThanOrEqualTo(String value) {
            addCriterion("WebIcon >=", value, "webicon");
            return (Criteria) this;
        }

        public Criteria andWebiconLessThan(String value) {
            addCriterion("WebIcon <", value, "webicon");
            return (Criteria) this;
        }

        public Criteria andWebiconLessThanOrEqualTo(String value) {
            addCriterion("WebIcon <=", value, "webicon");
            return (Criteria) this;
        }

        public Criteria andWebiconLike(String value) {
            addCriterion("WebIcon like", value, "webicon");
            return (Criteria) this;
        }

        public Criteria andWebiconNotLike(String value) {
            addCriterion("WebIcon not like", value, "webicon");
            return (Criteria) this;
        }

        public Criteria andWebiconIn(List<String> values) {
            addCriterion("WebIcon in", values, "webicon");
            return (Criteria) this;
        }

        public Criteria andWebiconNotIn(List<String> values) {
            addCriterion("WebIcon not in", values, "webicon");
            return (Criteria) this;
        }

        public Criteria andWebiconBetween(String value1, String value2) {
            addCriterion("WebIcon between", value1, value2, "webicon");
            return (Criteria) this;
        }

        public Criteria andWebiconNotBetween(String value1, String value2) {
            addCriterion("WebIcon not between", value1, value2, "webicon");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("KeyWords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("KeyWords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("KeyWords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("KeyWords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("KeyWords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("KeyWords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("KeyWords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("KeyWords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("KeyWords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("KeyWords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("KeyWords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("KeyWords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("KeyWords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("KeyWords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andBlockwordsIsNull() {
            addCriterion("BlockWords is null");
            return (Criteria) this;
        }

        public Criteria andBlockwordsIsNotNull() {
            addCriterion("BlockWords is not null");
            return (Criteria) this;
        }

        public Criteria andBlockwordsEqualTo(String value) {
            addCriterion("BlockWords =", value, "blockwords");
            return (Criteria) this;
        }

        public Criteria andBlockwordsNotEqualTo(String value) {
            addCriterion("BlockWords <>", value, "blockwords");
            return (Criteria) this;
        }

        public Criteria andBlockwordsGreaterThan(String value) {
            addCriterion("BlockWords >", value, "blockwords");
            return (Criteria) this;
        }

        public Criteria andBlockwordsGreaterThanOrEqualTo(String value) {
            addCriterion("BlockWords >=", value, "blockwords");
            return (Criteria) this;
        }

        public Criteria andBlockwordsLessThan(String value) {
            addCriterion("BlockWords <", value, "blockwords");
            return (Criteria) this;
        }

        public Criteria andBlockwordsLessThanOrEqualTo(String value) {
            addCriterion("BlockWords <=", value, "blockwords");
            return (Criteria) this;
        }

        public Criteria andBlockwordsLike(String value) {
            addCriterion("BlockWords like", value, "blockwords");
            return (Criteria) this;
        }

        public Criteria andBlockwordsNotLike(String value) {
            addCriterion("BlockWords not like", value, "blockwords");
            return (Criteria) this;
        }

        public Criteria andBlockwordsIn(List<String> values) {
            addCriterion("BlockWords in", values, "blockwords");
            return (Criteria) this;
        }

        public Criteria andBlockwordsNotIn(List<String> values) {
            addCriterion("BlockWords not in", values, "blockwords");
            return (Criteria) this;
        }

        public Criteria andBlockwordsBetween(String value1, String value2) {
            addCriterion("BlockWords between", value1, value2, "blockwords");
            return (Criteria) this;
        }

        public Criteria andBlockwordsNotBetween(String value1, String value2) {
            addCriterion("BlockWords not between", value1, value2, "blockwords");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnIsNull() {
            addCriterion("WebfilePatn is null");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnIsNotNull() {
            addCriterion("WebfilePatn is not null");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnEqualTo(String value) {
            addCriterion("WebfilePatn =", value, "webfilepatn");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnNotEqualTo(String value) {
            addCriterion("WebfilePatn <>", value, "webfilepatn");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnGreaterThan(String value) {
            addCriterion("WebfilePatn >", value, "webfilepatn");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnGreaterThanOrEqualTo(String value) {
            addCriterion("WebfilePatn >=", value, "webfilepatn");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnLessThan(String value) {
            addCriterion("WebfilePatn <", value, "webfilepatn");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnLessThanOrEqualTo(String value) {
            addCriterion("WebfilePatn <=", value, "webfilepatn");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnLike(String value) {
            addCriterion("WebfilePatn like", value, "webfilepatn");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnNotLike(String value) {
            addCriterion("WebfilePatn not like", value, "webfilepatn");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnIn(List<String> values) {
            addCriterion("WebfilePatn in", values, "webfilepatn");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnNotIn(List<String> values) {
            addCriterion("WebfilePatn not in", values, "webfilepatn");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnBetween(String value1, String value2) {
            addCriterion("WebfilePatn between", value1, value2, "webfilepatn");
            return (Criteria) this;
        }

        public Criteria andWebfilepatnNotBetween(String value1, String value2) {
            addCriterion("WebfilePatn not between", value1, value2, "webfilepatn");
            return (Criteria) this;
        }

        public Criteria andWebdescribeIsNull() {
            addCriterion("WebDescribe is null");
            return (Criteria) this;
        }

        public Criteria andWebdescribeIsNotNull() {
            addCriterion("WebDescribe is not null");
            return (Criteria) this;
        }

        public Criteria andWebdescribeEqualTo(String value) {
            addCriterion("WebDescribe =", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeNotEqualTo(String value) {
            addCriterion("WebDescribe <>", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeGreaterThan(String value) {
            addCriterion("WebDescribe >", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("WebDescribe >=", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeLessThan(String value) {
            addCriterion("WebDescribe <", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeLessThanOrEqualTo(String value) {
            addCriterion("WebDescribe <=", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeLike(String value) {
            addCriterion("WebDescribe like", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeNotLike(String value) {
            addCriterion("WebDescribe not like", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeIn(List<String> values) {
            addCriterion("WebDescribe in", values, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeNotIn(List<String> values) {
            addCriterion("WebDescribe not in", values, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeBetween(String value1, String value2) {
            addCriterion("WebDescribe between", value1, value2, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeNotBetween(String value1, String value2) {
            addCriterion("WebDescribe not between", value1, value2, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightIsNull() {
            addCriterion("BottomCopyright is null");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightIsNotNull() {
            addCriterion("BottomCopyright is not null");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightEqualTo(String value) {
            addCriterion("BottomCopyright =", value, "bottomcopyright");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightNotEqualTo(String value) {
            addCriterion("BottomCopyright <>", value, "bottomcopyright");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightGreaterThan(String value) {
            addCriterion("BottomCopyright >", value, "bottomcopyright");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("BottomCopyright >=", value, "bottomcopyright");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightLessThan(String value) {
            addCriterion("BottomCopyright <", value, "bottomcopyright");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightLessThanOrEqualTo(String value) {
            addCriterion("BottomCopyright <=", value, "bottomcopyright");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightLike(String value) {
            addCriterion("BottomCopyright like", value, "bottomcopyright");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightNotLike(String value) {
            addCriterion("BottomCopyright not like", value, "bottomcopyright");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightIn(List<String> values) {
            addCriterion("BottomCopyright in", values, "bottomcopyright");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightNotIn(List<String> values) {
            addCriterion("BottomCopyright not in", values, "bottomcopyright");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightBetween(String value1, String value2) {
            addCriterion("BottomCopyright between", value1, value2, "bottomcopyright");
            return (Criteria) this;
        }

        public Criteria andBottomcopyrightNotBetween(String value1, String value2) {
            addCriterion("BottomCopyright not between", value1, value2, "bottomcopyright");
            return (Criteria) this;
        }

        public Criteria andRecordnumberIsNull() {
            addCriterion("RecordNumber is null");
            return (Criteria) this;
        }

        public Criteria andRecordnumberIsNotNull() {
            addCriterion("RecordNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRecordnumberEqualTo(String value) {
            addCriterion("RecordNumber =", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberNotEqualTo(String value) {
            addCriterion("RecordNumber <>", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberGreaterThan(String value) {
            addCriterion("RecordNumber >", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberGreaterThanOrEqualTo(String value) {
            addCriterion("RecordNumber >=", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberLessThan(String value) {
            addCriterion("RecordNumber <", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberLessThanOrEqualTo(String value) {
            addCriterion("RecordNumber <=", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberLike(String value) {
            addCriterion("RecordNumber like", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberNotLike(String value) {
            addCriterion("RecordNumber not like", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberIn(List<String> values) {
            addCriterion("RecordNumber in", values, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberNotIn(List<String> values) {
            addCriterion("RecordNumber not in", values, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberBetween(String value1, String value2) {
            addCriterion("RecordNumber between", value1, value2, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberNotBetween(String value1, String value2) {
            addCriterion("RecordNumber not between", value1, value2, "recordnumber");
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