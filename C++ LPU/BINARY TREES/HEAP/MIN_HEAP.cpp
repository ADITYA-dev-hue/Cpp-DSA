#include<iostream>
using namespace std;


class MinHeap{

    public:

    int arr[1000];
    int it=0;

    void push(int val){
        it++;
        arr[it]=val;
        int i=it;
        while(i/2>0 and arr[i]<arr[i/2]){
            swap(arr[i],arr[i/2]);
            i=i/2;
        }
    }
    void display(){
        for(int i=1;i<=it;i++){
            cout<<arr[i]<<" ";
        }
        cout<<endl;
    }
    void pop(){
        arr[1]=arr[it];
        it--;
        int i=1;
        while(2*i<=it){
            int left=2*i;
            int right=2*i+1;

            int smallest = left;
            if(right<=it and arr[right]<arr[left]){
                smallest=right;
            }

            if(arr[i]>arr[smallest]){
                swap(arr[i],arr[smallest]);
                i=smallest;
            }

            else{
                break; 
            }
            
        }
    }
};
int main(){
    MinHeap H;
    int n;
    int a;
    do{
        cout<<"Enter choice : 1. Push  2.pop  3.display 4.Exit\n";
        cin>>n;
        if(n==1){
            cout<<"Enter element to push : ";
            cin>>a;
            H.push(a);
            cout<<"Element "<<a<<" is pushed \n";
        }
        else if(n==2){
            H.pop();
            cout<<"Top element is poped...\n";
        }
        else if(n==3){
            H.display();
        }else if(n==4){
            cout<<"Exiting..!!";
            break;
        }else{
            cout<<"Choise is wrong...!!\n";
        }
    }while(n!=4);
}