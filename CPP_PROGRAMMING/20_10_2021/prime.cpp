#include<iostream>
using namespace std;

class Prime
{
    int num;
public:
    Prime(int num)
    {
        this->num = num;
    }
    void checkPrime()
    {
        int i=2;
        if(this->num==1)
        {
            printf("%d is not a prime number.\n",this->num);
        }
        while(i<=this->num)
        {
            
            if(this->num%i==0)
            {
                if(this->num==i)
                {
                printf("%d is a prime number.\n",this->num);   
                }
                else
                {
                    printf("%d is not a prime number.\n",this->num);
                    break;
                }
            }
            i++;
        }
    }
};

int main()
{
    Prime p(2);
    Prime q(28);
    p.checkPrime();
    q.checkPrime();
    
    return 0;
}
