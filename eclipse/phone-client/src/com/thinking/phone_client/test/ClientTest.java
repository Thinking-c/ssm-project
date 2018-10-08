package com.thinking.phone_client.test;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

/**
 *@Author:caoj
 *@Date:2018/08/13
 *@version:v1.0
 *@Description:
 */
public class ClientTest {
	
	public static void main(String[] args) {
		MobileCodeWS factory = new MobileCodeWS();
		MobileCodeWSSoap mobileCodeWSSoap = factory.getMobileCodeWSSoap();
		String mobileCodeInfo = mobileCodeWSSoap.getMobileCodeInfo("15084825778", null);
		System.out.println(mobileCodeInfo);
		System.out.println(mobileCodeInfo.trim());
	}

}
