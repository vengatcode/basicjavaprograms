package com.vengat.java.basics;

import java.util.Scanner;

public class My03_UserInput {
	
	/*
	 * Java User Input Scanner usage
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any two value to add :");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("Addition of two numbers : " + (a+b));

	}

}
