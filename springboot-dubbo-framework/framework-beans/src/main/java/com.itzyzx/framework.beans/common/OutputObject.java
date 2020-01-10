package com.itzyzx.framework.beans.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @CLassName OutputObject
 * @Description: 统一出参数据类型
 * @date: 2020/1/2 15:34
 * @Version 1.0
 */
public class OutputObject  implements Serializable {
	private static final long servialVersionUID=3862163719814236067L;
	private String returnCode;
	private String returnMessage;
	/**时间戳防止加密内容一致*/
	private String timeStamp;
	private Map<String,String> bean;
	private Map<String,Object> images;

	private Map<String,Object> ext1;
	private List<Map<String,String>> beans;
	private List<Map<String,Object>> ext2;

	public OutputObject(){
		this.bean=new HashMap<String, String>();
		this.returnMessage="success";
		this.returnCode="0000";
		this.beans=new ArrayList<Map<String, String>>();
		this.ext1=new HashMap<String, Object>();
		this.ext2=new ArrayList<Map<String, Object>>();
		this.timeStamp=String.valueOf(System.currentTimeMillis());
	}

	public OutputObject(String returnCode,String returnMessage){
		this.bean=new HashMap<String, String>();
		this.returnCode=returnCode;
		this.returnMessage=returnMessage;
		this.timeStamp=String.valueOf(System.currentTimeMillis());
	}



	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Map<String, String> getBean() {
		return bean;
	}

	public void setBean(Map<String, String> bean) {
		this.bean = bean;
	}

	public Map<String, Object> getImages() {
		return images;
	}

	public void setImages(Map<String, Object> images) {
		this.images = images;
	}

	public Map<String, Object> getExt1() {
		return ext1;
	}

	public void setExt1(Map<String, Object> ext1) {
		this.ext1 = ext1;
	}

	public List<Map<String, String>> getBeans() {
		return beans;
	}

	public void setBeans(List<Map<String, String>> beans) {
		this.beans = beans;
	}

	public List<Map<String, Object>> getExt2() {
		return ext2;
	}

	public void setExt2(List<Map<String, Object>> ext2) {
		this.ext2 = ext2;
	}
}
