#include<stdio.h>
int main()
{

	int integer1, integer2, integer3, sum;
	printf("please enter the first integer：");
	scanf_s("%d", &integer1);
	printf("please enter the second integer:");
	scanf_s("%d", &integer2);
	printf("please enter the thrid integer");
	scanf_s("%d", &integer3);
	sum = integer1 + integer2 + integer3;
	printf("sum = %d", sum);
	return 0;

}