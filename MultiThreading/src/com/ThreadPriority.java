package com;

class MyThread2 extends Thread {
	public MyThread2(String name) {
		super(name);
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(getName() + " with priority " + getPriority() + " is running: " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadPriority {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2("Thread-1");
		MyThread2 t2 = new MyThread2("Thread-2");
		MyThread2 t3 = new MyThread2("Thread-3");

		t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
		t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
		t3.setPriority(Thread.MAX_PRIORITY); // Priority 10

		t1.start();
		t2.start();
		t3.start();
	}
}
