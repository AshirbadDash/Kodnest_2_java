package com.kodnest.poly;

class Parent {
	static void display() {
		System.out.println("1");
	}

	void display1() {

	}
}

class Child extends Parent {
//	void display() {
//		System.out.println("2");
//	} instance method can be overrided but the 
//	static method canned be overrided that is called as method overriding

	void display1() {
		System.out.println("2");
	}
}

public class Main {
//	Parent obj1 =new Parent();
	Parent obj2 =new Child();
//	Child obj3 =new Child();
	
//	obj1.display();
//	obj2.display();
	
//	obj3.display();
	

}
