#include<stdio.h>
int main()
{
 int a;
    scanf("%d",&a);
  int b=a/1000;
  int c=a%10;
  int d=b+c;

  printf("%d\n",d);
  return(0);
}