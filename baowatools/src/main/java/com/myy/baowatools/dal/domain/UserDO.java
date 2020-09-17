package com.myy.baowatools.dal.domain;

import java.util.Date;

public class UserDO {
    /**
     * id INTEGER(20) 必填<br>
     * 用户id
     */
    private Long id;

    /**
     * tm_saas_code INTEGER(32)<br>
     * 速帮saasCode
     */
    private String tmSaasCode;

    /**
     * user_name INTEGER(150)<br>
     * 用户名
     */
    private String userName;

    /**
     * name VARCHAR(50)<br>
     * 姓名
     */
    private String name;

    /**
     * password VARCHAR(100)<br>
     * 密码
     */
    private String password;

    /**
     * phone_no VARCHAR(50)<br>
     * 电话
     */
    private String phoneNo;

    /**
     * email VARCHAR(128)<br>
     * 电子邮箱
     */
    private String email;

    /**
     * sex CHAR(1)<br>
     * F:女 M:男
     */
    private String sex;

    /**
     * flag VARCHAR(4)<br>
     * 标志位
     */
    private String flag;

    /**
     * extra_info VARCHAR(2000)<br>
     * 扩展字段
     */
    private String extraInfo;

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
     * 操作时间
     */
    private Date gmtModified;

    /**
     * is_deleted CHAR(1) 默认值[N] 必填<br>
     * N正常,Y删除
     */
    private String isDeleted;

    /**
     * grade VARCHAR(4)<br>
     * 用户等级
     */
    private String grade;

    /**
     * parent_user_id BIGINT(19)<br>
     * 父级用户id
     */
    private Long parentUserId;

    /**
     * parent_name VARCHAR(20)<br>
     * 父级用户名
     */
    private String parentName;

    /**
     * role_id BIGINT(19)<br>
     * 角色id
     */
    private Long roleId;

    /**
     * rule_id BIGINT(19)<br>
     * 对应查找规则id
     */
    private Long ruleId;

    /**
     * rule_name VARCHAR(40)<br>
     * 规则名称
     */
    private String ruleName;

    /**
     * rule_date TIMESTAMP(19)<br>
     * 规则绑定时间
     */
    private Date ruleDate;

    /**
     * user_property CHAR(1)<br>
     * 用户属性-0内部，1外部
     */
    private String userProperty;

    /**
     * product_belong CHAR(1)<br>
     * 所属产品-0车险，1健康险
     */
    private String productBelong;

    /**
     * max_number VARCHAR(20)<br>
     * 总数量上限
     */
    private String maxNumber;

    /**
     * distribute_date TIMESTAMP(19)<br>
     * 名单分发时间
     */
    private Date distributeDate;

    /**
     * call_supplier TINYINT(3)<br>
     * 话务供应商类型 1-讯鸟 2-智言
     */
    private Byte callSupplier;

    /**
     * agent_id VARCHAR(50)<br>
     * 坐席账号
     */
    private String agentId;

    /**
     * agent_pwd VARCHAR(50)<br>
     * 登录密码
     */
    private String agentPwd;

    /**
     * bind_phone VARCHAR(20)<br>
     * 绑定手机号
     */
    private String bindPhone;

    /**
     * ext_number BIGINT(19)<br>
     * 智言分机号
     */
    private Long extNumber;

    /**
     * wechat_id VARCHAR(50)<br>
     * 微信号
     */
    private String wechatId;

    /**
     * wechat_pwd VARCHAR(50)<br>
     * 微信密码
     */
    private String wechatPwd;

    /**
     * ac_account VARCHAR(50)<br>
     * 奥创平台账号
     */
    private String acAccount;

    /**
     * ac_password VARCHAR(50)<br>
     * 奥创平台密码
     */
    private String acPassword;

    /**
     * qn_id VARCHAR(50)<br>
     * 青牛账号
     */
    private String qnId;

    /**
     * qn_password VARCHAR(100)<br>
     * 青牛密码
     */
    private String qnPassword;

