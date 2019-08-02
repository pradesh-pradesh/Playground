#include<stdio.h>

int main()
{
int i,n,p;
printf("Enter n value\n");
  scanf("%d",&n);
for(i=1;i<=n;i++)
{
p=pow(i,i);
printf("%d",p);
printf(" ");

}
return 0;
}