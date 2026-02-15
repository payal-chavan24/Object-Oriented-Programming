package com.multipleinheritance;

//✅ 5. Advanced Practical Question
//Create:
//Interface Camera → method takePhoto()
//Interface MusicPlayer → method playMusic()
//Class SmartPhone implements both
//In main:
//Create object using reference of one interface
//Call method
//Then downcast and call other interface method
public interface Camera {
	public abstract void takePhoto();
}
