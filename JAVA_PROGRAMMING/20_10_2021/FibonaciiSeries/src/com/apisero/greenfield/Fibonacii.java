package com.apisero.greenfield;

import java.util.Scanner;

public class Fibonacii 
{
	void printFibonacii(int num)
	{
	    int i=0,j=1,k;
	    if(num>0)
	    {
	    	System.out.print(0+"\t");
	    }
	    while(num>1)
	    {
	        k=i;
	        i=i+j;
	        System.out.print(i+"\t");
	        j=k;
	        num--;
	    
	    }
	    System.out.println();
	}
	
	public static void main(String[] args)
	{
		int num;
		char ch='y';
		Fibonacii p = new Fibonacii();
		Scanner sc = new Scanner(System.in);
		while(ch == 'y')
		{
			num = sc.nextInt();
			p.printFibonacii(num);
			System.out.print("Want to check Another Number: ");
			ch = sc.next().charAt(0);
		}
		
	}
}
