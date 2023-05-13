import 'dart:io';
void main() {
  List<String> inputs = stdin.readLineSync()!.split(' ');
  int n = int.parse(inputs[0]);
  int p = int.parse(inputs[1]);
  print(n * p);
}
