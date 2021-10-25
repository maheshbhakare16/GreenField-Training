#include <stdio.h>

int main() 
{
	int num,i;
	scanf("%d",&num);
	if(num==1)
	{
	    printf("Number is Prime\n");
	}
	else
	{
	    for(i=2;i<=num;i++)
    	{
    	    if(num%i==0)
    	    {
    	        break;
    	    }
    	}
    	if(i==num)
    	{
    	    printf("Number is Prime\n");
    	}
    	else
    	{
    	    printf("Number is not Prime\n");
    	}
	}
	return 0;
}

