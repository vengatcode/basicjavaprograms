package com.vengat.java.objectorientation;

/*
 * Class covers 
 * 		General object creation & assignment
 * 		Encapsulation
 * 		Constructor - Constructor doesn't have any return type. Here we need both default constructor as
 * 						well as parameterized constructor due to object creation & instantiation also 
 * 						available in this class (both object definition manual & constructor).
 * 
 */

public class My01_MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		General object creation & assignment
		My02_StudentInfo sathya = new My02_StudentInfo();
		sathya.id = 18;
		sathya.name = "SathyaNarayanan Vengatesan";
		sathya.age = 8;		
		System.out.println("ID is " + sathya.id + " Name is " + sathya.name + " and Age is " + sathya.age);
		
//		Encapsulation
		My02_StudentInfo sowmiya = new My02_StudentInfo();
		sowmiya.setId(11);
		sowmiya.setName("Sowmiya Vengatesan");
		sowmiya.setAge(5);
		System.out.println("ID is " + sowmiya.getId() + " Name is " + sowmiya.getName() + " and Age is " + sowmiya.getAge());
		
//		Constructor
		My02_StudentInfo rani = new My02_StudentInfo(07, "Selvarani Vengatesan", 34);
		System.out.println("ID is " + rani.getId() + " Name is " + rani.getName() + " and Age is " + rani.getAge());
		

	}

}
