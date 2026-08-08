#include<stdio.h>
int main()
{
    int* shuffle(int* nums, int numsSize, int n, int* returnSize)
    {
        int* arr = malloc(numsSize * sizeof(int));
        for (int i = 0; i < numsSize; i++)
        {
            arr[i] = nums[i];
        }
        for (int i = 0; i < numsSize - 1; i++)
        {
            if (i == 0 || i % 2 == 0)
            {
                nums[i] = arr[i / 2];
            }
            else
            {
                nums[i] = arr[numsSize / 2 + i / 2];
            }
        }
        free(arr);
        *returnSize = numsSize;
        return nums;
    }//有更简单的方法，可以以arr为主体来输出；这个时候就不用给arr先复制成nums了这个时候就只用分奇偶的情况；只用写3行复杂度低太多了，
    //这题里面要区分出数组里的数和计算出来的数的区别；计算出的数始终比数组里的数大一
    //奇偶性与2nhe2n-1or+1直接关联，没有必要想太多；


}