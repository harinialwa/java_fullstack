package com;

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Runnable Thread: " + i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Threading2 {
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main thread: " + i);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
