#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int scope(int);

int main()
{
	int grade;
	printf("Please enter your grade:");
	scanf("%d", &grade);
	
	switch (scope(grade)) 
	{
	case 1:printf("A");
		break;
	case 2:printf("B");
		break;
	case 3:printf("C");
		break;
	case 4:printf("D");
		break;
	case 5:printf("E");
		break;
	default: printf("wrong");
	}
	return 0;
}
int scope(int grade)
{
	if (90 <= grade&&grade <= 100) return 1;
	if (81 <= grade&&grade < 90) return 2;
	if (70 <= grade&&grade < 80) return 3;
	if (60 <= grade&&grade < 70) return 4;
	if (0 <= grade&&grade < 60) return 5;
}