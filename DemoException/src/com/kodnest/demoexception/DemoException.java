package com.kodnest.demoexception;

public class DemoException {
	public static void main(String[] args) {

		try {

			int a = 10;
			int b = 12;

			int sum = a / b;

			System.out.println(sum);

		} catch (Exception e) {
			System.out.println("Division by zero \n "+" please enter the +ve number");
//			System.out.println(e);

		}

	}

}
