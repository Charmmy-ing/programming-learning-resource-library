#include<stdio.h>
int main()
{
	int a, b;
	printf("enter teo integers:");
	scanf_s("%d%d", &a, &b);
	if (a > b)
	{
		printf("a>b");
	}
	else//这个后面可触发，省了算力
	{
		if (a < b)
		{
			printf("a<b");
		}
		else
		{
			if (a == b)
			{
				printf("a==b");
			}
		}
	}
}