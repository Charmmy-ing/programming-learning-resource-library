// 用 VS 写 C 的老习惯了，先关个安全警告
#include<stdio.h>
int main()
{
	double x;
	double y;
		printf("Please enter integer：");
		scanf("%lf", &x);
		while(1)
		{
			if (x < 1)
			{
				y = x;
				printf("Your y is %f\n", y);

			}
			else
			{
				if (1 <= x && x <= 10)
				{
					y = 2 * x - 1;
				}
				else
				{
					y = 3 * x - 11;
				}
				printf("Your y is %d\n", (int)y);
			}
		printf("Please enter integer：");
		scanf("%lf", &x);
	    }

}