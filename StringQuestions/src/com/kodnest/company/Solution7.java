package com.kodnest.company;

//write a java program to convert a string to an array and display array elements 

public class Solution7 {
	public static void main(String[] args) {
		String s = "programming";

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}

}
