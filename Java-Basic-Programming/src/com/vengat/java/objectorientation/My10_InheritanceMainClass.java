package com.vengat.java.objectorientation;

public class My10_InheritanceMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		My08_InheritanceRectangleDerived rect = new My08_InheritanceRectangleDerived();
		My09_InheritanceTriangleDerived tri = new My09_InheritanceTriangleDerived();
		
		rect.setVariables(10, 10);
		tri.setVariables(10, 10);
		
		System.out.println("Area of Rectangle is : " + rect.areaOfRectangle());
		System.out.println("Area of Rectangle is : " + tri.areaOfTriangle());

	}

}
