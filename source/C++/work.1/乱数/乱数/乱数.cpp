#include<stdio.h>
int main()
{
	unsigned int next = 1;
	for (int i = 1; i <= 5; i++)
	{
		next = next * 1321545 + 6359;
		int rand =(next / 35665) % 5615;
		printf("%d\n", rand);


	}
	return 0;
}