    /**
     * qn_phone VARCHAR(50)<br>
     * 青牛账号对应电话
     */
    private String qnPhone;

    /**
     * department VARCHAR(10)<br>
     * 所属部门
     */
    private String department;

    /**
     * level CHAR(1)<br>
     * 坐席等级
     */
    private String level;

    /**
     * exam_role VARCHAR(20)<br>
     * 考试角色
     */
    private String examRole;

    /**
     * enable_mobile_version BIT 默认值[0]<br>
     * 是否开通移动账号：1是 0否
     */
    private Boolean enableMobileVersion;

    /**
     * subao_id VARCHAR(40)<br>
     * 速保出单员ID
     */
    private String subaoId;

    /**
     * belong_to VARCHAR(20)<br>
     * 所属产品（众安、非众安）
     */
    private String belongTo;

    /**
     * last_login_time TIMESTAMP(19)<br>
     * 最新登录时间
     */
    private Date lastLoginTime;

    /**
     * id INTEGER(20) 必填<br>
     * 获得 用户id
     */
    public Long getId() {
        return id;
    }

    /**
     * id INTEGER(20) 必填<br>
     * 设置 用户id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * tm_saas_code INTEGER(32)<br>
     * 获得 速帮saasCode
     */
    public String getTmSaasCode() {
        return tmSaasCode;
    }

    /**
     * tm_saas_code INTEGER(32)<br>
     * 设置 速帮saasCode
     */
    public void setTmSaasCode(String tmSaasCode) {
        this.tmSaasCode = tmSaasCode;
    }

    /**
     * user_name INTEGER(150)<br>
     * 获得 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * user_name INTEGER(150)<br>
     * 设置 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * name VARCHAR(50)<br>
     * 获得 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * name VARCHAR(50)<br>
     * 设置 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * password VARCHAR(100)<br>
     * 获得 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * password VARCHAR(100)<br>
     * 设置 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * phone_no VARCHAR(50)<br>
     * 获得 电话
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * phone_no VARCHAR(50)<br>
     * 设置 电话
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * email VARCHAR(128)<br>
     * 获得 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * email VARCHAR(128)<br>
     * 设置 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * sex CHAR(1)<br>
     * 获得 F:女 M:男
     */
    public String getSex() {
        return sex;
    }

    /**
     * sex CHAR(1)<br>
     * 设置 F:女 M:男
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * flag VARCHAR(4)<br>
     * 获得 标志位
     */
    public String getFlag() {
        return flag;
    }

    /**
     * flag VARCHAR(4)<br>
     * 设置 标志位
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * extra_info VARCHAR(2000)<br>
     * 获得 扩展字段
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * extra_info VARCHAR(2000)<br>
     * 设置 扩展字段
     */
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
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
     * 获得 操作时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * gmt_modified TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 设置 操作时间
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
     * grade VARCHAR(4)<br>
     * 获得 用户等级
     */
    public String getGrade() {
        return grade;
    }

    /**
     * grade VARCHAR(4)<br>
     * 设置 用户等级
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * parent_user_id BIGINT(19)<br>
     * 获得 父级用户id
     */
    public Long getParentUserId() {
        return parentUserId;
    }

    /**
     * parent_user_id BIGINT(19)<br>
     * 设置 父级用户id
     */
    public void setParentUserId(Long parentUserId) {
        this.parentUserId = parentUserId;
    }

    /**
     * parent_name VARCHAR(20)<br>
     * 获得 父级用户名
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * parent_name VARCHAR(20)<br>
     * 设置 父级用户名
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * role_id BIGINT(19)<br>
     * 获得 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * role_id BIGINT(19)<br>
     * 设置 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * rule_id BIGINT(19)<br>
     * 获得 对应查找规则id
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * rule_id BIGINT(19)<br>
     * 设置 对应查找规则id
     */
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * rule_name VARCHAR(40)<br>
     * 获得 规则名称
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * rule_name VARCHAR(40)<br>
     * 设置 规则名称
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * rule_date TIMESTAMP(19)<br>
     * 获得 规则绑定时间
     */
    public Date getRuleDate() {
        return ruleDate;
    }

