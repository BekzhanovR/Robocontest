import 'dart:io';

void main() {
  String? input = stdin.readLineSync();
  
  if (input != null) {
    List<String> inputs = input.split(' ');
    int a = int.parse(inputs[0]);
    int b = int.parse(inputs[1]);
    int c = int.parse(inputs[2]);
    int d = int.parse(inputs[3]);
    int e = int.parse(inputs[4]);

    int mn = [a, b, c, d, e].reduce((value, element) => value < element ? value : element);
    int mx = [a, b, c, d, e].reduce((value, element) => value > element ? value : element);

    print('${a + b + c + d + e - mx} ${a + b + c + d + e - mn}');
  }
}
