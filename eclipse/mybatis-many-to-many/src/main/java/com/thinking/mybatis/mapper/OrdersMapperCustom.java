package com.thinking.mybatis.mapper;

import java.util.List;

import com.thinking.mybatis.pojo.User;

/**
 * @Author:caoj
 * @Date:2018/09/20
 * @version:v1.0
 * @Description:
 */
public interface OrdersMapperCustom {

	public List<User> findUserAndItemsResultMap() throws Exception;

}
