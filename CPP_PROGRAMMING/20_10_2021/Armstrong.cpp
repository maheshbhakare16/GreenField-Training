#include<iostream>
using namespace std;


bool checkArmstrong(int num)
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

int main()
{
    int num;
    printf("Enter the number: ");
    cin>>num;
    if(checkArmstrong(num))
    {
        cout<<"The number is an armstrong number"<<endl;
    }
    else
    {
        cout<<"The number is not an armstrong number"<<endl;
    }
    return 0;
}
