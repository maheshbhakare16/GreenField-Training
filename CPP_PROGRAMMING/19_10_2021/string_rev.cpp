#include <iostream>
using namespace std;

int main() 
{
	char str[100];
    int i;
    cout<<"Enter the string: ";
    fgets(str,sizeof(str),stdin);
    for(i=0;str[i]!='\0';i++);
    i--;
    if(str[i]==10)
    {
        i--;
    }
    cout<<"Reverse string is: ";
    for( ;i>=0;i--)
    {
        printf("%c",str[i]);
    }
    cout<<endl;
	return 0;
}
