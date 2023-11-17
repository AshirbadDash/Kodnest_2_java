package com.kodnest.company;

import java.util.Scanner;

public class EmployeeObject {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Employee array of size 3
		Employee[] a = new Employee[3];

		System.out.println("Enter the Employee details");
		System.out.println("---------------------------");
		int j = 1;
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Enter Employee-" + (j) + " Name");
			String name = scan.next();
			System.out.println("Enter Employee Age-" + (j) + " Age");
			int age = scan.nextInt();
			a[i] = new Employee(name, age);
			j++;
//			a[i].name = scan.nextLine();
//			a[i].age = scan.nextInt();
		}
		System.out.println("---------------------------");
		System.out.println("Employee Details are");
		for (int i = 0; i <= a.length - 1; i++) {

			System.out.println(a[i].name + "-" + a[i].age);
			System.out.println();
		}
		scan.close();

	}
}

class Employee {

	String name;
	int age;

	// constructor with 2 parameters
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
//
//		static void work() {
//			System.out.println("The Employee is working");
//		}
//
//		static void sleep() {
//			System.out.println("The Employee is sleeping");
//		}
