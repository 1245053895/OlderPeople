package com.xh.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andRealpayIsNull() {
            addCriterion("RealPay is null");
            return (Criteria) this;
        }

        public Criteria andRealpayIsNotNull() {
            addCriterion("RealPay is not null");
            return (Criteria) this;
        }

        public Criteria andRealpayEqualTo(Double value) {
            addCriterion("RealPay =", value, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayNotEqualTo(Double value) {
            addCriterion("RealPay <>", value, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayGreaterThan(Double value) {
            addCriterion("RealPay >", value, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayGreaterThanOrEqualTo(Double value) {
            addCriterion("RealPay >=", value, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayLessThan(Double value) {
            addCriterion("RealPay <", value, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayLessThanOrEqualTo(Double value) {
            addCriterion("RealPay <=", value, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayIn(List<Double> values) {
            addCriterion("RealPay in", values, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayNotIn(List<Double> values) {
            addCriterion("RealPay not in", values, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayBetween(Double value1, Double value2) {
            addCriterion("RealPay between", value1, value2, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayNotBetween(Double value1, Double value2) {
            addCriterion("RealPay not between", value1, value2, "realpay");
            return (Criteria) this;
        }

        public Criteria andAmountpayIsNull() {
            addCriterion("AmountPay is null");
            return (Criteria) this;
        }

        public Criteria andAmountpayIsNotNull() {
            addCriterion("AmountPay is not null");
            return (Criteria) this;
        }

        public Criteria andAmountpayEqualTo(Double value) {
            addCriterion("AmountPay =", value, "amountpay");
            return (Criteria) this;
        }

        public Criteria andAmountpayNotEqualTo(Double value) {
            addCriterion("AmountPay <>", value, "amountpay");
            return (Criteria) this;
        }

        public Criteria andAmountpayGreaterThan(Double value) {
            addCriterion("AmountPay >", value, "amountpay");
            return (Criteria) this;
        }

        public Criteria andAmountpayGreaterThanOrEqualTo(Double value) {
            addCriterion("AmountPay >=", value, "amountpay");
            return (Criteria) this;
        }

        public Criteria andAmountpayLessThan(Double value) {
            addCriterion("AmountPay <", value, "amountpay");
            return (Criteria) this;
        }

        public Criteria andAmountpayLessThanOrEqualTo(Double value) {
            addCriterion("AmountPay <=", value, "amountpay");
            return (Criteria) this;
        }

        public Criteria andAmountpayIn(List<Double> values) {
            addCriterion("AmountPay in", values, "amountpay");
            return (Criteria) this;
        }

        public Criteria andAmountpayNotIn(List<Double> values) {
            addCriterion("AmountPay not in", values, "amountpay");
            return (Criteria) this;
        }

        public Criteria andAmountpayBetween(Double value1, Double value2) {
            addCriterion("AmountPay between", value1, value2, "amountpay");
            return (Criteria) this;
        }

        public Criteria andAmountpayNotBetween(Double value1, Double value2) {
            addCriterion("AmountPay not between", value1, value2, "amountpay");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PayType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PayType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(Integer value) {
            addCriterion("PayType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(Integer value) {
            addCriterion("PayType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(Integer value) {
            addCriterion("PayType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(Integer value) {
            addCriterion("PayType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("PayType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<Integer> values) {
            addCriterion("PayType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<Integer> values) {
            addCriterion("PayType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(Integer value1, Integer value2) {
            addCriterion("PayType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PayType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPostfeeIsNull() {
            addCriterion("PostFee is null");
            return (Criteria) this;
        }

        public Criteria andPostfeeIsNotNull() {
            addCriterion("PostFee is not null");
            return (Criteria) this;
        }

        public Criteria andPostfeeEqualTo(Double value) {
            addCriterion("PostFee =", value, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeNotEqualTo(Double value) {
            addCriterion("PostFee <>", value, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeGreaterThan(Double value) {
            addCriterion("PostFee >", value, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("PostFee >=", value, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeLessThan(Double value) {
            addCriterion("PostFee <", value, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeLessThanOrEqualTo(Double value) {
            addCriterion("PostFee <=", value, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeIn(List<Double> values) {
            addCriterion("PostFee in", values, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeNotIn(List<Double> values) {
            addCriterion("PostFee not in", values, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeBetween(Double value1, Double value2) {
            addCriterion("PostFee between", value1, value2, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeNotBetween(Double value1, Double value2) {
            addCriterion("PostFee not between", value1, value2, "postfee");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNull() {
            addCriterion("PayStatus is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("PayStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(Integer value) {
            addCriterion("PayStatus =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(Integer value) {
            addCriterion("PayStatus <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(Integer value) {
            addCriterion("PayStatus >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayStatus >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(Integer value) {
            addCriterion("PayStatus <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(Integer value) {
            addCriterion("PayStatus <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<Integer> values) {
            addCriterion("PayStatus in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<Integer> values) {
            addCriterion("PayStatus not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(Integer value1, Integer value2) {
            addCriterion("PayStatus between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PayStatus not between", value1, value2, "paystatus");
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

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeIsNull() {
            addCriterion("PaymentTime is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeIsNotNull() {
            addCriterion("PaymentTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeEqualTo(Date value) {
            addCriterion("PaymentTime =", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotEqualTo(Date value) {
            addCriterion("PaymentTime <>", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeGreaterThan(Date value) {
            addCriterion("PaymentTime >", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PaymentTime >=", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeLessThan(Date value) {
            addCriterion("PaymentTime <", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeLessThanOrEqualTo(Date value) {
            addCriterion("PaymentTime <=", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeIn(List<Date> values) {
            addCriterion("PaymentTime in", values, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotIn(List<Date> values) {
            addCriterion("PaymentTime not in", values, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeBetween(Date value1, Date value2) {
            addCriterion("PaymentTime between", value1, value2, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotBetween(Date value1, Date value2) {
            addCriterion("PaymentTime not between", value1, value2, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("SendTime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("SendTime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("SendTime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("SendTime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("SendTime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SendTime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("SendTime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("SendTime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("SendTime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("SendTime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("SendTime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("SendTime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("EndTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andClosetimeIsNull() {
            addCriterion("CloseTime is null");
            return (Criteria) this;
        }

        public Criteria andClosetimeIsNotNull() {
            addCriterion("CloseTime is not null");
            return (Criteria) this;
        }

        public Criteria andClosetimeEqualTo(Date value) {
            addCriterion("CloseTime =", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeNotEqualTo(Date value) {
            addCriterion("CloseTime <>", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeGreaterThan(Date value) {
            addCriterion("CloseTime >", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CloseTime >=", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeLessThan(Date value) {
            addCriterion("CloseTime <", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeLessThanOrEqualTo(Date value) {
            addCriterion("CloseTime <=", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeIn(List<Date> values) {
            addCriterion("CloseTime in", values, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeNotIn(List<Date> values) {
            addCriterion("CloseTime not in", values, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeBetween(Date value1, Date value2) {
            addCriterion("CloseTime between", value1, value2, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeNotBetween(Date value1, Date value2) {
            addCriterion("CloseTime not between", value1, value2, "closetime");
            return (Criteria) this;
        }

        public Criteria andShippingnameIsNull() {
            addCriterion("ShippingName is null");
            return (Criteria) this;
        }

        public Criteria andShippingnameIsNotNull() {
            addCriterion("ShippingName is not null");
            return (Criteria) this;
        }

        public Criteria andShippingnameEqualTo(String value) {
            addCriterion("ShippingName =", value, "shippingname");
            return (Criteria) this;
        }

        public Criteria andShippingnameNotEqualTo(String value) {
            addCriterion("ShippingName <>", value, "shippingname");
            return (Criteria) this;
        }

        public Criteria andShippingnameGreaterThan(String value) {
            addCriterion("ShippingName >", value, "shippingname");
            return (Criteria) this;
        }

        public Criteria andShippingnameGreaterThanOrEqualTo(String value) {
            addCriterion("ShippingName >=", value, "shippingname");
            return (Criteria) this;
        }

        public Criteria andShippingnameLessThan(String value) {
            addCriterion("ShippingName <", value, "shippingname");
            return (Criteria) this;
        }

        public Criteria andShippingnameLessThanOrEqualTo(String value) {
            addCriterion("ShippingName <=", value, "shippingname");
            return (Criteria) this;
        }

        public Criteria andShippingnameLike(String value) {
            addCriterion("ShippingName like", value, "shippingname");
            return (Criteria) this;
        }

        public Criteria andShippingnameNotLike(String value) {
            addCriterion("ShippingName not like", value, "shippingname");
            return (Criteria) this;
        }

        public Criteria andShippingnameIn(List<String> values) {
            addCriterion("ShippingName in", values, "shippingname");
            return (Criteria) this;
        }

        public Criteria andShippingnameNotIn(List<String> values) {
            addCriterion("ShippingName not in", values, "shippingname");
            return (Criteria) this;
        }

        public Criteria andShippingnameBetween(String value1, String value2) {
            addCriterion("ShippingName between", value1, value2, "shippingname");
            return (Criteria) this;
        }

        public Criteria andShippingnameNotBetween(String value1, String value2) {
            addCriterion("ShippingName not between", value1, value2, "shippingname");
            return (Criteria) this;
        }

        public Criteria andShippingcodeIsNull() {
            addCriterion("ShippingCode is null");
            return (Criteria) this;
        }

        public Criteria andShippingcodeIsNotNull() {
            addCriterion("ShippingCode is not null");
            return (Criteria) this;
        }

        public Criteria andShippingcodeEqualTo(String value) {
            addCriterion("ShippingCode =", value, "shippingcode");
            return (Criteria) this;
        }

        public Criteria andShippingcodeNotEqualTo(String value) {
            addCriterion("ShippingCode <>", value, "shippingcode");
            return (Criteria) this;
        }

        public Criteria andShippingcodeGreaterThan(String value) {
            addCriterion("ShippingCode >", value, "shippingcode");
            return (Criteria) this;
        }

        public Criteria andShippingcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ShippingCode >=", value, "shippingcode");
            return (Criteria) this;
        }

        public Criteria andShippingcodeLessThan(String value) {
            addCriterion("ShippingCode <", value, "shippingcode");
            return (Criteria) this;
        }

        public Criteria andShippingcodeLessThanOrEqualTo(String value) {
            addCriterion("ShippingCode <=", value, "shippingcode");
            return (Criteria) this;
        }

        public Criteria andShippingcodeLike(String value) {
            addCriterion("ShippingCode like", value, "shippingcode");
            return (Criteria) this;
        }

        public Criteria andShippingcodeNotLike(String value) {
            addCriterion("ShippingCode not like", value, "shippingcode");
            return (Criteria) this;
        }

        public Criteria andShippingcodeIn(List<String> values) {
            addCriterion("ShippingCode in", values, "shippingcode");
            return (Criteria) this;
        }

        public Criteria andShippingcodeNotIn(List<String> values) {
            addCriterion("ShippingCode not in", values, "shippingcode");
            return (Criteria) this;
        }

        public Criteria andShippingcodeBetween(String value1, String value2) {
            addCriterion("ShippingCode between", value1, value2, "shippingcode");
            return (Criteria) this;
        }

        public Criteria andShippingcodeNotBetween(String value1, String value2) {
            addCriterion("ShippingCode not between", value1, value2, "shippingcode");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestIsNull() {
            addCriterion("BuyerRequest is null");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestIsNotNull() {
            addCriterion("BuyerRequest is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestEqualTo(String value) {
            addCriterion("BuyerRequest =", value, "buyerrequest");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestNotEqualTo(String value) {
            addCriterion("BuyerRequest <>", value, "buyerrequest");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestGreaterThan(String value) {
            addCriterion("BuyerRequest >", value, "buyerrequest");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestGreaterThanOrEqualTo(String value) {
            addCriterion("BuyerRequest >=", value, "buyerrequest");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestLessThan(String value) {
            addCriterion("BuyerRequest <", value, "buyerrequest");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestLessThanOrEqualTo(String value) {
            addCriterion("BuyerRequest <=", value, "buyerrequest");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestLike(String value) {
            addCriterion("BuyerRequest like", value, "buyerrequest");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestNotLike(String value) {
            addCriterion("BuyerRequest not like", value, "buyerrequest");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestIn(List<String> values) {
            addCriterion("BuyerRequest in", values, "buyerrequest");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestNotIn(List<String> values) {
            addCriterion("BuyerRequest not in", values, "buyerrequest");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestBetween(String value1, String value2) {
            addCriterion("BuyerRequest between", value1, value2, "buyerrequest");
            return (Criteria) this;
        }

        public Criteria andBuyerrequestNotBetween(String value1, String value2) {
            addCriterion("BuyerRequest not between", value1, value2, "buyerrequest");
            return (Criteria) this;
        }

        public Criteria andTotalcreditIsNull() {
            addCriterion("TotalCredit is null");
            return (Criteria) this;
        }

        public Criteria andTotalcreditIsNotNull() {
            addCriterion("TotalCredit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcreditEqualTo(Integer value) {
            addCriterion("TotalCredit =", value, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditNotEqualTo(Integer value) {
            addCriterion("TotalCredit <>", value, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditGreaterThan(Integer value) {
            addCriterion("TotalCredit >", value, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("TotalCredit >=", value, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditLessThan(Integer value) {
            addCriterion("TotalCredit <", value, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditLessThanOrEqualTo(Integer value) {
            addCriterion("TotalCredit <=", value, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditIn(List<Integer> values) {
            addCriterion("TotalCredit in", values, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditNotIn(List<Integer> values) {
            addCriterion("TotalCredit not in", values, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditBetween(Integer value1, Integer value2) {
            addCriterion("TotalCredit between", value1, value2, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditNotBetween(Integer value1, Integer value2) {
            addCriterion("TotalCredit not between", value1, value2, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andOrderAIsNull() {
            addCriterion("Order_A is null");
            return (Criteria) this;
        }

        public Criteria andOrderAIsNotNull() {
            addCriterion("Order_A is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAEqualTo(String value) {
            addCriterion("Order_A =", value, "orderA");
            return (Criteria) this;
        }

        public Criteria andOrderANotEqualTo(String value) {
            addCriterion("Order_A <>", value, "orderA");
            return (Criteria) this;
        }

        public Criteria andOrderAGreaterThan(String value) {
            addCriterion("Order_A >", value, "orderA");
            return (Criteria) this;
        }

        public Criteria andOrderAGreaterThanOrEqualTo(String value) {
            addCriterion("Order_A >=", value, "orderA");
            return (Criteria) this;
        }

        public Criteria andOrderALessThan(String value) {
            addCriterion("Order_A <", value, "orderA");
            return (Criteria) this;
        }

        public Criteria andOrderALessThanOrEqualTo(String value) {
            addCriterion("Order_A <=", value, "orderA");
            return (Criteria) this;
        }

        public Criteria andOrderALike(String value) {
            addCriterion("Order_A like", value, "orderA");
            return (Criteria) this;
        }

        public Criteria andOrderANotLike(String value) {
            addCriterion("Order_A not like", value, "orderA");
            return (Criteria) this;
        }

        public Criteria andOrderAIn(List<String> values) {
            addCriterion("Order_A in", values, "orderA");
            return (Criteria) this;
        }

        public Criteria andOrderANotIn(List<String> values) {
            addCriterion("Order_A not in", values, "orderA");
            return (Criteria) this;
        }

        public Criteria andOrderABetween(String value1, String value2) {
            addCriterion("Order_A between", value1, value2, "orderA");
            return (Criteria) this;
        }

        public Criteria andOrderANotBetween(String value1, String value2) {
            addCriterion("Order_A not between", value1, value2, "orderA");
            return (Criteria) this;
        }

        public Criteria andOrderBIsNull() {
            addCriterion("Order_B is null");
            return (Criteria) this;
        }

        public Criteria andOrderBIsNotNull() {
            addCriterion("Order_B is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBEqualTo(String value) {
            addCriterion("Order_B =", value, "orderB");
            return (Criteria) this;
        }

        public Criteria andOrderBNotEqualTo(String value) {
            addCriterion("Order_B <>", value, "orderB");
            return (Criteria) this;
        }

        public Criteria andOrderBGreaterThan(String value) {
            addCriterion("Order_B >", value, "orderB");
            return (Criteria) this;
        }

        public Criteria andOrderBGreaterThanOrEqualTo(String value) {
            addCriterion("Order_B >=", value, "orderB");
            return (Criteria) this;
        }

        public Criteria andOrderBLessThan(String value) {
            addCriterion("Order_B <", value, "orderB");
            return (Criteria) this;
        }

        public Criteria andOrderBLessThanOrEqualTo(String value) {
            addCriterion("Order_B <=", value, "orderB");
            return (Criteria) this;
        }

        public Criteria andOrderBLike(String value) {
            addCriterion("Order_B like", value, "orderB");
            return (Criteria) this;
        }

        public Criteria andOrderBNotLike(String value) {
            addCriterion("Order_B not like", value, "orderB");
            return (Criteria) this;
        }

        public Criteria andOrderBIn(List<String> values) {
            addCriterion("Order_B in", values, "orderB");
            return (Criteria) this;
        }

        public Criteria andOrderBNotIn(List<String> values) {
            addCriterion("Order_B not in", values, "orderB");
            return (Criteria) this;
        }

        public Criteria andOrderBBetween(String value1, String value2) {
            addCriterion("Order_B between", value1, value2, "orderB");
            return (Criteria) this;
        }

        public Criteria andOrderBNotBetween(String value1, String value2) {
            addCriterion("Order_B not between", value1, value2, "orderB");
            return (Criteria) this;
        }

        public Criteria andOrderCIsNull() {
            addCriterion("Order_C is null");
            return (Criteria) this;
        }

        public Criteria andOrderCIsNotNull() {
            addCriterion("Order_C is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCEqualTo(String value) {
            addCriterion("Order_C =", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCNotEqualTo(String value) {
            addCriterion("Order_C <>", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCGreaterThan(String value) {
            addCriterion("Order_C >", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCGreaterThanOrEqualTo(String value) {
            addCriterion("Order_C >=", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCLessThan(String value) {
            addCriterion("Order_C <", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCLessThanOrEqualTo(String value) {
            addCriterion("Order_C <=", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCLike(String value) {
            addCriterion("Order_C like", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCNotLike(String value) {
            addCriterion("Order_C not like", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCIn(List<String> values) {
            addCriterion("Order_C in", values, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCNotIn(List<String> values) {
            addCriterion("Order_C not in", values, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCBetween(String value1, String value2) {
            addCriterion("Order_C between", value1, value2, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCNotBetween(String value1, String value2) {
            addCriterion("Order_C not between", value1, value2, "orderC");
            return (Criteria) this;
        }

        public Criteria andGainidIsNull() {
            addCriterion("GainId is null");
            return (Criteria) this;
        }

        public Criteria andGainidIsNotNull() {
            addCriterion("GainId is not null");
            return (Criteria) this;
        }

        public Criteria andGainidEqualTo(Integer value) {
            addCriterion("GainId =", value, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidNotEqualTo(Integer value) {
            addCriterion("GainId <>", value, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidGreaterThan(Integer value) {
            addCriterion("GainId >", value, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GainId >=", value, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidLessThan(Integer value) {
            addCriterion("GainId <", value, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidLessThanOrEqualTo(Integer value) {
            addCriterion("GainId <=", value, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidIn(List<Integer> values) {
            addCriterion("GainId in", values, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidNotIn(List<Integer> values) {
            addCriterion("GainId not in", values, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidBetween(Integer value1, Integer value2) {
            addCriterion("GainId between", value1, value2, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainidNotBetween(Integer value1, Integer value2) {
            addCriterion("GainId not between", value1, value2, "gainid");
            return (Criteria) this;
        }

        public Criteria andGainmethodIsNull() {
            addCriterion("GainMethod is null");
            return (Criteria) this;
        }

        public Criteria andGainmethodIsNotNull() {
            addCriterion("GainMethod is not null");
            return (Criteria) this;
        }

        public Criteria andGainmethodEqualTo(Integer value) {
            addCriterion("GainMethod =", value, "gainmethod");
            return (Criteria) this;
        }

        public Criteria andGainmethodNotEqualTo(Integer value) {
            addCriterion("GainMethod <>", value, "gainmethod");
            return (Criteria) this;
        }

        public Criteria andGainmethodGreaterThan(Integer value) {
            addCriterion("GainMethod >", value, "gainmethod");
            return (Criteria) this;
        }

        public Criteria andGainmethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("GainMethod >=", value, "gainmethod");
            return (Criteria) this;
        }

        public Criteria andGainmethodLessThan(Integer value) {
            addCriterion("GainMethod <", value, "gainmethod");
            return (Criteria) this;
        }

        public Criteria andGainmethodLessThanOrEqualTo(Integer value) {
            addCriterion("GainMethod <=", value, "gainmethod");
            return (Criteria) this;
        }

        public Criteria andGainmethodIn(List<Integer> values) {
            addCriterion("GainMethod in", values, "gainmethod");
            return (Criteria) this;
        }

        public Criteria andGainmethodNotIn(List<Integer> values) {
            addCriterion("GainMethod not in", values, "gainmethod");
            return (Criteria) this;
        }

        public Criteria andGainmethodBetween(Integer value1, Integer value2) {
            addCriterion("GainMethod between", value1, value2, "gainmethod");
            return (Criteria) this;
        }

        public Criteria andGainmethodNotBetween(Integer value1, Integer value2) {
            addCriterion("GainMethod not between", value1, value2, "gainmethod");
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