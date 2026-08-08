#include<stdio.h>
int int main(int argc, char const *argv[])
{
    while (1)
    {
        static int i;
        i++;
        if (i == 100)
        {
            printf("%d", i);
            break;
        }
    }
    return 0;
}