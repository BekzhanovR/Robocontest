import 'dart:io';

int fff(int n) {
  int s = 0, p;
  while (n > 0) {
    p = n % 10;
    s = s + p;
    n = n ~/ 10;
  }
  return s * s;
}

void main() {
  int n = int.parse(stdin.readLineSync()!);
  int k = 0;
  int i = 1, h = 0;
  while (k < n) {
    if (i % fff(i) == 0)
      k++;
    h = i;
    i++;
  }
  print(h);
}
