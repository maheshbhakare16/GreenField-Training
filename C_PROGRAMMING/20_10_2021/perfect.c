#include<stdio.h>

void checkPrefect(int num)
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
        printf("number is a perfect number \n");
    }
    else
    {
    printf("number is not a perfect number \n");
    }
}

void main()
{
 int num;
 printf("enter the number: ");
 scanf("%d",&num);
 checkPrefect(num);
 
 
}
