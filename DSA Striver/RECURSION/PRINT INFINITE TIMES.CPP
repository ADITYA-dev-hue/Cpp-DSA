#include<iostream>
using namespace std;

void printInfinity(){
    cout<<"*";
    printInfinity();
}
int main(){
    printInfinity();
}