package com.vengat.java.objectorientation;
/*
 * Method overloading can have same method name but differ in parameter or return type
 */

public class My03_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(5, 5);
		add(5.5, 5.5);

	}
	
	static void add(int a, int b) {
		System.out.println("Sum of A & B is "+ (a+b) );
	}
	static void add(double a, double b) {
		System.out.println("Sum of A & B is "+ (a+b) );
	}

}
