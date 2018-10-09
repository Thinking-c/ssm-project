package com.thinking.thread;

/**
 * @Author:caoj
 * @Date:2018/09/19
 * @version:v1.0
 * @Description:
 */
public class PrintOneTwoThree {

	/**
	 * 三个线程，分别打印A、B、C，要求按ABC的顺序循环打印10次
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Print p1 = new Print(0);
		Print p2 = new Print(1);
		Print p3 = new Print(2);

		new Thread(p1, "p1").start();
		new Thread(p2, "p2").start();
		new Thread(p3, "p3").start();

		while (Thread.activeCount() > 1);
		System.out.println("Done!");
	}
}

class Print implements Runnable {
	private static int state = 0;
	private int id;
	private static Object lock = new Object();

	public Print(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		synchronized (lock) {
			while (state < 30) {
				if (state % 3 == id) {
					switch (id) {
					case 0:
						System.out.println("[" + Thread.currentThread().getName() + "]" + "A");
						break;
					case 1:
						System.out.println("[" + Thread.currentThread().getName() + "]" + "B");
						break;
					case 2:
						System.out.println("[" + Thread.currentThread().getName() + "]" + "C");
						break;
					default:
						break;
					}
					state++;
					lock.notifyAll();
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
