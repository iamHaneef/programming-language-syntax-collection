#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

/*
 int add(int a , int b)
{
        return a+b;
}
*/
void main()
{

   // int a = 5;
   // int b = 10;

   // add( a, b);

    int arr[] = {1,2,3,4,5};

    int arr2[2][3]={{1,2,3},{4,5,6}};

    int n = sizeof(arr)/sizeof(arr[0]);

    for(int i=0 ; i<n ; i++)
    {
        printf("%d",arr[i]);
    }

    printf(" ");
    for(int i=0 ; i<2 ; i++)
    {

        for(int j=0 ; j<3 ; j++)
        {
            printf("%d",arr2[i][j]);
        }
    }





    /*
    int a=2;

    switch(a)
    {
    case 1:
        printf("one");
        break;

    case 2:
        printf("two");
        break;

    default:
        printf("others");
        break;
    }
    */


    /*
    int i=5;
    int result = (i>=5) ? 10 : 0;
    printf("%d", result);
    */



  /*  for(int i=1;i<=5 ; i++)
    {
        printf("%d",i);
    }
    printf("\n");

    int j=1;
    while(j<=5)
    {
        printf("%d",j);
        j++;
    }

    printf("\n");
    int k=1;
    do{
        printf("%d",k);
        k++;
    }while(k<=5);

    */

    /*
    int a=5;
    int b=10;
    int c=15;

    if(a>b && a>c)
    {
        printf("%d", a );
    }
    else if(b>a && b>c)
    {
        printf("%d",b );
    }
    else{
        printf("%d",c);
    }

    */

   /* int a = 10;
    int b = 15;
    printf("%d %d %d %d %d"  , a+b , a-b , a*b , a/b , a%b);
    */


    /*
    int a = 5;
    float b = 10.5;
    char c = 'A';
    char str[10] = "haneef";

    printf("%d %f %c %s\n ",a,b,c,str);
    */

   /* int a;
    printf("Enter Integer : ");
    scanf("%d",&a);

    char c;
    printf("Enter char : ");
    scanf(" %c", &c);

    float b;
    printf("Enter float : ");
    scanf("%f",&b);

    char str1[10];
    printf("Enter String : ");
    scanf("%s",str1);
  */


}
