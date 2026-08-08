#include<stdio.h>
#include<stdlib.h>
int main() 
{
	int* numbers=0;
	int length=0;
	while (1)
	{
		int input;
		scanf_s("%d",&input);
		if (input == 0)
			break;
		int* larger=(int*)malloc(sizeof(int)*(length+1));//c++更严void无法转成int，要显性改为int
		//也可以用numbers=realloca（numbers,sizeof(int)*(length+1)
		for (int i = 0; i < length; i++)
		{
			larger[i] = numbers[i];
		}
		free(numbers);
		numbers = larger;
		numbers[length] = input;
		length++;
	}
	printf("numbers: ");
	for (int i = 0; i < length; i++)
	{
		printf("%d", numbers[i]);
	}
	return 0;
}