#include<stdio.h>
int main()
{
     int number,temp,sum = 0, digit, res;
  
    scanf("%d",&number);

    temp = number;
   while(temp!=0)
   {
      
        digit=temp % 10;
  
        sum = sum + digit;
  
        temp = temp / 10;
   }
   res = number % sum;

   if(res == 0)
    
       printf("Harshard Number");
   else
      //display
      printf("Not Harshard Number");
  return 0;
}