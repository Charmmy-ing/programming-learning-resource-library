#include<stdio.h>
int main()
{
	int h = 1;
	int arr[6] = { 9,5,8,1,7,3, };
	while (h <3)
	{
		h = 2*h + 1;
	}
	while (h >= 1)
	{
		int empty = 0;
		for (int i = h; i < 6; i++)
		{
			for (int j = i; j >=h; j = j-h)
			{
				if (arr[j] < arr[j - h])
				{
					empty = arr[j];
					arr[j] = arr[j - h];
					arr[j - h] = empty;
				}
			}
		}
		h = h / 2;
	}
	for (int i = 0; i < 6; i++)
	{
		printf("%d\t", arr[i]);
	}
	return 0;
}