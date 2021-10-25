#include<stdio.h>
void checkArmstrong(int num)
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
        printf("the number is armstrong number\n");
    }
    else
    {
        printf("the number is not an armstrong number\n");
    }
}
void main()
{
 int num;
 printf("enter the number: ");
 scanf("%d",&num);
 checkArmstrong(num);
 
     
}
