#include<iostream>
using namespace std;

bool checkPrefect(int num)
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
    cout<<"enter the number: ";
    cin>>num;
    if(checkPrefect(num))
    {
        cout<<"number is a perfect number..."<<endl;
    }
    else
    {
         cout<<"number is not a perfect number..."<<endl;
    }
    return 0;
}
