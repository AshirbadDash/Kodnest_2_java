package com.kodnest.company;

import java.util.Scanner;

public class MultiplicationTable {

//	 Java program to print table 
	// of a number using recursion

	// Function that print the
	// table of a given number
	// using recursion
	static void mul_table(int N, int i) {
		// Base Case
		if (i > 10)
			return;

		// Print the table for
		// current iteration
		System.out.println(N + " * " + i + " = " + N * i);

		// Recursive call to next
		// iteration
		mul_table(N, i + 1);
	}

	// driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");

		// Input number whose table
		// is to print
		int N = sc.nextInt();

		// Function call to print
		// the table
		mul_table(N, 1);
		sc.close();
	}

}
