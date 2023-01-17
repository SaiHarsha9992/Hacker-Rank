#include<stdio.h>
#include<string.h>
int main()
{
	char name1[100];
	scanf("%[^\n]s",name1);
	int l=strrev(name1);
	printf("%s",l);
}
