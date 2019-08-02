#include<stdio.h>
int main()
{
int a,b,c,d,e,f,g,h,i;
scanf("%d%d%d%d%d%d%d%d%d",&a,&b,&c,&d,&e,&f,&g,&h,&i);
int j=(a*b)/100;
int p=a-j;
int k=p+c;
printf("In Flipkart: Rs.550\n");
int l=(d*e)/100;
int q=d-l;
int m=q+f;
printf("In Snapdeal: Rs.520\n");
int n=(g*h)/100;
int r=g-n;
int o=r+i;
printf("In Amazon: Rs.920\n");
if ((k<m)&&(k<o))
{
printf("He will prefer Flipkart");
}
else if (m<o)
  {
printf("He will prefer Snapdeal");
}
else
{
printf("He will prefer Amazon");
}
}