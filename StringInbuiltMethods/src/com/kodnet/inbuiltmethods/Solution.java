package com.kodnet.inbuiltmethods;

public class Solution {
	public static void main(String[] args) {

		String str = new String("JavaProgram");
//		System.out.println(str.length());//7 
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
		System.out.println(str.substring(7));// gram
		System.out.println(str.substring(2, 7));// vaPro
		String newStr1 = str.replace('a', 'A');
		System.out.println(newStr1);
		String newStr2 = str.replace("ava", "AVA");
		System.out.println(newStr2);
		
		
	}

}
