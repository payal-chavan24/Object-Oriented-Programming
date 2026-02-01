package com.practicequestion;

//write a method isEven( int n )(parameterized return type boolean )
//that check even, odd
public class CheckEvenOdd {
	public boolean isEven(int n) {
		if (n % 2 == 0) {
			//System.out.println("Even number");
			return true;//if number is even it print true 
		} else {
			//System.out.println("Odd number");
			return false;//if number is odd it print false
		}
	}
}
