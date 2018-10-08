package com.thinking.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author:caoj
 * @Date:2018/08/06
 * @version:v1.0
 * @Description:
 */
public class ReentrantReadWriteLockTest {

	private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	

	public ReentrantReadWriteLockTest() {

	}

	public static void main(String[] args) {

		ReentrantReadWriteLockTest lockTest = new ReentrantReadWriteLockTest();
		new Thread() {
			public void run() {
				lockTest.insert(Thread.currentThread());
			};
		}.start();
		
		new Thread() {
			public void run() {
				lockTest.insert(Thread.currentThread());
			};
		}.start();

	}

	public void insert(Thread thread) {
		
		rwl.readLock().lock();
		try {
			for (int i = 0; i < 50; i++) {
				System.out.println(thread.getName() + "正在进行读操作");
			}
		} finally {
			System.out.println(thread.getName() + "释放了读锁");
			rwl.readLock().unlock();
		}
	}

}
