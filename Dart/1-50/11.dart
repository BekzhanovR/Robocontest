import 'dart:io';

void main() {
  int n = int.parse(stdin.readLineSync()!);
  List<int> s = stdin.readLineSync()!.split(' ').map(int.parse).toList();

  int max = s[0];
  int maxIndex = 0;
  for (int i = 1; i < n; i++) {
    if (s[i] > max) {
      max = s[i];
      maxIndex = i;
    }
  }

  s.removeAt(maxIndex);

  int newMax = s[0];
  for (int i = 1; i < n - 1; i++) {
    if (s[i] > newMax) {
      newMax = s[i];
    }
  }

  print(newMax);
}
