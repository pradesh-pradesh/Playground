#include<stdio.h>
#include <string.h>
 
int main()
{
   char a[100], b[100];
 
   gets(a);
 
   gets(b);
 
   if (strcmp(a,b) == 0)
      printf("Strings are same");
   else
      printf("Strings are not same");
 
   return 0;
}