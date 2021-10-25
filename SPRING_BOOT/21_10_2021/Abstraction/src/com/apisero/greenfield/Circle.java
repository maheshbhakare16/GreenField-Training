package com.apisero.greenfield;

public class Circle implements Shape
{
	private double redius;
	
	public Circle(double redius) {
		super();
		this.redius = redius;
	}

	public double getRedius() {
		return redius;
	}

	public void setRedius(double redius) {
		this.redius = redius;
	}

	@Override
	public double area() 
	{
		return 3.14*redius*redius;
	}
	

}
