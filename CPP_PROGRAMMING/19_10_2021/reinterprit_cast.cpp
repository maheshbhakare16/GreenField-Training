
#include <iostream>
using namespace std;
class Demo
{
    int a;
    int b;
    int c;
    public:
    Demo(int a, int b, int c)
    {
        this->a = a;
        this->b = b;
        this->c = c;
    }
};
int main()
{
    Demo d(10,20,30);
    int* p=NULL;
    p = reinterpret_cast<int*>(&d);
    cout<<*(p+0)<<endl;
    cout<<*(p+1)<<endl;
    cout<<*(p+2)<<endl;
    return 0;
}