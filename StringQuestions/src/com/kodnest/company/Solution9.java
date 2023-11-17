package com.kodnest.company;
//convert mutable to immutable string

public class Solution9 {
	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("hello");
		String str = new String(s);
		System.out.println(str);
	}

}
