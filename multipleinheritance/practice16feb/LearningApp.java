package com.practice16feb;

public class LearningApp implements VideoCourse, TestSeries {

	@Override
	public void attemptTest() {
		System.out.println("appearing test ");

	}

	@Override
	public void watchVideo() {
		System.out.println("video editing learning");

	}

	public static void main(String[] args) {
		LearningApp l = new LearningApp();
		l.attemptTest();
		l.watchVideo();
	}

}
