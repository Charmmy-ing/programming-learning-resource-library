#include<stdio.h>
typedef char new;
typedef struct node
{
  new data;
  int liog;
  //0表示指向一个结点；1表示指向一个线索；
  int rlog;
  struct node*lchild;
  struct node*rchild;
}Node;
//define a arr;
new arr[]='ABDH##I##EJ###CF##G##';
int dev=0;
//create a tree;
void createtree(Nope *l)
{
new ch=arr[dev];
if(ch=='#')
{
	l==NULL;
	return;
}
else
{
	l=(Nope *)malloc(sizeof(Nope));
	l->data=ch;
	dev++;

	createtree(l->lchild)
	{
		if(l->lchild!=NULL)
		{
          l->llog=0;
		}
		createtree(l->rchild)
	{
		if(l->rchild!=NULL)
		{
          l->rlog=0;
		}
	}
}
typedef Node* tree;
int main(int argc, char const *argv[])
{
	Node list;
	createtree(&list)
	return 0;
}