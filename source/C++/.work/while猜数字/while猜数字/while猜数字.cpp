#include<stdio.h>
int main()
{
	int answer = 4;
	int Guess;
	int count = 1;
	printf("enter your guess:");
	scanf_s("%d", &Guess);
	while (Guess != 4)
	{
		if (Guess > 4)
		{
			printf(">\n");
		}
		else {
			if (Guess < 4)
			{
				printf("<\n");
			}
		}
	
				printf("enter your new guess:");
				scanf_s("%d", &Guess); 
				count = count + 1;
			
		}

		printf("Right!!!!!\n");
		printf("%d", count);
		return 0;
}