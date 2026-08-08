#include<stdio.h>
int main()
{
	int a, b, c;
	printf("enter the lengths:");
	scanf_s("%d%d%d", &a, &b, &c);
	if ((a * a + b * b == c * c || c * c + a * a == b * b || b * b + c * c == a * a)&&a!=b&&b!=c&&c!=a)
	{
		printf(" Rectangular triangle\n");
	}
	return 0;
}