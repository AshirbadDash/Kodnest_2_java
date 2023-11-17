package com.kodnest.company;

public class EvenOddElements_EvenOddIndex {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println("The even elements are:-");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("The odd elements are:-");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("The Even index elements are:-");
		for (int i = 0; i < a.length; i++) {
			if ((a[i] % 2 == 1) || (a[i] % 2 != 0)) {
				System.out.println(a[i]);
			}
		}
		System.out.println("The odd index elements are:-");
		for (int i = 0; i < a.length; i++) {
			if ((a[i] % 2 == 0) || (a[i] % 2 != 1)) {
				System.out.println(a[i]);
			}
		}

	}
}