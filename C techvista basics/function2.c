#include<stdio.h>
int add(int a,int b,int c){
    printf("sum of a b c : %d",a+b+c);
    return 0;
}

int main(){
    int a=20,b=40,c=10;
    add(a,b,c);
    return 0;
}