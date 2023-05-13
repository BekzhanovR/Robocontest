import 'dart:io';
void main() {
  late int A, B, C, N, d;
  N = int.parse(stdin.readLineSync()!);
  List<String> input = stdin.readLineSync()!.split(' ');
  A = int.parse(input[0]);
  B = int.parse(input[1]);
  C = int.parse(input[2]);
  d = A + B + C;
  if (N <= d) {
    print('Yes');
  } else {
    print('No');
  }
}
