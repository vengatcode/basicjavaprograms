package com.vengat.java.basics;

public class My15_MethodsInJava {
	/*
	 * Java Methods -> It is also called functions
	 * <access specifier> <static> <return value> <name of the method>(){
	 * 		statements...;
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello();
		Hello("Vengatesan");
		Hello("Selvarani");
		Hello("Sathyanarayanan");
		Hello("Sowmiya");
	}	
	public static void Hello() {
		System.out.println("Hello Dude");
	}	
	public static void Hello(String name) {
		System.out.println("Hello " +name);
	}
}
