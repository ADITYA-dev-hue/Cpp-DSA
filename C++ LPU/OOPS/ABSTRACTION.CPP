#include "ENCAPSULATION.CPP"
int main(){
    Stack st;
    int a;
    cout<<"Enter 5 elements to push in stack: ";
    for(int i=0;i<5;i++){
        cin>>a;
        st.push(a);
    }
    int n;
    do{
        cout<<"Enter choice : 1. Push  2.pop  3.display 4.Exit\n";
        cin>>n;
        if(n==1){
            cout<<"Enter element to push : ";
            cin>>a;
            st.push(a);
            cout<<"Element "<<a<<" is pushed \n";
        }else if(n==2){
            st.pop();
            cout<<"Top element is poped...\n";
        }else if(n==3){
            st.display();
        }else if(n==4){
            cout<<"Exiting..!!";
            break;
        }else{
            cout<<"Choise is wrong...!!\n";
        }
    }while(n!=4);
    return 0;
    
}