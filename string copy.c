#include<stdio.h>
#include<string.h>
int main()
{
	char name1[100],name2[100];
	scanf("%[^\n]s",name1);
	strcpy(name2,name1);
	printf("%s",name2);
}
