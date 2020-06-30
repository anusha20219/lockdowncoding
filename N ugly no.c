#include<stdio.h>
#include<math.h>

int isprime(int x)
{
    int i;
    for(i=2;i<=sqrt(x);i++)
        if(x%i==0)
            return 0;
    return 1;
}

int isUgly(int x)
{
    int count=0; //To maintain the count of the prime factors. If count > 3, then the number is not ugly
    int i;
    for(i=2;i<=sqrt(x);i++)
    {
        if(isprime(i) && x%i==0)
        {
            count++;
            if(count > 3)
                return 0; // Not ugly
        }   
    }
    return 1;
}

int main(void)
{
    int i,n=10;
    printf("\n The ugly numbers upto %d are : 1 ",n);
    for(i=2;i<=n;i++)
    {
        if(isUgly(i))
            printf(" %d ",i);
    }
    return 0;
}
