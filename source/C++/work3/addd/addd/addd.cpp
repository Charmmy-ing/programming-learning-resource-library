#include <stdio.h>
int main()
{ 

	int integer1;//定义了
	int integer2;//定义了
	int sum;//定义了整数
	printf("please enter the first integer:");
	scanf_s("%d", &integer1);//scanf-s为读取键盘
	printf("please enter the second integer:");
	scanf_s("%d", &integer2);//&为选址符号
	sum = integer1 + integer2;//=只能读右边不能读左边
	printf("Sum is %d", sum);
	return 0;

}