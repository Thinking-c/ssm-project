package com.thinking.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * @Author:caoj
 * @Date:2018/08/28
 * @version:v1.0
 * @Description:
 */
public class Demo {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String updateTime = sdf.format(new Date());

		System.out.println(updateTime);
		System.out.println(String.valueOf(System.currentTimeMillis() / 1000));
	}

	@Test
	public void test1() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd 24:00:00");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date today = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.add(c.DATE, -1);
		
		String format = sdf.format(c.getTime());
		String format1 = sdf1.format(c.getTime());
		
		System.out.println(format);
		System.out.println(format1);
		
		try {
			Date parse = sdf2.parse(format);
			Date parse1 = sdf2.parse(format1);	
			System.out.println(parse);
			System.out.println(parse1);
			System.out.println(new Date());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
