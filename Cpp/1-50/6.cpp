#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n,k;
    cin>>n;
    k=log(n)/log(10)+1;
    if(n%400==0||n%4==0&&n%100!=0)
    {
        if(k==1){cout << "12/09/000"<< n ;}
        if(k==2){cout << "12/09/00"<< n ;}
        if(k==3){cout << "12/09/0"<< n ;}
        if(k==4){cout << "12/09/"<< n ;}
    }
    else{
        if(k==1){cout << "13/09/000"<< n ;}
        if(k==2){cout << "13/09/00"<< n ;}
        if(k==3){cout << "13/09/0"<< n ;}
        if(k==4){cout << "13/09/"<< n ;}
    }
    return 0;
}