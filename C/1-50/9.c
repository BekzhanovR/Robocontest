#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int s[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &s[i]);
    }

    for (int i = 0; i < n; i++) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (s[j] == s[i]) {
                count++;
            }
        }
        if (count == 1) {
            printf("%d\n", s[i]);
        }
    }

    return 0;
}
