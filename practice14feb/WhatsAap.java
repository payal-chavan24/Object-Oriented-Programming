package com.practice14feb;

public class WhatsAap implements Meta {

	@Override
	public void metaDetails() {
		System.out.println("this is WhatsAap meta....!");
	}

}

class Facebook implements Meta {
	@Override
	public void metaDetails() {
		System.out.println("this is Facebook meta....!");
	}

}