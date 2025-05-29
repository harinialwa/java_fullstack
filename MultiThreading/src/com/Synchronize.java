package com;

class Counter {
	private int count = 0;

	public synchronized void increment() {
		count++;
		System.out.println(Thread.currentThread().getName() + " : " + count);
	}

	public int getCount() {
		return count;
	}
}

class MyThread1 extends Thread {
	private Counter counter;

	MyThread1(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			counter.increment();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Synchronize {
	public static void main(String[] args) {
		Counter counter = new Counter();

		MyThread1 t1 = new MyThread1(counter);
		MyThread1 t2 = new MyThread1(counter);

		t1.start();
		t2.start();
	}
}
