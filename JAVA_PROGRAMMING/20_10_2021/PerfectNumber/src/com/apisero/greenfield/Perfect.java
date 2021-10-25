package com.apisero.greenfield;
import java.util.Scanner;

public class Perfect 
{
	boolean checkPrefect(int num)
	{
	    int sum=0,i=1;
	    while(i<num)
	    {
	        if(num%i==0)
	        {
	            sum+=i;
	        }
	        i++;
	    }
	    if(sum==num)
	    {
	       return true;
	    }
	    else
	    {
	        return false;
	    }
	}

	public static void main(String[] args) 
	{
		int num;
		char ch='y';
		Perfect p = new Perfect();
		Scanner sc = new Scanner(System.in);
		while(ch == 'y')
		{
			num = sc.nextInt();
			if(p.checkPrefect(num))
			{
				System.out.println("Number is a Perfect Number");
			}
			else
			{
				System.out.println("Number is not a Perfect Number");
			}
			System.out.print("Want to check Another Number: ");
			ch = sc.next().charAt(0);
		}
		
	}

}
