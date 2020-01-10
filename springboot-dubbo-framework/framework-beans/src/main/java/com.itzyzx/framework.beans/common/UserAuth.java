package com.itzyzx.framework.beans.common;

import com.itzyzx.framework.beans.UserDO;

import java.util.List;

/**
 * @CLassName UserAuth
 * @Description: TODO
 * @date: 2020/1/2 16:54
 * @Version 1.0
 */

public class UserAuth  extends UserDO {
	private static final long serialVersionUID=299999933333333L;

	private String smsCode; //短信验证码
	private boolean isCheck=false;
	private int randomCheckErrorNum=0;//验证错误次数
	private int randomSendNum=0;//下发次数
	private String randomSendTime;//下发时间

	private String roomId;//聊天室id
	private String communityId;//小区id
	private String coummunityName;//小区名称
	private String areaId; //渠道Id
	private String areaName; //渠道名称
	private String orgLevel;
	private Long roleId;//角色id

	private List<String> functionNames; //用户可以访问的方法名称

	public String getSmsCode() {
		return smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public boolean isCheck() {
		return isCheck;
	}

	public void setCheck(boolean check) {
		isCheck = check;
	}

	public int getRandomCheckErrorNum() {
		return randomCheckErrorNum;
	}

	public void setRandomCheckErrorNum(int randomCheckErrorNum) {
		this.randomCheckErrorNum = randomCheckErrorNum;
	}

	public int getRandomSendNum() {
		return randomSendNum;
	}

	public void setRandomSendNum(int randomSendNum) {
		this.randomSendNum = randomSendNum;
	}

	public String getRandomSendTime() {
		return randomSendTime;
	}

	public void setRandomSendTime(String randomSendTime) {
		this.randomSendTime = randomSendTime;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getCommunityId() {
		return communityId;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getCoummunityName() {
		return coummunityName;
	}

	public void setCoummunityName(String coummunityName) {
		this.coummunityName = coummunityName;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getOrgLevel() {
		return orgLevel;
	}

	public void setOrgLevel(String orgLevel) {
		this.orgLevel = orgLevel;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public List<String> getFunctionNames() {
		return functionNames;
	}

	public void setFunctionNames(List<String> functionNames) {
		this.functionNames = functionNames;
	}
}
