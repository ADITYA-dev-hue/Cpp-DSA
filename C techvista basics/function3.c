#include<stdio.h>
void Nation(){
    printf("India ");
}
void nation2(){
    printf("Austrelia ");
    Nation();
}
int main(){
    Nation();
    nation2();
    return 0;
}