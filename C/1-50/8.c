#include <stdio.h>

long long min(long long a, long long b) {
    return (a < b) ? a : b;
}

long long max(long long a, long long b) {
    return (a > b) ? a : b;
}

int main() {
    long long a, b, c, d, e, mn, mx;
    scanf("%lld %lld %lld %lld %lld", &a, &b, &c, &d, &e);
    mn = min(min(a, b), min(c, min(e, d)));
    mx = max(max(a, b), max(c, max(e, d)));
    printf("%lld %lld", a + b + c + d + e - mx, a + b + c + d + e - mn);
    return 0;
}
