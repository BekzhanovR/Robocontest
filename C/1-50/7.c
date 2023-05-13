#include <stdio.h>
int main()
{
    long long n, k;
    scanf("%lld", &n);
    long long f[46] = {0, 1};
    for (int i = 2; i <= 45; i++)
    {
        f[i] = f[i - 2] + f[i - 1];
    }
    printf("%lld", f[n] * 2);
    return 0;
}
