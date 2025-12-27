#include<bits/stdc++.h>
using namespace std;

template<typename T>
//Template class
class Base{
    public:
    T x;
    Base(T val){
        x=val;
    }

};

template<typename T1>
//Method of inheritance from template class
class child:public Base<T1>{
    public:
    int  y;
    child(T1 val):Base<T1>(val){
        y=val;
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

    cout<<endl;
    cout<<"-------------------"<<endl;

    child<int>obj5(10);
    cout<<"Value from Base class using child class object: "<<obj5.x<<endl;
    return 0;
}