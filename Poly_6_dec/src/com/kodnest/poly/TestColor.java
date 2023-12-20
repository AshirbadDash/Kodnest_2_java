package com.kodnest.poly;

public class TestColor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Color color = new Color();
//		Color c;
//		c = new Red();
//		c = new Orange();
//
//		c.display();
//		c.display();

//		Color c = new Red(); // upcasting
//		Color c2 = new Orange();// upcasting
//
//		c.display();
//		c2.display();

		Color c = new Red();
		Color c2 = new Orange();
		c.display();
		((Red) c).RedDisplay(); // downcasting
		((Orange) c2).OrangeDisplay();
		c2.display();

	}
}
