package com.thinking.thread;

public class ThreadTest {
	private static Object lock = new Object();

	public static void main(String[] args) {

		Thread t1 = new Thread(ThreadTest::print);
		Thread t2 = new Thread(ThreadTest::print);
		t1.start();
		t2.start();

		Print1 print1 = new Print1(0);
		Print1 print2 = new Print1(1);

		new Thread(print1, "p1").start();
		new Thread(print2, "p2").start();

//		while (Thread.activeCount() > 1);
//		System.out.println("Done!");

	}

	private static void print() {
		synchronized (lock) {
			for (int i = 0; i < 10; i++) {

				lock.notifyAll();
				System.out.println(i);

				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		}
	}

}

class Print1 implements Runnable {

	private static Object lock = new Object();
	private int id;
	private volatile static int i = 0;

	public Print1(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		synchronized (lock) {
			while (i < 10) {
				if (i % 2 == id) {
					System.out.println("[" + Thread.currentThread().getName() + "]" + i);
					lock.notifyAll();
//					lock.notify();
					i++;
				} else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}

	}

}
