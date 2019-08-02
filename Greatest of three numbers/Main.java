#include<stdio.h>
int main()
{
 int A, B, C; 
    scanf("%d %d %d", &A, &B, &C); 
  
    if (A >= B && A >= C) 
        printf("%d is greater", A); 
  
    if (B >= A && B >= C) 
        printf("%d is greater", B); 
  
    if (C >= A && C >= B) 
        printf("%d is greater", C); 
  
    return 0; 
}