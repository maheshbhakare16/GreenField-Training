#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* next;
};


// -------------------- FUNCTION TO CREATE NODE -----------------
struct node* CreateNode()
{
    struct node* newnode = NULL;
    newnode = (struct node*)malloc(sizeof(struct node));
    if(newnode != NULL)
    {
        printf("Enter the data for newnode: ");
        scanf("%d",&(newnode->data));
        newnode->next = NULL;
    }
    else
    {
        printf("Memory not allocateed .....\n");
    }
    return newnode;
}
// ------------ FUNCTION TO COUNT NODES ---------------------------
int CountNode(struct node* head)
{
    int count = 0;
    while(head != NULL)
    {
        count++;
        head = head->next;
    }
    return count;
}


// ---------------------- FUNCTION TO CREATE LINKED LIST(MAKES LINKING OF NODES) --------------------
void CreateLinkedList(struct node** head)
{
    struct node* newnode;
    struct node* tempnode = *head;
    newnode = CreateNode();
    if(*head == NULL)
    {
        *head = newnode;
    }
    else
    {
        while(tempnode->next != NULL)
        {
            tempnode = tempnode->next;
        }
        tempnode->next = newnode;
        
    }
}


// -------------------------- FUNCTION TO DISPLAY LINKED LIST -----------
void DisplayLinkedList(struct node* tempnode)
{
    printf("Our Linked List is: ");
    while(tempnode != NULL)
    {
        printf(" -> %d",tempnode->data);
        tempnode = tempnode->next;
    }
    printf("\n");
}



int main()
{
    int choice;
    struct node* first=NULL;
    do
    {
        printf(" --------------------------------- ***************** ----------------------------\n\n");
        printf("1) Create Link List\n2) Display Link List\n3) Exit\nEnter your choice: ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: CreateLinkedList(&first); // &first = to make change at the address of first
                    break;
            case 2: DisplayLinkedList(first); // first = to make copy of first
                    break;
            
        }
    }while(choice != 0);
    return 0;
}