    /**
     * rule_date TIMESTAMP(19)<br>
     * 设置 规则绑定时间
     */
    public void setRuleDate(Date ruleDate) {
        this.ruleDate = ruleDate;
    }

    /**
     * user_property CHAR(1)<br>
     * 获得 用户属性-0内部，1外部
     */
    public String getUserProperty() {
        return userProperty;
    }

    /**
     * user_property CHAR(1)<br>
     * 设置 用户属性-0内部，1外部
     */
    public void setUserProperty(String userProperty) {
        this.userProperty = userProperty;
    }

    /**
     * product_belong CHAR(1)<br>
     * 获得 所属产品-0车险，1健康险
     */
    public String getProductBelong() {
        return productBelong;
    }

    /**
     * product_belong CHAR(1)<br>
     * 设置 所属产品-0车险，1健康险
     */
    public void setProductBelong(String productBelong) {
        this.productBelong = productBelong;
    }

    /**
     * max_number VARCHAR(20)<br>
     * 获得 总数量上限
     */
    public String getMaxNumber() {
        return maxNumber;
    }

    /**
     * max_number VARCHAR(20)<br>
     * 设置 总数量上限
     */
    public void setMaxNumber(String maxNumber) {
        this.maxNumber = maxNumber;
    }

    /**
     * distribute_date TIMESTAMP(19)<br>
     * 获得 名单分发时间
     */
    public Date getDistributeDate() {
        return distributeDate;
    }

    /**
     * distribute_date TIMESTAMP(19)<br>
     * 设置 名单分发时间
     */
    public void setDistributeDate(Date distributeDate) {
        this.distributeDate = distributeDate;
    }

    /**
     * call_supplier TINYINT(3)<br>
     * 获得 话务供应商类型 1-讯鸟 2-智言
     */
    public Byte getCallSupplier() {
        return callSupplier;
    }

    /**
     * call_supplier TINYINT(3)<br>
     * 设置 话务供应商类型 1-讯鸟 2-智言
     */
    public void setCallSupplier(Byte callSupplier) {
        this.callSupplier = callSupplier;
    }

    /**
     * agent_id VARCHAR(50)<br>
     * 获得 坐席账号
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * agent_id VARCHAR(50)<br>
     * 设置 坐席账号
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * agent_pwd VARCHAR(50)<br>
     * 获得 登录密码
     */
    public String getAgentPwd() {
        return agentPwd;
    }

    /**
     * agent_pwd VARCHAR(50)<br>
     * 设置 登录密码
     */
    public void setAgentPwd(String agentPwd) {
        this.agentPwd = agentPwd;
    }

    /**
     * bind_phone VARCHAR(20)<br>
     * 获得 绑定手机号
     */
    public String getBindPhone() {
        return bindPhone;
    }

    /**
     * bind_phone VARCHAR(20)<br>
     * 设置 绑定手机号
     */
    public void setBindPhone(String bindPhone) {
        this.bindPhone = bindPhone;
    }

    /**
     * ext_number BIGINT(19)<br>
     * 获得 智言分机号
     */
    public Long getExtNumber() {
        return extNumber;
    }

    /**
     * ext_number BIGINT(19)<br>
     * 设置 智言分机号
     */
    public void setExtNumber(Long extNumber) {
        this.extNumber = extNumber;
    }

    /**
     * wechat_id VARCHAR(50)<br>
     * 获得 微信号
     */
    public String getWechatId() {
        return wechatId;
    }

    /**
     * wechat_id VARCHAR(50)<br>
     * 设置 微信号
     */
    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    /**
     * wechat_pwd VARCHAR(50)<br>
     * 获得 微信密码
     */
    public String getWechatPwd() {
        return wechatPwd;
    }

