package com.thinking;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

/**
 *@Author:caoj
 *@Date:2018/08/16
 *@version:v1.0
 *@Description:
 */
public class RedisClusterTest {
	public static void main(String[] args) {
		
		Set<HostAndPort> clusterNodes = new HashSet<HostAndPort>();
		clusterNodes.add(new HostAndPort("192.168.1.129", 8001));
		clusterNodes.add(new HostAndPort("192.168.1.129", 8002));
		clusterNodes.add(new HostAndPort("192.168.1.129", 8003));
		clusterNodes.add(new HostAndPort("192.168.1.129", 8004));
		clusterNodes.add(new HostAndPort("192.168.1.129", 8005));
		clusterNodes.add(new HostAndPort("192.168.1.129", 8006));
		
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(50);//最大连接个数
		config.setMaxIdle(10);//对打空闲连接数
		config.setMaxWaitMillis(60000);//获取连接时的最大等待毫秒数
		config.setTestOnBorrow(true);//获取连接时检测其有效性
		
		//第二个参数：超时时间         第三个参数：最大尝试重连次数
		JedisCluster cluster = new JedisCluster(clusterNodes, 150000, 100, config);
		
		cluster.set("id", "1000");
		cluster.set("name", "tutu");
		cluster.set("age", "1");
		
		System.out.println(cluster.get("id"));
		System.out.println(cluster.get("name"));
		System.out.println(cluster.get("age"));
		
		try {
			cluster.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
