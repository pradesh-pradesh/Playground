#include<stdio.h>
int main()
{
  int a,b,c,d,e,f;
  scanf("%d%d%d%d%d%d",&a,&b,&c,&d,&e,&f);
  float g=(a+c+e)/3.0;
 float h=(b+d+f)/3.0;
  printf("%.1f\n",(float)g);
  printf("%.1f\n",(float)h);
  return(0);
}