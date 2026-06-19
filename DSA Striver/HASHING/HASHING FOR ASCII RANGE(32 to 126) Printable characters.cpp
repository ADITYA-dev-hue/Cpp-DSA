#include<iostream>
#include<string>
using namespace std;

int main(){
    string str;
    getline(cin,str);       //cin.ignore();
    int hash[94]={0};

    for(int i=0;i<=str.length();i++){
        int n = (char)str[i];
        hash[n-33]++;
    }
    for(int i=0;i<94;i++){
        if(hash[i]!=0){
            cout<<(char)(i+33)<<" : "<<hash[i]<<endl;
        }
    }
}
