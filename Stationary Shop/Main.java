
#include<stdio.h>
int main()
{
char a[3];
int b,c,d;
scanf("%s%d%d%d",&a,&b,&c,&d);
 int e=c*d;
 int f=b-d;
if(a<c)
{
  printf("The amount for %d pencil is %d\n",d,e);
  printf("Remaining number of pencils present in the stock:%d",f);
}
else
  printf("Out of stock");
 return 0;
}
