using System;

public class Program{
	const int mod = 1000000007;
	public static int BinPow(int a, int n){
      	if (n == 0) return 1;
      	if (n % 2 == 0){
          	int x = BinPow(a, n / 2);
          	return (int)(((long)x * x) % mod);
      	}
      	return (int)(((long)a * BinPow(a, n - 1)) % mod);
  	}
	
	public static void Main(){
      int n, k, a, b;
      string[] input = Console.ReadLine().Split();
      n = int.Parse(input[0]);
      k = int.Parse(input[1]);

      a = BinPow(k, n) - 1;
      b = k - 1;
      int result = (int)(((long)a * BinPow(b, mod - 2)) % mod);
      Console.WriteLine(result);
	}
}