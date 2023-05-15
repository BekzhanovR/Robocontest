#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    long long int n, soniTub = 1;
    cin >> n;
    bool ha = true;
    for (int j = 3; j <= n; j += 2)
    {
        ha = true;
        for (int i = 2; i <= sqrt(j); i++)
        {
            if (j % i == 0)
            {
                ha = false;
                break;
            }
        }
        if (ha)
            soniTub++;
    }
    if (soniTub % 2 != 0)
        cout << "Ali";
    else
        cout << "Bobur";
}