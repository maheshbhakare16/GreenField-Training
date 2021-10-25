package com.apisero.greenfield;
import java.util.Scanner;

public class Armstrong 
{
	boolean checkArmstrong(int num)
	{   int num2=num,i=0,sum=0,mult,value;
	    // to find the no. of digits in a number
	    while(num2!=0)
	    {
	        num2/=10;
	        i++;
	    }
	    //  to find the armstrong value
	    num2=num;
	    while(num2!=0)
	    {
	    value= num2%10;
	    mult=1;
	    for(int j=1;j<=i;j++)
	    {
	        mult*=value;
	    }
	    sum+=mult;
	    num2/=10;
	    }
	    //  to check the armstrong or not
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
		Armstrong p = new Armstrong();
		Scanner sc = new Scanner(System.in);
		while(ch == 'y')
		{
			num = sc.nextInt();
			if(p.checkArmstrong(num))
			{
				System.out.println("Number is an Armstrong Number");
			}
			else
			{
				System.out.println("Number is not an Armstrong Number");
			}
			System.out.print("Want to check Another Number: ");
			ch = sc.next().charAt(0);
		}
		
	}

}
