#include<iostream>
using namespace std;
class Stack{
    int arr[100];
    int top_index= -1;
    public:
    void push(int val){
        if(top_index>100){
            cout<<"Stack OverLoad..\n";
            return;
        }
        top_index++;
        arr[top_index]=val;
    }
    void pop(){
        if(top_index==-1){
            cout<<"Stack is empty\n";
            return;
        }
        top_index--;
    }
    int top(){
        return arr[top_index];
    }
    void display(){
        for(int i=0;i<=top_index;i++){
            cout<<arr[i]<<" ";
        }
        int a=top();
        cout<<"\nTop Value = "<<a<<endl<<endl;
    }
};