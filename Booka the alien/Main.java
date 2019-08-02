#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b=a/365;
  int c=a%365;
    int d=c/7;
    int e=c%7;
  printf("%d\n%d\n%d\n",b,d,e);
  return(0);
}