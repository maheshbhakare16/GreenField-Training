#include<stdio.h>
void checkPrime(int n)
{
    int i=2;
    if(n==1)
     {
         printf("%d is not a prime number.\n",n);
     }
    while(i<=n)
    {
        
        if(n%i==0)
        {
            if(n==i)
            {
            printf("%d is a prime number.\n",n);   
            }
            else
            {
                printf("%d is not a prime number.\n",n);
                break;
            }
        }
        i++;
    }
}
void main()
{
 int n;
 printf("enter the number to check whether it is prime or not: ");
 scanf("%d",&n);
 checkPrime(n);
}
