package com.apisero.greenfield;

public class Square implements Shape 
{
	private double side;
	

	public Square(double side) 
	{
		super();
		this.side = side;
	}
	

	public double getSide() 
	{
		return side;
	}


	public void setSide(double side) 
	{
		this.side = side;
	}


	@Override
	public double area() 
	{
		return side*side;
	}

}
