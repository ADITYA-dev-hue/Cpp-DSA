#include<bits/stdc++.h>
using namespace std;

template<typename T>

class Base{
    public:
    T x;
    Base(T val){
        x=val;
    }

};
int main(){
    vector<int>v={1,2,3,4,5};

    Base<char>obj('a');
    cout<<obj.x<<endl;

    cout<<"-------------------"<<endl;
    Base<double>obj2(5.5);
    cout<<obj2.x<<endl;

    cout<<"-------------------"<<endl;
    Base<string>obj3("Hello Template");
    cout<<obj3.x<<endl;

    
    cout<<"-------------------"<<endl;
    Base<vector<int>>obj4(v);
    cout<<"Vector elements: ";
    for(int i=0;i<obj4.x.size();i++){
        cout<<obj4.x[i]<<" ";
    }
    return 0;
}