package com.xh.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNull() {
            addCriterion("UserPwd is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNotNull() {
            addCriterion("UserPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdEqualTo(String value) {
            addCriterion("UserPwd =", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotEqualTo(String value) {
            addCriterion("UserPwd <>", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThan(String value) {
            addCriterion("UserPwd >", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThanOrEqualTo(String value) {
            addCriterion("UserPwd >=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThan(String value) {
            addCriterion("UserPwd <", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThanOrEqualTo(String value) {
            addCriterion("UserPwd <=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLike(String value) {
            addCriterion("UserPwd like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotLike(String value) {
            addCriterion("UserPwd not like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdIn(List<String> values) {
            addCriterion("UserPwd in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotIn(List<String> values) {
            addCriterion("UserPwd not in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdBetween(String value1, String value2) {
            addCriterion("UserPwd between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotBetween(String value1, String value2) {
            addCriterion("UserPwd not between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNull() {
            addCriterion("UserSex is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("UserSex is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(String value) {
            addCriterion("UserSex =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(String value) {
            addCriterion("UserSex <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(String value) {
            addCriterion("UserSex >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(String value) {
            addCriterion("UserSex >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(String value) {
            addCriterion("UserSex <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(String value) {
            addCriterion("UserSex <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLike(String value) {
            addCriterion("UserSex like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotLike(String value) {
            addCriterion("UserSex not like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<String> values) {
            addCriterion("UserSex in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<String> values) {
            addCriterion("UserSex not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(String value1, String value2) {
            addCriterion("UserSex between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(String value1, String value2) {
            addCriterion("UserSex not between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIsNull() {
            addCriterion("UserRealName is null");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIsNotNull() {
            addCriterion("UserRealName is not null");
            return (Criteria) this;
        }

        public Criteria andUserrealnameEqualTo(String value) {
            addCriterion("UserRealName =", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotEqualTo(String value) {
            addCriterion("UserRealName <>", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameGreaterThan(String value) {
            addCriterion("UserRealName >", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("UserRealName >=", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLessThan(String value) {
            addCriterion("UserRealName <", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLessThanOrEqualTo(String value) {
            addCriterion("UserRealName <=", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLike(String value) {
            addCriterion("UserRealName like", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotLike(String value) {
            addCriterion("UserRealName not like", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIn(List<String> values) {
            addCriterion("UserRealName in", values, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotIn(List<String> values) {
            addCriterion("UserRealName not in", values, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameBetween(String value1, String value2) {
            addCriterion("UserRealName between", value1, value2, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotBetween(String value1, String value2) {
            addCriterion("UserRealName not between", value1, value2, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("UserPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("UserPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("UserPhone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("UserPhone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("UserPhone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("UserPhone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("UserPhone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("UserPhone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("UserPhone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("UserPhone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("UserPhone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("UserPhone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("UserPhone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("UserPhone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayIsNull() {
            addCriterion("UserBirthday is null");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayIsNotNull() {
            addCriterion("UserBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("UserBirthday =", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("UserBirthday <>", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("UserBirthday >", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UserBirthday >=", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("UserBirthday <", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UserBirthday <=", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("UserBirthday in", values, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("UserBirthday not in", values, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UserBirthday between", value1, value2, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UserBirthday not between", value1, value2, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNull() {
            addCriterion("UserAddress is null");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNotNull() {
            addCriterion("UserAddress is not null");
            return (Criteria) this;
        }

        public Criteria andUseraddressEqualTo(String value) {
            addCriterion("UserAddress =", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotEqualTo(String value) {
            addCriterion("UserAddress <>", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThan(String value) {
            addCriterion("UserAddress >", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThanOrEqualTo(String value) {
            addCriterion("UserAddress >=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThan(String value) {
            addCriterion("UserAddress <", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThanOrEqualTo(String value) {
            addCriterion("UserAddress <=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLike(String value) {
            addCriterion("UserAddress like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotLike(String value) {
            addCriterion("UserAddress not like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressIn(List<String> values) {
            addCriterion("UserAddress in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotIn(List<String> values) {
            addCriterion("UserAddress not in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressBetween(String value1, String value2) {
            addCriterion("UserAddress between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotBetween(String value1, String value2) {
            addCriterion("UserAddress not between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("UserEmail is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("UserEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("UserEmail =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("UserEmail <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("UserEmail >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("UserEmail >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("UserEmail <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("UserEmail <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("UserEmail like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("UserEmail not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("UserEmail in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("UserEmail not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("UserEmail between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("UserEmail not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andCreditscoreIsNull() {
            addCriterion("CreditsCore is null");
            return (Criteria) this;
        }

        public Criteria andCreditscoreIsNotNull() {
            addCriterion("CreditsCore is not null");
            return (Criteria) this;
        }

        public Criteria andCreditscoreEqualTo(Integer value) {
            addCriterion("CreditsCore =", value, "creditscore");
            return (Criteria) this;
        }

        public Criteria andCreditscoreNotEqualTo(Integer value) {
            addCriterion("CreditsCore <>", value, "creditscore");
            return (Criteria) this;
        }

        public Criteria andCreditscoreGreaterThan(Integer value) {
            addCriterion("CreditsCore >", value, "creditscore");
            return (Criteria) this;
        }

        public Criteria andCreditscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("CreditsCore >=", value, "creditscore");
            return (Criteria) this;
        }

        public Criteria andCreditscoreLessThan(Integer value) {
            addCriterion("CreditsCore <", value, "creditscore");
            return (Criteria) this;
        }

        public Criteria andCreditscoreLessThanOrEqualTo(Integer value) {
            addCriterion("CreditsCore <=", value, "creditscore");
            return (Criteria) this;
        }

        public Criteria andCreditscoreIn(List<Integer> values) {
            addCriterion("CreditsCore in", values, "creditscore");
            return (Criteria) this;
        }

        public Criteria andCreditscoreNotIn(List<Integer> values) {
            addCriterion("CreditsCore not in", values, "creditscore");
            return (Criteria) this;
        }

        public Criteria andCreditscoreBetween(Integer value1, Integer value2) {
            addCriterion("CreditsCore between", value1, value2, "creditscore");
            return (Criteria) this;
        }

        public Criteria andCreditscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("CreditsCore not between", value1, value2, "creditscore");
            return (Criteria) this;
        }

        public Criteria andUserinputdateIsNull() {
            addCriterion("UserInputDate is null");
            return (Criteria) this;
        }

        public Criteria andUserinputdateIsNotNull() {
            addCriterion("UserInputDate is not null");
            return (Criteria) this;
        }

        public Criteria andUserinputdateEqualTo(Date value) {
            addCriterionForJDBCDate("UserInputDate =", value, "userinputdate");
            return (Criteria) this;
        }

        public Criteria andUserinputdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UserInputDate <>", value, "userinputdate");
            return (Criteria) this;
        }

        public Criteria andUserinputdateGreaterThan(Date value) {
            addCriterionForJDBCDate("UserInputDate >", value, "userinputdate");
            return (Criteria) this;
        }

        public Criteria andUserinputdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UserInputDate >=", value, "userinputdate");
            return (Criteria) this;
        }

        public Criteria andUserinputdateLessThan(Date value) {
            addCriterionForJDBCDate("UserInputDate <", value, "userinputdate");
            return (Criteria) this;
        }

        public Criteria andUserinputdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UserInputDate <=", value, "userinputdate");
            return (Criteria) this;
        }

        public Criteria andUserinputdateIn(List<Date> values) {
            addCriterionForJDBCDate("UserInputDate in", values, "userinputdate");
            return (Criteria) this;
        }

        public Criteria andUserinputdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UserInputDate not in", values, "userinputdate");
            return (Criteria) this;
        }

        public Criteria andUserinputdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UserInputDate between", value1, value2, "userinputdate");
            return (Criteria) this;
        }

        public Criteria andUserinputdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UserInputDate not between", value1, value2, "userinputdate");
            return (Criteria) this;
        }

        public Criteria andUserzipIsNull() {
            addCriterion("UserZip is null");
            return (Criteria) this;
        }

        public Criteria andUserzipIsNotNull() {
            addCriterion("UserZip is not null");
            return (Criteria) this;
        }

        public Criteria andUserzipEqualTo(Integer value) {
            addCriterion("UserZip =", value, "userzip");
            return (Criteria) this;
        }

        public Criteria andUserzipNotEqualTo(Integer value) {
            addCriterion("UserZip <>", value, "userzip");
            return (Criteria) this;
        }

        public Criteria andUserzipGreaterThan(Integer value) {
            addCriterion("UserZip >", value, "userzip");
            return (Criteria) this;
        }

        public Criteria andUserzipGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserZip >=", value, "userzip");
            return (Criteria) this;
        }

        public Criteria andUserzipLessThan(Integer value) {
            addCriterion("UserZip <", value, "userzip");
            return (Criteria) this;
        }

        public Criteria andUserzipLessThanOrEqualTo(Integer value) {
            addCriterion("UserZip <=", value, "userzip");
            return (Criteria) this;
        }

        public Criteria andUserzipIn(List<Integer> values) {
            addCriterion("UserZip in", values, "userzip");
            return (Criteria) this;
        }

        public Criteria andUserzipNotIn(List<Integer> values) {
            addCriterion("UserZip not in", values, "userzip");
            return (Criteria) this;
        }

        public Criteria andUserzipBetween(Integer value1, Integer value2) {
            addCriterion("UserZip between", value1, value2, "userzip");
            return (Criteria) this;
        }

        public Criteria andUserzipNotBetween(Integer value1, Integer value2) {
            addCriterion("UserZip not between", value1, value2, "userzip");
            return (Criteria) this;
        }

        public Criteria andUserlogincountIsNull() {
            addCriterion("UserLoginCount is null");
            return (Criteria) this;
        }

        public Criteria andUserlogincountIsNotNull() {
            addCriterion("UserLoginCount is not null");
            return (Criteria) this;
        }

        public Criteria andUserlogincountEqualTo(Integer value) {
            addCriterion("UserLoginCount =", value, "userlogincount");
            return (Criteria) this;
        }

        public Criteria andUserlogincountNotEqualTo(Integer value) {
            addCriterion("UserLoginCount <>", value, "userlogincount");
            return (Criteria) this;
        }

        public Criteria andUserlogincountGreaterThan(Integer value) {
            addCriterion("UserLoginCount >", value, "userlogincount");
            return (Criteria) this;
        }

        public Criteria andUserlogincountGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserLoginCount >=", value, "userlogincount");
            return (Criteria) this;
        }

        public Criteria andUserlogincountLessThan(Integer value) {
            addCriterion("UserLoginCount <", value, "userlogincount");
            return (Criteria) this;
        }

        public Criteria andUserlogincountLessThanOrEqualTo(Integer value) {
            addCriterion("UserLoginCount <=", value, "userlogincount");
            return (Criteria) this;
        }

        public Criteria andUserlogincountIn(List<Integer> values) {
            addCriterion("UserLoginCount in", values, "userlogincount");
            return (Criteria) this;
        }

        public Criteria andUserlogincountNotIn(List<Integer> values) {
            addCriterion("UserLoginCount not in", values, "userlogincount");
            return (Criteria) this;
        }

        public Criteria andUserlogincountBetween(Integer value1, Integer value2) {
            addCriterion("UserLoginCount between", value1, value2, "userlogincount");
            return (Criteria) this;
        }

        public Criteria andUserlogincountNotBetween(Integer value1, Integer value2) {
            addCriterion("UserLoginCount not between", value1, value2, "userlogincount");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeIsNull() {
            addCriterion("UserLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeIsNotNull() {
            addCriterion("UserLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeEqualTo(Date value) {
            addCriterion("UserLoginTime =", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeNotEqualTo(Date value) {
            addCriterion("UserLoginTime <>", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeGreaterThan(Date value) {
            addCriterion("UserLoginTime >", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UserLoginTime >=", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeLessThan(Date value) {
            addCriterion("UserLoginTime <", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("UserLoginTime <=", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeIn(List<Date> values) {
            addCriterion("UserLoginTime in", values, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeNotIn(List<Date> values) {
            addCriterion("UserLoginTime not in", values, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeBetween(Date value1, Date value2) {
            addCriterion("UserLoginTime between", value1, value2, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("UserLoginTime not between", value1, value2, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserAIsNull() {
            addCriterion("User_A is null");
            return (Criteria) this;
        }

        public Criteria andUserAIsNotNull() {
            addCriterion("User_A is not null");
            return (Criteria) this;
        }

        public Criteria andUserAEqualTo(String value) {
            addCriterion("User_A =", value, "userA");
            return (Criteria) this;
        }

        public Criteria andUserANotEqualTo(String value) {
            addCriterion("User_A <>", value, "userA");
            return (Criteria) this;
        }

        public Criteria andUserAGreaterThan(String value) {
            addCriterion("User_A >", value, "userA");
            return (Criteria) this;
        }

        public Criteria andUserAGreaterThanOrEqualTo(String value) {
            addCriterion("User_A >=", value, "userA");
            return (Criteria) this;
        }

        public Criteria andUserALessThan(String value) {
            addCriterion("User_A <", value, "userA");
            return (Criteria) this;
        }

        public Criteria andUserALessThanOrEqualTo(String value) {
            addCriterion("User_A <=", value, "userA");
            return (Criteria) this;
        }

        public Criteria andUserALike(String value) {
            addCriterion("User_A like", value, "userA");
            return (Criteria) this;
        }

        public Criteria andUserANotLike(String value) {
            addCriterion("User_A not like", value, "userA");
            return (Criteria) this;
        }

        public Criteria andUserAIn(List<String> values) {
            addCriterion("User_A in", values, "userA");
            return (Criteria) this;
        }

        public Criteria andUserANotIn(List<String> values) {
            addCriterion("User_A not in", values, "userA");
            return (Criteria) this;
        }

        public Criteria andUserABetween(String value1, String value2) {
            addCriterion("User_A between", value1, value2, "userA");
            return (Criteria) this;
        }

        public Criteria andUserANotBetween(String value1, String value2) {
            addCriterion("User_A not between", value1, value2, "userA");
            return (Criteria) this;
        }

        public Criteria andUserBIsNull() {
            addCriterion("User_B is null");
            return (Criteria) this;
        }

        public Criteria andUserBIsNotNull() {
            addCriterion("User_B is not null");
            return (Criteria) this;
        }

        public Criteria andUserBEqualTo(String value) {
            addCriterion("User_B =", value, "userB");
            return (Criteria) this;
        }

        public Criteria andUserBNotEqualTo(String value) {
            addCriterion("User_B <>", value, "userB");
            return (Criteria) this;
        }

        public Criteria andUserBGreaterThan(String value) {
            addCriterion("User_B >", value, "userB");
            return (Criteria) this;
        }

        public Criteria andUserBGreaterThanOrEqualTo(String value) {
            addCriterion("User_B >=", value, "userB");
            return (Criteria) this;
        }

        public Criteria andUserBLessThan(String value) {
            addCriterion("User_B <", value, "userB");
            return (Criteria) this;
        }

        public Criteria andUserBLessThanOrEqualTo(String value) {
            addCriterion("User_B <=", value, "userB");
            return (Criteria) this;
        }

        public Criteria andUserBLike(String value) {
            addCriterion("User_B like", value, "userB");
            return (Criteria) this;
        }

        public Criteria andUserBNotLike(String value) {
            addCriterion("User_B not like", value, "userB");
            return (Criteria) this;
        }

        public Criteria andUserBIn(List<String> values) {
            addCriterion("User_B in", values, "userB");
            return (Criteria) this;
        }

        public Criteria andUserBNotIn(List<String> values) {
            addCriterion("User_B not in", values, "userB");
            return (Criteria) this;
        }

        public Criteria andUserBBetween(String value1, String value2) {
            addCriterion("User_B between", value1, value2, "userB");
            return (Criteria) this;
        }

        public Criteria andUserBNotBetween(String value1, String value2) {
            addCriterion("User_B not between", value1, value2, "userB");
            return (Criteria) this;
        }

        public Criteria andUserCIsNull() {
            addCriterion("User_C is null");
            return (Criteria) this;
        }

        public Criteria andUserCIsNotNull() {
            addCriterion("User_C is not null");
            return (Criteria) this;
        }

        public Criteria andUserCEqualTo(String value) {
            addCriterion("User_C =", value, "userC");
            return (Criteria) this;
        }

        public Criteria andUserCNotEqualTo(String value) {
            addCriterion("User_C <>", value, "userC");
            return (Criteria) this;
        }

        public Criteria andUserCGreaterThan(String value) {
            addCriterion("User_C >", value, "userC");
            return (Criteria) this;
        }

        public Criteria andUserCGreaterThanOrEqualTo(String value) {
            addCriterion("User_C >=", value, "userC");
            return (Criteria) this;
        }

        public Criteria andUserCLessThan(String value) {
            addCriterion("User_C <", value, "userC");
            return (Criteria) this;
        }

        public Criteria andUserCLessThanOrEqualTo(String value) {
            addCriterion("User_C <=", value, "userC");
            return (Criteria) this;
        }

        public Criteria andUserCLike(String value) {
            addCriterion("User_C like", value, "userC");
            return (Criteria) this;
        }

        public Criteria andUserCNotLike(String value) {
            addCriterion("User_C not like", value, "userC");
            return (Criteria) this;
        }

        public Criteria andUserCIn(List<String> values) {
            addCriterion("User_C in", values, "userC");
            return (Criteria) this;
        }

        public Criteria andUserCNotIn(List<String> values) {
            addCriterion("User_C not in", values, "userC");
            return (Criteria) this;
        }

        public Criteria andUserCBetween(String value1, String value2) {
            addCriterion("User_C between", value1, value2, "userC");
            return (Criteria) this;
        }

        public Criteria andUserCNotBetween(String value1, String value2) {
            addCriterion("User_C not between", value1, value2, "userC");
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