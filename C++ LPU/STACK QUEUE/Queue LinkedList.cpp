#include<iostream>
using namespace std;
class Node{
    public:
    int val;
    Node* next;
    Node(int val){
        this->val=val;
        this->next=NULL;
    }
};

class Queue{
    Node* head;
    Node* tail;
    public:
    Queue(){
        head=NULL;
        tail=NULL;
    }  
    void push(int val){
        Node* newNode=new Node(val);
        if(head==NULL){
            head=newNode;
            tail=head;
            return;
        }
        tail->next=newNode;
        tail=newNode;
    }  
    void pop(){
        if(head==NULL){
            cout<<"Queue is empty\n";
            return;
        }
        Node* temp=head;
        head=head->next;
        delete(temp);
    }
    void display(){
        if(empty()){
            cout<<"Queue is empty.\n";
            return;
        }
        Node* temp=head;
        while(temp!=NULL){
            cout<<temp->val<<" ";
            temp=temp->next;
        }
        cout<<endl;
        cout<<front()<<endl;
    }
    int front(){
        return head->val;
    }
    bool empty(){
        return head==NULL;
    }
};

int main(){
    Queue st;
    int a;
    cout<<" A push pop In Queue By LinkedList...!!\n";
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