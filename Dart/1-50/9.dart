import 'dart:io';

void main() {
  int n = int.parse(stdin.readLineSync()!);
  List<int> s = stdin.readLineSync()!.split(' ').map(int.parse).toList();

  for (int i in s) {
    if (s.where((x) => x == i).length == 1) {
      print(i);
    }
  }
}
