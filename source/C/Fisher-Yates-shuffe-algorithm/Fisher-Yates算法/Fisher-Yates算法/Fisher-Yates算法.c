#include<stdio.h>
#include<time.h>
//定义一个常量；
#define n 9
int main()
{
	//我要洗的牌；
	int arr[9] = { 1,2,3,4,5,6,7,8,9 };
	//设置乱数种；
	srand(time(NULL));
	//对每张牌进行换洗；
	for (int i = n - 1; i > 0; --i)
	{
		//选取随机交换的位置；
		int num = rand() % (i + 1);
		int temp = arr[i];
		arr[i] = arr[num];
		arr[num] = temp;
	}
		for (int i = 0; i < 9; i++)
		{
			printf("%d\t", arr[i]);
		}
}