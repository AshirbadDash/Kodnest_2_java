package com.kodnest.recursion;

import java.util.Scanner;
//wajp to print all natural numbers from 1 to n using recursion

public class Solution2 {

	static void printIncreasing(int n) {// 1,2,.....n-1,n
		if (n == 1) {
			System.out.println(n);
			return;
		}

		printIncreasing(n - 1);// 1,2,3..n-1
		System.out.println(n);
	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printIncreasing(n);

		sc.close();
	}
}
