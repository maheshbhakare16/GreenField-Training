package com.apisero.greenfield;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class TestCalculator {
	@BeforeClass
	public static void beforeClassDemo()
	{
		System.out.println("Called Ones before class");
	}
	@Before
	public void beforeAdd()
	{
		System.out.println("Called before add method...");
	}
	@Test
	public void testAdd()
	{
		Calculator c = new Calculator();
		assertEquals(4,c.add(2, 2));
		System.out.println("Addition result is: "+c.add(2,2));
		
	}
	@After
	public void afterAdd()
	{
		System.out.println("Called After add method");
	}
	@AfterClass
	public static void afterClassDemo()
	{
		System.out.println("After class Execution...");
	}
	
}
