#include<iostream>
#include<vector>
#include<fstream>
#include<algorithm>
using namespace std;
int main(){
    vector<int> v;
    int n;

    //Take input from the file...
    ifstream readfile;
    readfile.open("file1.txt");

    while(readfile >> n){
        v.push_back(n);
    }
    readfile.close();


    int l=v.size();
    sort(v.begin(),v.end());
    
    //Write in file...
    ofstream file;
    file.open("file1.txt");
        for(int i=0;i<l;i++){
            file<<v[i]<<" ";
        }

    cout<<l<<endl;
    for(int i=0;i<l;i++){
        cout<<v[i]<<" ";
    }
    file.close();
    readfile.close();
    return 0;
}