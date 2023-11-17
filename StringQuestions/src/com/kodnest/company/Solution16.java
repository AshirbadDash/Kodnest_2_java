package com.kodnest.company;

import java.util.Scanner;
//wajp to read a sentence and display the same 

public class Solution16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User ! please enter the sentence to be displayed");
		String s = sc.nextLine();

		System.out.println(s);
		sc.close();

	}

}
