#include<iostream>
#include<stack>
using namespace std;

int main(){
    stack<int> st;
    int arr[6]={3,8,4,0,1,2};
    int n=6;
    int ans[6];
    for(int i=n-1;i>=0;i--){
        
        while(!st.empty() and st.top()<=arr[i]){
            st.pop();
        }

        if(!st.empty()){

            ans[i]=st.top();
        }
        if(st.empty()){
            ans[i] = -1;
        }
        st.push(arr[i]);
    }
    for(int i=0;i<n;i++){
        cout<<ans[i]<<" ";
    }
    
}