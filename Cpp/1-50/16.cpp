#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

string son(ll n){
  string satr;
  switch(n){
    case 1: return("bir");
    case 2: return("ikki");
    case 3: return("uch");
    case 4: return("to'rt");
    case 5: return("besh");
    case 6: return("olti");
    case 7: return("yetti");
    case 8: return("sakkiz");
    case 9: return("to'qqiz");
    case 10: return("o'n");
    case 20: return("yigirma");
    case 30: return("o'ttiz");
    case 40: return("qirq");
    case 50: return("ellik");
    case 60: return("oltmish");
    case 70: return("yetmish");
    case 80: return("sakson");
    case 90: return("to'qson");
    case 100: return("yuz");
    case 1000: return("ming");
    case 1000000: return("million");
    case 1000000000: return("milliard");
    default: return("");
  }
}

string maydala(int n){
  string satr="";
  int i=0;
  satr=son(n%10)+satr;
  if(n%100/10!=0) {
      if(satr!="") satr=" "+satr;
      satr=son(n%100/10*10)+satr;}
  if(n>=100) {
      if(satr!="") satr=" "+satr;
      satr=son(n/100)+" yuz"+satr;}
  return satr;
}

int main(){
  int arr[4];
  ll n,i=0;
  string satr,maydaSatr;
  cin>>n;
  while(n!=0){
    arr[i]=n%1000;
    n/=1000;
    i++;
  }
  string javob[i];
  for(int j=0;j<i;j++){
    maydaSatr="";
    maydaSatr=maydala(arr[j]);
    if(j!=0 && j!=3 && arr[j]!=0) maydaSatr+=" "+son(pow(10,j*3))+" ";
    if(j==3) maydaSatr+=" "+son(pow(10,3*3))+" ";
    satr=maydaSatr+satr;
  }
  cout<<satr;
}