package com.multithreading;

public class Method extends Thread {
//	public void run() {
//		System.out.println(Thread.currentThread().getName());//return the thread name
//	}
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		Method m=new Method();
		//m.setName("MethodPractice");//set thread name
		//m.start();
		System.out.println(m.isAlive());//false because thread is not running
		m.start();
        System.out.println(m.isAlive());//true because thread is running
//		m.start();
	}

}
