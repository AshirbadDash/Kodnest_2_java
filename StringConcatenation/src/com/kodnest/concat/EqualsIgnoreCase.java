package com.kodnest.concat;

public class EqualsIgnoreCase {
	public static void main(String[] args) {

		String s1 = new String("java");
		String s2 = new String("Java");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

	}
}
