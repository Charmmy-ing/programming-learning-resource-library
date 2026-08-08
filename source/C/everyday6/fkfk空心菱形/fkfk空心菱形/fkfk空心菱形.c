#include<stdio.h>
int main()
{
	int n, a;
	printf("Please enter a: ");
	scanf_s("%d", &a);
	n = a + 1;
	for (int i = 1; i <= n; i++)
	{
		for (int j = i; j < n; j++)
		{
			printf(" ");
		}
		for (int j = 1; j <= 2 * i - 1; j++)
		{
			if (j == 1 || j == 2 * i - 1)
			{
				printf("*");
			}
			else
			{
				printf(" ");
			}
		}
		printf("\n");
	}
	for (int i = n - 1; i > 0; i--)
	{
		for (int j = i; j < n; j++)
		{
			printf(" ");
		}
		for (int j = 1; j <=2 * i - 1; j++)
		{
			if (j == 1 || j == 2 * i - 1)
			{
				printf("*");
			}
			else
			{
				printf(" ");
			}
		}
		printf("\n");
	}
	return 0;
}