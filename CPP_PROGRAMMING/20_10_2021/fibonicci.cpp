#include<iostream>

void printFibonacii(int num)
{
    int i=0,j=1,k;
    if(num>0)
    {
    std::cout<<0<<"\t";
    }
    while(num>1)
    {
        k=i;
        i=i+j;
        std::cout<<i<<"\t";
        j=k;
        num--;
    
    }
    std::cout<<std::endl;
}
int main()
{
 int num;
 std::cout<<"Enter the number: ";
 std::cin>>num;
 printFibonacii(num);
}
