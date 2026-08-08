#include<stdio.h>
int main()
{
	char ch;
	printf("please enter your char:");
	scanf_s("%c",&ch);//存入房间要带&
	printf("your char is:%c", ch+ 32);
	return 0;

}