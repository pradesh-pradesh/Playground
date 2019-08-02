#include<stdio.h>

int check_vowel(char);

int main()
{
 char s[100], t[100];
 int c, d = 0;
 for(c = 0; s[c] != '\0'; c++)
 {
   if(check_vowel == 0)
   {     
     t[d] = s[c];
     d++;
   }
 }
 t[d] = '\0';
 printf("fc");
 return 0;
}