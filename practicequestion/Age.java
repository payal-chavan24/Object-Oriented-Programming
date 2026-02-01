package com.practicequestion;
//create two constructor (constructor overloading) :
//Default-> age=18
//parameterized-> set age from user
//print both
public class Age {
	int age;
	
Age(){
  age=18;
  System.out.println("Default constructor="+age);
}
Age(int age){
	this.age=age;
	System.out.println("Parameterized constructor ="+this.age);
}
public void displayAge() {
	System.out.println("Age ="+age);
}


}
