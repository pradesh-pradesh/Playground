#include<stdio.h>
int main()
{
 char ch;

    scanf("%c", &ch);


    if(ch >= 'A' && ch <= 'Z')
    {
        printf("Upper", ch);
    }
    else if(ch >= 'a' && ch <= 'z')
    {
        printf("Lower", ch);
    }
    else
    {
        printf("Symbol", ch);
    }

    return 0;
}