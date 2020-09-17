package com.myy.baowatools.pojo;

import net.sf.json.JSONObject;

//设置规则内容，最终转换为json形式传给保哇接口
public class RuleInfo {
    String id;
    String userId;
    //账号信息
    UserSet userSet;
    //业务来源
    Object campaignIdList;
    //名单分类
    Object secondRules;
    //投保地列表
    Object insurePlaceCodeList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserSet getUserSet() {
        return userSet;
    }

    public void setUserSet(UserSet userSet) {
        this.userSet = userSet;
    }

    public Object getCampaignIdList() {
        return campaignIdList;
    }

    public void setCampaignIdList(Object campaignIdList) {
        this.campaignIdList = campaignIdList;
    }

    public Object getSecondRules() {
        return secondRules;
    }

    public void setSecondRules(Object secondRules) {
        this.secondRules = secondRules;
    }

    public Object getInsurePlaceCodeList() {
        return insurePlaceCodeList;
    }

    public void setInsurePlaceCodeList(Object insurePlaceCodeList) {
        this.insurePlaceCodeList = insurePlaceCodeList;
    }

    @Override
    public String toString() {
        return "RuleInfo{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", userSet=" + userSet +
                ", campaignIdList=" + campaignIdList +
                ", secondRules=" + secondRules +
                ", insurePlaceCodeList=" + insurePlaceCodeList +
                '}';
    }
}
class SecondRules{
    int dayNumber;
    String isDeleted;
    String nameType;
    long ruleId;

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public void setRuleId(long ruleId) {
        this.ruleId = ruleId;
    }
}