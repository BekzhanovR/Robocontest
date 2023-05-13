import 'dart:io';

void main() {
  String input = stdin.readLineSync()!;
  List<String> numbers = input.split(' ');

  int a = int.parse(numbers[0]);
  int b = int.parse(numbers[1]);

  String x;
  if (a > b) {
    x = '>';
  } else if (a == b) {
    x = '=';
  } else {
    x = '<';
  }

  print(x);
}
