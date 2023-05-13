import 'dart:io';

void main() {
  int n = int.parse(stdin.readLineSync()!);
  List<int> f = List<int>.filled(46, 0);
  f[0] = 0;
  f[1] = 1;
  for (int i = 2; i <= 45; i++) {
    f[i] = f[i - 2] + f[i - 1];
  }
  print(f[n] * 2);
}
