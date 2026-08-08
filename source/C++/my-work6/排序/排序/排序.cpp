#include<stdio.h>
int main()
{
	int a, b;
	printf(" enter tow integers:");
	scanf_s("%d%d", &a, &b);
	if (a > b) {
		printf("%d %d", b, a);
	}
	if (a < b) {
		printf("%d %d", a, b);
	}
	return 0;
}