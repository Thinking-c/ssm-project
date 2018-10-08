package com.thinking.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 *@Author:caoj
 *@Date:2018/09/13
 *@version:v1.0
 *@Description:
 */
public class TimerTest {
	
	public static void main(String[] args) {
		
		int n = 1;
		Timer timer = new Timer();
		timer.schedule(new Task(timer),n * 150);
		
	}
	
}
