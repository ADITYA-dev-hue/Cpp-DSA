#include<iostream>
using namespace std;
void print_Reverse(int i,int n){
    if(i<1){
        return;
    }
    print_Reverse(i-1,n);
    cout<<i<<" ";
}
int main(){
    int i=10;
    print_Reverse(20,20);
}