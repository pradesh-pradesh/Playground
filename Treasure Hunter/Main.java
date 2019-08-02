#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int d=a*b/100;
  printf("%d\n",d);
  int e=a-d;
  int f=(c*e/100);
    int g=d+f;
    int h=(a-g)/3;
  printf("%d\n%d",f,h);
  return(0);
}