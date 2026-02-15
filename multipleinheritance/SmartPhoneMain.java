package com.multipleinheritance;

public class SmartPhoneMain {
	public static void main(String args[]) {
		Camera c = new SmartPhone();
		c.takePhoto();
		// c.playMusic not allowed
		SmartPhone s = (SmartPhone) c;// downcasting
		s.playMusic();
	}
}
