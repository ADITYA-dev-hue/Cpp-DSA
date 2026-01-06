#include<iostream>
using namespace std;
class Group{
    public:
    int a;
    int c;
    Group(int i,int r){
        a=i;
        c=r;
    }
    Group(){}
    Group operator *(Group obj){
        Group newobj;
        newobj.a=obj.a * a;
        newobj.c=obj.c * c;
        return newobj;
    }
    Group& operator ++(){
        Group newObj;
        a++;
        c++;
        return *this;
    }
};
int main(){
    Group obj1(100,200);
    Group obj2(2,4);
    
    
    Group ans = obj1 * obj2;
    cout<<"i= "<<ans.a<<" r= "<<ans.c<<endl;
    ++ans;
    //Group ans2=++ans;
    cout<<"i= "<<ans.a<<" r= "<<ans.c<<endl;

    return 0;
}