#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
	int q[4],i,j,t;
	printf("Please enter four integers:");
	for (i = 0; i < 4; i++)
	{
		scanf("%d", &q[i]);
	}
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 3 - i; j++)
		{
			if (q[j] > q[j+1])
			{
				int t = q[j];
				q[j] = q[j+1];
				q[j+1] = t;
			}
		}
	}
	for (i = 0; i < 4; i++)
	{
		printf("%d", q[i]);
	}
	return 0;
}