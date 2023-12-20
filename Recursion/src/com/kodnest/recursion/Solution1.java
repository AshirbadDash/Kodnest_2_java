package com.kodnest.recursion;

public class Solution1 {
	public static void main(String[] args) {

		System.out.println(sum(3, 1));
		print();
	}

	static int sum(int a, int b) {
		int ans = a + b;
		return ans;

	}

	static void print() {
		System.out.println("hello");
		return;
	}
}
