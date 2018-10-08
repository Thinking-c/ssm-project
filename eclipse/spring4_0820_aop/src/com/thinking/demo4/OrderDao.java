package com.thinking.demo4;

/**
 * @Author:caoj
 * @Date:2018/08/20
 * @version:v1.0
 * @Description:
 */
public class OrderDao {

	public void save() {
		System.out.println("保存订单...");
	}

	public String update() {
		System.out.println("修改订单...");
		return "success";
	}

	public void find() {
		System.out.println("查询订单...");
//		int i = 1 / 0;
	}

	public String delete() {
		System.out.println("删除订单...");
		return "success";
	}

}
