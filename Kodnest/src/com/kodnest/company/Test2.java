/*package whatever //do not write package name here */
package com.kodnest.company;

import java.util.Scanner;

class Test2 {
	/* function to find table of number */
	static void table(int no) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * no + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Table of 6=");
		table(6);// calling function
		System.out.println("\nTable of 5=");
		table(5);// calling function
	}
}
