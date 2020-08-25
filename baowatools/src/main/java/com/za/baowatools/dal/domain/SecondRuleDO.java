package com.za.baowatools.dal.domain;

import java.util.Date;

public class SecondRuleDO {
    /**
     * id BIGINT(19) 必填<br>
     * 主键ID
     */
    private Long id;

    /**
     * rule_id BIGINT(19) 必填<br>
     * 规则ID
     */
    private Long ruleId;

    /**
     * campaign_id VARCHAR(20)<br>
     * 营销活动定义id
     */
    private String campaignId;

    /**
     * campaign_name VARCHAR(200)<br>
     * 
     */
    private String campaignName;

    /**
     * total_number INTEGER(10)<br>
     * 名单总数上限
     */
    private Integer totalNumber;

    /**
     * day_number INTEGER(10)<br>
     * 当日名单上限
     */
    private Integer dayNumber;

    /**
     * status TINYINT(3)<br>
     * 子规则状态 0-失效；1-有效
     */
    private Byte status;

    /**
     * creator VARCHAR(32) 默认值[system] 必填<br>
     * 创建人
     */
    private String creator;

    /**
     * gmt_created TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 创建时间
     */
    private Date gmtCreated;

    /**
     * modifier VARCHAR(32) 默认值[system] 必填<br>
     * 最后修改人
     */
    private String modifier;

    /**
     * gmt_modified TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 最后修改时间
     */
    private Date gmtModified;

    /**
     * is_deleted CHAR(1) 默认值[N] 必填<br>
     * N正常,Y删除
     */
    private String isDeleted;

    /**
     * name_type VARCHAR(50)<br>
     * 名单分类
     */
    private String nameType;

    /**
     * business_model VARCHAR(20)<br>
     * 业务模式
     */
    private String businessModel;

    /**
     * level_one VARCHAR(10)<br>
     * 一级名单数量
     */
    private String levelOne;

    /**
     * level_two VARCHAR(10)<br>
     * 二级名单数量
     */
    private String levelTwo;

    /**
     * level_three VARCHAR(10)<br>
     * 三级名单数量
     */
    private String levelThree;

    /**
     * id BIGINT(19) 必填<br>
     * 获得 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * id BIGINT(19) 必填<br>
     * 设置 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * rule_id BIGINT(19) 必填<br>
     * 获得 规则ID
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * rule_id BIGINT(19) 必填<br>
     * 设置 规则ID
     */
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * campaign_id VARCHAR(20)<br>
     * 获得 营销活动定义id
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * campaign_id VARCHAR(20)<br>
     * 设置 营销活动定义id
     */
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * campaign_name VARCHAR(200)<br>
     * 获得 
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * campaign_name VARCHAR(200)<br>
     * 设置 
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * total_number INTEGER(10)<br>
     * 获得 名单总数上限
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    /**
     * total_number INTEGER(10)<br>
     * 设置 名单总数上限
     */
    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    /**
     * day_number INTEGER(10)<br>
     * 获得 当日名单上限
     */
    public Integer getDayNumber() {
        return dayNumber;
    }

    /**
     * day_number INTEGER(10)<br>
     * 设置 当日名单上限
     */
    public void setDayNumber(Integer dayNumber) {
        this.dayNumber = dayNumber;
    }

    /**
     * status TINYINT(3)<br>
     * 获得 子规则状态 0-失效；1-有效
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * status TINYINT(3)<br>
     * 设置 子规则状态 0-失效；1-有效
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * creator VARCHAR(32) 默认值[system] 必填<br>
     * 获得 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * creator VARCHAR(32) 默认值[system] 必填<br>
     * 设置 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * gmt_created TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 获得 创建时间
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * gmt_created TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 设置 创建时间
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * modifier VARCHAR(32) 默认值[system] 必填<br>
     * 获得 最后修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * modifier VARCHAR(32) 默认值[system] 必填<br>
     * 设置 最后修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * gmt_modified TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 获得 最后修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * gmt_modified TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 设置 最后修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * is_deleted CHAR(1) 默认值[N] 必填<br>
     * 获得 N正常,Y删除
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * is_deleted CHAR(1) 默认值[N] 必填<br>
     * 设置 N正常,Y删除
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * name_type VARCHAR(50)<br>
     * 获得 名单分类
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * name_type VARCHAR(50)<br>
     * 设置 名单分类
     */
    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    /**
     * business_model VARCHAR(20)<br>
     * 获得 业务模式
     */
    public String getBusinessModel() {
        return businessModel;
    }

    /**
     * business_model VARCHAR(20)<br>
     * 设置 业务模式
     */
    public void setBusinessModel(String businessModel) {
        this.businessModel = businessModel;
    }

    /**
     * level_one VARCHAR(10)<br>
     * 获得 一级名单数量
     */
    public String getLevelOne() {
        return levelOne;
    }

    /**
     * level_one VARCHAR(10)<br>
     * 设置 一级名单数量
     */
    public void setLevelOne(String levelOne) {
        this.levelOne = levelOne;
    }

    /**
     * level_two VARCHAR(10)<br>
     * 获得 二级名单数量
     */
    public String getLevelTwo() {
        return levelTwo;
    }

    /**
     * level_two VARCHAR(10)<br>
     * 设置 二级名单数量
     */
    public void setLevelTwo(String levelTwo) {
        this.levelTwo = levelTwo;
    }

    /**
     * level_three VARCHAR(10)<br>
     * 获得 三级名单数量
     */
    public String getLevelThree() {
        return levelThree;
    }

    /**
     * level_three VARCHAR(10)<br>
     * 设置 三级名单数量
     */
    public void setLevelThree(String levelThree) {
        this.levelThree = levelThree;
    }
}