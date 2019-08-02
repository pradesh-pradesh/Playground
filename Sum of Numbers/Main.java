#include<stdio.h>
int main()
{
 int total=0;  
    int number;  

    scanf("%d",&number);                


    while(number > 0){      

        total=total+number; 

        scanf("%d",&number);              

    }
    printf("%d\n", total);  
    return 0;
}