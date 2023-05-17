import 'dart:io';

void main() {
  List<String> inputs = stdin.readLineSync()!.split(' ');
  int n = int.parse(inputs[0]);
  int k = int.parse(inputs[1]);

  if (n == 0) {
    print("1");
  } else {
    print(k + 1);
  }
}
