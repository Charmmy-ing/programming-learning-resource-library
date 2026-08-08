#include<stdio.h>

int rand();
int main()
{
	for (int i = 1; i <= 5; i++)
	{
		printf("%d\n",rand());
		}
	return 0;
}
int rand(void)
{
	static unsigned int next;
	next = next * 15241351 + 546;
	return (next / 15616) % 5135;

}