package com.vengat.java.basics;

public class My16_MethodsReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = addNumber(10, 20, 30);
		System.out.println("Result : "+answer);
		
		addNumbers(20, 30, 40);
		

	}
	
	public static int addNumber(int a, int b, int c) {
		return a+b+c;
	}
	public static void addNumbers(int a, int b, int c) {
		System.out.println("Addition of three numbers : "+ (a+b+c));
	}
	

}
