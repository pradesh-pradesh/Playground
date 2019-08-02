
#include<stdio.h>
int main()
{
 int a,b,c;
 scanf("%d%d%d",&a,&b,&c);
 int d=(a*b*c)/100;
 int e=d+a;
 float f=((float)d/(float)100)*(float)2;
 float g=(float)e-f;
 printf("%.2f\n",(float)d);
 printf("%.2f\n",(float)e);
 printf("%.2f\n",f);
 printf("%.2f\n",g);
 return 0;
}