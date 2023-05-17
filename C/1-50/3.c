#include <stdio.h>
#include <string.h>

char* findSum(char* str1, char* str2) {
    if (strlen(str1) > strlen(str2)) {
        char* temp = str1;
        str1 = str2;
        str2 = temp;
    }
    
    int n1 = strlen(str1);
    int n2 = strlen(str2);
    int maxLength = n2;
    
    int carry = 0;
    char* result = malloc((maxLength + 2) * sizeof(char));
    int index = maxLength;
    result[index] = '\0';
    
    for (int i = n1 - 1; i >= 0; i--) {
        int sum = (str1[i] - '0') + (str2[i + n2 - n1] - '0') + carry;
        result[--index] = sum % 10 + '0';
        carry = sum / 10;
    }
    
    for (int i = n2 - n1 - 1; i >= 0; i--) {
        int sum = (str2[i] - '0') + carry;
        result[--index] = sum % 10 + '0';
        carry = sum / 10;
    }
    
    if (carry > 0) {
        result[--index] = carry + '0';
    }
    
    return result + index;
}

int main() {
    char A[100], B[100];
    scanf("%s%s", A, B);
    printf("%s\n", findSum(A, B));
    return 0;
}