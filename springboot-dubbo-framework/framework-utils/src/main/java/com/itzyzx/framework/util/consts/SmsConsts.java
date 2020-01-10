package com.itzyzx.framework.util.consts;

/**
 * @CLassName SmsConsts
 * @Description: 短信常量
 * @date: 2020/1/3 14:51
 * @Version 1.0
 */
public interface SmsConsts {
	String SMS_CODE_TIME_OUT="15"; //短信失效时间 15分钟
	String LOGIN_TEMPLATE_ID="30096"; //登录短信模板id
	String CREATE_MANAGER_USER_TEMPLATE_ID="30097"; //创建管理员和子管理员账号的短信通知模板id
	String REST_MANAGER_USER_TEMPLATE_ID="30098"; //重置超管和子管密码的短信通知模板id
	String ADD_DEVICE_TEMPLATE_ID="30099"; //新增门禁短信模板id
    String UPDATE_DEVICE_RESET_PSWD_TEMPLATE_ID="30100";//编辑门禁重置密码短信模板id

}
