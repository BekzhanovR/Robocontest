#include <bits/stdc++.h>
using namespace std;
int main()
{
   long long A,B,C,N,d;
   cin >> N;
   cin >> A >> B >> C;
   d=A+B+C;
   if(N<=d)
   {
       cout << "Yes";
   }
   else
    {
    cout << "No";
    }
   return 0;
}