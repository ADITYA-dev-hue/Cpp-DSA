#include<iostream>
using namespace std;
class A{
    int var1;  //private member by default;
    friend void fn(A obj);
    public:
    int var2;
    friend class B;
};

class B{
    int var3;
    int var4;
};

void fn(A obj){
    cin>>obj.var1;
    cout<<obj.var1;  // freind function help to use private member of class.....
}


int main(){
    A obj;
    obj.var2=100;
    fn(obj);
}