#include<iostream>
#include<math.h>
#define qol 1000000007 
int binpow(int a,int n){
  if(n==0) return 1;
  if(n%2==0){
     int x=binpow(a,n/2);
     return 1LL*x*x%qol;}
     return 1LL*a*binpow(a,n-1)%qol;
  }
using namespace std;
int main(){
  int n,k;
  cin>>n>>k;
  cout<<binpow(k+1,n);
}