#include<stdio.h>
void printstar(int N);//void is without send mean;
int main()
{
	int N;
	printf("N= ");
	scanf_s("%d", &N);
	int i, j;
	for (i = 1; i <= N; i++)
	{
		printstar(i);//印i个⭐⭐
	    printf("\n");
	}
return 0;
}



void printstar(int N)
{
	int j;
	for (j = 1; j <= N; j++)
	{
		printf("*");
	}
	return;
}