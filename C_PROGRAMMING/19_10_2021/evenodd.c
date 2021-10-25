#include <stdio.h>

int main() 
{
	int num;
	scanf("%d",&num);
	if(num&0 == 0)
	{
	    printf("Number is Odd\n");
	}
	else
	{
	    printf("Number is Even\n");
	}
	return 0;
}

