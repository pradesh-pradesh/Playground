#include<stdio.h>  
#define MAX_SIZE 100
int main()
{
  int arr[MAX_SIZE];
    int i, size, even, odd;

 
    scanf("%d", &size);

 
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

 
    even = 0;
    odd  = 0;

    for(i=0; i<size; i++)
    {
       
        if(arr[i]%2 == 0)
        {
            even++;
        }
        else
        {
            odd++;
        }
    }

    
    printf("Odd: %d\n", odd);
    printf("Even: %d", even);
    return 0;
}