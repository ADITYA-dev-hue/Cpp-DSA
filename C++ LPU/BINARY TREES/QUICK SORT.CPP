#include<iostream>
using namespace std;

int pivot_shift(int arr[],int left,int right){
    int i=left,j=right;
    int pivot=arr[left];

    while(i<j){
        while(i <= right and arr[i] <= pivot){
            i++;
        }
        while(j >= left and arr[j] > pivot){
            j--;
        }
        if(i < j){
            swap(arr[i],arr[j]);
        }
    }
    swap(arr[left], arr[j]);
    return j;
}

void quick_sort(int arr[],int left,int right){
    if(left>=right){
        return;
    }
    int ind=pivot_shift(arr,left,right);
    quick_sort(arr,left,ind-1);
    quick_sort(arr,ind+1,right);
    
}
int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];

    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";

    }
    cout<<endl;
    quick_sort(arr,0,n-1);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";

    }

}