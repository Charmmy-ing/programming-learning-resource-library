#include<stdio.h>
int main()
{
	int a, b, c,o;//384
	printf("please enter there integers:");
	scanf_s("%d%d%d", &a, &b, &c);
	if (b < a)
	{
		o = b;
		b = a;
		a = o;
	}
	if (c < a) 
	{
		o = a;
		a = c;
		c = o;
	}
	if (c < b)
	{
		o = c;
		c = b;
		b = o;
	}
	printf("%d%d%d", a, b, c);
	return o;
}
