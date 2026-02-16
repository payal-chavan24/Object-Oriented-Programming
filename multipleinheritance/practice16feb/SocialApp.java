package com.practice16feb;

public class SocialApp implements ReelFeature, ChatFeature {

	@Override
	public void sendMessage() {
		System.out.println("Sending message...!");

	}

	@Override
	public void uploadReel() {
		System.out.println("Uploading reels..!");

	}

	public static void main(String[] args) {
		SocialApp s = new SocialApp();
		s.sendMessage();
		s.uploadReel();
	}

}
