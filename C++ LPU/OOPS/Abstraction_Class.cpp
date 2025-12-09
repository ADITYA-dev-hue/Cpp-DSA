#include<iostream>
using namespace std;
class Animal{
    public:
    virtual void voice()=0;
    virtual bool domestic()=0;
    virtual bool herbi()=0;
    virtual bool carni()=0;
};
class Dog: public Animal{
    virtual void voice(){
        cout<<"it barks\n";
    }
    virtual bool domestic(){
        return true;
    }
    virtual bool herbi(){
        return true;
    }
    virtual bool carni(){
        return true;
    }
};
class Snake: public Animal{
    virtual void voice(){
        cout<<"it Hiss\n";
    }
    virtual bool domestic(){
        return false;
    }
    virtual bool herbi(){
        return false;
    }
    virtual bool carni(){
        return true;
    }
};
int main(){
    Animal *dog=new Dog;
    Animal *snake=new Snake;

    dog->voice();
    snake->voice();
}