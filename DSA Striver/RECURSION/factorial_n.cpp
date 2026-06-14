#include<iostream>
using namespace std;

int fact_r(int n){
    if(n==0){
        return 1;
    }
    if(n==1){
        return 1;
    }
    return fact_r(n-1)*n;
}
int main(){
    int n;
    cin>>n;
    
    cout<<n<<"! = "<<fact_r(n);
}