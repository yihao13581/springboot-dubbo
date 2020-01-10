package com.itzyzx.framework.util;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.apache.http.*;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @CLassName HttpUtil
 * @Description: http工具类
 * @Version 1.0
 */
public class HttpUtil {

	private static final CloseableHttpClient httpClient = HttpClients.createDefault();

	/**
	 * 发送HttpGet请求
	 */
	public static String sendGet(String url) {
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse response = null;
		try {
			response = httpClient.execute(httpGet);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		String result = null;
		try {
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				result = EntityUtils.toString(entity);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * @return java.lang.String
	 * @Description //发送HttpPost请求，参数为map
	 * @Param [url, map]
	 **/
	public static String sendPost(String url, Map<String, String> map) {
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			formparams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, Consts.UTF_8);
		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(entity);
		CloseableHttpResponse response = null;
		try {
			response = httpClient.execute(httpPost);
		} catch (IOException e) {
			e.printStackTrace();
		}
		HttpEntity entity1 = response.getEntity();
		String result = null;
		try {
			result = EntityUtils.toString(entity1);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * @return java.lang.String
	 * @Description 发送HTTP post请求 参数为String
	 * @Param [url, para]
	 **/
	public static String sendPost(String url, String para) {
		HttpPost httpPost = new HttpPost(url);
		httpPost.setHeader("Content-Type", "application/json:charset=UTF-8");
		StringEntity stringEntity = new StringEntity(para, Charset.forName("UTF-8"));
		stringEntity.setContentEncoding("UTF-8");
		stringEntity.setContentType("application/json");
		httpPost.setEntity(stringEntity);
		try {
			HttpResponse httpResponse = httpClient.execute(httpPost);
			String response = EntityUtils.toString(httpResponse.getEntity());
			return response;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			httpPost.releaseConnection();
		}
		return null;
	}

	/**
	 * 发送不带参数的HttpPost请求
	 */
	public static String sendPost(String url) {
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpResponse response = null;
		try {
			response = httpClient.execute(httpPost);
		} catch (IOException e) {
			e.printStackTrace();
		}
		HttpEntity entity = response.getEntity();
		String result = null;
		try {
			result =EntityUtils.toString(entity);
		} catch (ParseException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
