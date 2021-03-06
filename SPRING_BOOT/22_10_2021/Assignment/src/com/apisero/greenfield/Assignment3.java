package com.apisero.greenfield;

import java.util.Scanner;

public class Assignment3 {
	public void ByteAutoBoxUnBox()
	{
		System.out.println("Byte: ");
		byte i = 10;
		Byte j = i;
		System.out.println("Autoboxing of byte: "+j);
		byte k = j;
		System.out.println("AutoUnboxing of Byte: "+k);
		System.out.println("\n--------------------------------------------------------------\n");
	}
	public void ShortAutoBoxUnBox()
	{
		System.out.println("Short: ");
		short i = 10;
		Short j = i;
		System.out.println("Autoboxing of short: "+j);
		short k = j;
		System.out.println("AutoUnboxing of Short: "+k);
		System.out.println("\n--------------------------------------------------------------\n");
	}
	public void IntegerAutoBoxUnBox()
	{
		System.out.println("Integer: ");
		int i = 10;
		Integer j = i;
		System.out.println("Autoboxing of int: "+j);
		int k = j;
		System.out.println("AutoUnboxing of Integer: "+k);
		System.out.println("\n--------------------------------------------------------------\n");
	}
	public void FloatAutoBoxUnBox()
	{
		System.out.println("Float: ");
		float i = 10.34f;
		Float j = i;
		System.out.println("Autoboxing of float: "+j);
		float k = j;
		System.out.println("AutoUnboxing of Float: "+k);
		System.out.println("\n--------------------------------------------------------------\n");
	}
	void DoubleAutoBoxUnBox()
	{
		System.out.println("Double: ");
		double i = 12.15;
		Double j = i;
		System.out.println("Autoboxing of double: "+j);
		double k = j;
		System.out.println("AutoUnboxing of Double: "+k);
		System.out.println("\n--------------------------------------------------------------\n");
	}
	void CharacterAutoBoxUnBox()
	{
		System.out.println("Character: ");
		char i ='a';
		Character j = i;
		System.out.println("Autoboxing of char: "+j);
		char k = j;
		System.out.println("AutoUnboxing of Character: "+k);
		System.out.println("\n--------------------------------------------------------------\n");
	}
	void BooleanAutoBoxUnBox()
	{
		System.out.println("Boolean: ");
		boolean i = true;
		Boolean j = i;
		System.out.println("Autoboxing of boolean: "+j);
		boolean k = j;
		System.out.println("AutoUnboxing of Boolean: "+k);
		System.out.println("\n--------------------------------------------------------------\n");
	}
	void LongAutoBoxUnBox()
	{
		System.out.println("Long: ");
		long i = 10;
		Long j = i;
		System.out.println("Autoboxing of long: "+j);
		long k = j;
		System.out.println("AutoUnboxing of Long: "+k);
		System.out.println("\n--------------------------------------------------------------\n");
	}
	public static void main(String[] args) {
		Assignment3 a3 = new Assignment3();		
		int choice;
		char ch;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("-----------------------------------------------------");
			
			do
			{
				System.out.println("-----------------------------------------------------");
				System.out.print("1. Byte\n2. Short\n3. Integer\n4. Long\n5. Float\n6. Double\n7. Character\n8. Boolean\nEnter Your Choice: ");
				choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					a3.ByteAutoBoxUnBox();
					break;
				case 2: 
					a3.ShortAutoBoxUnBox();
					break;
				case 3:
					a3.IntegerAutoBoxUnBox();
					break;
				case 4:
					a3.LongAutoBoxUnBox();
					break;
				case 5:
					a3.FloatAutoBoxUnBox();
					break;
				case 6:
					a3.DoubleAutoBoxUnBox();
					break;
				case 7:
					a3.CharacterAutoBoxUnBox();
					break;
				case 8:
					a3.BooleanAutoBoxUnBox();
					break;
				default:
					System.out.println("Enter Proper Choice....");
				}
				System.out.print("Do you want to Continue: ");
				ch = sc.next().charAt(0);
			}while(ch == 'y');
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
