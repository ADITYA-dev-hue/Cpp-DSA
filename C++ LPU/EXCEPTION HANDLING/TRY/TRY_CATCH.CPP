#include<iostream>
using namespace std;

int main(){
    int n,m;
    cin>>n>>m;
    
 try{
    
    try{
        if(m==0)throw "Division by zero error";
            int res=n/m;
            cout<<"Result: "<<res<<endl;
    }
    catch(const char *str){       //(const char* str){}
       cout<<"Exception error: "<<str<<endl;
    }

}catch(const char *str){
    cout<<"Exception caught in outer try: "<<str<<endl;
}
   
    return 0;
}
