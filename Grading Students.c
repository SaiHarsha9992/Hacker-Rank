#include<stdio.h>
int main()
{
    int n,i,in;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        in=(a[i]/5+1)*5;
        if(a[i]<38)
        {
            printf("%d\n",a[i]);
        }
        else if(in-a[i]<3) 
        {
            printf("%d\n",in);
        }
        else
        {
            printf("%d\n",a[i]);
        }
    }
}
