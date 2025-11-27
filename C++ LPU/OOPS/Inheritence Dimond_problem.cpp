#include<iostream>
using namespace std;

class A{
    public:
    int x;
};
class B : public A{
    public:
    void fun(){
        cout<<"\nB\n";
    }
};
class C : public A{
    public:
    void fun(){
        cout<<"C";
    }
};

class D : public B,public C{
    public:
    int a;
};

int main(){
    D obj;
    cin>> obj.B::x;
    cin>>obj.C::x;
    // B::x and C::x are different copies of x from A class.
    cout<<"x from B = "<<obj.B::x<<endl;
    cout<<"x from C = "<<obj.C::x;

    obj.B::fun();
    obj.C::fun();
    return 0;
}