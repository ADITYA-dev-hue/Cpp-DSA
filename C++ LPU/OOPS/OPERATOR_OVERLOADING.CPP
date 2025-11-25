#include<iostream>
using namespace std;
class Complex{
    public:
    int r;
    int i;
    Complex(int r=0,int i=0){
        this->i=i;
        this->r=r;
    }
    void display(){
        cout<<r<<" + "<<i<<"i\n";
    }
    
};
Complex operator +(Complex &c1,Complex &c2){
        Complex ans;
        ans.r=c1.r + c2.r;
        ans.i=c1.i + c2.i;
        return ans;    
}

int main(){   
    Complex c1(2,3);
    Complex c2(4,5);
    c1.display();
    c2.display();
    Complex c3=c1+c2;
    c3.display();
}
