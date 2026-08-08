#include<stdio.h>
#include<stdlib.h>
int* getConcatenation(int* nums, int numsSize, int* returnSize);
int main()
{
    int numsSize = 5;
    int nums[5] = { 1,2,3,4,5 };
    int returnS=0;
    int* returnSize = &returnS;
    int* ans = getConcatenation(nums, numsSize,returnSize);
        for (int i = 0; i < 2 * numsSize; i++)
        {
            printf("%d", ans[i]);
        }
        return 0;
}
int* getConcatenation(int* nums, int numsSize, int* returnSize)
{
    int* ans;
    ans = malloc(2 * numsSize * sizeof(int));
    if (ans ==NULL)
    {
        printf(" wrong");
        return NULL;
    }
    for (int i = 0; i < numsSize; i++)
    {
        ans[i] = nums[i];
        ans[numsSize + i] = nums[i];
    }
    *returnSize = 2 * numsSize;
    return ans;
}