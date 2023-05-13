#include<iostream>
using namespace std;
int main(){
    int n, m;
    cin >> n;
    int arr[105];
    for (int i = 0; i < n; i++){
      cin >> arr[i];
  }
  for (int i = 0; i < n; i++){
      for (int j = 0; j < n - i - 1; j++){
        if (arr[j] > arr[j + 1]){
          m = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = m;
      }
    }
  }
  for (int i = 0; i < n; i = i + 2){
    if (arr[i] != arr[i + 1]){
      cout << arr[i];
      return 0;
      break;
    }
  }
  cout << arr[n - 1];
    return 0;
}