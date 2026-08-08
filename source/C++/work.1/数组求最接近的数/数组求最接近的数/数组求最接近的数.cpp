#include<stdio.h>
int main()
{
	int  i[10], Q, m, n;
	printf("enter your number:");
	scanf_s("%d\n", &Q);
	while (1)
	{
		printf("enter 10 numbers:");
		for (m = 0; m < 10; m++)
		{
			scanf_s("%d", &i[m]);
		}
		 int max_i=-1;
		for (n = 0; n < 10; n++)
		{
			if (i[n]<Q && (i[n]>i[max_i]||max_i==-1))
			{
				max_i = n;
			}
		}
		if (max_i != -1)
		{
			printf("%d\n", i[max_i]);
		}
		else
		{
			break;
		}
	}return 0;
}