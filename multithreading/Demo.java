package com.multithreading;

public class Demo extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Hi =" + i);
			try {
				Thread.sleep(500);//sleep () method of class is used paused thread for specafic
			} catch (InterruptedException e) {

			}
		}
	}

	public void m1() {
		for (int i = 101; i <= 200; i++) {
			System.out.println("Hello =" + i);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {

			}
		}
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		// d.run()//if you call run method then multi threading wont happened because we
		// call single thread at time
		d.start();// with the help of start method we create new thread which automatically called
					// run method
		d.m1();

	}

}
