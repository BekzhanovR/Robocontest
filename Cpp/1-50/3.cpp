#include<fstream>
#include<string.h>
#include<iostream>
#include<math.h>
using namespace std;
char s1[100000000],s2[100000000];
ifstream in("input.txt");
ofstream out("output.txt");
int a[100000000],b[100000000],c[100000000];
int main() {
  in>>s1>>s2;
  for(int i=0; i<strlen(s1); i++) {
    a[i]=s1[i]-48;
  }
  for(int i=0; i<strlen(s2); i++) {
    b[i]=s2[i]-48;
  }
  int m=min(strlen(s1), strlen(s2));
  int Max=max(strlen(s1), strlen(s2))-1;
  for(int i=Max; i>=0; i--) {
    if(strlen(s1)>=strlen(s2) ) {
      c[i]=c[i]+a[i]+b[m-1];
      if(i>0) {
        c[i-1]=c[i]/10;
        c[i]=c[i]%10;
      } m-=1;
    }
    else
      if(strlen(s2)>strlen(s1)) {
      c[i]=c[i]+b[i]+a[m-1];
      if(i>0) {
        c[i-1]=c[i]/10;
        c[i]=c[i]%10;
      } m-=1;
    
  }
}
for(int i=0; i<max(strlen(s1), strlen(s2)); i++)
    out<<c[i];
    return 0;
}