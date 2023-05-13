#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    long long a[100];
    for (int i=0; i<n; i++)
    {
        cin>>a[i];
    }
    sort(a,a+n);
    cout << a[n-2];
    return 0;
}