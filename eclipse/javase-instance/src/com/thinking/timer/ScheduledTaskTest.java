package com.thinking.timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @Author:caoj
 * @Date:2018/08/28
 * @version:v1.0
 * @Description:
 */
public class ScheduledTaskTest {

	private static ScheduledExecutorService exec = Executors.newScheduledThreadPool(2);

	public static void main(String[] args) {
		ScheduledFuture<?> scheduledTest1 = scheduledTest1();
		ScheduledFuture<?> scheduledTest2 = scheduledTest2();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		scheduledTest1.cancel(true);
		scheduledTest3();
		
		System.out.println(String.valueOf(System.currentTimeMillis()));

	}

	public static ScheduledFuture<?> scheduledTest1() {

		ScheduledFuture<?> scheduleWithFixedDelay = exec.scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				System.out.println("scheduled1 task start......");
			}
		}, 5, 5, TimeUnit.SECONDS);
		return scheduleWithFixedDelay;
	}

	public static ScheduledFuture<?> scheduledTest2() {

		ScheduledFuture<?> scheduleWithFixedDelay = exec.scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				System.out.println("scheduled2 task start......");
			}
		}, 5, 5, TimeUnit.SECONDS);
		return scheduleWithFixedDelay;
	}

	public static ScheduledFuture<?> scheduledTest3() {

		ScheduledFuture<?> scheduleWithFixedDelay = exec.scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				System.out.println("scheduled3 task start......");
			}
		}, 5, 5, TimeUnit.SECONDS);
		return scheduleWithFixedDelay;
	}

}
