#include<iostream>
using namespace std;

// parameterised method
void rec_sum2(int n,int sum){
    if(n<1){
        cout<<sum;
        return;
    }
    rec_sum2(n-1,sum+n);
}
// funtional method 
int rec_sum(int n){
    
    if(n<1){
        return 0;
    }
    return rec_sum(n-1)+n;

}
int main(){
    int n;
    cin>>n;
    int sum=rec_sum(n);
    rec_sum2(3,0);
    cout<<endl<<sum;
}