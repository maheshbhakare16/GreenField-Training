
#include <iostream>
using namespace std;

int main()
{
   int const a=10;
   int*p = NULL;
   p = const_cast<int*>(&a);
   (*p)++;
   cout<<a<<endl<<*p;
    return 0;
}