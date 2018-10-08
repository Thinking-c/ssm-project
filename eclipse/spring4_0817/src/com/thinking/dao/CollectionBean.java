package com.thinking.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *@Author:caoj
 *@Date:2018/08/18
 *@version:v1.0
 *@Description:集合属性的注入
 */
public class CollectionBean {
	
	private String[] arrs;
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;

	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "CollectionBean [arrs=" + Arrays.toString(arrs) + ", list=" + list + ", set=" + set + ", map=" + map
				+ "]";
	}	

}
