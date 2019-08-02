#include<stdio.h>
int main()
{
int l1,b1,l2,b2,l,b;
scanf("%d%d%d%d%d%d",&l1,&b1,&l2,&b2,&l,&b);
int p1=l1*b1;
int p2=l2*b2;
int p=p1+p2;
int w=l*b;
if(p>=w)
{
printf("Raj can fix both painting");
}
else
printf("Raj cannot fix both painting");
return 0;
}
