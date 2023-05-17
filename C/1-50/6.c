#include <stdio.h>

int funk(int n) {
    int count = 0;
    while (n != 0) {
        n /= 10;
        count++;
    }
    return count;
}

int main() {
    int n, k;
    scanf("%d", &n);
    k = funk(n);
    if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
        if (k == 1) { printf("12/09/000%d\n", n); }
        if (k == 2) { printf("12/09/00%d\n", n); }
        if (k == 3) { printf("12/09/0%d\n", n); }
        if (k == 4) { printf("12/09/%d\n", n); }
    }
    else {
        if (k == 1) { printf("13/09/000%d\n", n); }
        if (k == 2) { printf("13/09/00%d\n", n); }
        if (k == 3) { printf("13/09/0%d\n", n); }
        if (k == 4) { printf("13/09/%d\n", n); }
    }
    return 0;
}