package com.kodnest.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		binarySearch();

	}

	public static void binarySearch() {

		Scanner scan = new Scanner(System.in);

		System.out.println("User! please enter the size of the Array");

		int size = scan.nextInt();
		int[] a = new int[size];

		System.out.println("Enter the Elements of array ");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
			Arrays.sort(a);

			System.out.println("Enter the Element to be searched");
			int ele = scan.nextInt();
			int low = 0;
			int high = 5;
			int mid;
			int flag = 0;

			while (low <= high) {

				mid = (low + high) / 2;
				if (a[mid] == ele) {
					System.out.println("Element found");
					flag++;
					break;

				} else if (ele > a[mid]) {
					low = mid + 1;

				} else {
					high = mid - 1;
				}

			}
			if (flag == 0) {

				System.out.println("Element not Found");
			}
			scan.close();
		}
	}

}
