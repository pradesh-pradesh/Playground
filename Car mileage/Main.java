#include<stdio.h>
int main()
{
int a,b,c;
scanf("%d%d%d",&a,&b,&c);
int d=a*b;
if(c<=d)
{
printf("Can reach");
}
else
  printf("Cannot reach");
  return 0;
}