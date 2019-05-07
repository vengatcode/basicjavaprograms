package com.vengat.java.objectorientation;
/*
 * 	static -> static members belong to the class instead of a specific instance.
 * 				static members can access directly from a class, not required to create instance
 * 				
 * 
 * 				Refer static variable from <My02_StudentInfo.java>
 */

public class My04_StaticUsage {

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
				
		My02_StudentInfo vengat = new My02_StudentInfo(24, "Vengatesan Rathinavel", 36);
		System.out.println("ID is " + vengat.getId() + " Name is " + vengat.getName() + " and Age is " + vengat.getAge());
		System.out.println("*******************************");
		System.out.println("The Number of Object you created is : " +My02_StudentInfo.getnoOfStudent());

	}

}
