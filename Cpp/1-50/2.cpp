#include <iostream>
using namespace std;
int main()
{
  float A,B;
  cin>>A>>B;
  if(A>B)
  {
    cout<<">";
  }
  if(A==B)
  {
    cout<<"=";
  }
  if(A<B)
  {
    cout<<"<";
  }
  return 0;
}