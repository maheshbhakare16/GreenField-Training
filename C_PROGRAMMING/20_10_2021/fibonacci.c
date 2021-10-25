#include<stdio.h>

void printFibonacii(int num)
{
    int i=0,j=1,k;
    if(num>0)
    {
    printf("%d\t",0);
    }
    while(num>1)
    {
        k=i;
        i=i+j;
        printf("%d\t",i);
        j=k;
        num--;
    
    }
    printf("\n");
}
void main()
{
 int num;
 printf("enter the number: ");
 scanf("%d",&num);
 printFibonacii(num);
}
