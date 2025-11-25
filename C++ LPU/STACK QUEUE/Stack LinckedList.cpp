#include<iostream>
using namespace std;
struct Node{
    int data;
    Node* next;
    Node(int val){
        data=val;
        next=NULL;
    }
};
Node* head=NULL;
Node* tail=NULL;
class Stack{
    
    public:
    void push(int val){
        Node* newNode=new Node(val);
        if(head==NULL){
            head=newNode;
            tail=head;
            return;
        }
        if(head!=NULL){
            tail->next=newNode;
            tail=tail->next;
        }
    }
    void pop(){
        if(head==NULL){
            cout<<"Stack is empty..\n";
            return;
        }
        if(head->next==NULL){
            head=NULL;
            return;
        }
        if(head!=tail){
            Node* temp=head;
            while(temp->next!=tail){
                temp=temp->next;
            }
            temp->next=NULL;
            tail=temp;
        }
        
    }
    int top(){
        return tail->data;
    }
    void display(){
        Node* temp=head;
        while(temp!=NULL){
            cout<<temp->data<<" ";
            if(temp->next!=NULL){
                cout<<" ";
            }
            temp=temp->next;
        }
        int a=top();
        cout<<"\nTop Value is : "<<a<<endl<<endl;
    }
};
int main(){
    Stack st;
    int a;
    int n;
    do{
        cout<<"Enter choice : 1. Push  2.pop  3.display 4.Exit\n";
        cin>>n;
        if(n==1){
            cout<<"Enter element to push : ";
            cin>>a;
            st.push(a);
            cout<<"Element "<<a<<" is pushed \n";
        }else if(n==2){
            st.pop();
            cout<<"Top element is poped...\n";
        }else if(n==3){
            st.display();
        }else if(n==4){
            cout<<"Exiting..!!";
            break;
        }else{
            cout<<"Choise is wrong...!!\n";
        }
    }while(n!=4);
    return 0;
}