#include<stdio.h>
#include<string.h>
int main()
{
	char name1[100],name2[100];
	scanf("%[^\n]s",&name1);
	scanf("\n");
	scanf("%[^\n]s",&name2);
	int l=strcat(name1,name2);
	printf("%s",l);
}
