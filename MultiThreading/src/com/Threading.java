package com;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread 1: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Threading {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start(); // Starts the new thread

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main thread: " + i);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
