#include<stdio.h>
int main()
{

	int side1, side2, side3;
	printf("please enter the lengths:");
	scanf_s("%d%d%d", &side1, &side2, &side3);
	if (side1 == side2 || side2 == side3||side3==side1)
	{
		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
		{
			printf("Isosceles triangle\n");
			
		}
		return 0;
	}


}//if ((side1 = side2 || side1 = sode3 || side2 = side3) && a + b > c && b + c > a && a + c > b)