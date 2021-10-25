#include <stdio.h>

int main() 
{
	int num,i;
	scanf("%d",&num);
	if(num%3 == 0)
	{
	    printf("Number is Divisible by 3\n");
	}
    if(num%5 == 0)
	{
	    printf("Number is Divisible by 5\n");
	}
	if(num%7 == 0)
	{
	    printf("Number is Divisible by 7\n");
	}
	if(num%5 !=0 || num%3 !=0 || num%3 !=0)
	{
	    printf("No. not divisible by 3, 5, 7\n");
	}
	return 0;
}

