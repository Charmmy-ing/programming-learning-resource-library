#include<stdio.h>
int main()
{
	int ten[10]={0}, i, o,n;
	printf("please enter ten numbers: ");
	for (i = 0; i < 10; i++)
	{
		scanf_s("%d", & ten[i]);
	}
	for ( n = 0; n <9; n++)
	{
		for (i = 0; i <9-n ; i++)
		{
			if (ten[i] > ten[i+1])
			{
				o = ten[i];
				ten[i] = ten[i+1];
				ten[i + 1] = o;
			}
		}
	}
	for (i = 0; i < 10;i++)
	{
		printf("%d\t",ten[i]);
	}
}