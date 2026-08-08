#include<stdio.h>
int main()
{
	int empty;
	int arr[6] = { 9,5,8,1,7,3 };
	for (int n = 1; n < 6; n++)
	{
		for (int i = n; i>=1; i--)
		{
			if (arr[i] < arr[i-1])
			{
				empty = arr[i];
				arr[i] = arr[i - 1];
				arr[i-1] = empty;
			}
			else
				break;
		}
	}
	for (int i = 0; i < 6; i++)
	{
		printf("%d\t", arr[i]);
	}
	return 0;
}