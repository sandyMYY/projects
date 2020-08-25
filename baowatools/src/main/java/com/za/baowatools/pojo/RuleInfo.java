package com.za.baowatools.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//设置规则内容，最终转换为json形式传给保哇接口
public class RuleInfo {
    long id;
    long userId;
    //账号信息
    UserSet userSet;
    //业务来源
    String[] campaignIdList;
    //名单分类
    List<SecondRules> secondRules;
    //投保地列表
    String[] insurePlaceCodeList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public UserSet getUserSet() {
        return userSet;
    }

    public void setUserSet(UserSet userSet) {
        this.userSet = userSet;
    }

    public String[] getCampaignIdList() {
        return campaignIdList;
    }

    public void setCampaignIdList(String[] campaignIdList) {
        this.campaignIdList = campaignIdList;
    }

    public List<SecondRules> getSecondRules() {
        return secondRules;
    }

    public void setSecondRules(List<SecondRules> secondRules) {
        this.secondRules = secondRules;
    }

    public String[] getInsurePlaceCodeList() {
        return insurePlaceCodeList;
    }

    public void setInsurePlaceCodeList(String[] insurePlaceCodeList) {
        this.insurePlaceCodeList = insurePlaceCodeList;
    }

    @Override
    public String toString() {
        return "RuleInfo{" +
                "id=" + id +
                ", userId=" + userId +
                ", userSet=" + userSet +
                ", campaignIdList=" + Arrays.toString(campaignIdList) +
                ", secondRules=" + secondRules +
                ", insurePlaceCodeList=" + Arrays.toString(insurePlaceCodeList) +
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