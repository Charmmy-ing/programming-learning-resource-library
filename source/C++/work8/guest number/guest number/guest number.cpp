#include<stdio.h>
int main()
{
	int anwser = 4;
	int guess;
	printf("enter your guess:");
	scanf_s("%d", &guess);
	if (guess < anwser)
	{
		printf("is small");
	}
	else 
	{
		if (guess > anwser) 
		{
			printf("is big");

		}
		else
		{
			if (anwser == guess) {
				printf("right");
			}


		}
			
	}

}