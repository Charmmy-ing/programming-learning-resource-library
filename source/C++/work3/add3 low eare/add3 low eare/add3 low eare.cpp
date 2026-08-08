#include<stdio.h>
int main()
{
	int integer, sum;
	printf("please enter the first integer：");
	scanf_s("%d", &integer);
	sum = integer;
	printf("please enter the second integer:");
	scanf_s("%d", &integer);
	sum = sum + integer;
	printf("please enter the thrid integer");
	scanf_s("%d", &integer);
	sum = integer + sum;
	printf("sum = %d", sum);
	return 0;
}
