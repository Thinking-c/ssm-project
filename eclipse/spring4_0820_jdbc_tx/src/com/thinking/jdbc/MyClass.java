package com.thinking.jdbc;
/**
 *@Author:caoj
 *@Date:2018/08/22
 *@version:v1.0
 *@Description:
 */

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class MyClass {
	
	//select count(库存号) form tmp where 库存号 not in((select 库存号 from a as a, b as b where a.库存号 = b.库存号) as tmp)

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(6);
		list.add(81);
		list.add(23);
		list.add(45);
		list.add(12);
		list.add(19);
		list.add(38);
		int count = multiple(list);
		System.out.println(count);
	}

	public static int multiple(List<Integer> list) {

		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				if ((list.get(i) + list.get(j + 1)) % 10 == 0) {
					count++;
				}
			}

		}
		return count / 2;
	}

}
