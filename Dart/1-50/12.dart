import 'dart:io';

void main() {
  var n = int.parse(stdin.readLineSync()!);
  var a = List<int>.generate(n + 1, (i) => i);

  a[1] = 0;
  var i = 2;

  while (i <= n) {
    if (a[i] != 0) {
      var j = i + i;
      while (j <= n) {
        a[j] = 0;
        j += i;
      }
    }
    i++;
  }

  var primes = a.where((num) => num != 0).toList();
  var ism = ["Bobur", "Ali"];

  if (n == 1) {
    print("Ali");
  } else {
    print(ism[primes.length % 2]);
  }
}
