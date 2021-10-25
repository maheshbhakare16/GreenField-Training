
#include <iostream>
using namespace std;
  
int main()
{
    //implicit casting
    int x = 1; 
    char y = 'a'; 
    x = x + y;
    float z = x + 1.0;
    cout<< "x = " << x << endl;
    cout<< "y = " << y << endl;
    cout<< "z = " << z << endl;
    
    //explicit casting
    double a=2.0;
    x = (int)a+z;
    cout<<x;
    return 0;
}