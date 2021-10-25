package com.apisero.greenfield;

public class Prime 
{
	int num;
	Prime(int num)
	{
		this.num = num;
	}
	void checkPrime()
    {
        int i=2;
        if(this.num==1)
        {
            System.out.printf("%d is not a prime number.\n",this.num);
        }
        while(i<=this.num)
        {
            
            if(this.num%i==0)
            {
                if(this.num==i)
                {
                	System.out.printf("%d is a prime number.\n",this.num);   
                }
                else
                {
                	System.out.printf("%d is not a prime number.\n",this.num);
                    break;
                }
            }
            i++;
        }
    }
	public static void main(String[] args) 
	{
		Prime p = new Prime(10);
		p.checkPrime();
		Prime p1 = new Prime(11);
		p1.checkPrime();
		Prime p2 = new Prime(17);
		p2.checkPrime();
	}

}
