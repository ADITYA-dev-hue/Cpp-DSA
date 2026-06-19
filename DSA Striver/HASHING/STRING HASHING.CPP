#include<iostream>
#include<string>
using namespace std;

int main(){
    string str;
    cin>>str;
    int hash[26]={0};
    for(int i=0;i<=str.length();i++){
        int n=(char)str[i];
        hash[n-97]++;
    }
    for(int i=0;i<26;i++){
        if(hash[i]!=0){
        cout<<(char)(i+97)<<" : "<<hash[i]<<endl;   
        }
    }
}