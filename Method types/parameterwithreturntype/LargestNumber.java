package com.parameterwithreturntype;
//9. Write a method to return the largest of three numbers.
public class LargestNumber {
public String printLargestNum(int a,int b,int c) {
	if(a>b&&a>c) {
		return a+" Is largest";
	}else if (b>a&&b>c) {
		return b+" Is largest";
	}else {
		return c+" Is largest";
	}
}
}
