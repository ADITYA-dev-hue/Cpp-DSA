#include<iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* next;
    
    Node(int data){
        this->data=data;        //this-> is a pointer of constructor
        this->next=NULL;
    }
};
Node* insert_at_start(int data,Node* head){
    Node *new_node=new Node(data);

    new_node->next=head;
    return new_node;
}

int main(){
    Node *n1=new Node(10);
    Node *n2=new Node(0);   //THIS HELPS TO ASSIGN NEW VALUE TO NODE DATA....
    Node *n3=new Node(30);

    // n1->data=10;
    // n2->data=20;                 //THIS ALSO HELPS TO ASSIGN NEW VALUE TO NODE DATA....
    // n3->data=30;  

    n1->next=n2;
    n2->next=n3;        //THIS HELPS TO CONNECT THE NODES......
    n3->next=NULL;

    Node* head=insert_at_start(22,head);

    while (head!=NULL)
    {
        cout<<head->data<<" ";      //LOOP TO PRINT VALUES OF ALL NODES.....
        head=head->next;
    }
    
    return 0;
}
