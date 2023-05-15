using System;

class Program {
    static void Main(string[] args) {
        int n = int.Parse(Console.ReadLine());
        int k = 0;
        for (int i = 2; i <= n; i++) {
            bool x = true;
            for (int j = 2; j <= Math.Sqrt(i); j++) {
                if (i % j == 0) {
                    x = false;  
                    break;
                }
            }
            if (x) {
                k++;
            }
        }
        if (k % 2 == 0) {
            Console.WriteLine("Bobur");
        } else {
            Console.WriteLine("Ali");
        }
    }
}