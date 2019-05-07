package com.vengat.java.objectorientation;
/*
 * static member variable & function included in this class
 */

public class My02_StudentInfo {
	int id;
	String name;
	int age;
	static int noOfStudent = 0;

//	Encapsulation for class member variable
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	Constructor
	public My02_StudentInfo(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		noOfStudent++;
	}
//	Default constructor
	public My02_StudentInfo() {
		// TODO Auto-generated constructor stub
		noOfStudent++;
	}
	
//	static member function
	public static int getnoOfStudent() {
		return noOfStudent;
	}
	
	

}
