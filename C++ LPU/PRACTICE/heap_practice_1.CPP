#include<iostream>
using namespace std;

class MaxHeap{
    public:

    int arr[1000];
    int it=0;

    void push(int val){
        it++;
        arr[it]=val;
        int i=it;
        while(i/2>0 and arr[i]>arr[i/2]){
            swap(arr[i],arr[i/2]);
            i=i/2;
        }
    }

    void pop(){
        arr[1]=arr[it];
        it--;
        int i=1;
        while(true){
            int left=2*i;
            int right=2*i+1;
            int largest=left;

            if(right<=it and  arr[right]>arr[largest]){
                largest=right;
            }
            if(arr[i]<arr[largest]){
                swap(arr[i],arr[largest]);
                i=largest;
            }else{
                break;
            }
        }
    }
    void display(){
        for(int i=1;i<=it;i++){
            cout<<arr[i]<<" ";
        }
        cout<<endl;
    }
};

void heapify_max(int arr[],int n,int i){

    while(2*i<n){
        int left=2*i;
        int right=2*i+1;
        int largest=left;

        if(right<n and arr[right]>arr[largest]){
            swap(arr[right],arr[largest]);
        }
        if(arr[i]<arr[largest]){
            swap(arr[i],arr[largest]);
            i=largest;
        }
        else{
            break;
        }
    }
}
int main(){
    int m;
    cin>>m;
    int heap1[m];
    for(int j=1; j < m ; j++){
        cin>>heap1[j];
    }

    heapify_max(heap1,m,1);
    cout<<endl;
    for(int i=1;i<m;i++){
        cout<<heap1[i]<<" ";
    }


    MaxHeap H;
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