#include <stdio.h>

void main() {
    int a=0,b=1,c,n;
    printf("enter the value");
    scanf("%d",&n);
    while(n>0){
        printf("\n%d",a);
        c=a+b;
        a=b;
        b=c;
        n--;
    }
}
