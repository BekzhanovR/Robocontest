#include <iostream>
using namespace std;
const int mod = 1e9 + 7;
int binpow(int a, int n ){
    if(n == 0) return 1;
    if(n % 2 == 0){
        int x = binpow(a, n/2);
        return 1LL * x * x % mod;
    }
    return 1LL*a*binpow(a, n-1) % mod;
}
int main(){
    int n, k, a, b;
    cin >> n >> k;
    a = binpow(k, n) - 1;
    b = k - 1;
    cout << 1LL * a * binpow(b, mod - 2) % mod;
    return 0;
}