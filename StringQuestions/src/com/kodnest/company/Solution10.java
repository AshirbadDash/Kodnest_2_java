package com.kodnest.company;
//convert immutable to mutable string

public class Solution10 {
	public static void main(String[] args) {

		String str = new String("hello");
		StringBuffer s = new StringBuffer(str);
		System.out.println(str);
		
	}

}
