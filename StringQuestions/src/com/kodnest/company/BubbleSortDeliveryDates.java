package com.kodnest.company;
////wajp to display all the characters separated by space
//
//public class Solution1 {
//	public static void main(String[] args) {
//
//		String s = "Hello";
//		for (int i = 0; i < s.length(); i++) {
//			System.out.print(s.charAt(i) + " ");
//		}
//
//	}
//
//}
//package com;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortDeliveryDates {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] deliveryDates = new int[n];
        System.out.println("Enter the delivery dates separated by spaces:");
        for (int i = 0; i < n; i++) {
            deliveryDates[i] = scanner.nextInt();
        }

        bubbleSort(deliveryDates);

        System.out.println("Sorted delivery dates in ascending order:");
        System.out.println(Arrays.toString(deliveryDates));
    }
}
