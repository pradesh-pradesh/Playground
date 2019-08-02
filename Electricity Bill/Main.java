#include<stdio.h>
int main()
{
 int a;
 scanf("%d",&a);
 if (a<=200)
 {
   float b=(float)a*0.5;
   printf("Rs.%d",(int)b);
 }
 else if(a<=400)
 {
   float c=(float)a*0.65;
   float d=c+100;
   d=round(d);
  printf("Rs.%d",(int)d);
 }
 else if(a>600)
 {
   float e=(float)a*1.25;
   int f=(int)e+425;
   printf("Rs.%d",f);
 }

}