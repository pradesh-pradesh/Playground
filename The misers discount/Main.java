#include<stdio.h>
int main()
{
 float a,b,c;
  scanf("%f%f%f\n",&a,&b,&c);
  float d=a+b;
  float e=(d*c)/100;
  float f=d-e;
  printf("%.2f\n%.2f\n%.2f\n",d,f,e);
  return(0);
  
}