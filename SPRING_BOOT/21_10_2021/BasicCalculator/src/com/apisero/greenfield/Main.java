package com.apisero.greenfield;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int choice,value1,value2;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------------------------------");
		System.out.print("Enter Value 1: ");
		value1 = sc.nextInt();
		System.out.print("Enter Value 2: ");
		value2 = sc.nextInt();
		Calculator c = new Calculator(value1,value2);
		
		do
		{
			System.out.println("-----------------------------------------------------");
			System.out.print("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n Enter Your Choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println(c.add());
				break;
			case 2: 
				System.out.println(c.sub());
				break;
			case 3:
				System.out.println(c.mult());
				break;
			case 4:
				System.out.println(c.divide());
				break;
			default:
				System.out.println("Enter Proper Choice....");
			}
			System.out.print("Do you want to Continue: ");
			ch = sc.next().charAt(0);
		}while(ch == 'y');
	}

}
