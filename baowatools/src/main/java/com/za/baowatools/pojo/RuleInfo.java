package com.za.baowatools.pojo;

import net.sf.json.JSONObject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//设置规则内容，最终转换为json形式传给保哇接口
public class RuleInfo {
    String id;
    String userId;
    //账号信息
    UserSet userSet;
    //业务来源
    JSONObject campaignIdList;
    //名单分类
    JSONObject secondRules;
    //投保地列表
    JSONObject insurePlaceCodeList;

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

    public JSONObject getCampaignIdList() {
        return campaignIdList;
    }

    public void setCampaignIdList(JSONObject campaignIdList) {
        this.campaignIdList = campaignIdList;
    }

    public JSONObject getSecondRules() {
        return secondRules;
    }

    public void setSecondRules(JSONObject secondRules) {
        this.secondRules = secondRules;
    }

    public JSONObject getInsurePlaceCodeList() {
        return insurePlaceCodeList;
    }

    public void setInsurePlaceCodeList(JSONObject insurePlaceCodeList) {
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