package com.itzyzx.framework.beans;

import com.itzyzx.framework.beans.common.PageBean;

import java.util.Date;

/**
 * @CLassName UseDO
 * @Description: TODO
 * @date: 2020/1/2 15:33
 * @Version 1.0
 */
public class UserDO extends PageBean<UserDO> {
	/**
	 * 主键ID
	 **/
	private Long userId;

	/**
	 * 账户
	 */
	private String userAcct;
	/**
	 * 密码（加密）
	 **/
	private String userPwd;
	/**
	 * 真实姓名
	 */
	private String realName;
	/**
	 * 身份证号
	 */
	private String idCard;
	/**
	 * 手机号
	 **/
	private String mobile;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 0:男，1：女
	 **/
	private String gender;
	/**
	 * 头像地址
	 */
	private String avatar;
	/**
	 * 组织id
	 */
	private Long orgId;
	/**
	 * 1超管； 2子管理
	 */
	private String userType;

	/**
	 * 密码更新时间
	 */
	private Date passwordUpdateTime;
	/**
	 * 最后登录时间
	 */
	private Date lastLoginTime;

	/**
	 * 登录次数
	 */
	private Integer loginCount;
	/**
	 * im账户密码
	 */
	private String imPwd;

	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 0:已删除  1： 启用   2：禁用
	 */
	private String validFlag;
	private Date createTime;
	private Date updateTime;
	private String creator;
	private String updater;
	private String sysId;
	private Long parentOrgId;//上级组织id

	private static final long serialVersionUID=1L;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserAcct() {
		return userAcct;
	}

	public void setUserAcct(String userAcct) {
		this.userAcct = userAcct;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getPasswordUpdateTime() {
		return passwordUpdateTime;
	}

	public void setPasswordUpdateTime(Date passwordUpdateTime) {
		this.passwordUpdateTime = passwordUpdateTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	public String getImPwd() {
		return imPwd;
	}

	public void setImPwd(String imPwd) {
		this.imPwd = imPwd;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public Long getParentOrgId() {
		return parentOrgId;
	}

	public void setParentOrgId(Long parentOrgId) {
		this.parentOrgId = parentOrgId;
	}
}
