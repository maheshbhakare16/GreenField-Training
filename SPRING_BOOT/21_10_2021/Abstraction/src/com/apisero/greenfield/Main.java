package com.apisero.greenfield;

public class Main 
{

	public static void main(String[] args) 
	{
		Shape square = new Square(12.00);
		System.out.println("Area of Square is: "+square.area());
		
		Shape circle = new Circle(12.00);
		System.out.println("Area of circle is: "+circle.area());

	}

}
