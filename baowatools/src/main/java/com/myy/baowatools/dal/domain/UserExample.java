package com.myy.baowatools.dal.domain;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeIsNull() {
            addCriterion("tm_saas_code is null");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeIsNotNull() {
            addCriterion("tm_saas_code is not null");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeEqualTo(String value) {
            addCriterion("tm_saas_code =", value, "tmSaasCode");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeNotEqualTo(String value) {
            addCriterion("tm_saas_code <>", value, "tmSaasCode");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeGreaterThan(String value) {
            addCriterion("tm_saas_code >", value, "tmSaasCode");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tm_saas_code >=", value, "tmSaasCode");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeLessThan(String value) {
            addCriterion("tm_saas_code <", value, "tmSaasCode");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeLessThanOrEqualTo(String value) {
            addCriterion("tm_saas_code <=", value, "tmSaasCode");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeLike(String value) {
            addCriterion("tm_saas_code like", value, "tmSaasCode");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeNotLike(String value) {
            addCriterion("tm_saas_code not like", value, "tmSaasCode");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeIn(List<String> values) {
            addCriterion("tm_saas_code in", values, "tmSaasCode");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeNotIn(List<String> values) {
            addCriterion("tm_saas_code not in", values, "tmSaasCode");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeBetween(String value1, String value2) {
            addCriterion("tm_saas_code between", value1, value2, "tmSaasCode");
            return (Criteria) this;
        }

        public Criteria andTmSaasCodeNotBetween(String value1, String value2) {
            addCriterion("tm_saas_code not between", value1, value2, "tmSaasCode");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNull() {
            addCriterion("phone_no is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNotNull() {
            addCriterion("phone_no is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoEqualTo(String value) {
            addCriterion("phone_no =", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotEqualTo(String value) {
            addCriterion("phone_no <>", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThan(String value) {
            addCriterion("phone_no >", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("phone_no >=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThan(String value) {
            addCriterion("phone_no <", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("phone_no <=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLike(String value) {
            addCriterion("phone_no like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotLike(String value) {
            addCriterion("phone_no not like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIn(List<String> values) {
            addCriterion("phone_no in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotIn(List<String> values) {
            addCriterion("phone_no not in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoBetween(String value1, String value2) {
            addCriterion("phone_no between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotBetween(String value1, String value2) {
            addCriterion("phone_no not between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andExtraInfoIsNull() {
            addCriterion("extra_info is null");
            return (Criteria) this;
        }

        public Criteria andExtraInfoIsNotNull() {
            addCriterion("extra_info is not null");
            return (Criteria) this;
        }

        public Criteria andExtraInfoEqualTo(String value) {
            addCriterion("extra_info =", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoNotEqualTo(String value) {
            addCriterion("extra_info <>", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoGreaterThan(String value) {
            addCriterion("extra_info >", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoGreaterThanOrEqualTo(String value) {
            addCriterion("extra_info >=", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoLessThan(String value) {
            addCriterion("extra_info <", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoLessThanOrEqualTo(String value) {
            addCriterion("extra_info <=", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoLike(String value) {
            addCriterion("extra_info like", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoNotLike(String value) {
            addCriterion("extra_info not like", value, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoIn(List<String> values) {
            addCriterion("extra_info in", values, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoNotIn(List<String> values) {
            addCriterion("extra_info not in", values, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoBetween(String value1, String value2) {
            addCriterion("extra_info between", value1, value2, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andExtraInfoNotBetween(String value1, String value2) {
            addCriterion("extra_info not between", value1, value2, "extraInfo");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNull() {
            addCriterion("gmt_created is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNotNull() {
            addCriterion("gmt_created is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedEqualTo(Date value) {
            addCriterion("gmt_created =", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotEqualTo(Date value) {
            addCriterion("gmt_created <>", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThan(Date value) {
            addCriterion("gmt_created >", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_created >=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThan(Date value) {
            addCriterion("gmt_created <", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_created <=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIn(List<Date> values) {
            addCriterion("gmt_created in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotIn(List<Date> values) {
            addCriterion("gmt_created not in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedBetween(Date value1, Date value2) {
            addCriterion("gmt_created between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_created not between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andParentUserIdIsNull() {
            addCriterion("parent_user_id is null");
            return (Criteria) this;
        }

        public Criteria andParentUserIdIsNotNull() {
            addCriterion("parent_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentUserIdEqualTo(Long value) {
            addCriterion("parent_user_id =", value, "parentUserId");
            return (Criteria) this;
        }

        public Criteria andParentUserIdNotEqualTo(Long value) {
            addCriterion("parent_user_id <>", value, "parentUserId");
            return (Criteria) this;
        }

        public Criteria andParentUserIdGreaterThan(Long value) {
            addCriterion("parent_user_id >", value, "parentUserId");
            return (Criteria) this;
        }

        public Criteria andParentUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_user_id >=", value, "parentUserId");
            return (Criteria) this;
        }

        public Criteria andParentUserIdLessThan(Long value) {
            addCriterion("parent_user_id <", value, "parentUserId");
            return (Criteria) this;
        }

        public Criteria andParentUserIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_user_id <=", value, "parentUserId");
            return (Criteria) this;
        }

        public Criteria andParentUserIdIn(List<Long> values) {
            addCriterion("parent_user_id in", values, "parentUserId");
            return (Criteria) this;
        }

        public Criteria andParentUserIdNotIn(List<Long> values) {
            addCriterion("parent_user_id not in", values, "parentUserId");
            return (Criteria) this;
        }

        public Criteria andParentUserIdBetween(Long value1, Long value2) {
            addCriterion("parent_user_id between", value1, value2, "parentUserId");
            return (Criteria) this;
        }

        public Criteria andParentUserIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_user_id not between", value1, value2, "parentUserId");
            return (Criteria) this;
        }

        public Criteria andParentNameIsNull() {
            addCriterion("parent_name is null");
            return (Criteria) this;
        }

        public Criteria andParentNameIsNotNull() {
            addCriterion("parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andParentNameEqualTo(String value) {
            addCriterion("parent_name =", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotEqualTo(String value) {
            addCriterion("parent_name <>", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThan(String value) {
            addCriterion("parent_name >", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("parent_name >=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThan(String value) {
            addCriterion("parent_name <", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThanOrEqualTo(String value) {
            addCriterion("parent_name <=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLike(String value) {
            addCriterion("parent_name like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotLike(String value) {
            addCriterion("parent_name not like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameIn(List<String> values) {
            addCriterion("parent_name in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotIn(List<String> values) {
            addCriterion("parent_name not in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameBetween(String value1, String value2) {
            addCriterion("parent_name between", value1, value2, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotBetween(String value1, String value2) {
            addCriterion("parent_name not between", value1, value2, "parentName");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Long value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Long value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Long value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Long value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Long> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Long> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Long value1, Long value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNull() {
            addCriterion("rule_id is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(Long value) {
            addCriterion("rule_id =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(Long value) {
            addCriterion("rule_id <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(Long value) {
            addCriterion("rule_id >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rule_id >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(Long value) {
            addCriterion("rule_id <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(Long value) {
            addCriterion("rule_id <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<Long> values) {
            addCriterion("rule_id in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<Long> values) {
            addCriterion("rule_id not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(Long value1, Long value2) {
            addCriterion("rule_id between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(Long value1, Long value2) {
            addCriterion("rule_id not between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("rule_name is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("rule_name =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("rule_name <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("rule_name >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("rule_name >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("rule_name <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("rule_name <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("rule_name like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("rule_name not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("rule_name in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("rule_name not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("rule_name between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("rule_name not between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleDateIsNull() {
            addCriterion("rule_date is null");
            return (Criteria) this;
        }

        public Criteria andRuleDateIsNotNull() {
            addCriterion("rule_date is not null");
            return (Criteria) this;
        }

        public Criteria andRuleDateEqualTo(Date value) {
            addCriterion("rule_date =", value, "ruleDate");
            return (Criteria) this;
        }

        public Criteria andRuleDateNotEqualTo(Date value) {
            addCriterion("rule_date <>", value, "ruleDate");
            return (Criteria) this;
        }

        public Criteria andRuleDateGreaterThan(Date value) {
            addCriterion("rule_date >", value, "ruleDate");
            return (Criteria) this;
        }

        public Criteria andRuleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("rule_date >=", value, "ruleDate");
            return (Criteria) this;
        }

        public Criteria andRuleDateLessThan(Date value) {
            addCriterion("rule_date <", value, "ruleDate");
            return (Criteria) this;
        }

        public Criteria andRuleDateLessThanOrEqualTo(Date value) {
            addCriterion("rule_date <=", value, "ruleDate");
            return (Criteria) this;
        }

        public Criteria andRuleDateIn(List<Date> values) {
            addCriterion("rule_date in", values, "ruleDate");
            return (Criteria) this;
        }

        public Criteria andRuleDateNotIn(List<Date> values) {
            addCriterion("rule_date not in", values, "ruleDate");
            return (Criteria) this;
        }

        public Criteria andRuleDateBetween(Date value1, Date value2) {
            addCriterion("rule_date between", value1, value2, "ruleDate");
            return (Criteria) this;
        }

        public Criteria andRuleDateNotBetween(Date value1, Date value2) {
            addCriterion("rule_date not between", value1, value2, "ruleDate");
            return (Criteria) this;
        }

        public Criteria andUserPropertyIsNull() {
            addCriterion("user_property is null");
            return (Criteria) this;
        }

        public Criteria andUserPropertyIsNotNull() {
            addCriterion("user_property is not null");
            return (Criteria) this;
        }

        public Criteria andUserPropertyEqualTo(String value) {
            addCriterion("user_property =", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyNotEqualTo(String value) {
            addCriterion("user_property <>", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyGreaterThan(String value) {
            addCriterion("user_property >", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("user_property >=", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyLessThan(String value) {
            addCriterion("user_property <", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyLessThanOrEqualTo(String value) {
            addCriterion("user_property <=", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyLike(String value) {
            addCriterion("user_property like", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyNotLike(String value) {
            addCriterion("user_property not like", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyIn(List<String> values) {
            addCriterion("user_property in", values, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyNotIn(List<String> values) {
            addCriterion("user_property not in", values, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyBetween(String value1, String value2) {
            addCriterion("user_property between", value1, value2, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyNotBetween(String value1, String value2) {
            addCriterion("user_property not between", value1, value2, "userProperty");
            return (Criteria) this;
        }

        public Criteria andProductBelongIsNull() {
            addCriterion("product_belong is null");
            return (Criteria) this;
        }

        public Criteria andProductBelongIsNotNull() {
            addCriterion("product_belong is not null");
            return (Criteria) this;
        }

        public Criteria andProductBelongEqualTo(String value) {
            addCriterion("product_belong =", value, "productBelong");
            return (Criteria) this;
        }

        public Criteria andProductBelongNotEqualTo(String value) {
            addCriterion("product_belong <>", value, "productBelong");
            return (Criteria) this;
        }

        public Criteria andProductBelongGreaterThan(String value) {
            addCriterion("product_belong >", value, "productBelong");
            return (Criteria) this;
        }

        public Criteria andProductBelongGreaterThanOrEqualTo(String value) {
            addCriterion("product_belong >=", value, "productBelong");
            return (Criteria) this;
        }

        public Criteria andProductBelongLessThan(String value) {
            addCriterion("product_belong <", value, "productBelong");
            return (Criteria) this;
        }

        public Criteria andProductBelongLessThanOrEqualTo(String value) {
            addCriterion("product_belong <=", value, "productBelong");
            return (Criteria) this;
        }

        public Criteria andProductBelongLike(String value) {
            addCriterion("product_belong like", value, "productBelong");
            return (Criteria) this;
        }

        public Criteria andProductBelongNotLike(String value) {
            addCriterion("product_belong not like", value, "productBelong");
            return (Criteria) this;
        }

        public Criteria andProductBelongIn(List<String> values) {
            addCriterion("product_belong in", values, "productBelong");
            return (Criteria) this;
        }

        public Criteria andProductBelongNotIn(List<String> values) {
            addCriterion("product_belong not in", values, "productBelong");
            return (Criteria) this;
        }

        public Criteria andProductBelongBetween(String value1, String value2) {
            addCriterion("product_belong between", value1, value2, "productBelong");
            return (Criteria) this;
        }

        public Criteria andProductBelongNotBetween(String value1, String value2) {
            addCriterion("product_belong not between", value1, value2, "productBelong");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIsNull() {
            addCriterion("max_number is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIsNotNull() {
            addCriterion("max_number is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumberEqualTo(String value) {
            addCriterion("max_number =", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotEqualTo(String value) {
            addCriterion("max_number <>", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberGreaterThan(String value) {
            addCriterion("max_number >", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("max_number >=", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberLessThan(String value) {
            addCriterion("max_number <", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberLessThanOrEqualTo(String value) {
            addCriterion("max_number <=", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberLike(String value) {
            addCriterion("max_number like", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotLike(String value) {
            addCriterion("max_number not like", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIn(List<String> values) {
            addCriterion("max_number in", values, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotIn(List<String> values) {
            addCriterion("max_number not in", values, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberBetween(String value1, String value2) {
            addCriterion("max_number between", value1, value2, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotBetween(String value1, String value2) {
            addCriterion("max_number not between", value1, value2, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andDistributeDateIsNull() {
            addCriterion("distribute_date is null");
            return (Criteria) this;
        }

        public Criteria andDistributeDateIsNotNull() {
            addCriterion("distribute_date is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeDateEqualTo(Date value) {
            addCriterion("distribute_date =", value, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateNotEqualTo(Date value) {
            addCriterion("distribute_date <>", value, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateGreaterThan(Date value) {
            addCriterion("distribute_date >", value, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("distribute_date >=", value, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateLessThan(Date value) {
            addCriterion("distribute_date <", value, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateLessThanOrEqualTo(Date value) {
            addCriterion("distribute_date <=", value, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateIn(List<Date> values) {
            addCriterion("distribute_date in", values, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateNotIn(List<Date> values) {
            addCriterion("distribute_date not in", values, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateBetween(Date value1, Date value2) {
            addCriterion("distribute_date between", value1, value2, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andDistributeDateNotBetween(Date value1, Date value2) {
            addCriterion("distribute_date not between", value1, value2, "distributeDate");
            return (Criteria) this;
        }

        public Criteria andCallSupplierIsNull() {
            addCriterion("call_supplier is null");
            return (Criteria) this;
        }

        public Criteria andCallSupplierIsNotNull() {
            addCriterion("call_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andCallSupplierEqualTo(Byte value) {
            addCriterion("call_supplier =", value, "callSupplier");
            return (Criteria) this;
        }

        public Criteria andCallSupplierNotEqualTo(Byte value) {
            addCriterion("call_supplier <>", value, "callSupplier");
            return (Criteria) this;
        }

        public Criteria andCallSupplierGreaterThan(Byte value) {
            addCriterion("call_supplier >", value, "callSupplier");
            return (Criteria) this;
        }

        public Criteria andCallSupplierGreaterThanOrEqualTo(Byte value) {
            addCriterion("call_supplier >=", value, "callSupplier");
            return (Criteria) this;
        }

        public Criteria andCallSupplierLessThan(Byte value) {
            addCriterion("call_supplier <", value, "callSupplier");
            return (Criteria) this;
        }

        public Criteria andCallSupplierLessThanOrEqualTo(Byte value) {
            addCriterion("call_supplier <=", value, "callSupplier");
            return (Criteria) this;
        }

        public Criteria andCallSupplierIn(List<Byte> values) {
            addCriterion("call_supplier in", values, "callSupplier");
            return (Criteria) this;
        }

        public Criteria andCallSupplierNotIn(List<Byte> values) {
            addCriterion("call_supplier not in", values, "callSupplier");
            return (Criteria) this;
        }

        public Criteria andCallSupplierBetween(Byte value1, Byte value2) {
            addCriterion("call_supplier between", value1, value2, "callSupplier");
            return (Criteria) this;
        }

        public Criteria andCallSupplierNotBetween(Byte value1, Byte value2) {
            addCriterion("call_supplier not between", value1, value2, "callSupplier");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(String value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(String value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(String value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(String value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(String value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLike(String value) {
            addCriterion("agent_id like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotLike(String value) {
            addCriterion("agent_id not like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<String> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<String> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(String value1, String value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(String value1, String value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentPwdIsNull() {
            addCriterion("agent_pwd is null");
            return (Criteria) this;
        }

        public Criteria andAgentPwdIsNotNull() {
            addCriterion("agent_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAgentPwdEqualTo(String value) {
            addCriterion("agent_pwd =", value, "agentPwd");
            return (Criteria) this;
        }

        public Criteria andAgentPwdNotEqualTo(String value) {
            addCriterion("agent_pwd <>", value, "agentPwd");
            return (Criteria) this;
        }

        public Criteria andAgentPwdGreaterThan(String value) {
            addCriterion("agent_pwd >", value, "agentPwd");
            return (Criteria) this;
        }

        public Criteria andAgentPwdGreaterThanOrEqualTo(String value) {
            addCriterion("agent_pwd >=", value, "agentPwd");
            return (Criteria) this;
        }

        public Criteria andAgentPwdLessThan(String value) {
            addCriterion("agent_pwd <", value, "agentPwd");
            return (Criteria) this;
        }

        public Criteria andAgentPwdLessThanOrEqualTo(String value) {
            addCriterion("agent_pwd <=", value, "agentPwd");
            return (Criteria) this;
        }

        public Criteria andAgentPwdLike(String value) {
            addCriterion("agent_pwd like", value, "agentPwd");
            return (Criteria) this;
        }

        public Criteria andAgentPwdNotLike(String value) {
            addCriterion("agent_pwd not like", value, "agentPwd");
            return (Criteria) this;
        }

        public Criteria andAgentPwdIn(List<String> values) {
            addCriterion("agent_pwd in", values, "agentPwd");
            return (Criteria) this;
        }

        public Criteria andAgentPwdNotIn(List<String> values) {
            addCriterion("agent_pwd not in", values, "agentPwd");
            return (Criteria) this;
        }

        public Criteria andAgentPwdBetween(String value1, String value2) {
            addCriterion("agent_pwd between", value1, value2, "agentPwd");
            return (Criteria) this;
        }

        public Criteria andAgentPwdNotBetween(String value1, String value2) {
            addCriterion("agent_pwd not between", value1, value2, "agentPwd");
            return (Criteria) this;
        }

        public Criteria andBindPhoneIsNull() {
            addCriterion("bind_phone is null");
            return (Criteria) this;
        }

        public Criteria andBindPhoneIsNotNull() {
            addCriterion("bind_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBindPhoneEqualTo(String value) {
            addCriterion("bind_phone =", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNotEqualTo(String value) {
            addCriterion("bind_phone <>", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneGreaterThan(String value) {
            addCriterion("bind_phone >", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("bind_phone >=", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneLessThan(String value) {
            addCriterion("bind_phone <", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneLessThanOrEqualTo(String value) {
            addCriterion("bind_phone <=", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneLike(String value) {
            addCriterion("bind_phone like", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNotLike(String value) {
            addCriterion("bind_phone not like", value, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneIn(List<String> values) {
            addCriterion("bind_phone in", values, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNotIn(List<String> values) {
            addCriterion("bind_phone not in", values, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneBetween(String value1, String value2) {
            addCriterion("bind_phone between", value1, value2, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNotBetween(String value1, String value2) {
            addCriterion("bind_phone not between", value1, value2, "bindPhone");
            return (Criteria) this;
        }

        public Criteria andExtNumberIsNull() {
            addCriterion("ext_number is null");
            return (Criteria) this;
        }

        public Criteria andExtNumberIsNotNull() {
            addCriterion("ext_number is not null");
            return (Criteria) this;
        }

        public Criteria andExtNumberEqualTo(Long value) {
            addCriterion("ext_number =", value, "extNumber");
            return (Criteria) this;
        }

        public Criteria andExtNumberNotEqualTo(Long value) {
            addCriterion("ext_number <>", value, "extNumber");
            return (Criteria) this;
        }

        public Criteria andExtNumberGreaterThan(Long value) {
            addCriterion("ext_number >", value, "extNumber");
            return (Criteria) this;
        }

        public Criteria andExtNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("ext_number >=", value, "extNumber");
            return (Criteria) this;
        }

        public Criteria andExtNumberLessThan(Long value) {
            addCriterion("ext_number <", value, "extNumber");
            return (Criteria) this;
        }

        public Criteria andExtNumberLessThanOrEqualTo(Long value) {
            addCriterion("ext_number <=", value, "extNumber");
            return (Criteria) this;
        }

        public Criteria andExtNumberIn(List<Long> values) {
            addCriterion("ext_number in", values, "extNumber");
            return (Criteria) this;
        }

        public Criteria andExtNumberNotIn(List<Long> values) {
            addCriterion("ext_number not in", values, "extNumber");
            return (Criteria) this;
        }

        public Criteria andExtNumberBetween(Long value1, Long value2) {
            addCriterion("ext_number between", value1, value2, "extNumber");
            return (Criteria) this;
        }

        public Criteria andExtNumberNotBetween(Long value1, Long value2) {
            addCriterion("ext_number not between", value1, value2, "extNumber");
            return (Criteria) this;
        }

        public Criteria andWechatIdIsNull() {
            addCriterion("wechat_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatIdIsNotNull() {
            addCriterion("wechat_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatIdEqualTo(String value) {
            addCriterion("wechat_id =", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotEqualTo(String value) {
            addCriterion("wechat_id <>", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThan(String value) {
            addCriterion("wechat_id >", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_id >=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThan(String value) {
            addCriterion("wechat_id <", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_id <=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLike(String value) {
            addCriterion("wechat_id like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotLike(String value) {
            addCriterion("wechat_id not like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdIn(List<String> values) {
            addCriterion("wechat_id in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotIn(List<String> values) {
            addCriterion("wechat_id not in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdBetween(String value1, String value2) {
            addCriterion("wechat_id between", value1, value2, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotBetween(String value1, String value2) {
            addCriterion("wechat_id not between", value1, value2, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatPwdIsNull() {
            addCriterion("wechat_pwd is null");
            return (Criteria) this;
        }

        public Criteria andWechatPwdIsNotNull() {
            addCriterion("wechat_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andWechatPwdEqualTo(String value) {
            addCriterion("wechat_pwd =", value, "wechatPwd");
            return (Criteria) this;
        }

        public Criteria andWechatPwdNotEqualTo(String value) {
            addCriterion("wechat_pwd <>", value, "wechatPwd");
            return (Criteria) this;
        }

        public Criteria andWechatPwdGreaterThan(String value) {
            addCriterion("wechat_pwd >", value, "wechatPwd");
            return (Criteria) this;
        }

        public Criteria andWechatPwdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_pwd >=", value, "wechatPwd");
            return (Criteria) this;
        }

        public Criteria andWechatPwdLessThan(String value) {
            addCriterion("wechat_pwd <", value, "wechatPwd");
            return (Criteria) this;
        }

        public Criteria andWechatPwdLessThanOrEqualTo(String value) {
            addCriterion("wechat_pwd <=", value, "wechatPwd");
            return (Criteria) this;
        }

        public Criteria andWechatPwdLike(String value) {
            addCriterion("wechat_pwd like", value, "wechatPwd");
            return (Criteria) this;
        }

        public Criteria andWechatPwdNotLike(String value) {
            addCriterion("wechat_pwd not like", value, "wechatPwd");
            return (Criteria) this;
        }

        public Criteria andWechatPwdIn(List<String> values) {
            addCriterion("wechat_pwd in", values, "wechatPwd");
            return (Criteria) this;
        }

        public Criteria andWechatPwdNotIn(List<String> values) {
            addCriterion("wechat_pwd not in", values, "wechatPwd");
            return (Criteria) this;
        }

        public Criteria andWechatPwdBetween(String value1, String value2) {
            addCriterion("wechat_pwd between", value1, value2, "wechatPwd");
            return (Criteria) this;
        }

        public Criteria andWechatPwdNotBetween(String value1, String value2) {
            addCriterion("wechat_pwd not between", value1, value2, "wechatPwd");
            return (Criteria) this;
        }

        public Criteria andAcAccountIsNull() {
            addCriterion("ac_account is null");
            return (Criteria) this;
        }

        public Criteria andAcAccountIsNotNull() {
            addCriterion("ac_account is not null");
            return (Criteria) this;
        }

        public Criteria andAcAccountEqualTo(String value) {
            addCriterion("ac_account =", value, "acAccount");
            return (Criteria) this;
        }

        public Criteria andAcAccountNotEqualTo(String value) {
            addCriterion("ac_account <>", value, "acAccount");
            return (Criteria) this;
        }

        public Criteria andAcAccountGreaterThan(String value) {
            addCriterion("ac_account >", value, "acAccount");
            return (Criteria) this;
        }

        public Criteria andAcAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ac_account >=", value, "acAccount");
            return (Criteria) this;
        }

        public Criteria andAcAccountLessThan(String value) {
            addCriterion("ac_account <", value, "acAccount");
            return (Criteria) this;
        }

        public Criteria andAcAccountLessThanOrEqualTo(String value) {
            addCriterion("ac_account <=", value, "acAccount");
            return (Criteria) this;
        }

        public Criteria andAcAccountLike(String value) {
            addCriterion("ac_account like", value, "acAccount");
            return (Criteria) this;
        }

        public Criteria andAcAccountNotLike(String value) {
            addCriterion("ac_account not like", value, "acAccount");
            return (Criteria) this;
        }

        public Criteria andAcAccountIn(List<String> values) {
            addCriterion("ac_account in", values, "acAccount");
            return (Criteria) this;
        }

        public Criteria andAcAccountNotIn(List<String> values) {
            addCriterion("ac_account not in", values, "acAccount");
            return (Criteria) this;
        }

        public Criteria andAcAccountBetween(String value1, String value2) {
            addCriterion("ac_account between", value1, value2, "acAccount");
            return (Criteria) this;
        }

        public Criteria andAcAccountNotBetween(String value1, String value2) {
            addCriterion("ac_account not between", value1, value2, "acAccount");
            return (Criteria) this;
        }

        public Criteria andAcPasswordIsNull() {
            addCriterion("ac_password is null");
            return (Criteria) this;
        }

        public Criteria andAcPasswordIsNotNull() {
            addCriterion("ac_password is not null");
            return (Criteria) this;
        }

        public Criteria andAcPasswordEqualTo(String value) {
            addCriterion("ac_password =", value, "acPassword");
            return (Criteria) this;
        }

        public Criteria andAcPasswordNotEqualTo(String value) {
            addCriterion("ac_password <>", value, "acPassword");
            return (Criteria) this;
        }

        public Criteria andAcPasswordGreaterThan(String value) {
            addCriterion("ac_password >", value, "acPassword");
            return (Criteria) this;
        }

        public Criteria andAcPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ac_password >=", value, "acPassword");
            return (Criteria) this;
        }

        public Criteria andAcPasswordLessThan(String value) {
            addCriterion("ac_password <", value, "acPassword");
            return (Criteria) this;
        }

        public Criteria andAcPasswordLessThanOrEqualTo(String value) {
            addCriterion("ac_password <=", value, "acPassword");
            return (Criteria) this;
        }

        public Criteria andAcPasswordLike(String value) {
            addCriterion("ac_password like", value, "acPassword");
            return (Criteria) this;
        }

        public Criteria andAcPasswordNotLike(String value) {
            addCriterion("ac_password not like", value, "acPassword");
            return (Criteria) this;
        }

        public Criteria andAcPasswordIn(List<String> values) {
            addCriterion("ac_password in", values, "acPassword");
            return (Criteria) this;
        }

        public Criteria andAcPasswordNotIn(List<String> values) {
            addCriterion("ac_password not in", values, "acPassword");
            return (Criteria) this;
        }

        public Criteria andAcPasswordBetween(String value1, String value2) {
            addCriterion("ac_password between", value1, value2, "acPassword");
            return (Criteria) this;
        }

        public Criteria andAcPasswordNotBetween(String value1, String value2) {
            addCriterion("ac_password not between", value1, value2, "acPassword");
            return (Criteria) this;
        }

        public Criteria andQnIdIsNull() {
            addCriterion("qn_id is null");
            return (Criteria) this;
        }

        public Criteria andQnIdIsNotNull() {
            addCriterion("qn_id is not null");
            return (Criteria) this;
        }

        public Criteria andQnIdEqualTo(String value) {
            addCriterion("qn_id =", value, "qnId");
            return (Criteria) this;
        }

        public Criteria andQnIdNotEqualTo(String value) {
            addCriterion("qn_id <>", value, "qnId");
            return (Criteria) this;
        }

        public Criteria andQnIdGreaterThan(String value) {
            addCriterion("qn_id >", value, "qnId");
            return (Criteria) this;
        }

        public Criteria andQnIdGreaterThanOrEqualTo(String value) {
            addCriterion("qn_id >=", value, "qnId");
            return (Criteria) this;
        }

        public Criteria andQnIdLessThan(String value) {
            addCriterion("qn_id <", value, "qnId");
            return (Criteria) this;
        }

        public Criteria andQnIdLessThanOrEqualTo(String value) {
            addCriterion("qn_id <=", value, "qnId");
            return (Criteria) this;
        }

        public Criteria andQnIdLike(String value) {
            addCriterion("qn_id like", value, "qnId");
            return (Criteria) this;
        }

        public Criteria andQnIdNotLike(String value) {
            addCriterion("qn_id not like", value, "qnId");
            return (Criteria) this;
        }

        public Criteria andQnIdIn(List<String> values) {
            addCriterion("qn_id in", values, "qnId");
            return (Criteria) this;
        }

        public Criteria andQnIdNotIn(List<String> values) {
            addCriterion("qn_id not in", values, "qnId");
            return (Criteria) this;
        }

        public Criteria andQnIdBetween(String value1, String value2) {
            addCriterion("qn_id between", value1, value2, "qnId");
            return (Criteria) this;
        }

        public Criteria andQnIdNotBetween(String value1, String value2) {
            addCriterion("qn_id not between", value1, value2, "qnId");
            return (Criteria) this;
        }

        public Criteria andQnPasswordIsNull() {
            addCriterion("qn_password is null");
            return (Criteria) this;
        }

        public Criteria andQnPasswordIsNotNull() {
            addCriterion("qn_password is not null");
            return (Criteria) this;
        }

        public Criteria andQnPasswordEqualTo(String value) {
            addCriterion("qn_password =", value, "qnPassword");
            return (Criteria) this;
        }

        public Criteria andQnPasswordNotEqualTo(String value) {
            addCriterion("qn_password <>", value, "qnPassword");
            return (Criteria) this;
        }

        public Criteria andQnPasswordGreaterThan(String value) {
            addCriterion("qn_password >", value, "qnPassword");
            return (Criteria) this;
        }

        public Criteria andQnPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("qn_password >=", value, "qnPassword");
            return (Criteria) this;
        }

        public Criteria andQnPasswordLessThan(String value) {
            addCriterion("qn_password <", value, "qnPassword");
            return (Criteria) this;
        }

        public Criteria andQnPasswordLessThanOrEqualTo(String value) {
            addCriterion("qn_password <=", value, "qnPassword");
            return (Criteria) this;
        }

        public Criteria andQnPasswordLike(String value) {
            addCriterion("qn_password like", value, "qnPassword");
            return (Criteria) this;
        }

        public Criteria andQnPasswordNotLike(String value) {
            addCriterion("qn_password not like", value, "qnPassword");
            return (Criteria) this;
        }

        public Criteria andQnPasswordIn(List<String> values) {
            addCriterion("qn_password in", values, "qnPassword");
            return (Criteria) this;
        }

        public Criteria andQnPasswordNotIn(List<String> values) {
            addCriterion("qn_password not in", values, "qnPassword");
            return (Criteria) this;
        }

        public Criteria andQnPasswordBetween(String value1, String value2) {
            addCriterion("qn_password between", value1, value2, "qnPassword");
            return (Criteria) this;
        }

        public Criteria andQnPasswordNotBetween(String value1, String value2) {
            addCriterion("qn_password not between", value1, value2, "qnPassword");
            return (Criteria) this;
        }

        public Criteria andQnPhoneIsNull() {
            addCriterion("qn_phone is null");
            return (Criteria) this;
        }

        public Criteria andQnPhoneIsNotNull() {
            addCriterion("qn_phone is not null");
            return (Criteria) this;
        }

        public Criteria andQnPhoneEqualTo(String value) {
            addCriterion("qn_phone =", value, "qnPhone");
            return (Criteria) this;
        }

        public Criteria andQnPhoneNotEqualTo(String value) {
            addCriterion("qn_phone <>", value, "qnPhone");
            return (Criteria) this;
        }

        public Criteria andQnPhoneGreaterThan(String value) {
            addCriterion("qn_phone >", value, "qnPhone");
            return (Criteria) this;
        }

        public Criteria andQnPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("qn_phone >=", value, "qnPhone");
            return (Criteria) this;
        }

        public Criteria andQnPhoneLessThan(String value) {
            addCriterion("qn_phone <", value, "qnPhone");
            return (Criteria) this;
        }

        public Criteria andQnPhoneLessThanOrEqualTo(String value) {
            addCriterion("qn_phone <=", value, "qnPhone");
            return (Criteria) this;
        }

        public Criteria andQnPhoneLike(String value) {
            addCriterion("qn_phone like", value, "qnPhone");
            return (Criteria) this;
        }

        public Criteria andQnPhoneNotLike(String value) {
            addCriterion("qn_phone not like", value, "qnPhone");
            return (Criteria) this;
        }

        public Criteria andQnPhoneIn(List<String> values) {
            addCriterion("qn_phone in", values, "qnPhone");
            return (Criteria) this;
        }

        public Criteria andQnPhoneNotIn(List<String> values) {
            addCriterion("qn_phone not in", values, "qnPhone");
            return (Criteria) this;
        }

        public Criteria andQnPhoneBetween(String value1, String value2) {
            addCriterion("qn_phone between", value1, value2, "qnPhone");
            return (Criteria) this;
        }

        public Criteria andQnPhoneNotBetween(String value1, String value2) {
            addCriterion("qn_phone not between", value1, value2, "qnPhone");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andExamRoleIsNull() {
            addCriterion("exam_role is null");
            return (Criteria) this;
        }

        public Criteria andExamRoleIsNotNull() {
            addCriterion("exam_role is not null");
            return (Criteria) this;
        }

        public Criteria andExamRoleEqualTo(String value) {
            addCriterion("exam_role =", value, "examRole");
            return (Criteria) this;
        }

        public Criteria andExamRoleNotEqualTo(String value) {
            addCriterion("exam_role <>", value, "examRole");
            return (Criteria) this;
        }

        public Criteria andExamRoleGreaterThan(String value) {
            addCriterion("exam_role >", value, "examRole");
            return (Criteria) this;
        }

        public Criteria andExamRoleGreaterThanOrEqualTo(String value) {
            addCriterion("exam_role >=", value, "examRole");
            return (Criteria) this;
        }

        public Criteria andExamRoleLessThan(String value) {
            addCriterion("exam_role <", value, "examRole");
            return (Criteria) this;
        }

        public Criteria andExamRoleLessThanOrEqualTo(String value) {
            addCriterion("exam_role <=", value, "examRole");
            return (Criteria) this;
        }

        public Criteria andExamRoleLike(String value) {
            addCriterion("exam_role like", value, "examRole");
            return (Criteria) this;
        }

        public Criteria andExamRoleNotLike(String value) {
            addCriterion("exam_role not like", value, "examRole");
            return (Criteria) this;
        }

        public Criteria andExamRoleIn(List<String> values) {
            addCriterion("exam_role in", values, "examRole");
            return (Criteria) this;
        }

        public Criteria andExamRoleNotIn(List<String> values) {
            addCriterion("exam_role not in", values, "examRole");
            return (Criteria) this;
        }

        public Criteria andExamRoleBetween(String value1, String value2) {
            addCriterion("exam_role between", value1, value2, "examRole");
            return (Criteria) this;
        }

        public Criteria andExamRoleNotBetween(String value1, String value2) {
            addCriterion("exam_role not between", value1, value2, "examRole");
            return (Criteria) this;
        }

        public Criteria andEnableMobileVersionIsNull() {
            addCriterion("enable_mobile_version is null");
            return (Criteria) this;
        }

        public Criteria andEnableMobileVersionIsNotNull() {
            addCriterion("enable_mobile_version is not null");
            return (Criteria) this;
        }

        public Criteria andEnableMobileVersionEqualTo(Boolean value) {
            addCriterion("enable_mobile_version =", value, "enableMobileVersion");
            return (Criteria) this;
        }

        public Criteria andEnableMobileVersionNotEqualTo(Boolean value) {
            addCriterion("enable_mobile_version <>", value, "enableMobileVersion");
            return (Criteria) this;
        }

        public Criteria andEnableMobileVersionGreaterThan(Boolean value) {
            addCriterion("enable_mobile_version >", value, "enableMobileVersion");
            return (Criteria) this;
        }

        public Criteria andEnableMobileVersionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enable_mobile_version >=", value, "enableMobileVersion");
            return (Criteria) this;
        }

        public Criteria andEnableMobileVersionLessThan(Boolean value) {
            addCriterion("enable_mobile_version <", value, "enableMobileVersion");
            return (Criteria) this;
        }

        public Criteria andEnableMobileVersionLessThanOrEqualTo(Boolean value) {
            addCriterion("enable_mobile_version <=", value, "enableMobileVersion");
            return (Criteria) this;
        }

        public Criteria andEnableMobileVersionIn(List<Boolean> values) {
            addCriterion("enable_mobile_version in", values, "enableMobileVersion");
            return (Criteria) this;
        }

        public Criteria andEnableMobileVersionNotIn(List<Boolean> values) {
            addCriterion("enable_mobile_version not in", values, "enableMobileVersion");
            return (Criteria) this;
        }

        public Criteria andEnableMobileVersionBetween(Boolean value1, Boolean value2) {
            addCriterion("enable_mobile_version between", value1, value2, "enableMobileVersion");
            return (Criteria) this;
        }

        public Criteria andEnableMobileVersionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enable_mobile_version not between", value1, value2, "enableMobileVersion");
            return (Criteria) this;
        }

        public Criteria andSubaoIdIsNull() {
            addCriterion("subao_id is null");
            return (Criteria) this;
        }

        public Criteria andSubaoIdIsNotNull() {
            addCriterion("subao_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubaoIdEqualTo(String value) {
            addCriterion("subao_id =", value, "subaoId");
            return (Criteria) this;
        }

        public Criteria andSubaoIdNotEqualTo(String value) {
            addCriterion("subao_id <>", value, "subaoId");
            return (Criteria) this;
        }

        public Criteria andSubaoIdGreaterThan(String value) {
            addCriterion("subao_id >", value, "subaoId");
            return (Criteria) this;
        }

        public Criteria andSubaoIdGreaterThanOrEqualTo(String value) {
            addCriterion("subao_id >=", value, "subaoId");
            return (Criteria) this;
        }

        public Criteria andSubaoIdLessThan(String value) {
            addCriterion("subao_id <", value, "subaoId");
            return (Criteria) this;
        }

        public Criteria andSubaoIdLessThanOrEqualTo(String value) {
            addCriterion("subao_id <=", value, "subaoId");
            return (Criteria) this;
        }

        public Criteria andSubaoIdLike(String value) {
            addCriterion("subao_id like", value, "subaoId");
            return (Criteria) this;
        }

        public Criteria andSubaoIdNotLike(String value) {
            addCriterion("subao_id not like", value, "subaoId");
            return (Criteria) this;
        }

        public Criteria andSubaoIdIn(List<String> values) {
            addCriterion("subao_id in", values, "subaoId");
            return (Criteria) this;
        }

        public Criteria andSubaoIdNotIn(List<String> values) {
            addCriterion("subao_id not in", values, "subaoId");
            return (Criteria) this;
        }

        public Criteria andSubaoIdBetween(String value1, String value2) {
            addCriterion("subao_id between", value1, value2, "subaoId");
            return (Criteria) this;
        }

        public Criteria andSubaoIdNotBetween(String value1, String value2) {
            addCriterion("subao_id not between", value1, value2, "subaoId");
            return (Criteria) this;
        }

        public Criteria andBelongToIsNull() {
            addCriterion("belong_to is null");
            return (Criteria) this;
        }

        public Criteria andBelongToIsNotNull() {
            addCriterion("belong_to is not null");
            return (Criteria) this;
        }

        public Criteria andBelongToEqualTo(String value) {
            addCriterion("belong_to =", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToNotEqualTo(String value) {
            addCriterion("belong_to <>", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToGreaterThan(String value) {
            addCriterion("belong_to >", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToGreaterThanOrEqualTo(String value) {
            addCriterion("belong_to >=", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToLessThan(String value) {
            addCriterion("belong_to <", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToLessThanOrEqualTo(String value) {
            addCriterion("belong_to <=", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToLike(String value) {
            addCriterion("belong_to like", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToNotLike(String value) {
            addCriterion("belong_to not like", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToIn(List<String> values) {
            addCriterion("belong_to in", values, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToNotIn(List<String> values) {
            addCriterion("belong_to not in", values, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToBetween(String value1, String value2) {
            addCriterion("belong_to between", value1, value2, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToNotBetween(String value1, String value2) {
            addCriterion("belong_to not between", value1, value2, "belongTo");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
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