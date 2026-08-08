#include<stdio.h>
typedef int new;
int ini();
int insort(nope *l,new);
typedef struct Nope
{
	int data;
	struct Nope *next;
}nope;
int main(int argc, char const *argv[])
{
	// 初始化；
	nope *list=ini();
	// 建立一个2元链表；
     list=insort(list,2);
     list=insort(list,3);
	return 0;
}
// 初始化;
int ini()
{
	nope *l=(nope*)malloc(sizeof(nope));
	l->data=0;
	l->next=NULL;
	return l;
}
//尾插插入
int insort(nope *l;new n)
{
 nope *p=(nope*)malloc(sizeof(nope));
 l->next=p;
 p->next=NULL;
 p->data=n;
 return p;
}