#include <bits/stdc++.h>
using namespace std;
int main()
{
    long long a,b,c,d,e,mn,mx;
    cin>>a>>b>>c>>d>>e;
    mn=min(min(a,b),min(c,min(e,d)));
    mx=max(max(a,b),max(c,max(e,d)));
    cout<<a+b+c+d+e-mx<<" "<<a+b+c+d+e-mn;
   	return 0;
}