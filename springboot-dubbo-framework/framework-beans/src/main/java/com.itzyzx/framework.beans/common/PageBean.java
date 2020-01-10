package com.itzyzx.framework.beans.common;

import com.github.pagehelper.Page;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.List;

/**
 * @CLassName PageBean
 * @Description: TODO
 * @date: 2020/1/2 16:09
 * @Version 1.0
 */
public class PageBean<T> implements Serializable {

	private static final long serialVersionUID=1L;
	private long total;         //总记录数
	private List<T> list;        //结果页
	private int pageNum; 		//第几页
	private int pageSize;		//每页记录数
	private int pages;          //总页数
	private int size;           //当前页数 <=pageSize,该属性来自ArrayList的size属性


	/**
	 * @Description 包装Page对象，因为直接返回Page对象，在JSON处理以及其它情况下会被当成List来处理，
	 * 而出现一些问题。
	 * @Param  list
	 * @return  page
	 **/
	public PageBean(List<T> list){
		if(list instanceof Page){
			Page<T> page=(Page<T>) list;
			this.pageNum=page.getPageNum();
			this.pageSize=page.getPageSize();
			this.total=page.getTotal();
			this.pages=page.getPages();
			this.list=page;
			this.size=page.size();
		}
	}

	public PageBean(){}


	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
