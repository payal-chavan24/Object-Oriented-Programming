package com.practice16feb;

public class SmartPhone implements Camera, MusicPlayer {

	@Override
	public void playMusic() {
		System.out.println("playing music...!");

	}

	@Override
	public void takePhoto() {
		System.out.println("Taking photo from camera ");

	}

}
