#include<stdio.h>
#include <string.h>
 
int main()
{
  char a[1000], b[1000];
 
  gets(a);
 
  gets(b);
 
  strcat(a, b);
 
  printf("The concatenated string is %s\n", a);
 
  return 0;
}