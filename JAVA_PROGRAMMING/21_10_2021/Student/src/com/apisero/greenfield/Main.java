package com.apisero.greenfield;

public class Main 
{

	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setId("API2309");
		s.setName("Mahesh");
		s.setMarks(87.75);
		System.out.println(s);
		//System.out.println("ID: "+s.getId()+", Name: "+s.getName()+", Marks: "+s.getMarks());
		
		Student s1 = new Student("API2308", "Shubham",98.76);
		System.out.println(s1);
	}

}
