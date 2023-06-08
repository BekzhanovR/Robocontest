#include <stdio.h>
#include <string.h>

char* son(int n) {
    static char satr[10];
    switch(n) {
        case 1: return "bir";
        case 2: return "ikki";
        case 3: return "uch";
        case 4: return "to'rt";
        case 5: return "besh";
        case 6: return "olti";
        case 7: return "yetti";
        case 8: return "sakkiz";
        case 9: return "to'qqiz";
        case 10: return "o'n";
        case 20: return "yigirma";
        case 30: return "o'ttiz";
        case 40: return "qirq";
        case 50: return "ellik";
        case 60: return "oltmish";
        case 70: return "yetmish";
        case 80: return "sakson";
        case 90: return "to'qson";
        case 100: return "yuz";
        case 1000: return "ming";
        case 1000000: return "million";
        case 1000000000: return "milliard";
        default: return "";
    }
}

char* maydala(int n) {
    static char satr[100];
    strcpy(satr, " ");
    if (n % 100 / 10 != 0) {
        if (strcmp(satr, "") != 0) strcat(satr, " ");
        strcat(satr, son(n % 100 / 10 * 10));
    }
    if (n >= 100) {
        if (strcmp(satr, "") != 0) strcat(satr, " ");
        strcat(satr, son(n / 100));
        strcat(satr, " yuz");
    }
    strcat(satr, son(n % 10));
    return satr;
}

void printUzbekLotin(long long n) {
    if (n == 0) {
        printf("nol");
        return;
    }

    char satr[10000];
    strcpy(satr, " ");
    int i = 0;
    while (n != 0) {
        int chunk = n % 1000;
        if (chunk != 0) {
            strcat(satr, maydala(chunk));
            if (i == 0) strcat(satr, " ");
            if (i == 1) strcat(satr, " ming ");
            if (i == 2) strcat(satr, " million ");
            if (i == 3) strcat(satr, " milliard ");
        }
        n /= 1000;
        i++;
    }
    printf("%s", satr);
}

int main() {
    long long n;
    scanf("%lld", &n);
    printUzbekLotin(n);
    return 0;
}
