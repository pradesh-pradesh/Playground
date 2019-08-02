#include<stdio.h>
int main()
{
int a,b,c;
scanf("%d%d%d",&a,&b,&c);
 if(a>b){
      if(b>c){
      printf("The treasure is in the box which has number %d.\n ",b);
  }
  else if(c>a){
      printf("The treasure is in the box which has number %d.\n ",a);
  }
  else{
      printf("The treasure is in the box which has number %d.\n ",c);
  }
  }
  else{
      if(b<c){
      printf("The treasure is in the box which has number %d.\n",b);
  }
  else if(c<a){
      printf("The treasure is in the box which has number %d.\n",a);
  }
  else{
      printf("The treasure is in the box which has number %d.\n",c);
  }
  }
if((a<b)&&(a<c))
{
printf("The code to open the box is %d.",a);
}
else if(b<c)
{
 printf("The code to open the box is %d.",b);
}
else
   printf("The code to open the box is %d.",c);
return 0;
}
