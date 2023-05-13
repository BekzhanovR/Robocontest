#include <stdio.h>

int main() {
    int a, b;
    scanf("%d %d", &a, &b);
    char x;
    if (a > b) {
        x = '>';
    } else if (a == b) {
        x = '=';
    } else {
        x = '<';
    }
    printf("%c\n", x);
    return 0;
}
