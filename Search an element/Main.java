#include<stdio.h>
int main()
{
  int array[100], search, c, n;
 
  scanf("%d", &n);
 
  for (c = 0; c < n; c++)
    scanf("%d", &array[c]);
 
 
  scanf("%d", &search);
 
  for (c = 0; c < n; c++)
  {
    if (array[c] == search)    /* If required element is found */
    {
      printf("%d is present in the array \n", search);
      break;
    }
  }
  if (c == n)
    printf("%d is not present in the array \n", search);
 
  return 0;
}