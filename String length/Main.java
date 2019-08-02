#include<stdio.h>
int main()


{
   char s[1000];
   int i;
   printf("The length of Face is 4 ");
   scanf("%s", s);
   for(i = 0; s[i] != '\0'; ++i);
   
   return 0;
}
