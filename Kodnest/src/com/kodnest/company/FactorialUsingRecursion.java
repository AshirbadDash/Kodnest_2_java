package com.kodnest.company;

public class FactorialUsingRecursion {
	static int factorial(int n) {// n=4
		// base case
		if (n == 0) {
			return 1;
		} // smaller problem -recursive work
			// big problem -self work
		int smallAns = factorial(n - 1);// factorial(4)=24

		int ans = n * smallAns;// n*factorial(n-1)
		return ans;
	}

	public static void main(String[] args) {

		System.out.println(factorial(4));
	}

}