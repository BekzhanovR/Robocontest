import 'dart:io';

const int mod = 1000000007;

int binPow(int a, int n) {
  if (n == 0) return 1;
  if (n % 2 == 0) {
    int x = binPow(a, n ~/ 2);
    return (x * x) % mod;
  }
  return (a * binPow(a, n - 1)) % mod;
}

void main() {
  List<String> input = stdin.readLineSync()!.split(' ');
  int n = int.parse(input[0]);
  int k = int.parse(input[1]);

  int a = binPow(k, n) - 1;
  int b = k - 1;
  int result = (a * binPow(b, mod - 2)) % mod;
  print(result);
}