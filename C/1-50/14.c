#include <stdio.h>
#include <math.h>

long long int modularPow(long long int base, long long int exponent, long long int modulus) {
    long long int result = 1;
    while (exponent > 0) {
        if (exponent % 2 == 1) {
            result = (result * base) % modulus;
        }
        base = (base * base) % modulus;
        exponent /= 2;
    }
    return result;
}

int main() {
    int n, k;
    scanf("%d %d", &n, &k);

    long long int output;
    if (n == 0) {
        output = 1;
    } else {
        output = modularPow(k + 1, n, 1000000007);
    }

    printf("%lld\n", output);

    return 0;
}
