#include<stdio.h>
typedef int new;
typedef struct 树与二叉树，完全二叉树
{
	new data;
	treenope *lchild;
	treenope *rchild;
}treenode;
typedef treenode* bitree;  
//定义一个树
char str[]="ABDH#K###E##CFI###G#J##";
int dex=0;
void creatatree(bitree *l);   
{
 char ch;
 ch=str[dex++];
 if(ch=='#') 
 	{
 		*l=NULL;
 	}
 	else
 	{
 		*l=(bitree)malloc(sizeof(treenope));
 		(*l)->data=ch;
 		creatatree(&(*l)->lchild);
 		creatatree(&(*l)->rchild); 
 	}

}
//前序历遍
void preorder（bitree l）
{
	if(l==NULL)
	{
		return;
	}
	printf("%d",l->data);
	preorder("%d"l->lchild);
	preorder("%d",l->rchild);  
}   
//中序遍历
void inorder(bitree l)
{
	if(l==NULL)
	{
		return;
	}
	inorder("%d"l->lchild);
	print("%d",l->data);
	inorder("%d",l->rchild); 
}
//后序历遍
void postorder(bitree l)
{
	if(l==NULL)
	{
		return;
	}
	inorder("%d"l->lchild);
	inorder("%d",l->rchild);
	print("%d",l->data); 
}
int main(int argc, char const *argv[])
{
	treenope list;
	creatatree(&(bitree list)); 
	preorder（&list）;
	inorder(&list);
	return 0;
}
