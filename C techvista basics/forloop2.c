#include<stdio.h>
int main(){
    int a;
    printf("write a no. for which you want TABLE:\n");
    scanf("%d",&a);
    printf("The Table is:\n");
    for(int i=1;i<=10;i++){
        printf("%d X %d = %d\n",a,i,a*i);
    }
    return 0;
}