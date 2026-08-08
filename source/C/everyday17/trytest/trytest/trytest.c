#include<stdio.h>
int main()
{
	int arr[3] = { 1,2,3 };
	int *a = arr+1;
	printf("%d", *arr);
	return 0;
}