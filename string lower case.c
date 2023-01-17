#include<stdio.h>
#include<string.h>
int main()
{
    char name[100];
    scanf("%[^\n]s",name);
    strlwr(name);
    printf("%s",name);
}
