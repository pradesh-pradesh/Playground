#include<stdio.h>
int main()
{
  int i, n, t1 = 1, t2 = 2, nextTerm;
    printf("Enter n value \n");
    scanf("%d", &n);
    for (i = 1; i <= n; ++i)
    {
        printf("%d ", t1);
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    }
    return 0;
}