package com.vengat.java.basics;

public class My08_Conditional_IfElse {
	/*
	 * if(conditional statement){
	 * statement1
	 * statement2
	 * } else{
	 * statement1
	 * statement2
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean check = true;
		
		if(check) {
			System.out.println("I am from IF statement");
		}else {
			System.out.println("I am from ELSE statement");
		}
		
		if(!check) {
			System.out.println("I am from IF statement");
		}else if(!check) {
			System.out.println("I am from ELSE IF statement");
		}else {
			System.out.println("I am from ELSE statement");
		}

	}

}
