package com.kodnest.demoexception;

public class DemoExp_2 {
	public static void main(String[] args) {
		
		try {
			System.out.println(3/0);
			
		} catch (Exception e) {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		finally {
			
		}

	}

}
//	try ,finally --> possible
// try ,multiple catchBlock ,finally -->possible
// try alone is not possible
// try without catch possible
// catch without try not possible
//// catch alone not possible
// catch,finally -->not possible
// try->finally->catch -->not possible
// catch always comes with try
// removing catch we can interchange with finally
