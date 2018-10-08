package com.thinking.lock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.xml.transform.Source;

/**
 * @Author:caoj
 * @Date:2018/08/06
 * @version:v1.0
 * @Description:
 */

public class ReentrantLockTest {

	private static ArrayList<Integer> arrayList = new ArrayList<>();
	private static CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList<>();

	private Lock lock = new ReentrantLock();
	
	public ReentrantLockTest() {
		
	}

	public static void main(String[] args) {
		ReentrantLockTest lockTest = new ReentrantLockTest();
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
		
		//java.util.ConcurrentModificationException
//		Iterator<Integer> iterator = arrayList.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		Iterator<Integer> iterator = copyOnWriteArrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

	public void insert(Thread thread) {
		
		try {
			thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		lock.lock();
		try {
			System.out.println(thread.getName() + "得到了锁");
			for(int i = 0; i < 5; i++) {
//				arrayList.add(i);
				copyOnWriteArrayList.add(i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println(thread.getName() + "释放了锁");
			lock.unlock();
		}
	}

}
