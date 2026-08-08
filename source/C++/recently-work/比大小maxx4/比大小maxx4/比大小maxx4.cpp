#include<stdio.h>5
int main()
{
	int A, B, C, D, M;
	printf("enter there integers:");
	scanf_s("%d%d%d%d", &A, &B, &C, &D);
	M = A;
	if (A < B)
	{
		M = B;
	}
	if (M < C) 
	{
		M = C;
	}
	if (M < D)
	{ 
		M = D; 
	}
	printf("%d", M);
	return 0;
}