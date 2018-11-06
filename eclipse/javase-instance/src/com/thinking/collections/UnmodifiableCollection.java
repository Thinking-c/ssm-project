package com.thinking.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *@Author:caoj
 *@Date:2018/08/08
 *@version:v1.0
 *@Description:
 */
public class UnmodifiableCollection {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List list = Collections.emptyList();
		System.out.println(list);
		
		//java.lang.UnsupportedOperationException
//		list.add("333");
		
		
	}

}
