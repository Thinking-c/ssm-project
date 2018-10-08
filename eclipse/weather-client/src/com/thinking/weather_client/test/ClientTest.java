package com.thinking.weather_client.test;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

/**
 *@Author:caoj
 *@Date:2018/08/13
 *@version:v1.0
 *@Description:
 */
public class ClientTest {
	
	public static void main(String[] args) {
		
		WeatherWS weatherWS = new WeatherWS();
		WeatherWSSoap weatherWSSoap = weatherWS.getWeatherWSSoap();
		ArrayOfString weather = weatherWSSoap.getWeather("上海", "");
		List<String> list = weather.getString();
		System.out.println(list.size());
		System.out.println("------------------------------");
		for(String s : list) {			
			System.out.println(s);
		}
	}

}
