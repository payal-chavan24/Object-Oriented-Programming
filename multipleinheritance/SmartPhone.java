package com.multipleinheritance;

public class SmartPhone implements Camera, MusicPlayer {

	@Override
	public void takePhoto() {
		System.out.println("Taking photos from camera");

	}

	@Override
	public void playMusic() {
		System.out.println("listening music");

	}
}