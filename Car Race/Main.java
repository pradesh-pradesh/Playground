#include<stdio.h>
int main()
{
int a,b,c,d;
scanf("%d%d%d%d",&a,&b,&c,&d);
int e=a%d;
int f=b%d;
int g=c%d;
if(e==0)
{
printf("Car 1 goes into road A");
}
else if(f==0)
   {
printf("Car 1 goes into road B");
}
else if(g==0)
{
printf("Car 1 goes into road c");  
}
else
  printf("No path exist");
return 0;
}