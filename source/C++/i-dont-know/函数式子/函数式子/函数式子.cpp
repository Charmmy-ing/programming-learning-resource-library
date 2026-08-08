#include<stdio.h>
int max2(int a, int b);

int main()
{
	int a, b;
	printf("enter first integer:");
	scanf_s("%d", &a);
	printf("enter scond integer:");
	scanf_s("%d", &b);
	printf("%d\n", max2(a, b));
	return 0;
}
int max2(int a,int b)
{
	int max;
	if (a >= b)
	{
		max = a;
	}
	else
	{
		max = b;
	}return max;
}