#include <stdio.h>

int main() {
    int n, k;
    scanf("%d %d", &n, &k);

    if (n == 0) {
        printf("1\n");
    } else {
        printf("%d\n", k + 1);
    }

    return 0;
}
