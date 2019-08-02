#include<stdio.h>
int main()
{
int a,b,c;
scanf("%d%d%d",&a,&b,&c);
int e=a*b;
int f=a*c;
int g=e+f;
if(a>=g)
{
  printf("Boat is stable");
}
else
{
  printf("Boat will drow");
}
return 0;
}
