#include<iostream>
using namespace std;
class Queue{
    public:
    int q[10000];
    int front;
    int rear;
    Queue(){
        this->front=-1;
        this->rear=-1;
    }

    void push(int val){
        if(rear>10000){
            cout<<"Over Load\n";
            return;
        }
        
        rear++;

        if(rear==0){
            front=0;
        }
        q[rear]=val;
    }
    void pop(){
        if(front==-1){
            cout<<"Queue is Empty\n";
            return;
        }
        front++;   
        if(front>rear){
            cout<<"Invalid Push\n";
            return;
        }
    }
    int top(){
        return q[front];
    }
    void display(){
        for(int i=front;i<=rear;i++){
            cout<<q[i]<<" ";
        }
        cout<<endl;
        cout<<"Front val is:"<<top()<<endl;

        if(isEmpty()){
            cout<<"Queue is Empty\n";
        }

    }
    bool isEmpty(){
        return front==-1 || front>rear;
    }

};
int main(){
    Queue st;
    int a;
    cout<<" A push pop In Queue By Array...!!\n";
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