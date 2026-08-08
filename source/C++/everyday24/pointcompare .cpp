#include<stdio.h>
void seq(int *l);
int main()
{
	//input;
	int num[3]={0};
	printf("Please enter three numbers:\n");
	for (int i = 0; i <3; i++)
	{
	 scanf("%d",&num[i]);
	}
	// work;
	seq(num);
	// output;
	for (int i = 0; i <3; i++)
	{
	printf("%d\t",num[i]);
	}
	return 0;
}
// functions;
void seq(int *num)
{
 int empty;
 for (int i =1; i <3 ; ++i)
 {
 	if (num[0]<num[i])
 	{
 		empty=num[0];
 		num[0]=num[i];
 		num[i]=empty;
 	}
 }
 	if (num[1]<num[2])
 	{
 		empty=num[1];
 		num[1]=num[2];
 		num[2]=empty;
 	}
 }
