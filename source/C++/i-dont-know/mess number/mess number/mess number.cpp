#include<stdio.h>
#include<stdlib.h>
#include<time.h>//调用时间的函数
int main()
{
	srand(time(0));//srand叫乱数种 用来初始化rand
	int i;
	for (i = 1; i <= 5; i++)//换行
	{
		printf("%d\n", rand());
	}
	return 0;
}