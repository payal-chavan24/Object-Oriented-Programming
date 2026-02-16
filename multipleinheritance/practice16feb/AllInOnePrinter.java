package com.practice16feb;

public class AllInOnePrinter implements Printer, Scanner {

	@Override
	public void scan() {
		System.out.println("taking input from users");

	}

	@Override
	public void print() {
		System.out.println("Print statments");
	}

	public static void main(String[] args) {
		AllInOnePrinter a = new AllInOnePrinter();
		a.print();
		a.scan();
	}

}