    /**
     * wechat_pwd VARCHAR(50)<br>
     * 设置 微信密码
     */
    public void setWechatPwd(String wechatPwd) {
        this.wechatPwd = wechatPwd;
    }

    /**
     * ac_account VARCHAR(50)<br>
     * 获得 奥创平台账号
     */
    public String getAcAccount() {
        return acAccount;
    }

    /**
     * ac_account VARCHAR(50)<br>
     * 设置 奥创平台账号
     */
    public void setAcAccount(String acAccount) {
        this.acAccount = acAccount;
    }

    /**
     * ac_password VARCHAR(50)<br>
     * 获得 奥创平台密码
     */
    public String getAcPassword() {
        return acPassword;
    }

    /**
     * ac_password VARCHAR(50)<br>
     * 设置 奥创平台密码
     */
    public void setAcPassword(String acPassword) {
        this.acPassword = acPassword;
    }

    /**
     * qn_id VARCHAR(50)<br>
     * 获得 青牛账号
     */
    public String getQnId() {
        return qnId;
    }

    /**
     * qn_id VARCHAR(50)<br>
     * 设置 青牛账号
     */
    public void setQnId(String qnId) {
        this.qnId = qnId;
    }

    /**
     * qn_password VARCHAR(100)<br>
     * 获得 青牛密码
     */
    public String getQnPassword() {
        return qnPassword;
    }

    /**
     * qn_password VARCHAR(100)<br>
     * 设置 青牛密码
     */
    public void setQnPassword(String qnPassword) {
        this.qnPassword = qnPassword;
    }

    /**
     * qn_phone VARCHAR(50)<br>
     * 获得 青牛账号对应电话
     */
    public String getQnPhone() {
        return qnPhone;
    }

    /**
     * qn_phone VARCHAR(50)<br>
     * 设置 青牛账号对应电话
     */
    public void setQnPhone(String qnPhone) {
        this.qnPhone = qnPhone;
    }

    /**
     * department VARCHAR(10)<br>
     * 获得 所属部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * department VARCHAR(10)<br>
     * 设置 所属部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * level CHAR(1)<br>
     * 获得 坐席等级
     */
    public String getLevel() {
        return level;
    }

    /**
     * level CHAR(1)<br>
     * 设置 坐席等级
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * exam_role VARCHAR(20)<br>
     * 获得 考试角色
     */
    public String getExamRole() {
        return examRole;
    }

    /**
     * exam_role VARCHAR(20)<br>
     * 设置 考试角色
     */
    public void setExamRole(String examRole) {
        this.examRole = examRole;
    }

    /**
     * enable_mobile_version BIT 默认值[0]<br>
     * 获得 是否开通移动账号：1是 0否
     */
    public Boolean getEnableMobileVersion() {
        return enableMobileVersion;
    }

    /**
     * enable_mobile_version BIT 默认值[0]<br>
     * 设置 是否开通移动账号：1是 0否
     */
    public void setEnableMobileVersion(Boolean enableMobileVersion) {
        this.enableMobileVersion = enableMobileVersion;
    }

    /**
     * subao_id VARCHAR(40)<br>
     * 获得 速保出单员ID
     */
    public String getSubaoId() {
        return subaoId;
    }

    /**
     * subao_id VARCHAR(40)<br>
     * 设置 速保出单员ID
     */
    public void setSubaoId(String subaoId) {
        this.subaoId = subaoId;
    }

    /**
     * belong_to VARCHAR(20)<br>
     * 获得 所属产品（众安、非众安）
     */
    public String getBelongTo() {
        return belongTo;
    }

    /**
     * belong_to VARCHAR(20)<br>
     * 设置 所属产品（众安、非众安）
     */
    public void setBelongTo(String belongTo) {
        this.belongTo = belongTo;
    }

    /**
     * last_login_time TIMESTAMP(19)<br>
     * 获得 最新登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * last_login_time TIMESTAMP(19)<br>
     * 设置 最新登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}