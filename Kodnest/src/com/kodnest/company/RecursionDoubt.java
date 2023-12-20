package com.kodnest.company;

public class RecursionDoubt {
	public static void main(String[] args) {
		int n = 5;
		printIncreasing(n);

	}

	static void printIncreasing(int n) {
		if (n == 1) {
			System.out.println(1);
			return;
		}
		printIncreasing(n - 1);
		System.out.println(n);
	}

}
