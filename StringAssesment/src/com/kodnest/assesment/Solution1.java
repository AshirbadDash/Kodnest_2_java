package com.kodnest.assesment;

import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();

		}

		bubbleSort(arr);
		System.out.print("Sorted array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
