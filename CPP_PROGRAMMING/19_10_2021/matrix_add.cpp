#include <iostream>
using namespace std;

int main() 
{
	int i,j,m1,n1,m2,n2,a[10][10],b[10][10],c[10][10];
    cout<<"enter the no. of rows in 1st array: ";
    cin>>m1;
    cout<<"enter the no. of columns in 1st array: ";
    cin>>n1;
    cout<<"enter the elements: "<<endl;
    for(i=0;i<m1;i++)
    {
        for(j=0;j<n1;j++)
        {
            cin>>a[i][j];
        }
    }
    cout<<"enter the no. of rows in 2nd array: ";
    cin>>m2;
    cout<<"enter the no. of columns in 2nd array: ";
    cin>>n2;
    cout<<"enter the elements: "<<endl;
    for(i=0;i<m2;i++)
    {
        for(j=0;j<n2;j++)
        {
            cin>>b[i][j];
        }
    }
    if(m1==m2 && n1==n2)
    {
       for(i=0;i<m1;i++)
        {
            for(j=0;j<n1;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
    
        cout<<"Addition of two matrices is: "<<endl;
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n1;j++)
            {
                cout<<c[i][j]<<" ";
            }
            cout<<endl;
        }
    }
    else
    {
        cout<<"enter the proper array sizes..."<<endl;
    }
	return 0;
}
