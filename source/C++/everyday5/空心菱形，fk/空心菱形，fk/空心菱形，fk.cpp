#include<stdio.h>
int main()
{
	int n;
	printf("Please enter half of high \"n\" :");
		scanf_s("%d", &n);
		for (int i = 1; i <=n; i++)
		{
			for (int j = n; j > n-i; j--)
			{
				printf(" ");
			}
			for(int j=1;j<=2*i-1;j++)
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
			for (int j = 1; j < n - i; j++)
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
		return 0;
}