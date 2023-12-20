package com.kodnest.company;

public class BaseCondition {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("1");
		fact(n);
		System.out.println("2");
	}

	public static void fact(int n) {
		System.out.println("3");
		if (n == 0) {
			System.out.println("4");
			return;
		} // base condition
		System.out.println("Executing!" + n);
		n--;
		System.out.println("5");
		fact(n);
//		System.out.println("6");
	}
}
