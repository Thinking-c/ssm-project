package com.thinking.mybatis.mapper;

import java.util.List;

import com.thinking.mybatis.pojo.Orders;
import com.thinking.mybatis.pojo.User;

/**
 * @Author:caoj
 * @Date:2018/09/20
 * @version:v1.0
 * @Description:
 */
public interface OrderMapper {

	// 查询所有订单
	public List<Orders> findAllOrders();

	// 一对一关联查询，已订单为中心，关联用户
	public List<Orders> findOrders();

	// 一对多关联查询，已用户为中心，关联订单
	public List<User> findUsers();

}
