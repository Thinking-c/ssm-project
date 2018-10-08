package com.thinking.timer;

import java.util.Timer;
import java.util.TimerTask;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 *@Author:caoj
 *@Date:2018/09/13
 *@version:v1.0
 *@Description:
 */
public class Task extends TimerTask implements Runnable {
	
	private Timer timer;

	public Task(Timer timer) {
		this.timer = timer;
	}

	@Override
	public void run() {
		System.out.println("-----");
		timer.cancel();
	}

}
