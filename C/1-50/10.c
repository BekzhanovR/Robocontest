#include <stdio.h>
int main() {
    long long A, B, C, N, d;
    scanf("%lld", &N);
    scanf("%lld %lld %lld", &A, &B, &C);
    d = A + B + C;
    if (N <= d) {
        printf("Yes");
    } else {
        printf("No");
    }
    return 0;
}
