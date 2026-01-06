#include<iostream>
using namespace std;

class A{
    public:
    int age;
    int id;
    A(int a , int b){
        id=a;
        age=b;
        cout<<"Parameterised Constructor A\n\n";
    }

    //default constructor;
    A(){
        cout<<"Default constructor A\n\n";
    } 
    //Static Member Fuction and Data Member.
    static double g;

    static void g_set(double a){
        g=a;
    }
    //Friend Function.
    friend void age_off(A &obj,int c);
    //Virtual Function. function overriding..
    virtual double fun(){};

    //Operator Overloading..
    A operator +(A &obj){
        A newObj;
        newObj.id=id+obj.id;
        return newObj;
    }

    A operator ++(){
        A newObj;
        newObj.id=++id;
        return newObj;
    }
    ~A(){
        cout<<"Distructor A\n";
    }

};



//friend function..
void age_off(A &obj,int c){
    obj.age=c;
}

//assigning value to static data member g.
double A::g=20;




class B:public A{
    public:
    string name;
    B(int c,int d):A(c,d){
        cout<<"Value assign to A class From class B\n\n";
    }
    B(){
        cout<<"Default constructor B\n\n";
    }
    B(string n){
        name=n;
    }
    B operator +(B &obj){
        B newobj;
        newobj.name=name+obj.name;
        return newobj;
    }
    double fun(){
        cout<<"Virtual function fun from class B is called\n";
        return 7.09;
    }


    ~B(){
        cout<<"Distructor B\n";
    }
};
int main(){
    B obj(12,8);
    cout<<obj.age<<" "<<obj.id<<endl;

    //friend function.
    A new_obj;
    age_off(new_obj,9);
    cout<<"friend function age: "<<new_obj.age<<endl;

    cout<<obj.fun()<<endl;

    cout<<"Static data member g Value: ";
    cout<<A::g<<endl;
    cout<<"Static member fuction changed g Value: ";
    A::g_set(30);
    cout<<A::g<<endl;

    //DMA
    cout<<"\nDynamic Memory Allocation:\n";
    int *p=new int(90);
    cout<<*p<<endl;

    int *arr=new int[5];
    arr[0]=30;
    arr[1]=65;
    arr[2]=44;
    cout<<arr[0]<<" "<<arr[1]<<" "<<arr[2]<<endl;
    delete[] arr;
    delete p;

    B *u=new B(12,98);
    cout<<"Age/Id is: ";
    cout<<u->age<<"/";
    cout<<u->id<<endl;
    delete u;

    //Operator Overloading ..
    A obj1,obj2,obj3;
    obj1.id=210;
    obj2.id=310;
    obj3=obj1+obj2;
    cout<<"Operator overloading Id of obj1 + obj2 = "<<obj3.id<<endl;


    //Operator overLoading B class concatenate String. 
    B sr1("Hello");
    B sr2("World");
    B sr3;
    cout<<"Operator overloading String concatenate: ";
    sr3=sr1+sr2;
    cout<<sr3.name<<endl<<endl;
    //Operator overloading ++
    A obj4;
    obj4.id=50;
    A obj5;
    obj5=++obj4;
    cout<<"Operator overloading ++ : "<<obj4.id<<endl;

}