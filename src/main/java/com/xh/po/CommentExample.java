package com.xh.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("CommentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("CommentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Integer value) {
            addCriterion("CommentId =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Integer value) {
            addCriterion("CommentId <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Integer value) {
            addCriterion("CommentId >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommentId >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Integer value) {
            addCriterion("CommentId <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("CommentId <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Integer> values) {
            addCriterion("CommentId in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Integer> values) {
            addCriterion("CommentId not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Integer value1, Integer value2) {
            addCriterion("CommentId between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("CommentId not between", value1, value2, "commentid");
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

        public Criteria andCommentIsNull() {
            addCriterion("Comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("Comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("Comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("Comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("Comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("Comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("Comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("Comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("Comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("Comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("Comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("Comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("Comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentIsNull() {
            addCriterion("GoodComment is null");
            return (Criteria) this;
        }

        public Criteria andGoodcommentIsNotNull() {
            addCriterion("GoodComment is not null");
            return (Criteria) this;
        }

        public Criteria andGoodcommentEqualTo(Integer value) {
            addCriterion("GoodComment =", value, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentNotEqualTo(Integer value) {
            addCriterion("GoodComment <>", value, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentGreaterThan(Integer value) {
            addCriterion("GoodComment >", value, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodComment >=", value, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentLessThan(Integer value) {
            addCriterion("GoodComment <", value, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentLessThanOrEqualTo(Integer value) {
            addCriterion("GoodComment <=", value, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentIn(List<Integer> values) {
            addCriterion("GoodComment in", values, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentNotIn(List<Integer> values) {
            addCriterion("GoodComment not in", values, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentBetween(Integer value1, Integer value2) {
            addCriterion("GoodComment between", value1, value2, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andGoodcommentNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodComment not between", value1, value2, "goodcomment");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNull() {
            addCriterion("CommentTime is null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNotNull() {
            addCriterion("CommentTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeEqualTo(Date value) {
            addCriterion("CommentTime =", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotEqualTo(Date value) {
            addCriterion("CommentTime <>", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThan(Date value) {
            addCriterion("CommentTime >", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CommentTime >=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThan(Date value) {
            addCriterion("CommentTime <", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThanOrEqualTo(Date value) {
            addCriterion("CommentTime <=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIn(List<Date> values) {
            addCriterion("CommentTime in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotIn(List<Date> values) {
            addCriterion("CommentTime not in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeBetween(Date value1, Date value2) {
            addCriterion("CommentTime between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotBetween(Date value1, Date value2) {
            addCriterion("CommentTime not between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommentreviewIsNull() {
            addCriterion("CommentReview is null");
            return (Criteria) this;
        }

        public Criteria andCommentreviewIsNotNull() {
            addCriterion("CommentReview is not null");
            return (Criteria) this;
        }

        public Criteria andCommentreviewEqualTo(String value) {
            addCriterion("CommentReview =", value, "commentreview");
            return (Criteria) this;
        }

        public Criteria andCommentreviewNotEqualTo(String value) {
            addCriterion("CommentReview <>", value, "commentreview");
            return (Criteria) this;
        }

        public Criteria andCommentreviewGreaterThan(String value) {
            addCriterion("CommentReview >", value, "commentreview");
            return (Criteria) this;
        }

        public Criteria andCommentreviewGreaterThanOrEqualTo(String value) {
            addCriterion("CommentReview >=", value, "commentreview");
            return (Criteria) this;
        }

        public Criteria andCommentreviewLessThan(String value) {
            addCriterion("CommentReview <", value, "commentreview");
            return (Criteria) this;
        }

        public Criteria andCommentreviewLessThanOrEqualTo(String value) {
            addCriterion("CommentReview <=", value, "commentreview");
            return (Criteria) this;
        }

        public Criteria andCommentreviewLike(String value) {
            addCriterion("CommentReview like", value, "commentreview");
            return (Criteria) this;
        }

        public Criteria andCommentreviewNotLike(String value) {
            addCriterion("CommentReview not like", value, "commentreview");
            return (Criteria) this;
        }

        public Criteria andCommentreviewIn(List<String> values) {
            addCriterion("CommentReview in", values, "commentreview");
            return (Criteria) this;
        }

        public Criteria andCommentreviewNotIn(List<String> values) {
            addCriterion("CommentReview not in", values, "commentreview");
            return (Criteria) this;
        }

        public Criteria andCommentreviewBetween(String value1, String value2) {
            addCriterion("CommentReview between", value1, value2, "commentreview");
            return (Criteria) this;
        }

        public Criteria andCommentreviewNotBetween(String value1, String value2) {
            addCriterion("CommentReview not between", value1, value2, "commentreview");
            return (Criteria) this;
        }

        public Criteria andCommentCIsNull() {
            addCriterion("Comment_C is null");
            return (Criteria) this;
        }

        public Criteria andCommentCIsNotNull() {
            addCriterion("Comment_C is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCEqualTo(String value) {
            addCriterion("Comment_C =", value, "commentC");
            return (Criteria) this;
        }

        public Criteria andCommentCNotEqualTo(String value) {
            addCriterion("Comment_C <>", value, "commentC");
            return (Criteria) this;
        }

        public Criteria andCommentCGreaterThan(String value) {
            addCriterion("Comment_C >", value, "commentC");
            return (Criteria) this;
        }

        public Criteria andCommentCGreaterThanOrEqualTo(String value) {
            addCriterion("Comment_C >=", value, "commentC");
            return (Criteria) this;
        }

        public Criteria andCommentCLessThan(String value) {
            addCriterion("Comment_C <", value, "commentC");
            return (Criteria) this;
        }

        public Criteria andCommentCLessThanOrEqualTo(String value) {
            addCriterion("Comment_C <=", value, "commentC");
            return (Criteria) this;
        }

        public Criteria andCommentCLike(String value) {
            addCriterion("Comment_C like", value, "commentC");
            return (Criteria) this;
        }

        public Criteria andCommentCNotLike(String value) {
            addCriterion("Comment_C not like", value, "commentC");
            return (Criteria) this;
        }

        public Criteria andCommentCIn(List<String> values) {
            addCriterion("Comment_C in", values, "commentC");
            return (Criteria) this;
        }

        public Criteria andCommentCNotIn(List<String> values) {
            addCriterion("Comment_C not in", values, "commentC");
            return (Criteria) this;
        }

        public Criteria andCommentCBetween(String value1, String value2) {
            addCriterion("Comment_C between", value1, value2, "commentC");
            return (Criteria) this;
        }

        public Criteria andCommentCNotBetween(String value1, String value2) {
            addCriterion("Comment_C not between", value1, value2, "commentC");
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