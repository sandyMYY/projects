package com.myy.baowatools.dal.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SecondRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecondRuleExample() {
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

        public Criteria andCampaignIdIsNull() {
            addCriterion("campaign_id is null");
            return (Criteria) this;
        }

        public Criteria andCampaignIdIsNotNull() {
            addCriterion("campaign_id is not null");
            return (Criteria) this;
        }

        public Criteria andCampaignIdEqualTo(String value) {
            addCriterion("campaign_id =", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotEqualTo(String value) {
            addCriterion("campaign_id <>", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdGreaterThan(String value) {
            addCriterion("campaign_id >", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdGreaterThanOrEqualTo(String value) {
            addCriterion("campaign_id >=", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdLessThan(String value) {
            addCriterion("campaign_id <", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdLessThanOrEqualTo(String value) {
            addCriterion("campaign_id <=", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdLike(String value) {
            addCriterion("campaign_id like", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotLike(String value) {
            addCriterion("campaign_id not like", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdIn(List<String> values) {
            addCriterion("campaign_id in", values, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotIn(List<String> values) {
            addCriterion("campaign_id not in", values, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdBetween(String value1, String value2) {
            addCriterion("campaign_id between", value1, value2, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotBetween(String value1, String value2) {
            addCriterion("campaign_id not between", value1, value2, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignNameIsNull() {
            addCriterion("campaign_name is null");
            return (Criteria) this;
        }

        public Criteria andCampaignNameIsNotNull() {
            addCriterion("campaign_name is not null");
            return (Criteria) this;
        }

        public Criteria andCampaignNameEqualTo(String value) {
            addCriterion("campaign_name =", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameNotEqualTo(String value) {
            addCriterion("campaign_name <>", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameGreaterThan(String value) {
            addCriterion("campaign_name >", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameGreaterThanOrEqualTo(String value) {
            addCriterion("campaign_name >=", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameLessThan(String value) {
            addCriterion("campaign_name <", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameLessThanOrEqualTo(String value) {
            addCriterion("campaign_name <=", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameLike(String value) {
            addCriterion("campaign_name like", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameNotLike(String value) {
            addCriterion("campaign_name not like", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameIn(List<String> values) {
            addCriterion("campaign_name in", values, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameNotIn(List<String> values) {
            addCriterion("campaign_name not in", values, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameBetween(String value1, String value2) {
            addCriterion("campaign_name between", value1, value2, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameNotBetween(String value1, String value2) {
            addCriterion("campaign_name not between", value1, value2, "campaignName");
            return (Criteria) this;
        }

        public Criteria andTotalNumberIsNull() {
            addCriterion("total_number is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumberIsNotNull() {
            addCriterion("total_number is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumberEqualTo(Integer value) {
            addCriterion("total_number =", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberNotEqualTo(Integer value) {
            addCriterion("total_number <>", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberGreaterThan(Integer value) {
            addCriterion("total_number >", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_number >=", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberLessThan(Integer value) {
            addCriterion("total_number <", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberLessThanOrEqualTo(Integer value) {
            addCriterion("total_number <=", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberIn(List<Integer> values) {
            addCriterion("total_number in", values, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberNotIn(List<Integer> values) {
            addCriterion("total_number not in", values, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberBetween(Integer value1, Integer value2) {
            addCriterion("total_number between", value1, value2, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("total_number not between", value1, value2, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberIsNull() {
            addCriterion("day_number is null");
            return (Criteria) this;
        }

        public Criteria andDayNumberIsNotNull() {
            addCriterion("day_number is not null");
            return (Criteria) this;
        }

        public Criteria andDayNumberEqualTo(Integer value) {
            addCriterion("day_number =", value, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberNotEqualTo(Integer value) {
            addCriterion("day_number <>", value, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberGreaterThan(Integer value) {
            addCriterion("day_number >", value, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_number >=", value, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberLessThan(Integer value) {
            addCriterion("day_number <", value, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberLessThanOrEqualTo(Integer value) {
            addCriterion("day_number <=", value, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberIn(List<Integer> values) {
            addCriterion("day_number in", values, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberNotIn(List<Integer> values) {
            addCriterion("day_number not in", values, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberBetween(Integer value1, Integer value2) {
            addCriterion("day_number between", value1, value2, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andDayNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("day_number not between", value1, value2, "dayNumber");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andNameTypeIsNull() {
            addCriterion("name_type is null");
            return (Criteria) this;
        }

        public Criteria andNameTypeIsNotNull() {
            addCriterion("name_type is not null");
            return (Criteria) this;
        }

        public Criteria andNameTypeEqualTo(String value) {
            addCriterion("name_type =", value, "nameType");
            return (Criteria) this;
        }

        public Criteria andNameTypeNotEqualTo(String value) {
            addCriterion("name_type <>", value, "nameType");
            return (Criteria) this;
        }

        public Criteria andNameTypeGreaterThan(String value) {
            addCriterion("name_type >", value, "nameType");
            return (Criteria) this;
        }

        public Criteria andNameTypeGreaterThanOrEqualTo(String value) {
            addCriterion("name_type >=", value, "nameType");
            return (Criteria) this;
        }

        public Criteria andNameTypeLessThan(String value) {
            addCriterion("name_type <", value, "nameType");
            return (Criteria) this;
        }

        public Criteria andNameTypeLessThanOrEqualTo(String value) {
            addCriterion("name_type <=", value, "nameType");
            return (Criteria) this;
        }

        public Criteria andNameTypeLike(String value) {
            addCriterion("name_type like", value, "nameType");
            return (Criteria) this;
        }

        public Criteria andNameTypeNotLike(String value) {
            addCriterion("name_type not like", value, "nameType");
            return (Criteria) this;
        }

        public Criteria andNameTypeIn(List<String> values) {
            addCriterion("name_type in", values, "nameType");
            return (Criteria) this;
        }

        public Criteria andNameTypeNotIn(List<String> values) {
            addCriterion("name_type not in", values, "nameType");
            return (Criteria) this;
        }

        public Criteria andNameTypeBetween(String value1, String value2) {
            addCriterion("name_type between", value1, value2, "nameType");
            return (Criteria) this;
        }

        public Criteria andNameTypeNotBetween(String value1, String value2) {
            addCriterion("name_type not between", value1, value2, "nameType");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIsNull() {
            addCriterion("business_model is null");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIsNotNull() {
            addCriterion("business_model is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessModelEqualTo(String value) {
            addCriterion("business_model =", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelNotEqualTo(String value) {
            addCriterion("business_model <>", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelGreaterThan(String value) {
            addCriterion("business_model >", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelGreaterThanOrEqualTo(String value) {
            addCriterion("business_model >=", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelLessThan(String value) {
            addCriterion("business_model <", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelLessThanOrEqualTo(String value) {
            addCriterion("business_model <=", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelLike(String value) {
            addCriterion("business_model like", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelNotLike(String value) {
            addCriterion("business_model not like", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIn(List<String> values) {
            addCriterion("business_model in", values, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelNotIn(List<String> values) {
            addCriterion("business_model not in", values, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelBetween(String value1, String value2) {
            addCriterion("business_model between", value1, value2, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelNotBetween(String value1, String value2) {
            addCriterion("business_model not between", value1, value2, "businessModel");
            return (Criteria) this;
        }

        public Criteria andLevelOneIsNull() {
            addCriterion("level_one is null");
            return (Criteria) this;
        }

        public Criteria andLevelOneIsNotNull() {
            addCriterion("level_one is not null");
            return (Criteria) this;
        }

        public Criteria andLevelOneEqualTo(String value) {
            addCriterion("level_one =", value, "levelOne");
            return (Criteria) this;
        }

        public Criteria andLevelOneNotEqualTo(String value) {
            addCriterion("level_one <>", value, "levelOne");
            return (Criteria) this;
        }

        public Criteria andLevelOneGreaterThan(String value) {
            addCriterion("level_one >", value, "levelOne");
            return (Criteria) this;
        }

        public Criteria andLevelOneGreaterThanOrEqualTo(String value) {
            addCriterion("level_one >=", value, "levelOne");
            return (Criteria) this;
        }

        public Criteria andLevelOneLessThan(String value) {
            addCriterion("level_one <", value, "levelOne");
            return (Criteria) this;
        }

        public Criteria andLevelOneLessThanOrEqualTo(String value) {
            addCriterion("level_one <=", value, "levelOne");
            return (Criteria) this;
        }

        public Criteria andLevelOneLike(String value) {
            addCriterion("level_one like", value, "levelOne");
            return (Criteria) this;
        }

        public Criteria andLevelOneNotLike(String value) {
            addCriterion("level_one not like", value, "levelOne");
            return (Criteria) this;
        }

        public Criteria andLevelOneIn(List<String> values) {
            addCriterion("level_one in", values, "levelOne");
            return (Criteria) this;
        }

        public Criteria andLevelOneNotIn(List<String> values) {
            addCriterion("level_one not in", values, "levelOne");
            return (Criteria) this;
        }

        public Criteria andLevelOneBetween(String value1, String value2) {
            addCriterion("level_one between", value1, value2, "levelOne");
            return (Criteria) this;
        }

        public Criteria andLevelOneNotBetween(String value1, String value2) {
            addCriterion("level_one not between", value1, value2, "levelOne");
            return (Criteria) this;
        }

        public Criteria andLevelTwoIsNull() {
            addCriterion("level_two is null");
            return (Criteria) this;
        }

        public Criteria andLevelTwoIsNotNull() {
            addCriterion("level_two is not null");
            return (Criteria) this;
        }

        public Criteria andLevelTwoEqualTo(String value) {
            addCriterion("level_two =", value, "levelTwo");
            return (Criteria) this;
        }

        public Criteria andLevelTwoNotEqualTo(String value) {
            addCriterion("level_two <>", value, "levelTwo");
            return (Criteria) this;
        }

        public Criteria andLevelTwoGreaterThan(String value) {
            addCriterion("level_two >", value, "levelTwo");
            return (Criteria) this;
        }

        public Criteria andLevelTwoGreaterThanOrEqualTo(String value) {
            addCriterion("level_two >=", value, "levelTwo");
            return (Criteria) this;
        }

        public Criteria andLevelTwoLessThan(String value) {
            addCriterion("level_two <", value, "levelTwo");
            return (Criteria) this;
        }

        public Criteria andLevelTwoLessThanOrEqualTo(String value) {
            addCriterion("level_two <=", value, "levelTwo");
            return (Criteria) this;
        }

        public Criteria andLevelTwoLike(String value) {
            addCriterion("level_two like", value, "levelTwo");
            return (Criteria) this;
        }

        public Criteria andLevelTwoNotLike(String value) {
            addCriterion("level_two not like", value, "levelTwo");
            return (Criteria) this;
        }

        public Criteria andLevelTwoIn(List<String> values) {
            addCriterion("level_two in", values, "levelTwo");
            return (Criteria) this;
        }

        public Criteria andLevelTwoNotIn(List<String> values) {
            addCriterion("level_two not in", values, "levelTwo");
            return (Criteria) this;
        }

        public Criteria andLevelTwoBetween(String value1, String value2) {
            addCriterion("level_two between", value1, value2, "levelTwo");
            return (Criteria) this;
        }

        public Criteria andLevelTwoNotBetween(String value1, String value2) {
            addCriterion("level_two not between", value1, value2, "levelTwo");
            return (Criteria) this;
        }

        public Criteria andLevelThreeIsNull() {
            addCriterion("level_three is null");
            return (Criteria) this;
        }

        public Criteria andLevelThreeIsNotNull() {
            addCriterion("level_three is not null");
            return (Criteria) this;
        }

        public Criteria andLevelThreeEqualTo(String value) {
            addCriterion("level_three =", value, "levelThree");
            return (Criteria) this;
        }

        public Criteria andLevelThreeNotEqualTo(String value) {
            addCriterion("level_three <>", value, "levelThree");
            return (Criteria) this;
        }

        public Criteria andLevelThreeGreaterThan(String value) {
            addCriterion("level_three >", value, "levelThree");
            return (Criteria) this;
        }

        public Criteria andLevelThreeGreaterThanOrEqualTo(String value) {
            addCriterion("level_three >=", value, "levelThree");
            return (Criteria) this;
        }

        public Criteria andLevelThreeLessThan(String value) {
            addCriterion("level_three <", value, "levelThree");
            return (Criteria) this;
        }

        public Criteria andLevelThreeLessThanOrEqualTo(String value) {
            addCriterion("level_three <=", value, "levelThree");
            return (Criteria) this;
        }

        public Criteria andLevelThreeLike(String value) {
            addCriterion("level_three like", value, "levelThree");
            return (Criteria) this;
        }

        public Criteria andLevelThreeNotLike(String value) {
            addCriterion("level_three not like", value, "levelThree");
            return (Criteria) this;
        }

        public Criteria andLevelThreeIn(List<String> values) {
            addCriterion("level_three in", values, "levelThree");
            return (Criteria) this;
        }

        public Criteria andLevelThreeNotIn(List<String> values) {
            addCriterion("level_three not in", values, "levelThree");
            return (Criteria) this;
        }

        public Criteria andLevelThreeBetween(String value1, String value2) {
            addCriterion("level_three between", value1, value2, "levelThree");
            return (Criteria) this;
        }

        public Criteria andLevelThreeNotBetween(String value1, String value2) {
            addCriterion("level_three not between", value1, value2, "levelThree");
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