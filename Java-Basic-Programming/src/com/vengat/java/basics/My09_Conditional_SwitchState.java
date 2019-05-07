package com.vengat.java.basics;

public class My09_Conditional_SwitchState {
	/*
	 * 	Switch statement in Java
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 85;
		
		switch(marks) {
		case 90:
			System.out.println("Marks are Excellent");
			break;
		case 85:	
		case 80:
			System.out.println("Marks are Very Good");
			break;
		case 70:
			System.out.println("Marks are Good");
			break;
		default:
			System.out.println("Marks are Pass");
			break;
			
		}
		

	}

}
