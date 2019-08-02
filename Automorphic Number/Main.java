#include<stdio.h>
int main()
{
int a;
scanf ("%d",&a);
int b=a*a;
int c=b%10;
if(a!=c)
{
  printf("Not Automorphic Number");
}
else
{
  printf("Automorphic Number");
}
}