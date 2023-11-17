package com.kodnest.company;

public class MultiplesOfArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 15 };
		System.out.println("Multipls of 5:-");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 5 == 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Multipls of 3:-");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Multipls of 3 and 5:-");
		for (int i = 0; i < a.length; i++) {
			if ((a[i] % 3 == 0) & (a[i] % 5 == 0)) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Multipls of 3 or 5:-");
		for (int i = 0; i < a.length; i++) {
			if ((a[i] % 3 == 0) || (a[i] % 5 == 0)) {
				System.out.println(a[i]);
			}
		}
	}

}