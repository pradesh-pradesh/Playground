#include<stdio.h>
int main()
{
 int a,b,c;
  int dis=100;
  scanf("%d%d%d\n",&a,&b,&c);
  int d=a*b;
  int e=a*c;
  int f=d-e;
  int p=f-dis;
  printf("%d",p);
  return(0);
    
}