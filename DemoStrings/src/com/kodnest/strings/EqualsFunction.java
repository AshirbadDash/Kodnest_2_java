package com.kodnest.strings;

public class EqualsFunction {
	public static void main(String[] args) {

		String s1 = "java";
		String s2 = new String("java");
		String s3 = "java";
		String s4 = s1;
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));

	}
}