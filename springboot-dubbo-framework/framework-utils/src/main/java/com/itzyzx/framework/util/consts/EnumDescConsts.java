package com.itzyzx.framework.util.consts;

import java.util.HashMap;
import java.util.Map;

/**
 * @CLassName EnumDescConsts
 * @Description: TODO
 * @date: 2020/1/2 17:37
 * @Version 1.0
 */
public class EnumDescConsts {
	/**
	 * 人员类型
	 */
	public static final Map<String,String> prsnTypeCdMap=new HashMap<String, String>(){
		{
			put("1","业主");
			put("2","业主成员");
			put("3","租户");
		}
	};

	/**
	 * 开门记录-----人员类型
	 */
	public static final Map<String,String> prsnTypeMap=new HashMap<String, String>(){
		{
			put("1","业主");
			put("2","业主成员");
			put("3","租户");
			put("4","小区管理员");
		}
	};
}
