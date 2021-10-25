#include <stdio.h>

int min(int a,int b)
{
    if(a<b)
    {
        return a;
    }
    else
    {
        return b;
    }
}
void HCF(int n1, int n2, int n3, int min)
{
    int i;
    for(i=min;i>=1;i++)
	{
	    if(n1%i==0 && n2%i==0 && n3%i==0)
	    {
	        printf("HCF of %d , %d , %d is : %d\n",n1,n2,n3,i);
	        break;
	    }
	}
}

void LCM(int n1, int n2, int n3, int min)
{
    int i=1;
    while(1)
    {
        if(i%n1==0 && i%n2 ==0 && i%n3 ==0)
        {
            printf("LCM of %d , %d , %d is : %d\n",n1,n2,n3,i);
            break;
        }
        i++;
    }
    
}


int main() 
{
	int n1,n2,n3,choice;
	scanf("%d %d %d",&n1,&n2,&n3);
	do
	{
	    printf("1. HCF\n2. LCM \n3. Exit\nEnter your choice: ");
	    scanf("%d",&choice);
	    switch(choice)
	    {
	        case 1:
	            HCF(n1,n2,n3,min(min(n1,n2),n3));
	            break;
	        case 2:
	            LCM(n1,n2,n3,min(min(n1,n2),n3));
	            break;
	            case 3:
	                exit(0);
	                break;
	        default:
	            printf("Wrong choice...\n");
	    }
	    
	}while(choice != 3);
	return 0;
}

