#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int s[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &s[i]);
    }

    int max = s[0];
    int maxIndex = 0;
    for (int i = 1; i < n; i++) {
        if (s[i] > max) {
            max = s[i];
            maxIndex = i;
        }
    }

    for (int i = maxIndex; i < n - 1; i++) {
        s[i] = s[i + 1];
    }

    int newMax = s[0];
    for (int i = 1; i < n - 1; i++) {
        if (s[i] > newMax) {
            newMax = s[i];
        }
    }

    printf("%d\n", newMax);

    return 0;
}
