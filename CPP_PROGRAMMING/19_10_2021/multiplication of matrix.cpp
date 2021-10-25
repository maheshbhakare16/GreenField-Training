#include <iostream>
using namespace std;

int main() 
{
	int c1,c2,r1,r2;
	int num;
	int **a=NULL,**b=NULL,**c=NULL;
	cout<<"Enter row and column for matrix 1: "<<endl;
	cin>>r1>>c1;
	
	a=(int**)malloc(r1*sizeof(int*));
	for(int i=0;i<r1;i++)
	{
	    *(a+i)=(int*)malloc(c1*sizeof(int));
	    for(int j=0;j<c1;j++)
	    {
	        cin>>num;
	        *(*(a+i)+j) = num;
	        
	    }
	}
	cout<<"Enter row and column for matrix 2: "<<endl;
	cin>>r2>>c2;
	
	b=(int**)malloc(r2*sizeof(int*));
	for(int i=0;i<r2;i++)
	{
	    *(b+i)=(int*)malloc(c2*sizeof(int));
	    for(int j=0;j<c2;j++)
	    {
	        cin>>num;
	        *(*(b+i)+j) = num;
	        
	    }
	}
	if(c1==r2)
	{
	    c = (int**)malloc(r1*sizeof(int*));
	    for(int i=0;i<r1;i++)
	    {
	        *(c+i) = (int*)calloc(c2,sizeof(int));
	        for(int j=0;j<c2;j++)
	        {
	            for(int k=0;k<c1;k++)
	            {
	                *(*(c+i)+j) += *(*(a+i)+k)*(*(*(b+k)+j));
	            }
	        }
	    }
	    cout<<"Multiplication Matrix is: "<<endl;
	    for(int i=0;i<r1;i++)
	    {
	        for(int j=0;j<c2;j++)
	        {
	            cout<<*(*(c+i)+j)<<" ";
	        }
	        cout<<endl;
	    }
	}
	else
	{
	    cout<<"Wrong matrix Size"<<endl;
	}
}
