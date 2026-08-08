#include <stdio.h>
int main()
{

	int  integer1, integer2, integer3;
	double average;
	printf("please enter the first integer:");
	scanf_s("%d", & integer1);
	printf("please enter the scond integer:");
	scanf_s("%d", &integer2);
	printf("please enter the third integer:");
	scanf_s("%d", &integer3);
	average = (integer1 + integer2 + integer3)/3.;//i处理i一定得i'3.是转型了的.3为int  3.为double两者型别不同or(double)3
	return 0;//隐形转型 int与float运算会把int转为float

} 