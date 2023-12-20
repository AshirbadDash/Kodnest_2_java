package com.kodnest.demoexception;

import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) {

		int oripin = 5769;
		int balance = 15000;
		int pin = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bank app started");
		System.out.println("Enter the pin below");
		try {// the risky code may lead to exception

			pin = sc.nextInt();
			if (pin == oripin) {
				System.out.println("Current Balance: " + balance);
			}
		}

		catch (Exception e) { // resolution of exception
			System.out.println("Enter the PIN in Digits: " + "12xx");
		}

		finally { // the code need to be run irrespective of
//			weather the exception is being generated or
//			not or either the exception being caught or not
			sc.close();
			System.out.println("Bank app terminated");
		}
	}

}
