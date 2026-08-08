#include<stdio.h>
int main()
{
	int a, b, c;
	printf("please enter there integers:");
	scanf_s("%d%d%d", &a, &b, &c);
	if (a > b && a > c) 
	{
		printf("max is %d", a);
	}
	if (b > a && b > c)
	{
		printf("max is %d", b);
	}
	if (c > b && c > a)
	{
		printf("max is %d", c);
	}
	return 0;

}