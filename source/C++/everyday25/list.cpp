#include<stdio.h>
#include<stdlib.h>
//define a list type;
typedef struct Nope
{
	int data;
	struct Nope* next;
}nope;
void output(nope* p);
nope* ini();
nope* insort(nope* l, int n);
int main()
{
	// 初始化；
	nope* list = ini();
	nope* l=list;
	// 建立一个2元链表；
	list = insort(list, 2);
	list = insort(list, 3);
	list = insort(list, 5);
	list = insort(list, 7);
	list = insort(list, 11);
	list = insort(list, 61);
	output(l);
	return 0;
}
// 初始化;
nope* ini()
{
	nope* l = (nope*)malloc(sizeof(nope));
	l->data = 0;
	l->next = NULL;
	return l;
}
//尾插插入
nope* insort(nope* l, int n)
{
	nope* p = (nope*)malloc(sizeof(nope));
	l->next = p;
	p->next = NULL;
	p->data = n;
	return p;
}
//output;
void output(nope* l)
{
	nope* p = l->next;
	while (p != NULL)
	{
		printf("%d\n", p->data);
		p = p->next;
	}
	printf("\n");
}
