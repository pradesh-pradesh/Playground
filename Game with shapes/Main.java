#include<stdio.h>
int main()
{
int a,b;
scanf("%d%d",&a,&b);
int c=3.14*a*a;
int d=b*b;
if (d>=c)
{
printf ("circle can be inside a square");
}
else
 {
printf ("circle cannot be inside a Square");
}  
return 0;

}