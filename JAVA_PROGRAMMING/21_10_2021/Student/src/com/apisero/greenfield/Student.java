package com.apisero.greenfield;

public class Student 
{
	private String id;
	private String name;
	private double marks;
	
	public Student()
	{
		
	}
	
	public Student(String id)
	{
		this.id = id;
	}
	
	public Student(String id, String name, double marks) 
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}


	public String getId() 
	{
		return id;
	}


	public void setId(String id) 
	{
		this.id = id;
	}


	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public double getMarks() 
	{
		return marks;
	}


	public void setMarks(double marks) 
	{
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [getId()=" + getId() + ", getName()=" + getName() + ", getMarks()=" + getMarks() + "]";
	}
	
	
}
