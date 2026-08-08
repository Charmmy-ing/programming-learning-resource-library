#include<stdio.h>
int main() 
{
	int number;
	printf("Please enter the number of customers：");
	scanf_s("%d", &number);
	if (number*300 >= 3000)
	{
		printf("Total:%d", number * 240);
	}
	if (number * 300 < 3000)
	{
		printf("Total:%d\n", number * 300);
	}
		return 0;

}