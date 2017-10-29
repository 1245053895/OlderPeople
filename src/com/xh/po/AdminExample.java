package com.xh.po;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminidIsNull() {
            addCriterion("AdminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("AdminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("AdminId =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("AdminId <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("AdminId >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdminId >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("AdminId <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("AdminId <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("AdminId in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("AdminId not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("AdminId between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("AdminId not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNull() {
            addCriterion("AdminName is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("AdminName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("AdminName =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("AdminName <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("AdminName >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("AdminName >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("AdminName <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("AdminName <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("AdminName like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("AdminName not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("AdminName in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("AdminName not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("AdminName between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("AdminName not between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminpicIsNull() {
            addCriterion("AdminPic is null");
            return (Criteria) this;
        }

        public Criteria andAdminpicIsNotNull() {
            addCriterion("AdminPic is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpicEqualTo(String value) {
            addCriterion("AdminPic =", value, "adminpic");
            return (Criteria) this;
        }

        public Criteria andAdminpicNotEqualTo(String value) {
            addCriterion("AdminPic <>", value, "adminpic");
            return (Criteria) this;
        }

        public Criteria andAdminpicGreaterThan(String value) {
            addCriterion("AdminPic >", value, "adminpic");
            return (Criteria) this;
        }

        public Criteria andAdminpicGreaterThanOrEqualTo(String value) {
            addCriterion("AdminPic >=", value, "adminpic");
            return (Criteria) this;
        }

        public Criteria andAdminpicLessThan(String value) {
            addCriterion("AdminPic <", value, "adminpic");
            return (Criteria) this;
        }

        public Criteria andAdminpicLessThanOrEqualTo(String value) {
            addCriterion("AdminPic <=", value, "adminpic");
            return (Criteria) this;
        }

        public Criteria andAdminpicLike(String value) {
            addCriterion("AdminPic like", value, "adminpic");
            return (Criteria) this;
        }

        public Criteria andAdminpicNotLike(String value) {
            addCriterion("AdminPic not like", value, "adminpic");
            return (Criteria) this;
        }

        public Criteria andAdminpicIn(List<String> values) {
            addCriterion("AdminPic in", values, "adminpic");
            return (Criteria) this;
        }

        public Criteria andAdminpicNotIn(List<String> values) {
            addCriterion("AdminPic not in", values, "adminpic");
            return (Criteria) this;
        }

        public Criteria andAdminpicBetween(String value1, String value2) {
            addCriterion("AdminPic between", value1, value2, "adminpic");
            return (Criteria) this;
        }

        public Criteria andAdminpicNotBetween(String value1, String value2) {
            addCriterion("AdminPic not between", value1, value2, "adminpic");
            return (Criteria) this;
        }

        public Criteria andAdminpwdIsNull() {
            addCriterion("AdminPwd is null");
            return (Criteria) this;
        }

        public Criteria andAdminpwdIsNotNull() {
            addCriterion("AdminPwd is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpwdEqualTo(String value) {
            addCriterion("AdminPwd =", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdNotEqualTo(String value) {
            addCriterion("AdminPwd <>", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdGreaterThan(String value) {
            addCriterion("AdminPwd >", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdGreaterThanOrEqualTo(String value) {
            addCriterion("AdminPwd >=", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdLessThan(String value) {
            addCriterion("AdminPwd <", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdLessThanOrEqualTo(String value) {
            addCriterion("AdminPwd <=", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdLike(String value) {
            addCriterion("AdminPwd like", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdNotLike(String value) {
            addCriterion("AdminPwd not like", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdIn(List<String> values) {
            addCriterion("AdminPwd in", values, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdNotIn(List<String> values) {
            addCriterion("AdminPwd not in", values, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdBetween(String value1, String value2) {
            addCriterion("AdminPwd between", value1, value2, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdNotBetween(String value1, String value2) {
            addCriterion("AdminPwd not between", value1, value2, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminuserIsNull() {
            addCriterion("AdminUser is null");
            return (Criteria) this;
        }

        public Criteria andAdminuserIsNotNull() {
            addCriterion("AdminUser is not null");
            return (Criteria) this;
        }

        public Criteria andAdminuserEqualTo(String value) {
            addCriterion("AdminUser =", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserNotEqualTo(String value) {
            addCriterion("AdminUser <>", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserGreaterThan(String value) {
            addCriterion("AdminUser >", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserGreaterThanOrEqualTo(String value) {
            addCriterion("AdminUser >=", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserLessThan(String value) {
            addCriterion("AdminUser <", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserLessThanOrEqualTo(String value) {
            addCriterion("AdminUser <=", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserLike(String value) {
            addCriterion("AdminUser like", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserNotLike(String value) {
            addCriterion("AdminUser not like", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserIn(List<String> values) {
            addCriterion("AdminUser in", values, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserNotIn(List<String> values) {
            addCriterion("AdminUser not in", values, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserBetween(String value1, String value2) {
            addCriterion("AdminUser between", value1, value2, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserNotBetween(String value1, String value2) {
            addCriterion("AdminUser not between", value1, value2, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminsexIsNull() {
            addCriterion("AdminSex is null");
            return (Criteria) this;
        }

        public Criteria andAdminsexIsNotNull() {
            addCriterion("AdminSex is not null");
            return (Criteria) this;
        }

        public Criteria andAdminsexEqualTo(String value) {
            addCriterion("AdminSex =", value, "adminsex");
            return (Criteria) this;
        }

        public Criteria andAdminsexNotEqualTo(String value) {
            addCriterion("AdminSex <>", value, "adminsex");
            return (Criteria) this;
        }

        public Criteria andAdminsexGreaterThan(String value) {
            addCriterion("AdminSex >", value, "adminsex");
            return (Criteria) this;
        }

        public Criteria andAdminsexGreaterThanOrEqualTo(String value) {
            addCriterion("AdminSex >=", value, "adminsex");
            return (Criteria) this;
        }

        public Criteria andAdminsexLessThan(String value) {
            addCriterion("AdminSex <", value, "adminsex");
            return (Criteria) this;
        }

        public Criteria andAdminsexLessThanOrEqualTo(String value) {
            addCriterion("AdminSex <=", value, "adminsex");
            return (Criteria) this;
        }

        public Criteria andAdminsexLike(String value) {
            addCriterion("AdminSex like", value, "adminsex");
            return (Criteria) this;
        }

        public Criteria andAdminsexNotLike(String value) {
            addCriterion("AdminSex not like", value, "adminsex");
            return (Criteria) this;
        }

        public Criteria andAdminsexIn(List<String> values) {
            addCriterion("AdminSex in", values, "adminsex");
            return (Criteria) this;
        }

        public Criteria andAdminsexNotIn(List<String> values) {
            addCriterion("AdminSex not in", values, "adminsex");
            return (Criteria) this;
        }

        public Criteria andAdminsexBetween(String value1, String value2) {
            addCriterion("AdminSex between", value1, value2, "adminsex");
            return (Criteria) this;
        }

        public Criteria andAdminsexNotBetween(String value1, String value2) {
            addCriterion("AdminSex not between", value1, value2, "adminsex");
            return (Criteria) this;
        }

        public Criteria andAdmindepartIsNull() {
            addCriterion("AdminDepart is null");
            return (Criteria) this;
        }

        public Criteria andAdmindepartIsNotNull() {
            addCriterion("AdminDepart is not null");
            return (Criteria) this;
        }

        public Criteria andAdmindepartEqualTo(String value) {
            addCriterion("AdminDepart =", value, "admindepart");
            return (Criteria) this;
        }

        public Criteria andAdmindepartNotEqualTo(String value) {
            addCriterion("AdminDepart <>", value, "admindepart");
            return (Criteria) this;
        }

        public Criteria andAdmindepartGreaterThan(String value) {
            addCriterion("AdminDepart >", value, "admindepart");
            return (Criteria) this;
        }

        public Criteria andAdmindepartGreaterThanOrEqualTo(String value) {
            addCriterion("AdminDepart >=", value, "admindepart");
            return (Criteria) this;
        }

        public Criteria andAdmindepartLessThan(String value) {
            addCriterion("AdminDepart <", value, "admindepart");
            return (Criteria) this;
        }

        public Criteria andAdmindepartLessThanOrEqualTo(String value) {
            addCriterion("AdminDepart <=", value, "admindepart");
            return (Criteria) this;
        }

        public Criteria andAdmindepartLike(String value) {
            addCriterion("AdminDepart like", value, "admindepart");
            return (Criteria) this;
        }

        public Criteria andAdmindepartNotLike(String value) {
            addCriterion("AdminDepart not like", value, "admindepart");
            return (Criteria) this;
        }

        public Criteria andAdmindepartIn(List<String> values) {
            addCriterion("AdminDepart in", values, "admindepart");
            return (Criteria) this;
        }

        public Criteria andAdmindepartNotIn(List<String> values) {
            addCriterion("AdminDepart not in", values, "admindepart");
            return (Criteria) this;
        }

        public Criteria andAdmindepartBetween(String value1, String value2) {
            addCriterion("AdminDepart between", value1, value2, "admindepart");
            return (Criteria) this;
        }

        public Criteria andAdmindepartNotBetween(String value1, String value2) {
            addCriterion("AdminDepart not between", value1, value2, "admindepart");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIsNull() {
            addCriterion("AdminPhone is null");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIsNotNull() {
            addCriterion("AdminPhone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminphoneEqualTo(String value) {
            addCriterion("AdminPhone =", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotEqualTo(String value) {
            addCriterion("AdminPhone <>", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneGreaterThan(String value) {
            addCriterion("AdminPhone >", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneGreaterThanOrEqualTo(String value) {
            addCriterion("AdminPhone >=", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneLessThan(String value) {
            addCriterion("AdminPhone <", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneLessThanOrEqualTo(String value) {
            addCriterion("AdminPhone <=", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneLike(String value) {
            addCriterion("AdminPhone like", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotLike(String value) {
            addCriterion("AdminPhone not like", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIn(List<String> values) {
            addCriterion("AdminPhone in", values, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotIn(List<String> values) {
            addCriterion("AdminPhone not in", values, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneBetween(String value1, String value2) {
            addCriterion("AdminPhone between", value1, value2, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotBetween(String value1, String value2) {
            addCriterion("AdminPhone not between", value1, value2, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidIsNull() {
            addCriterion("AdminGroupId is null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidIsNotNull() {
            addCriterion("AdminGroupId is not null");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidEqualTo(Integer value) {
            addCriterion("AdminGroupId =", value, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidNotEqualTo(Integer value) {
            addCriterion("AdminGroupId <>", value, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidGreaterThan(Integer value) {
            addCriterion("AdminGroupId >", value, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdminGroupId >=", value, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidLessThan(Integer value) {
            addCriterion("AdminGroupId <", value, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidLessThanOrEqualTo(Integer value) {
            addCriterion("AdminGroupId <=", value, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidIn(List<Integer> values) {
            addCriterion("AdminGroupId in", values, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidNotIn(List<Integer> values) {
            addCriterion("AdminGroupId not in", values, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidBetween(Integer value1, Integer value2) {
            addCriterion("AdminGroupId between", value1, value2, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdmingroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("AdminGroupId not between", value1, value2, "admingroupid");
            return (Criteria) this;
        }

        public Criteria andAdminAIsNull() {
            addCriterion("Admin_A is null");
            return (Criteria) this;
        }

        public Criteria andAdminAIsNotNull() {
            addCriterion("Admin_A is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAEqualTo(String value) {
            addCriterion("Admin_A =", value, "adminA");
            return (Criteria) this;
        }

        public Criteria andAdminANotEqualTo(String value) {
            addCriterion("Admin_A <>", value, "adminA");
            return (Criteria) this;
        }

        public Criteria andAdminAGreaterThan(String value) {
            addCriterion("Admin_A >", value, "adminA");
            return (Criteria) this;
        }

        public Criteria andAdminAGreaterThanOrEqualTo(String value) {
            addCriterion("Admin_A >=", value, "adminA");
            return (Criteria) this;
        }

        public Criteria andAdminALessThan(String value) {
            addCriterion("Admin_A <", value, "adminA");
            return (Criteria) this;
        }

        public Criteria andAdminALessThanOrEqualTo(String value) {
            addCriterion("Admin_A <=", value, "adminA");
            return (Criteria) this;
        }

        public Criteria andAdminALike(String value) {
            addCriterion("Admin_A like", value, "adminA");
            return (Criteria) this;
        }

        public Criteria andAdminANotLike(String value) {
            addCriterion("Admin_A not like", value, "adminA");
            return (Criteria) this;
        }

        public Criteria andAdminAIn(List<String> values) {
            addCriterion("Admin_A in", values, "adminA");
            return (Criteria) this;
        }

        public Criteria andAdminANotIn(List<String> values) {
            addCriterion("Admin_A not in", values, "adminA");
            return (Criteria) this;
        }

        public Criteria andAdminABetween(String value1, String value2) {
            addCriterion("Admin_A between", value1, value2, "adminA");
            return (Criteria) this;
        }

        public Criteria andAdminANotBetween(String value1, String value2) {
            addCriterion("Admin_A not between", value1, value2, "adminA");
            return (Criteria) this;
        }

        public Criteria andAdminBIsNull() {
            addCriterion("Admin_B is null");
            return (Criteria) this;
        }

        public Criteria andAdminBIsNotNull() {
            addCriterion("Admin_B is not null");
            return (Criteria) this;
        }

        public Criteria andAdminBEqualTo(String value) {
            addCriterion("Admin_B =", value, "adminB");
            return (Criteria) this;
        }

        public Criteria andAdminBNotEqualTo(String value) {
            addCriterion("Admin_B <>", value, "adminB");
            return (Criteria) this;
        }

        public Criteria andAdminBGreaterThan(String value) {
            addCriterion("Admin_B >", value, "adminB");
            return (Criteria) this;
        }

        public Criteria andAdminBGreaterThanOrEqualTo(String value) {
            addCriterion("Admin_B >=", value, "adminB");
            return (Criteria) this;
        }

        public Criteria andAdminBLessThan(String value) {
            addCriterion("Admin_B <", value, "adminB");
            return (Criteria) this;
        }

        public Criteria andAdminBLessThanOrEqualTo(String value) {
            addCriterion("Admin_B <=", value, "adminB");
            return (Criteria) this;
        }

        public Criteria andAdminBLike(String value) {
            addCriterion("Admin_B like", value, "adminB");
            return (Criteria) this;
        }

        public Criteria andAdminBNotLike(String value) {
            addCriterion("Admin_B not like", value, "adminB");
            return (Criteria) this;
        }

        public Criteria andAdminBIn(List<String> values) {
            addCriterion("Admin_B in", values, "adminB");
            return (Criteria) this;
        }

        public Criteria andAdminBNotIn(List<String> values) {
            addCriterion("Admin_B not in", values, "adminB");
            return (Criteria) this;
        }

        public Criteria andAdminBBetween(String value1, String value2) {
            addCriterion("Admin_B between", value1, value2, "adminB");
            return (Criteria) this;
        }

        public Criteria andAdminBNotBetween(String value1, String value2) {
            addCriterion("Admin_B not between", value1, value2, "adminB");
            return (Criteria) this;
        }

        public Criteria andAdminCIsNull() {
            addCriterion("Admin_C is null");
            return (Criteria) this;
        }

        public Criteria andAdminCIsNotNull() {
            addCriterion("Admin_C is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCEqualTo(String value) {
            addCriterion("Admin_C =", value, "adminC");
            return (Criteria) this;
        }

        public Criteria andAdminCNotEqualTo(String value) {
            addCriterion("Admin_C <>", value, "adminC");
            return (Criteria) this;
        }

        public Criteria andAdminCGreaterThan(String value) {
            addCriterion("Admin_C >", value, "adminC");
            return (Criteria) this;
        }

        public Criteria andAdminCGreaterThanOrEqualTo(String value) {
            addCriterion("Admin_C >=", value, "adminC");
            return (Criteria) this;
        }

        public Criteria andAdminCLessThan(String value) {
            addCriterion("Admin_C <", value, "adminC");
            return (Criteria) this;
        }

        public Criteria andAdminCLessThanOrEqualTo(String value) {
            addCriterion("Admin_C <=", value, "adminC");
            return (Criteria) this;
        }

        public Criteria andAdminCLike(String value) {
            addCriterion("Admin_C like", value, "adminC");
            return (Criteria) this;
        }

        public Criteria andAdminCNotLike(String value) {
            addCriterion("Admin_C not like", value, "adminC");
            return (Criteria) this;
        }

        public Criteria andAdminCIn(List<String> values) {
            addCriterion("Admin_C in", values, "adminC");
            return (Criteria) this;
        }

        public Criteria andAdminCNotIn(List<String> values) {
            addCriterion("Admin_C not in", values, "adminC");
            return (Criteria) this;
        }

        public Criteria andAdminCBetween(String value1, String value2) {
            addCriterion("Admin_C between", value1, value2, "adminC");
            return (Criteria) this;
        }

        public Criteria andAdminCNotBetween(String value1, String value2) {
            addCriterion("Admin_C not between", value1, value2, "adminC");
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