#include<stdio.h>
int main()
{
char a[3];
int b,d;
float c;
scanf("%s%d%d%f",&a,&b,&d,&c);
if((d<=2)&&(c>=7.5))
{
printf("%s\n%d\nEligible\n",a,b);
}
else
{
printf("%s\n%d\nNot Eligible to attend placement\n",a,b);
}
return 0;
}