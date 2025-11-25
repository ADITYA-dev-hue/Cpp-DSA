#include<iostream>
using namespace std;
int str_to_int(string &str){
    int n=str.size();
    int ans;
    for(int i=0;i<n;i++){
        int digit=str[i]-'0';
        ans= (ans*10)+digit;
    }
    return ans;
}
void postfix(string &str){
    
}
int main(){
    string str;
    cin>>str;
    int a=str_to_int(str);   // string to integer...!
    cout<<a;
}
