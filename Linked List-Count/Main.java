#include<stdio.h>
int main()
{
  int a,b,c,d,e;
  printf("The students who are present in the class are\n");
  scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
  if (a>=0){
    printf("%d %d %d %d\n",a,b,c,d);
  printf("The number of students who are present is %d.",a);
    return 0;
}
}