package com.vengat.java.basics;

import java.util.Scanner;

public class My13_Arrays {
	/*
	 * Array used to store multiple values in a single variable with same data type
	 * int[] myArray = new int[5];
	 * int[] myArray = {1, 2, 3, 4, 5};
	 * int[] myArray = new int[] {1, 2, 3, 4, 5};
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[5];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any 5 integer value to store in array");
		int index = 0;
		do {
			myArray[index]=scan.nextInt();
			index++;
		}while(index<5);
		
		System.out.println("Now you have stored 5 integer value in your array");
		
		System.out.println("Values which you entered");
		index=0;
		do {
			System.out.println(myArray[index]);
			index++;
		}while(index<5);		
		

	}

}
