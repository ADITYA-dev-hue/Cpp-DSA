#include<iostream>
using namespace std;
class BankAccount{
    static double interest;
    public:
    int balance;
    string name;
    int deposite(int amount){
        balance+=amount;
        return balance;
    }
    int withdraw(int amount){
        if(balance<amount){
            cout<<"balance reach limit\n";
        }else{
            
            balance-=amount;
            cout<<"Amount Withdrawn\n";
        }
        return balance;
    }
    void r_o_i(){
        cout<<"Intrest ammount is = "<< balance*interest<<endl;;
    }
    void Balance(){
        cout<<"Current Balance is = "<<balance<<endl;
    }
    
};
double BankAccount::interest=0.3;
int main(){
    BankAccount c1;
    cout<<"Enter name of Account Holder : ";
    cin>>c1.name;
    cout<<"Enter balance = ";
    cin>>c1.balance;
    int amount;
    int i;
    cout<<"1. Deposite\n2. Witdraw\n3. Balance\n4. Exit\n";
    do{
        cout<<"Enter your Choice: ";
        cin>>i;
        if(i==1){
            cout<<"Enter amount to deposite : ";
            cin>>amount;
            c1.deposite(amount);
            cout<<"Amount deposited!\n";
        }else if(i==2){
            cout<<"Enter amount to Withdraw : ";
            cin>>amount;
            c1.withdraw(amount);

        }else if(i==3){
            c1.Balance();
        }else if(i==4){
            cout<<"Thank You To Choose Us... \n";
        }
    }while(i!=4);
    c1.r_o_i();


}