package com.kodnest.company;

public class InfiniteRecursion {
	public static void main(String[] args) {
		fact();
	}

	public static void fact() {
		System.out.println("Executing!");
		fact();
	}
}
