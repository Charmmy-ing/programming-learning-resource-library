#include<stdio.h>
#include<string.h>
#define nums 10
void input(stu *Charm);
int average(int *Charm,int *Ben,int *Alen);
//定义一个角色；
typedef struct
{
	int num;
	char name[nums];
	int grade;
}stu;
//输入角色信息；
void input(stu *l,int i)
{
  printf("what is his or her name?");
  scanf("%s",&l->name)；
  printf("please enter num:");
  scanf("%d",&l->num);
  printf("please enter grade:");
  scanf("%d",&l->grade);
}
//求出角色加权分数；
int average(stu *Charm,stu *Ben,stu *Alen);
{
  int averagegrade=(Charm->grade+Ben->grade+Alen->grade)/3;
  return averagegrade;
}
// 主函数；
int main(int argc, char const *argv[])
{
	stu student[3];
   for(int i=0;i<3,i++)
   {
   	input(&student[i],i+1);
   }
    printf("%d",average(&,&Ben,&Alen));
	return 0;
}