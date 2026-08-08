#include<stdio.h>
#include<string.h>
#define nums 10
//定义一个角色；
typedef struct
{
	int num;
	char name[nums];
	int grade;
}stu;
//输入角色信息；
void input(stu* l, int i)
{
	printf("what is his or her name?\n");
	scanf("%s", &l->name);
		printf("please enter his or her studentIDnum:\n");
	scanf("%d", &l->num);
	printf("please enter grade:\n");
	scanf("%d", &l->grade);
}
//求出角色加权分数；
int average(stu*l,stu *m,stu* o)
{
	int averagegrade = (l->grade + m->grade + o->grade) / 3;
	return averagegrade;
}
// 主函数；
int main(int argc, char const* argv[])
{
	stu student[3];
	for (int i = 0; i < 3; i++)
	{
		input(&student[i], i + 1);
	}
		printf("averagegrade is :%d", average(&student[0], &student[1], &student[2]));
	return 0;
}
